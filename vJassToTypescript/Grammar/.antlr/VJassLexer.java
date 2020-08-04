// Generated from c:\Dev\Repos\vJassToTypescript\vJassToTypescript\Grammar\vJass.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VJassLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Whitespace=19, Comment=20, LineComment=21, NoVJass=22, WhiteSpaceFragment=23, 
		Number=24, String=25, SingleQuoteString=26, OpenBracket=27, CloseBracket=28, 
		EOL=29, Array=30, Library=31, EndLibrary=32, Optional=33, Globals=34, 
		EndGlobals=35, RequireWords=36, VisibilityScope=37, Constant=38, Not=39, 
		And=40, Or=41, Call=42, Set=43, Interface=44, EndInterface=45, Function=46, 
		EndFunction=47, Takes=48, Return=49, Returns=50, Nothing=51, Method=52, 
		EndMethod=53, Defaults=54, Static=55, Struct=56, EndStruct=57, Extends=58, 
		Operator=59, If=60, EndIf=61, Then=62, ElseIf=63, Else=64, Local=65, Loop=66, 
		ExitWhen=67, EndLoop=68, Implement=69, Initializer=70, Native=71, Scope=72, 
		EndScope=73, Debug=74, Keyword=75, TextMacro=76, EndTextMacro=77, RunTextMacro=78, 
		Module=79, EndModule=80, Identifier=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "Whitespace", "Comment", "LineComment", "NoVJass", "WhiteSpaceFragment", 
			"SemiColon", "Letter", "Digit", "Underscore", "Comma", "Dot", "Dollar", 
			"Number", "String", "SingleQuoteString", "OpenBracket", "CloseBracket", 
			"EOL", "Array", "Library", "EndLibrary", "Optional", "Globals", "EndGlobals", 
			"RequireWords", "VisibilityScope", "Constant", "Not", "And", "Or", "Call", 
			"Set", "Interface", "EndInterface", "Function", "EndFunction", "Takes", 
			"Return", "Returns", "Nothing", "Method", "EndMethod", "Defaults", "Static", 
			"Struct", "EndStruct", "Extends", "Operator", "If", "EndIf", "Then", 
			"ElseIf", "Else", "Local", "Loop", "ExitWhen", "EndLoop", "Implement", 
			"Initializer", "Native", "Scope", "EndScope", "Debug", "Keyword", "TextMacro", 
			"EndTextMacro", "RunTextMacro", "Module", "EndModule", "Identifier", 
			"IdentifierStart", "IdentifierPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'<'", "'[]'", "'[]='", "'//!'", "'+'", "'-'", "'!='", 
			"'!'", "'('", "')'", "'*'", "'/'", "'=='", "'>'", "'>='", "'<='", null, 
			null, null, null, null, null, null, null, "'['", "']'", null, "'array'", 
			"'library'", "'endlibrary'", "'optional'", "'globals'", "'endglobals'", 
			null, null, "'constant'", "'not'", "'and'", "'or'", "'call'", "'set'", 
			"'interface'", "'endinterface'", "'function'", "'endfunction'", "'takes'", 
			"'return'", "'returns'", "'nothing'", "'method'", "'endmethod'", "'defaults'", 
			"'static'", "'struct'", "'endstruct'", "'extends'", "'operator'", "'if'", 
			"'endif'", "'then'", "'elseif'", "'else'", "'local'", "'loop'", "'exitwhen'", 
			"'endloop'", "'implement'", "'initializer'", "'native'", "'scope'", "'endscope'", 
			"'debug'", "'keyword'", "'textmacro'", "'endtextmacro'", "'runtextmacro'", 
			"'module'", "'endmodule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Whitespace", "Comment", "LineComment", 
			"NoVJass", "WhiteSpaceFragment", "Number", "String", "SingleQuoteString", 
			"OpenBracket", "CloseBracket", "EOL", "Array", "Library", "EndLibrary", 
			"Optional", "Globals", "EndGlobals", "RequireWords", "VisibilityScope", 
			"Constant", "Not", "And", "Or", "Call", "Set", "Interface", "EndInterface", 
			"Function", "EndFunction", "Takes", "Return", "Returns", "Nothing", "Method", 
			"EndMethod", "Defaults", "Static", "Struct", "EndStruct", "Extends", 
			"Operator", "If", "EndIf", "Then", "ElseIf", "Else", "Local", "Loop", 
			"ExitWhen", "EndLoop", "Implement", "Initializer", "Native", "Scope", 
			"EndScope", "Debug", "Keyword", "TextMacro", "EndTextMacro", "RunTextMacro", 
			"Module", "EndModule", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VJassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vJass.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0330\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\6\24\u00e6\n\24\r\24\16\24\u00e7\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u00ff\n\26\f\26"+
		"\16\26\u0102\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u0113\n\27\f\27\16\27\u0116\13\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0128\n\27\f\27\16\27\u012b\13\27\3\27\3\27\3\27\3\27\3\30\6"+
		"\30\u0132\n\30\r\30\16\30\u0133\3\31\3\31\3\32\5\32\u0139\n\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u0146\n \r \16 \u0147"+
		"\3 \3 \7 \u014c\n \f \16 \u014f\13 \7 \u0151\n \f \16 \u0154\13 \3!\3"+
		"!\3!\3!\7!\u015a\n!\f!\16!\u015d\13!\3!\3!\3\"\3\"\7\"\u0163\n\"\f\"\16"+
		"\"\u0166\13\"\3\"\3\"\3#\3#\3$\3$\3%\6%\u016f\n%\r%\16%\u0170\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\5,\u01b9\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u01d0\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3"+
		"P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3"+
		"W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\7Y\u0322\nY\fY\16Y\u0325\13Y"+
		"\3Z\3Z\3Z\3Z\5Z\u032b\nZ\3[\3[\5[\u032f\n[\5\u00f1\u0114\u0129\2\\\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2?\32A\33"+
		"C\34E\35G\36I\37K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64"+
		"u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008d"+
		"A\u008fB\u0091C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1"+
		"K\u00a3L\u00a5M\u00a7N\u00a9O\u00abP\u00adQ\u00afR\u00b1S\u00b3\2\u00b5"+
		"\2\3\2\f\5\2\13\f\17\17\"\"\3\2##\4\2\f\f\17\17\4\2C\\c|\3\2\62;\4\2\60"+
		"\60aa\n\2$$))^^ddhhppttvv\6\2\n\f\16\17$$^^\3\2))\4\2\13\f\17\17\2\u033c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b7"+
		"\3\2\2\2\5\u00b9\3\2\2\2\7\u00bb\3\2\2\2\t\u00bd\3\2\2\2\13\u00c0\3\2"+
		"\2\2\r\u00c4\3\2\2\2\17\u00c8\3\2\2\2\21\u00ca\3\2\2\2\23\u00cc\3\2\2"+
		"\2\25\u00cf\3\2\2\2\27\u00d1\3\2\2\2\31\u00d3\3\2\2\2\33\u00d5\3\2\2\2"+
		"\35\u00d7\3\2\2\2\37\u00d9\3\2\2\2!\u00dc\3\2\2\2#\u00de\3\2\2\2%\u00e1"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00eb\3\2\2\2+\u00f9\3\2\2\2-\u0105\3\2\2\2"+
		"/\u0131\3\2\2\2\61\u0135\3\2\2\2\63\u0138\3\2\2\2\65\u013a\3\2\2\2\67"+
		"\u013c\3\2\2\29\u013e\3\2\2\2;\u0140\3\2\2\2=\u0142\3\2\2\2?\u0145\3\2"+
		"\2\2A\u0155\3\2\2\2C\u0160\3\2\2\2E\u0169\3\2\2\2G\u016b\3\2\2\2I\u016e"+
		"\3\2\2\2K\u0172\3\2\2\2M\u0178\3\2\2\2O\u0180\3\2\2\2Q\u018b\3\2\2\2S"+
		"\u0194\3\2\2\2U\u019c\3\2\2\2W\u01b8\3\2\2\2Y\u01cf\3\2\2\2[\u01d1\3\2"+
		"\2\2]\u01da\3\2\2\2_\u01de\3\2\2\2a\u01e2\3\2\2\2c\u01e5\3\2\2\2e\u01ea"+
		"\3\2\2\2g\u01ee\3\2\2\2i\u01f8\3\2\2\2k\u0205\3\2\2\2m\u020e\3\2\2\2o"+
		"\u021a\3\2\2\2q\u0220\3\2\2\2s\u0227\3\2\2\2u\u022f\3\2\2\2w\u0237\3\2"+
		"\2\2y\u023e\3\2\2\2{\u0248\3\2\2\2}\u0251\3\2\2\2\177\u0258\3\2\2\2\u0081"+
		"\u025f\3\2\2\2\u0083\u0269\3\2\2\2\u0085\u0271\3\2\2\2\u0087\u027a\3\2"+
		"\2\2\u0089\u027d\3\2\2\2\u008b\u0283\3\2\2\2\u008d\u0288\3\2\2\2\u008f"+
		"\u028f\3\2\2\2\u0091\u0294\3\2\2\2\u0093\u029a\3\2\2\2\u0095\u029f\3\2"+
		"\2\2\u0097\u02a8\3\2\2\2\u0099\u02b0\3\2\2\2\u009b\u02ba\3\2\2\2\u009d"+
		"\u02c6\3\2\2\2\u009f\u02cd\3\2\2\2\u00a1\u02d3\3\2\2\2\u00a3\u02dc\3\2"+
		"\2\2\u00a5\u02e2\3\2\2\2\u00a7\u02ea\3\2\2\2\u00a9\u02f4\3\2\2\2\u00ab"+
		"\u0301\3\2\2\2\u00ad\u030e\3\2\2\2\u00af\u0315\3\2\2\2\u00b1\u031f\3\2"+
		"\2\2\u00b3\u032a\3\2\2\2\u00b5\u032e\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8"+
		"\4\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc"+
		"\b\3\2\2\2\u00bd\u00be\7]\2\2\u00be\u00bf\7_\2\2\u00bf\n\3\2\2\2\u00c0"+
		"\u00c1\7]\2\2\u00c1\u00c2\7_\2\2\u00c2\u00c3\7?\2\2\u00c3\f\3\2\2\2\u00c4"+
		"\u00c5\7\61\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7#\2\2\u00c7\16\3\2\2"+
		"\2\u00c8\u00c9\7-\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\22\3\2"+
		"\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\7?\2\2\u00ce\24\3\2\2\2\u00cf\u00d0"+
		"\7#\2\2\u00d0\26\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2\30\3\2\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4\32\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\34\3\2\2\2\u00d7\u00d8"+
		"\7\61\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7?\2\2\u00da\u00db\7?\2\2\u00db"+
		" \3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\"\3\2\2\2\u00de\u00df\7@\2\2\u00df"+
		"\u00e0\7?\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		"&\3\2\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\b\24\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7,\2\2\u00ed"+
		"\u00f1\3\2\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\b\25\3\2\u00f8*\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\n\3\2\2\u00fd\u00ff\n\4\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\b\26\3\2"+
		"\u0104,\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u0108"+
		"\7#\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7p\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7x\2\2\u010c\u010d\7l\2\2\u010d\u010e\7c\2\2\u010e\u010f\7u\2\2"+
		"\u010f\u0110\7u\2\2\u0110\u0114\3\2\2\2\u0111\u0113\13\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\61\2\2\u0118\u0119\7"+
		"\61\2\2\u0119\u011a\7#\2\2\u011a\u011b\7\"\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7p\2\2\u011d\u011e\7f\2\2\u011e\u011f\7p\2\2\u011f\u0120\7q\2\2"+
		"\u0120\u0121\7x\2\2\u0121\u0122\7l\2\2\u0122\u0123\7c\2\2\u0123\u0124"+
		"\7u\2\2\u0124\u0125\7u\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\5I%\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\b\27\3\2\u012f.\3\2\2\2\u0130\u0132\t\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\60\3\2\2\2\u0135\u0136\7=\2\2\u0136\62\3\2\2\2\u0137\u0139"+
		"\t\5\2\2\u0138\u0137\3\2\2\2\u0139\64\3\2\2\2\u013a\u013b\t\6\2\2\u013b"+
		"\66\3\2\2\2\u013c\u013d\7a\2\2\u013d8\3\2\2\2\u013e\u013f\7.\2\2\u013f"+
		":\3\2\2\2\u0140\u0141\7\60\2\2\u0141<\3\2\2\2\u0142\u0143\7&\2\2\u0143"+
		">\3\2\2\2\u0144\u0146\5\65\33\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0152\3\2\2\2\u0149\u014d"+
		"\t\7\2\2\u014a\u014c\5\65\33\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0149\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153@\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u015b\7$\2\2\u0156"+
		"\u0157\7^\2\2\u0157\u015a\t\b\2\2\u0158\u015a\n\t\2\2\u0159\u0156\3\2"+
		"\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7$"+
		"\2\2\u015fB\3\2\2\2\u0160\u0164\7)\2\2\u0161\u0163\n\n\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7)\2\2\u0168D\3\2\2\2\u0169"+
		"\u016a\7]\2\2\u016aF\3\2\2\2\u016b\u016c\7_\2\2\u016cH\3\2\2\2\u016d\u016f"+
		"\t\13\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171J\3\2\2\2\u0172\u0173\7c\2\2\u0173\u0174\7t"+
		"\2\2\u0174\u0175\7t\2\2\u0175\u0176\7c\2\2\u0176\u0177\7{\2\2\u0177L\3"+
		"\2\2\2\u0178\u0179\7n\2\2\u0179\u017a\7k\2\2\u017a\u017b\7d\2\2\u017b"+
		"\u017c\7t\2\2\u017c\u017d\7c\2\2\u017d\u017e\7t\2\2\u017e\u017f\7{\2\2"+
		"\u017fN\3\2\2\2\u0180\u0181\7g\2\2\u0181\u0182\7p\2\2\u0182\u0183\7f\2"+
		"\2\u0183\u0184\7n\2\2\u0184\u0185\7k\2\2\u0185\u0186\7d\2\2\u0186\u0187"+
		"\7t\2\2\u0187\u0188\7c\2\2\u0188\u0189\7t\2\2\u0189\u018a\7{\2\2\u018a"+
		"P\3\2\2\2\u018b\u018c\7q\2\2\u018c\u018d\7r\2\2\u018d\u018e\7v\2\2\u018e"+
		"\u018f\7k\2\2\u018f\u0190\7q\2\2\u0190\u0191\7p\2\2\u0191\u0192\7c\2\2"+
		"\u0192\u0193\7n\2\2\u0193R\3\2\2\2\u0194\u0195\7i\2\2\u0195\u0196\7n\2"+
		"\2\u0196\u0197\7q\2\2\u0197\u0198\7d\2\2\u0198\u0199\7c\2\2\u0199\u019a"+
		"\7n\2\2\u019a\u019b\7u\2\2\u019bT\3\2\2\2\u019c\u019d\7g\2\2\u019d\u019e"+
		"\7p\2\2\u019e\u019f\7f\2\2\u019f\u01a0\7i\2\2\u01a0\u01a1\7n\2\2\u01a1"+
		"\u01a2\7q\2\2\u01a2\u01a3\7d\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7n\2\2"+
		"\u01a5\u01a6\7u\2\2\u01a6V\3\2\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7g\2"+
		"\2\u01a9\u01aa\7s\2\2\u01aa\u01ab\7w\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad"+
		"\7t\2\2\u01ad\u01ae\7g\2\2\u01ae\u01b9\7u\2\2\u01af\u01b0\7w\2\2\u01b0"+
		"\u01b1\7u\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b9\7u\2\2\u01b3\u01b4\7p\2\2"+
		"\u01b4\u01b5\7g\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7f\2\2\u01b7\u01b9"+
		"\7u\2\2\u01b8\u01a7\3\2\2\2\u01b8\u01af\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9"+
		"X\3\2\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7k\2\2\u01bd"+
		"\u01be\7x\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7v\2\2\u01c0\u01d0\7g\2\2"+
		"\u01c1\u01c2\7r\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7d\2\2\u01c4\u01c5"+
		"\7n\2\2\u01c5\u01c6\7k\2\2\u01c6\u01d0\7e\2\2\u01c7\u01c8\7t\2\2\u01c8"+
		"\u01c9\7g\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7f\2\2\u01cb\u01cc\7q\2\2"+
		"\u01cc\u01cd\7p\2\2\u01cd\u01ce\7n\2\2\u01ce\u01d0\7{\2\2\u01cf\u01ba"+
		"\3\2\2\2\u01cf\u01c1\3\2\2\2\u01cf\u01c7\3\2\2\2\u01d0Z\3\2\2\2\u01d1"+
		"\u01d2\7e\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7u\2\2"+
		"\u01d5\u01d6\7v\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9"+
		"\7v\2\2\u01d9\\\3\2\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd"+
		"\7v\2\2\u01dd^\3\2\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1"+
		"\7f\2\2\u01e1`\3\2\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7t\2\2\u01e4b\3"+
		"\2\2\2\u01e5\u01e6\7e\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7n\2\2\u01e8"+
		"\u01e9\7n\2\2\u01e9d\3\2\2\2\u01ea\u01eb\7u\2\2\u01eb\u01ec\7g\2\2\u01ec"+
		"\u01ed\7v\2\2\u01edf\3\2\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7p\2\2\u01f0"+
		"\u01f1\7v\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7h\2\2"+
		"\u01f4\u01f5\7c\2\2\u01f5\u01f6\7e\2\2\u01f6\u01f7\7g\2\2\u01f7h\3\2\2"+
		"\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc"+
		"\7k\2\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7g\2\2\u01ff"+
		"\u0200\7t\2\2\u0200\u0201\7h\2\2\u0201\u0202\7c\2\2\u0202\u0203\7e\2\2"+
		"\u0203\u0204\7g\2\2\u0204j\3\2\2\2\u0205\u0206\7h\2\2\u0206\u0207\7w\2"+
		"\2\u0207\u0208\7p\2\2\u0208\u0209\7e\2\2\u0209\u020a\7v\2\2\u020a\u020b"+
		"\7k\2\2\u020b\u020c\7q\2\2\u020c\u020d\7p\2\2\u020dl\3\2\2\2\u020e\u020f"+
		"\7g\2\2\u020f\u0210\7p\2\2\u0210\u0211\7f\2\2\u0211\u0212\7h\2\2\u0212"+
		"\u0213\7w\2\2\u0213\u0214\7p\2\2\u0214\u0215\7e\2\2\u0215\u0216\7v\2\2"+
		"\u0216\u0217\7k\2\2\u0217\u0218\7q\2\2\u0218\u0219\7p\2\2\u0219n\3\2\2"+
		"\2\u021a\u021b\7v\2\2\u021b\u021c\7c\2\2\u021c\u021d\7m\2\2\u021d\u021e"+
		"\7g\2\2\u021e\u021f\7u\2\2\u021fp\3\2\2\2\u0220\u0221\7t\2\2\u0221\u0222"+
		"\7g\2\2\u0222\u0223\7v\2\2\u0223\u0224\7w\2\2\u0224\u0225\7t\2\2\u0225"+
		"\u0226\7p\2\2\u0226r\3\2\2\2\u0227\u0228\7t\2\2\u0228\u0229\7g\2\2\u0229"+
		"\u022a\7v\2\2\u022a\u022b\7w\2\2\u022b\u022c\7t\2\2\u022c\u022d\7p\2\2"+
		"\u022d\u022e\7u\2\2\u022et\3\2\2\2\u022f\u0230\7p\2\2\u0230\u0231\7q\2"+
		"\2\u0231\u0232\7v\2\2\u0232\u0233\7j\2\2\u0233\u0234\7k\2\2\u0234\u0235"+
		"\7p\2\2\u0235\u0236\7i\2\2\u0236v\3\2\2\2\u0237\u0238\7o\2\2\u0238\u0239"+
		"\7g\2\2\u0239\u023a\7v\2\2\u023a\u023b\7j\2\2\u023b\u023c\7q\2\2\u023c"+
		"\u023d\7f\2\2\u023dx\3\2\2\2\u023e\u023f\7g\2\2\u023f\u0240\7p\2\2\u0240"+
		"\u0241\7f\2\2\u0241\u0242\7o\2\2\u0242\u0243\7g\2\2\u0243\u0244\7v\2\2"+
		"\u0244\u0245\7j\2\2\u0245\u0246\7q\2\2\u0246\u0247\7f\2\2\u0247z\3\2\2"+
		"\2\u0248\u0249\7f\2\2\u0249\u024a\7g\2\2\u024a\u024b\7h\2\2\u024b\u024c"+
		"\7c\2\2\u024c\u024d\7w\2\2\u024d\u024e\7n\2\2\u024e\u024f\7v\2\2\u024f"+
		"\u0250\7u\2\2\u0250|\3\2\2\2\u0251\u0252\7u\2\2\u0252\u0253\7v\2\2\u0253"+
		"\u0254\7c\2\2\u0254\u0255\7v\2\2\u0255\u0256\7k\2\2\u0256\u0257\7e\2\2"+
		"\u0257~\3\2\2\2\u0258\u0259\7u\2\2\u0259\u025a\7v\2\2\u025a\u025b\7t\2"+
		"\2\u025b\u025c\7w\2\2\u025c\u025d\7e\2\2\u025d\u025e\7v\2\2\u025e\u0080"+
		"\3\2\2\2\u025f\u0260\7g\2\2\u0260\u0261\7p\2\2\u0261\u0262\7f\2\2\u0262"+
		"\u0263\7u\2\2\u0263\u0264\7v\2\2\u0264\u0265\7t\2\2\u0265\u0266\7w\2\2"+
		"\u0266\u0267\7e\2\2\u0267\u0268\7v\2\2\u0268\u0082\3\2\2\2\u0269\u026a"+
		"\7g\2\2\u026a\u026b\7z\2\2\u026b\u026c\7v\2\2\u026c\u026d\7g\2\2\u026d"+
		"\u026e\7p\2\2\u026e\u026f\7f\2\2\u026f\u0270\7u\2\2\u0270\u0084\3\2\2"+
		"\2\u0271\u0272\7q\2\2\u0272\u0273\7r\2\2\u0273\u0274\7g\2\2\u0274\u0275"+
		"\7t\2\2\u0275\u0276\7c\2\2\u0276\u0277\7v\2\2\u0277\u0278\7q\2\2\u0278"+
		"\u0279\7t\2\2\u0279\u0086\3\2\2\2\u027a\u027b\7k\2\2\u027b\u027c\7h\2"+
		"\2\u027c\u0088\3\2\2\2\u027d\u027e\7g\2\2\u027e\u027f\7p\2\2\u027f\u0280"+
		"\7f\2\2\u0280\u0281\7k\2\2\u0281\u0282\7h\2\2\u0282\u008a\3\2\2\2\u0283"+
		"\u0284\7v\2\2\u0284\u0285\7j\2\2\u0285\u0286\7g\2\2\u0286\u0287\7p\2\2"+
		"\u0287\u008c\3\2\2\2\u0288\u0289\7g\2\2\u0289\u028a\7n\2\2\u028a\u028b"+
		"\7u\2\2\u028b\u028c\7g\2\2\u028c\u028d\7k\2\2\u028d\u028e\7h\2\2\u028e"+
		"\u008e\3\2\2\2\u028f\u0290\7g\2\2\u0290\u0291\7n\2\2\u0291\u0292\7u\2"+
		"\2\u0292\u0293\7g\2\2\u0293\u0090\3\2\2\2\u0294\u0295\7n\2\2\u0295\u0296"+
		"\7q\2\2\u0296\u0297\7e\2\2\u0297\u0298\7c\2\2\u0298\u0299\7n\2\2\u0299"+
		"\u0092\3\2\2\2\u029a\u029b\7n\2\2\u029b\u029c\7q\2\2\u029c\u029d\7q\2"+
		"\2\u029d\u029e\7r\2\2\u029e\u0094\3\2\2\2\u029f\u02a0\7g\2\2\u02a0\u02a1"+
		"\7z\2\2\u02a1\u02a2\7k\2\2\u02a2\u02a3\7v\2\2\u02a3\u02a4\7y\2\2\u02a4"+
		"\u02a5\7j\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7p\2\2\u02a7\u0096\3\2\2"+
		"\2\u02a8\u02a9\7g\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7f\2\2\u02ab\u02ac"+
		"\7n\2\2\u02ac\u02ad\7q\2\2\u02ad\u02ae\7q\2\2\u02ae\u02af\7r\2\2\u02af"+
		"\u0098\3\2\2\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7o\2\2\u02b2\u02b3\7r\2"+
		"\2\u02b3\u02b4\7n\2\2\u02b4\u02b5\7g\2\2\u02b5\u02b6\7o\2\2\u02b6\u02b7"+
		"\7g\2\2\u02b7\u02b8\7p\2\2\u02b8\u02b9\7v\2\2\u02b9\u009a\3\2\2\2\u02ba"+
		"\u02bb\7k\2\2\u02bb\u02bc\7p\2\2\u02bc\u02bd\7k\2\2\u02bd\u02be\7v\2\2"+
		"\u02be\u02bf\7k\2\2\u02bf\u02c0\7c\2\2\u02c0\u02c1\7n\2\2\u02c1\u02c2"+
		"\7k\2\2\u02c2\u02c3\7|\2\2\u02c3\u02c4\7g\2\2\u02c4\u02c5\7t\2\2\u02c5"+
		"\u009c\3\2\2\2\u02c6\u02c7\7p\2\2\u02c7\u02c8\7c\2\2\u02c8\u02c9\7v\2"+
		"\2\u02c9\u02ca\7k\2\2\u02ca\u02cb\7x\2\2\u02cb\u02cc\7g\2\2\u02cc\u009e"+
		"\3\2\2\2\u02cd\u02ce\7u\2\2\u02ce\u02cf\7e\2\2\u02cf\u02d0\7q\2\2\u02d0"+
		"\u02d1\7r\2\2\u02d1\u02d2\7g\2\2\u02d2\u00a0\3\2\2\2\u02d3\u02d4\7g\2"+
		"\2\u02d4\u02d5\7p\2\2\u02d5\u02d6\7f\2\2\u02d6\u02d7\7u\2\2\u02d7\u02d8"+
		"\7e\2\2\u02d8\u02d9\7q\2\2\u02d9\u02da\7r\2\2\u02da\u02db\7g\2\2\u02db"+
		"\u00a2\3\2\2\2\u02dc\u02dd\7f\2\2\u02dd\u02de\7g\2\2\u02de\u02df\7d\2"+
		"\2\u02df\u02e0\7w\2\2\u02e0\u02e1\7i\2\2\u02e1\u00a4\3\2\2\2\u02e2\u02e3"+
		"\7m\2\2\u02e3\u02e4\7g\2\2\u02e4\u02e5\7{\2\2\u02e5\u02e6\7y\2\2\u02e6"+
		"\u02e7\7q\2\2\u02e7\u02e8\7t\2\2\u02e8\u02e9\7f\2\2\u02e9\u00a6\3\2\2"+
		"\2\u02ea\u02eb\7v\2\2\u02eb\u02ec\7g\2\2\u02ec\u02ed\7z\2\2\u02ed\u02ee"+
		"\7v\2\2\u02ee\u02ef\7o\2\2\u02ef\u02f0\7c\2\2\u02f0\u02f1\7e\2\2\u02f1"+
		"\u02f2\7t\2\2\u02f2\u02f3\7q\2\2\u02f3\u00a8\3\2\2\2\u02f4\u02f5\7g\2"+
		"\2\u02f5\u02f6\7p\2\2\u02f6\u02f7\7f\2\2\u02f7\u02f8\7v\2\2\u02f8\u02f9"+
		"\7g\2\2\u02f9\u02fa\7z\2\2\u02fa\u02fb\7v\2\2\u02fb\u02fc\7o\2\2\u02fc"+
		"\u02fd\7c\2\2\u02fd\u02fe\7e\2\2\u02fe\u02ff\7t\2\2\u02ff\u0300\7q\2\2"+
		"\u0300\u00aa\3\2\2\2\u0301\u0302\7t\2\2\u0302\u0303\7w\2\2\u0303\u0304"+
		"\7p\2\2\u0304\u0305\7v\2\2\u0305\u0306\7g\2\2\u0306\u0307\7z\2\2\u0307"+
		"\u0308\7v\2\2\u0308\u0309\7o\2\2\u0309\u030a\7c\2\2\u030a\u030b\7e\2\2"+
		"\u030b\u030c\7t\2\2\u030c\u030d\7q\2\2\u030d\u00ac\3\2\2\2\u030e\u030f"+
		"\7o\2\2\u030f\u0310\7q\2\2\u0310\u0311\7f\2\2\u0311\u0312\7w\2\2\u0312"+
		"\u0313\7n\2\2\u0313\u0314\7g\2\2\u0314\u00ae\3\2\2\2\u0315\u0316\7g\2"+
		"\2\u0316\u0317\7p\2\2\u0317\u0318\7f\2\2\u0318\u0319\7o\2\2\u0319\u031a"+
		"\7q\2\2\u031a\u031b\7f\2\2\u031b\u031c\7w\2\2\u031c\u031d\7n\2\2\u031d"+
		"\u031e\7g\2\2\u031e\u00b0\3\2\2\2\u031f\u0323\5\u00b3Z\2\u0320\u0322\5"+
		"\u00b5[\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2"+
		"\u0323\u0324\3\2\2\2\u0324\u00b2\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032b"+
		"\5\63\32\2\u0327\u032b\5\67\34\2\u0328\u032b\5;\36\2\u0329\u032b\5=\37"+
		"\2\u032a\u0326\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329"+
		"\3\2\2\2\u032b\u00b4\3\2\2\2\u032c\u032f\5\u00b3Z\2\u032d\u032f\5\65\33"+
		"\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u00b6\3\2\2\2\26\2\u00e7"+
		"\u00f1\u0100\u0114\u0129\u0133\u0138\u0147\u014d\u0152\u0159\u015b\u0164"+
		"\u0170\u01b8\u01cf\u0323\u032a\u032e\4\2\3\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}