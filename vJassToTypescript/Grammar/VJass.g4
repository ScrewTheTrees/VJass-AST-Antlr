grammar VJass;

//Start
program : rootStatements EOF;

//Statements
rootStatement : 
      libraryBlock 
    | globalsBlock
    | interfaceBlock
    | functionBlock
    | structBlock
    | nativeBlock
    | keyWordStatement
    | textMacroBlock
    | runTextMacroBlock
    | moduleBlock
;
libraryStatement :
      globalsBlock
    | interfaceBlock
    | functionBlock
    | methodBlock
    | structBlock
    | nativeBlock
    | keyWordStatement
    | textMacroBlock
    | runTextMacroBlock
    | moduleBlock
;
interfaceStatement : 
    interfaceMethodBlock
    | interfaceFieldDeclaration
    | textMacroBlock
    | runTextMacroBlock
;
functionStatement :
    setStatement
    | callStatement
    | returnStatement
    | ifStatement
    | localDeclaration
    | loopStatement
    | functionStaticIfStatement
    | ExitWhen singleExpression? //For Loops
    | textMacroBlock
    | runTextMacroBlock
;
structStatement :
    methodBlock
    | implementStatement
    | structStaticIfStatement
    | textMacroBlock
    | runTextMacroBlock
    
    | structFieldDeclaration //This one must be last.... its very... generic, disgustingly so.
;

//Multi Statements
rootStatements : rootStatement* ;
libraryStatements : libraryStatement* ;
interfaceStatements: interfaceStatement* ;
functionStatements : functionStatement* ;
structStatements : structStatement* ;

//Library
libraryBlock : 
    Library
    Identifier //Name
    initializerBlock?
    libraryRequireBlock?
    libraryStatements
    EndLibrary
;
libraryRequireBlock :
    RequireWords 
    Optional? Identifier
    ((',' | ~EOL) Optional? Identifier)* //Have to do NOT END OF LINE, because vJass is shoddy as hell.
;
//Scope
scopeBlock:
    Scope Identifier
    initializerBlock?
    libraryStatements
    EndScope
;

//Globals
globalsBlock : 
    Globals                 //Start globals block
    globalDeclaration*
    EndGlobals              //End globals block
;
globalDeclaration : 
    VisibilityScope?
    Constant?
    Identifier  //Type
    Array?
    Identifier  //Name
    ('=' singleExpression)?
;

//Interface
interfaceBlock : 
    Interface
    Identifier //Name
    interfaceStatements
    EndInterface
;
interfaceMethodBlock : 
    Method
    Identifier //Name
    Takes
    functionBlockArguments
    Returns
    functionBlockReturn
    (Defaults functionBlockReturn)?
;
interfaceFieldDeclaration :
    Identifier  //Type
    Array?
    Identifier  //Name
;

//Function
functionBlock : 
    VisibilityScope?
    Function 
    Identifier //Name
    Takes
    functionBlockArguments
    Returns
    functionBlockReturn
    functionStatements
    EndFunction
;
functionBlockArguments :
      Nothing
    | Identifier Identifier (',' Identifier Identifier)*
;
functionBlockReturn : 
      Nothing
    | Identifier
;
setStatement : 
    Debug? Set Identifier 
    singleExpression?
    '=' singleExpression
;
callStatement :
    Debug? Call singleExpression
;
returnStatement :
    Return singleExpression
;
localDeclaration:
    Debug?
    Local 
    Identifier //Type
    Array?
    Identifier //Name
    ('=' singleExpression)?
;

loopStatement:
    Loop
        functionStatements
    EndLoop
;

implementStatement:
    Implement
    Optional?
    Identifier
;
//If
ifStatement :
    If singleExpression Then functionStatements
    (ElseIf singleExpression Then functionStatements)*
    (Else functionStatements)?
    EndIf
;
structStaticIfStatement :
    Static If singleExpression Then structStatements
    (ElseIf singleExpression Then structStatements)*
    (Else structStatements)?
    EndIf
;
functionStaticIfStatement :
    Static If singleExpression Then functionStatements
    (ElseIf singleExpression Then functionStatements)*
    (Else functionStatements)?
    EndIf
;


//Native
nativeBlock: 
    Native
    Identifier
    Takes functionBlockArguments
    Returns functionBlockReturn
;

//Method
methodBlock :
    VisibilityScope?
    Static?
    Method
    Operator?
    Identifier? //name
    ( '<' | '[]' | '[]=' | '=')?
    Takes
    functionBlockArguments
    Returns
    functionBlockReturn
    functionStatements
    EndMethod
;

//Struct
structBlock :
    Struct
    Identifier
    structBlockExtends?
    structStatements
    EndStruct
;
structBlockExtends:
    Extends 
    (Identifier | Array)
    (',' Identifier)*
;
structFieldDeclaration :
    Debug?
    VisibilityScope?
    Static?
    Constant?
    Identifier  //Type
    Array?
    Identifier  //Name
    ('=' singleExpression)?
;

//Module
moduleBlock:
    VisibilityScope?
    Module
    Identifier //Name
    libraryStatements
    EndModule
;

//Text macros
textMacroBlock :
    ('//!' TextMacro Identifier Takes functionBlockArguments '//!' EndTextMacro)
    | ('//!'  TextMacro Identifier functionStatements '//!' EndTextMacro)
;
runTextMacroBlock :
    ('//!' RunTextMacro Optional? functionCall)
;

//Expressions
singleExpression :
    '+' singleExpression  
    | '-' singleExpression 
    | '!=' singleExpression 
    | '!' singleExpression 

    | '[' singleExpression ']' singleExpression?
    | Identifier '[' singleExpression ']' singleExpression?
    | '(' singleExpression ')' singleExpression?

    | singleExpression '+' singleExpression
    | singleExpression '-' singleExpression
    | singleExpression '*' singleExpression
    | singleExpression '/' singleExpression
    | singleExpression '==' singleExpression
    | singleExpression '!=' singleExpression
    | singleExpression '<' singleExpression
    | singleExpression '>' singleExpression
    | singleExpression '>=' singleExpression
    | singleExpression '<=' singleExpression
    | functionCall //Function

    | Not singleExpression
    | singleExpression And singleExpression
    | singleExpression Or singleExpression

 
    | Function Identifier //Code
    | Number
    | String
    | SingleQuoteString
    | Identifier
    | arrayLiteral
;

expressionSequence
    : singleExpression (',' singleExpression)*
;

arrayLiteral
    : '[' elementList ']'
;

elementList
    : ','* singleExpression? (','+ singleExpression)* ','* //Optional Intensifies
;
//Misc
initializerBlock:  
    Initializer Identifier
;

functionCall : 
    Identifier
    '(' expressionSequence? ')' 
    singleExpression? //In case of method .call()
; 

keyWordStatement:
    VisibilityScope?
    Keyword
    Identifier
;



//Special
Whitespace: [ \n\t\r]+ -> channel(HIDDEN);
Comment: '/*' .*? '*/' -> channel(2);
LineComment: '//' ~'!' ~[\r\n]* -> channel(2);
NoVJass: '//! novjass' .*? '//! endnovjass' .*? EOL -> channel(2);


WhiteSpaceFragment: [ \n\t\r]+;
fragment SemiColon : ';';
fragment Letter : [a-z] | [A-Z] ;
fragment Digit : [0-9] ;
fragment Underscore : '_' ;
fragment Comma : ',' ;
fragment Dot : '.' ;
fragment Dollar : '$' ;

Number : Digit+ ([._] Digit*)* ;
String: '"' ( '\\' [btnfr"'\\] | ~[\b\t\f\r\n\\"] )* '"';
SingleQuoteString: '\'' ~'\''* '\'';     // 'hpea'
OpenBracket: '[';
CloseBracket: ']';
EOL : [\n\t\r]+;

Array : 'array' ;
Library : 'library' ;
EndLibrary : 'endlibrary' ;
Optional : 'optional' ;
Globals : 'globals' ;
EndGlobals : 'endglobals' ;
RequireWords : 'requires' | 'uses' | 'needs' ;
VisibilityScope : 'private' | 'public' | 'readonly';
Constant : 'constant';
Not : 'not';
And : 'and';
Or : 'or';
Call : 'call';
Set : 'set';
Interface : 'interface';
EndInterface : 'endinterface';
Function : 'function';
EndFunction : 'endfunction';
Takes : 'takes';
Return : 'return';
Returns : 'returns';
Nothing : 'nothing';
Method : 'method';
EndMethod : 'endmethod';
Defaults: 'defaults';
Static: 'static';
Struct: 'struct';
EndStruct: 'endstruct';
Extends: 'extends';
Operator: 'operator';
If: 'if';
EndIf: 'endif';
Then: 'then';
ElseIf: 'elseif';
Else: 'else';
Local: 'local';
Loop: 'loop';
ExitWhen: 'exitwhen';
EndLoop: 'endloop';
Implement: 'implement';
Initializer: 'initializer';
Native: 'native';
Scope: 'scope';
EndScope: 'endscope';
Debug: 'debug';
Keyword: 'keyword';
TextMacro: 'textmacro';
EndTextMacro: 'endtextmacro';
RunTextMacro: 'runtextmacro';
Module: 'module';
EndModule: 'endmodule';


Identifier : 
    IdentifierStart IdentifierPart*
;


fragment IdentifierStart : 
      Letter
    | Underscore
    | Dot    //Might be an array extension
    | Dollar //Text macros
;

fragment IdentifierPart : 
      IdentifierStart 
    | Digit
;



