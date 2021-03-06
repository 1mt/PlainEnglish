// Generated from PlainEnglish.g4 by ANTLR 4.4

	package lexerparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlainEnglishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WHITESPACE=17, DOT=18, UNDERSCORE=19, LETTER=20, DOUBLEQUOTE=21, EQUALS=22, 
		FUNCTION=23, VARDEFINE=24, ASSIGN=25, EQUALSCOM=26, NOTEQUALS=27, STARTFUNC=28, 
		ENDFUNC=29, IF=30, ELSE=31, INCREMENT=32, DECREASE=33, ADD=34, MINUS=35, 
		MULT=36, DIV=37, MOD=38, AND=39, OR=40, GREATERTHAN=41, LESSTHAN=42, GREATERTHANEQ=43, 
		LESSTHANEQ=44, ARRAYGET=45, GLOBAL=46, FOR=47, WHILE=48, BREAK=49, RETURN=50, 
		NULLLITERAL=51, BOOLEANLITERAL=52, DECIMALLITERAL=53, INTEGERLITERAL=54, 
		STRINGLITERAL=55, IDENTIFIER=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHITESPACE", 
		"DOT", "UNDERSCORE", "LETTER", "DOUBLEQUOTE", "EQUALS", "FUNCTION", "VARDEFINE", 
		"ASSIGN", "EQUALSCOM", "NOTEQUALS", "STARTFUNC", "ENDFUNC", "IF", "ELSE", 
		"INCREMENT", "DECREASE", "ADD", "MINUS", "MULT", "DIV", "MOD", "AND", 
		"OR", "GREATERTHAN", "LESSTHAN", "GREATERTHANEQ", "LESSTHANEQ", "ARRAYGET", 
		"GLOBAL", "FOR", "WHILE", "BREAK", "RETURN", "NULLLITERAL", "BOOLEANLITERAL", 
		"DECIMALLITERAL", "INTEGERLITERAL", "STRINGLITERAL", "IDENTIFIER", "DIGIT", 
		"FRACTION", "UPPERCASE", "LOWERCASE"
	};


	public PlainEnglishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlainEnglish.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u02f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\6\22\u013d\n\22\r\22\16\22\u013e\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\5\25\u0149\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02c7\n\65\3\66"+
		"\6\66\u02ca\n\66\r\66\16\66\u02cb\3\66\3\66\3\67\6\67\u02d1\n\67\r\67"+
		"\16\67\u02d2\38\38\38\38\68\u02d9\n8\r8\168\u02da\38\38\39\59\u02e0\n"+
		"9\39\39\39\39\69\u02e6\n9\r9\169\u02e7\3:\3:\3;\3;\6;\u02ee\n;\r;\16;"+
		"\u02ef\3<\3<\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s\2u\2w\2y\2\3\2\6\5\2\13\f\17\17\"\"\3\2\62"+
		";\3\2C\\\3\2c|\u02fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3{\3\2\2\2\5\u0083\3\2\2"+
		"\2\7\u0090\3\2\2\2\t\u00a4\3\2\2\2\13\u00b5\3\2\2\2\r\u00c2\3\2\2\2\17"+
		"\u00c4\3\2\2\2\21\u00ca\3\2\2\2\23\u00db\3\2\2\2\25\u00e8\3\2\2\2\27\u00ff"+
		"\3\2\2\2\31\u0101\3\2\2\2\33\u0103\3\2\2\2\35\u0115\3\2\2\2\37\u012d\3"+
		"\2\2\2!\u012f\3\2\2\2#\u013c\3\2\2\2%\u0142\3\2\2\2\'\u0144\3\2\2\2)\u0148"+
		"\3\2\2\2+\u014a\3\2\2\2-\u014c\3\2\2\2/\u014e\3\2\2\2\61\u0169\3\2\2\2"+
		"\63\u0184\3\2\2\2\65\u018e\3\2\2\2\67\u019a\3\2\2\29\u01aa\3\2\2\2;\u01c0"+
		"\3\2\2\2=\u01cc\3\2\2\2?\u01cf\3\2\2\2A\u01d7\3\2\2\2C\u01e1\3\2\2\2E"+
		"\u01ea\3\2\2\2G\u01ee\3\2\2\2I\u01f4\3\2\2\2K\u01fd\3\2\2\2M\u0204\3\2"+
		"\2\2O\u0208\3\2\2\2Q\u020c\3\2\2\2S\u020f\3\2\2\2U\u021f\3\2\2\2W\u022c"+
		"\3\2\2\2Y\u0243\3\2\2\2[\u025c\3\2\2\2]\u0273\3\2\2\2_\u0282\3\2\2\2a"+
		"\u028f\3\2\2\2c\u0295\3\2\2\2e\u02aa\3\2\2\2g\u02b8\3\2\2\2i\u02c6\3\2"+
		"\2\2k\u02c9\3\2\2\2m\u02d0\3\2\2\2o\u02d4\3\2\2\2q\u02df\3\2\2\2s\u02e9"+
		"\3\2\2\2u\u02eb\3\2\2\2w\u02f1\3\2\2\2y\u02f3\3\2\2\2{|\7f\2\2|}\7q\2"+
		"\2}~\7\"\2\2~\177\7v\2\2\177\u0080\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082"+
		"\7u\2\2\u0082\4\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7u\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7\"\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2"+
		"\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2\u008f\6\3\2\2\2\u0090\u0091\7"+
		"y\2\2\u0091\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095"+
		"\7\"\2\2\u0095\u0096\7v\2\2\u0096\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7\"\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7e\2"+
		"\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7o\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7\"\2\2\u00a3"+
		"\b\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7\"\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7\"\2"+
		"\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7f\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\f\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7m\2\2"+
		"\u00c9\20\3\2\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7"+
		"u\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7v\2"+
		"\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7\"\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7q\2\2\u00da\22\3\2\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7v\2"+
		"\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3"+
		"\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7z\2\2\u00e7\24\3\2\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7n\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2"+
		"\7g\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7\"\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\7n\2"+
		"\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd"+
		"\7\"\2\2\u00fd\u00fe\7]\2\2\u00fe\26\3\2\2\2\u00ff\u0100\7*\2\2\u0100"+
		"\30\3\2\2\2\u0101\u0102\7+\2\2\u0102\32\3\2\2\2\u0103\u0104\7e\2\2\u0104"+
		"\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\u0107\7n\2\2\u0107\u0108\7\"\2"+
		"\2\u0108\u0109\7v\2\2\u0109\u010a\7j\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7\"\2\2\u010c\u010d\7h\2\2\u010d\u010e\7w\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7e\2\2\u0110\u0111\7v\2\2\u0111\u0112\7k\2\2\u0112\u0113\7q\2\2"+
		"\u0113\u0114\7p\2\2\u0114\34\3\2\2\2\u0115\u0116\7y\2\2\u0116\u0117\7"+
		"k\2\2\u0117\u0118\7v\2\2\u0118\u0119\7j\2\2\u0119\u011a\7\"\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2"+
		"\u011e\u011f\7g\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7r\2\2\u0121\u0122"+
		"\7c\2\2\u0122\u0123\7t\2\2\u0123\u0124\7c\2\2\u0124\u0125\7o\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7v\2\2\u0127\u0128\7g\2\2\u0128\u0129\7t\2\2"+
		"\u0129\u012a\7u\2\2\u012a\u012b\7\"\2\2\u012b\u012c\7*\2\2\u012c\36\3"+
		"\2\2\2\u012d\u012e\7.\2\2\u012e \3\2\2\2\u012f\u0130\7r\2\2\u0130\u0131"+
		"\7n\2\2\u0131\u0132\7g\2\2\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7\"\2\2\u0136\u0137\7u\2\2\u0137\u0138\7v\2"+
		"\2\u0138\u0139\7q\2\2\u0139\u013a\7r\2\2\u013a\"\3\2\2\2\u013b\u013d\t"+
		"\2\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\22\2\2\u0141$\3\2\2\2"+
		"\u0142\u0143\7\60\2\2\u0143&\3\2\2\2\u0144\u0145\7a\2\2\u0145(\3\2\2\2"+
		"\u0146\u0149\5y=\2\u0147\u0149\5w<\2\u0148\u0146\3\2\2\2\u0148\u0147\3"+
		"\2\2\2\u0149*\3\2\2\2\u014a\u014b\7$\2\2\u014b,\3\2\2\2\u014c\u014d\7"+
		"?\2\2\u014d.\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150\7n\2\2\u0150\u0151"+
		"\7g\2\2\u0151\u0152\7c\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154"+
		"\u0155\7\"\2\2\u0155\u0156\7e\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2"+
		"\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c"+
		"\7\"\2\2\u015c\u015d\7v\2\2\u015d\u015e\7j\2\2\u015e\u015f\7g\2\2\u015f"+
		"\u0160\7\"\2\2\u0160\u0161\7h\2\2\u0161\u0162\7w\2\2\u0162\u0163\7p\2"+
		"\2\u0163\u0164\7e\2\2\u0164\u0165\7v\2\2\u0165\u0166\7k\2\2\u0166\u0167"+
		"\7q\2\2\u0167\u0168\7p\2\2\u0168\60\3\2\2\2\u0169\u016a\7r\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7g\2\2\u016c\u016d\7c\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7g\2\2\u016f\u0170\7\"\2\2\u0170\u0171\7e\2\2\u0171\u0172\7t\2"+
		"\2\u0172\u0173\7g\2\2\u0173\u0174\7c\2\2\u0174\u0175\7v\2\2\u0175\u0176"+
		"\7g\2\2\u0176\u0177\7\"\2\2\u0177\u0178\7v\2\2\u0178\u0179\7j\2\2\u0179"+
		"\u017a\7g\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7x\2\2\u017c\u017d\7c\2"+
		"\2\u017d\u017e\7t\2\2\u017e\u017f\7k\2\2\u017f\u0180\7c\2\2\u0180\u0181"+
		"\7d\2\2\u0181\u0182\7n\2\2\u0182\u0183\7g\2\2\u0183\62\3\2\2\2\u0184\u0185"+
		"\7u\2\2\u0185\u0186\7g\2\2\u0186\u0187\7v\2\2\u0187\u0188\7\"\2\2\u0188"+
		"\u0189\7k\2\2\u0189\u018a\7v\2\2\u018a\u018b\7\"\2\2\u018b\u018c\7v\2"+
		"\2\u018c\u018d\7q\2\2\u018d\64\3\2\2\2\u018e\u018f\7k\2\2\u018f\u0190"+
		"\7u\2\2\u0190\u0191\7\"\2\2\u0191\u0192\7g\2\2\u0192\u0193\7s\2\2\u0193"+
		"\u0194\7w\2\2\u0194\u0195\7c\2\2\u0195\u0196\7n\2\2\u0196\u0197\7\"\2"+
		"\2\u0197\u0198\7v\2\2\u0198\u0199\7q\2\2\u0199\66\3\2\2\2\u019a\u019b"+
		"\7k\2\2\u019b\u019c\7u\2\2\u019c\u019d\7\"\2\2\u019d\u019e\7p\2\2\u019e"+
		"\u019f\7q\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a2\7g\2"+
		"\2\u01a2\u01a3\7s\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6"+
		"\7n\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"8\3\2\2\2\u01aa\u01ab\7r\2\2\u01ab\u01ac\7n\2\2\u01ac\u01ad\7g\2\2\u01ad"+
		"\u01ae\7c\2\2\u01ae\u01af\7u\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7\"\2"+
		"\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7c\2\2\u01b4\u01b5"+
		"\7t\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7\"\2\2\u01b7\u01b8\7h\2\2\u01b8"+
		"\u01b9\7w\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7v\2\2"+
		"\u01bc\u01bd\7k\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bf:\3\2\2"+
		"\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7j\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4"+
		"\7v\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7u\2\2\u01c7"+
		"\u01c8\7\"\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7n\2"+
		"\2\u01cb<\3\2\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7h\2\2\u01ce>\3\2\2\2"+
		"\u01cf\u01d0\7g\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7u\2\2\u01d2\u01d3"+
		"\7g\2\2\u01d3\u01d4\7\"\2\2\u01d4\u01d5\7f\2\2\u01d5\u01d6\7q\2\2\u01d6"+
		"@\3\2\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7e\2\2\u01da"+
		"\u01db\7t\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7o\2\2\u01dd\u01de\7g\2\2"+
		"\u01de\u01df\7p\2\2\u01df\u01e0\7v\2\2\u01e0B\3\2\2\2\u01e1\u01e2\7f\2"+
		"\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7e\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6"+
		"\7g\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7u\2\2\u01e8\u01e9\7g\2\2\u01e9"+
		"D\3\2\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7f\2\2\u01ec\u01ed\7f\2\2\u01ed"+
		"F\3\2\2\2\u01ee\u01ef\7o\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7p\2\2\u01f1"+
		"\u01f2\7w\2\2\u01f2\u01f3\7u\2\2\u01f3H\3\2\2\2\u01f4\u01f5\7o\2\2\u01f5"+
		"\u01f6\7w\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7k\2\2"+
		"\u01f9\u01fa\7r\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7{\2\2\u01fcJ\3\2\2"+
		"\2\u01fd\u01fe\7f\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7x\2\2\u0200\u0201"+
		"\7k\2\2\u0201\u0202\7f\2\2\u0202\u0203\7g\2\2\u0203L\3\2\2\2\u0204\u0205"+
		"\7o\2\2\u0205\u0206\7q\2\2\u0206\u0207\7f\2\2\u0207N\3\2\2\2\u0208\u0209"+
		"\7c\2\2\u0209\u020a\7p\2\2\u020a\u020b\7f\2\2\u020bP\3\2\2\2\u020c\u020d"+
		"\7q\2\2\u020d\u020e\7t\2\2\u020eR\3\2\2\2\u020f\u0210\7k\2\2\u0210\u0211"+
		"\7u\2\2\u0211\u0212\7\"\2\2\u0212\u0213\7i\2\2\u0213\u0214\7t\2\2\u0214"+
		"\u0215\7g\2\2\u0215\u0216\7c\2\2\u0216\u0217\7v\2\2\u0217\u0218\7g\2\2"+
		"\u0218\u0219\7t\2\2\u0219\u021a\7\"\2\2\u021a\u021b\7v\2\2\u021b\u021c"+
		"\7j\2\2\u021c\u021d\7c\2\2\u021d\u021e\7p\2\2\u021eT\3\2\2\2\u021f\u0220"+
		"\7k\2\2\u0220\u0221\7u\2\2\u0221\u0222\7\"\2\2\u0222\u0223\7n\2\2\u0223"+
		"\u0224\7g\2\2\u0224\u0225\7u\2\2\u0225\u0226\7u\2\2\u0226\u0227\7\"\2"+
		"\2\u0227\u0228\7v\2\2\u0228\u0229\7j\2\2\u0229\u022a\7c\2\2\u022a\u022b"+
		"\7p\2\2\u022bV\3\2\2\2\u022c\u022d\7k\2\2\u022d\u022e\7u\2\2\u022e\u022f"+
		"\7\"\2\2\u022f\u0230\7i\2\2\u0230\u0231\7t\2\2\u0231\u0232\7g\2\2\u0232"+
		"\u0233\7c\2\2\u0233\u0234\7v\2\2\u0234\u0235\7g\2\2\u0235\u0236\7t\2\2"+
		"\u0236\u0237\7\"\2\2\u0237\u0238\7q\2\2\u0238\u0239\7t\2\2\u0239\u023a"+
		"\7\"\2\2\u023a\u023b\7g\2\2\u023b\u023c\7s\2\2\u023c\u023d\7w\2\2\u023d"+
		"\u023e\7c\2\2\u023e\u023f\7n\2\2\u023f\u0240\7\"\2\2\u0240\u0241\7v\2"+
		"\2\u0241\u0242\7q\2\2\u0242X\3\2\2\2\u0243\u0244\7k\2\2\u0244\u0245\7"+
		"u\2\2\u0245\u0246\7\"\2\2\u0246\u0247\7n\2\2\u0247\u0248\7g\2\2\u0248"+
		"\u0249\7u\2\2\u0249\u024a\7u\2\2\u024a\u024b\7\"\2\2\u024b\u024c\7v\2"+
		"\2\u024c\u024d\7j\2\2\u024d\u024e\7c\2\2\u024e\u024f\7p\2\2\u024f\u0250"+
		"\7\"\2\2\u0250\u0251\7q\2\2\u0251\u0252\7t\2\2\u0252\u0253\7\"\2\2\u0253"+
		"\u0254\7g\2\2\u0254\u0255\7s\2\2\u0255\u0256\7w\2\2\u0256\u0257\7c\2\2"+
		"\u0257\u0258\7n\2\2\u0258\u0259\7\"\2\2\u0259\u025a\7v\2\2\u025a\u025b"+
		"\7q\2\2\u025bZ\3\2\2\2\u025c\u025d\7v\2\2\u025d\u025e\7j\2\2\u025e\u025f"+
		"\7g\2\2\u025f\u0260\7\"\2\2\u0260\u0261\7x\2\2\u0261\u0262\7c\2\2\u0262"+
		"\u0263\7n\2\2\u0263\u0264\7w\2\2\u0264\u0265\7g\2\2\u0265\u0266\7\"\2"+
		"\2\u0266\u0267\7k\2\2\u0267\u0268\7p\2\2\u0268\u0269\7\"\2\2\u0269\u026a"+
		"\7v\2\2\u026a\u026b\7j\2\2\u026b\u026c\7g\2\2\u026c\u026d\7\"\2\2\u026d"+
		"\u026e\7c\2\2\u026e\u026f\7t\2\2\u026f\u0270\7t\2\2\u0270\u0271\7c\2\2"+
		"\u0271\u0272\7{\2\2\u0272\\\3\2\2\2\u0273\u0274\7v\2\2\u0274\u0275\7j"+
		"\2\2\u0275\u0276\7c\2\2\u0276\u0277\7v\2\2\u0277\u0278\7\"\2\2\u0278\u0279"+
		"\7k\2\2\u0279\u027a\7u\2\2\u027a\u027b\7\"\2\2\u027b\u027c\7i\2\2\u027c"+
		"\u027d\7n\2\2\u027d\u027e\7q\2\2\u027e\u027f\7d\2\2\u027f\u0280\7c\2\2"+
		"\u0280\u0281\7n\2\2\u0281^\3\2\2\2\u0282\u0283\7h\2\2\u0283\u0284\7q\2"+
		"\2\u0284\u0285\7t\2\2\u0285\u0286\7\"\2\2\u0286\u0287\7v\2\2\u0287\u0288"+
		"\7j\2\2\u0288\u0289\7g\2\2\u0289\u028a\7\"\2\2\u028a\u028b\7n\2\2\u028b"+
		"\u028c\7q\2\2\u028c\u028d\7q\2\2\u028d\u028e\7r\2\2\u028e`\3\2\2\2\u028f"+
		"\u0290\7y\2\2\u0290\u0291\7j\2\2\u0291\u0292\7k\2\2\u0292\u0293\7n\2\2"+
		"\u0293\u0294\7g\2\2\u0294b\3\2\2\2\u0295\u0296\7v\2\2\u0296\u0297\7j\2"+
		"\2\u0297\u0298\7c\2\2\u0298\u0299\7p\2\2\u0299\u029a\7m\2\2\u029a\u029b"+
		"\7{\2\2\u029b\u029c\7q\2\2\u029c\u029d\7w\2\2\u029d\u029e\7\"\2\2\u029e"+
		"\u029f\7v\2\2\u029f\u02a0\7j\2\2\u02a0\u02a1\7c\2\2\u02a1\u02a2\7v\2\2"+
		"\u02a2\u02a3\7\"\2\2\u02a3\u02a4\7k\2\2\u02a4\u02a5\7u\2\2\u02a5\u02a6"+
		"\7\"\2\2\u02a6\u02a7\7c\2\2\u02a7\u02a8\7n\2\2\u02a8\u02a9\7n\2\2\u02a9"+
		"d\3\2\2\2\u02aa\u02ab\7r\2\2\u02ab\u02ac\7n\2\2\u02ac\u02ad\7g\2\2\u02ad"+
		"\u02ae\7c\2\2\u02ae\u02af\7u\2\2\u02af\u02b0\7g\2\2\u02b0\u02b1\7\"\2"+
		"\2\u02b1\u02b2\7t\2\2\u02b2\u02b3\7g\2\2\u02b3\u02b4\7v\2\2\u02b4\u02b5"+
		"\7w\2\2\u02b5\u02b6\7t\2\2\u02b6\u02b7\7p\2\2\u02b7f\3\2\2\2\u02b8\u02b9"+
		"\7p\2\2\u02b9\u02ba\7w\2\2\u02ba\u02bb\7n\2\2\u02bb\u02bc\7n\2\2\u02bc"+
		"h\3\2\2\2\u02bd\u02be\7v\2\2\u02be\u02bf\7t\2\2\u02bf\u02c0\7w\2\2\u02c0"+
		"\u02c7\7g\2\2\u02c1\u02c2\7h\2\2\u02c2\u02c3\7c\2\2\u02c3\u02c4\7n\2\2"+
		"\u02c4\u02c5\7u\2\2\u02c5\u02c7\7g\2\2\u02c6\u02bd\3\2\2\2\u02c6\u02c1"+
		"\3\2\2\2\u02c7j\3\2\2\2\u02c8\u02ca\5s:\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02ce\5u;\2\u02cel\3\2\2\2\u02cf\u02d1\5s:\2\u02d0\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3n\3\2\2\2"+
		"\u02d4\u02d8\5+\26\2\u02d5\u02d9\5)\25\2\u02d6\u02d9\5-\27\2\u02d7\u02d9"+
		"\7\"\2\2\u02d8\u02d5\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\5+\26\2\u02ddp\3\2\2\2\u02de\u02e0\5\'\24\2\u02df\u02de"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e5\5)\25\2\u02e2"+
		"\u02e6\5)\25\2\u02e3\u02e6\5s:\2\u02e4\u02e6\5\'\24\2\u02e5\u02e2\3\2"+
		"\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8r\3\2\2\2\u02e9\u02ea\t\3\2\2"+
		"\u02eat\3\2\2\2\u02eb\u02ed\7\60\2\2\u02ec\u02ee\5s:\2\u02ed\u02ec\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"v\3\2\2\2\u02f1\u02f2\t\4\2\2\u02f2x\3\2\2\2\u02f3\u02f4\t\5\2\2\u02f4"+
		"z\3\2\2\2\16\2\u013e\u0148\u02c6\u02cb\u02d2\u02d8\u02da\u02df\u02e5\u02e7"+
		"\u02ef\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}