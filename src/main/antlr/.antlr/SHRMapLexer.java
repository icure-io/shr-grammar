// Generated from /Users/kmahalingam/standardhealth/shr-grammar/src/main/antlr/SHRMapLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHRMapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_GRAMMAR=1, KW_G_MAP=2, KW_NAMESPACE=3, KW_TBD=4, KW_TARGET=5, KW_MAPS_TO=6, 
		KW_CONSTRAIN=7, KW_FIX=8, KW_TO=9, KW_BAR_CONCEPT=10, KW_BAR_ENTRY=11, 
		KW_BAR_VALUE=12, DOT=13, STAR=14, OPEN_BRACKET=15, CLOSE_BRACKET=16, COLON=17, 
		RANGE=18, KW_BOOLEAN=19, KW_INTEGER=20, KW_STRING=21, KW_DECIMAL=22, KW_URI=23, 
		KW_BASE64_BINARY=24, KW_INSTANT=25, KW_DATE=26, KW_DATE_TIME=27, KW_TIME=28, 
		KW_CODE=29, KW_OID=30, KW_ID=31, KW_MARKDOWN=32, KW_UNSIGNED_INT=33, KW_POSITIVE_INT=34, 
		KW_XHTML=35, WHOLE_NUMBER=36, ALL_CAPS=37, UPPER_WORD=38, LOWER_WORD=39, 
		DOT_SEPARATED_LW=40, DOT_SEPARATED_UW=41, STRING=42, WS=43, NEWLINE=44, 
		COMMENT=45, LINE_COMMENT=46, TARGET_PHRASE=47, WS2=48, TARGET_WORD=49, 
		WS3=50, TARGET_WORD_2=51, TARGET_PHRASE_2=52, WS4=53;
	public static final int
		MAPPING_TARGET=1, CARDINALITY_MAPPING_TARGET=2, FIXED_MAPPING_TARGET=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "MAPPING_TARGET", "CARDINALITY_MAPPING_TARGET", "FIXED_MAPPING_TARGET"
	};

	public static final String[] ruleNames = {
		"KW_GRAMMAR", "KW_G_MAP", "KW_NAMESPACE", "KW_TBD", "KW_TARGET", "KW_MAPS_TO", 
		"KW_CONSTRAIN", "KW_FIX", "KW_TO", "KW_BAR_CONCEPT", "KW_BAR_ENTRY", "KW_BAR_VALUE", 
		"DOT", "STAR", "OPEN_BRACKET", "CLOSE_BRACKET", "COLON", "RANGE", "KW_BOOLEAN", 
		"KW_INTEGER", "KW_STRING", "KW_DECIMAL", "KW_URI", "KW_BASE64_BINARY", 
		"KW_INSTANT", "KW_DATE", "KW_DATE_TIME", "KW_TIME", "KW_CODE", "KW_OID", 
		"KW_ID", "KW_MARKDOWN", "KW_UNSIGNED_INT", "KW_POSITIVE_INT", "KW_XHTML", 
		"WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", 
		"DOT_SEPARATED_UW", "STRING", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", 
		"TARGET_PHRASE", "WS2", "TARGET_WORD", "WS3", "TARGET_WORD_2", "TARGET_PHRASE_2", 
		"WS4"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Grammar:'", "'Map'", "'Namespace:'", "'TBD'", "'Target:'", "'maps to'", 
		"'constrain'", "'fix'", "'to'", "'_Concept'", "'_Entry'", "'_Value'", 
		"'.'", "'*'", "'['", "']'", "':'", "'..'", "'boolean'", "'integer'", "'string'", 
		"'decimal'", "'uri'", "'base64Binary'", "'instant'", "'date'", "'dateTime'", 
		"'time'", "'code'", "'oid'", "'id'", "'markdown'", "'unsignedInt'", "'positiveInt'", 
		"'xhtml'", null, null, null, null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_GRAMMAR", "KW_G_MAP", "KW_NAMESPACE", "KW_TBD", "KW_TARGET", 
		"KW_MAPS_TO", "KW_CONSTRAIN", "KW_FIX", "KW_TO", "KW_BAR_CONCEPT", "KW_BAR_ENTRY", 
		"KW_BAR_VALUE", "DOT", "STAR", "OPEN_BRACKET", "CLOSE_BRACKET", "COLON", 
		"RANGE", "KW_BOOLEAN", "KW_INTEGER", "KW_STRING", "KW_DECIMAL", "KW_URI", 
		"KW_BASE64_BINARY", "KW_INSTANT", "KW_DATE", "KW_DATE_TIME", "KW_TIME", 
		"KW_CODE", "KW_OID", "KW_ID", "KW_MARKDOWN", "KW_UNSIGNED_INT", "KW_POSITIVE_INT", 
		"KW_XHTML", "WHOLE_NUMBER", "ALL_CAPS", "UPPER_WORD", "LOWER_WORD", "DOT_SEPARATED_LW", 
		"DOT_SEPARATED_UW", "STRING", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", 
		"TARGET_PHRASE", "WS2", "TARGET_WORD", "WS3", "TARGET_WORD_2", "TARGET_PHRASE_2", 
		"WS4"
	};
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


	public SHRMapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SHRMapLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0217\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\6%\u0157\n%\r%\16"+
		"%\u0158\3&\3&\7&\u015d\n&\f&\16&\u0160\13&\3\'\3\'\7\'\u0164\n\'\f\'\16"+
		"\'\u0167\13\'\3(\3(\7(\u016b\n(\f(\16(\u016e\13(\3)\3)\7)\u0172\n)\f)"+
		"\16)\u0175\13)\3)\3)\3)\7)\u017a\n)\f)\16)\u017d\13)\6)\u017f\n)\r)\16"+
		")\u0180\3*\3*\7*\u0185\n*\f*\16*\u0188\13*\3*\3*\3*\7*\u018d\n*\f*\16"+
		"*\u0190\13*\7*\u0192\n*\f*\16*\u0195\13*\3*\3*\3*\7*\u019a\n*\f*\16*\u019d"+
		"\13*\3+\3+\7+\u01a1\n+\f+\16+\u01a4\13+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\7.\u01b4\n.\f.\16.\u01b7\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7"+
		"/\u01c2\n/\f/\16/\u01c5\13/\3/\3/\3\60\7\60\u01ca\n\60\f\60\16\60\u01cd"+
		"\13\60\3\60\3\60\7\60\u01d1\n\60\f\60\16\60\u01d4\13\60\6\60\u01d6\n\60"+
		"\r\60\16\60\u01d7\3\60\3\60\3\61\6\61\u01dd\n\61\r\61\16\61\u01de\3\61"+
		"\3\61\3\62\6\62\u01e4\n\62\r\62\16\62\u01e5\3\62\3\62\3\63\6\63\u01eb"+
		"\n\63\r\63\16\63\u01ec\3\63\3\63\3\64\6\64\u01f2\n\64\r\64\16\64\u01f3"+
		"\3\65\3\65\3\65\3\65\6\65\u01fa\n\65\r\65\16\65\u01fb\3\65\7\65\u01ff"+
		"\n\65\f\65\16\65\u0202\13\65\3\65\3\65\7\65\u0206\n\65\f\65\16\65\u0209"+
		"\13\65\6\65\u020b\n\65\r\65\16\65\u020c\3\65\3\65\3\66\6\66\u0212\n\66"+
		"\r\66\16\66\u0213\3\66\3\66\3\u01b5\2\67\6\3\b\4\n\5\f\6\16\7\20\b\22"+
		"\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60"+
		"\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\"+
		".^/`\60b\61d\62f\63h\64j\65l\66n\67\6\2\3\4\5\17\3\2\62;\3\2C\\\5\2\62"+
		";C\\aa\6\2\62;C\\^ac|\3\2c|\7\2//\62;C\\^^c|\5\2//\62;C|\4\2$$^^\5\2\13"+
		"\13\17\17\"\"\4\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2\13\f\17\17\"\"<<\4"+
		"\2\13\13\"\"\2\u022d\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2"+
		"\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3"+
		"\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2"+
		"$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60"+
		"\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2"+
		"\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H"+
		"\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2"+
		"\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2"+
		"\2\3b\3\2\2\2\3d\3\2\2\2\4f\3\2\2\2\4h\3\2\2\2\5j\3\2\2\2\5l\3\2\2\2\5"+
		"n\3\2\2\2\6p\3\2\2\2\by\3\2\2\2\n}\3\2\2\2\f\u0088\3\2\2\2\16\u008c\3"+
		"\2\2\2\20\u0094\3\2\2\2\22\u009e\3\2\2\2\24\u00aa\3\2\2\2\26\u00b0\3\2"+
		"\2\2\30\u00b3\3\2\2\2\32\u00bc\3\2\2\2\34\u00c3\3\2\2\2\36\u00ca\3\2\2"+
		"\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00d4"+
		"\3\2\2\2*\u00d7\3\2\2\2,\u00df\3\2\2\2.\u00e7\3\2\2\2\60\u00ee\3\2\2\2"+
		"\62\u00f6\3\2\2\2\64\u00fa\3\2\2\2\66\u0107\3\2\2\28\u010f\3\2\2\2:\u0114"+
		"\3\2\2\2<\u011d\3\2\2\2>\u0122\3\2\2\2@\u0127\3\2\2\2B\u012b\3\2\2\2D"+
		"\u012e\3\2\2\2F\u0137\3\2\2\2H\u0143\3\2\2\2J\u014f\3\2\2\2L\u0156\3\2"+
		"\2\2N\u015a\3\2\2\2P\u0161\3\2\2\2R\u0168\3\2\2\2T\u016f\3\2\2\2V\u0182"+
		"\3\2\2\2X\u019e\3\2\2\2Z\u01a7\3\2\2\2\\\u01ab\3\2\2\2^\u01af\3\2\2\2"+
		"`\u01bd\3\2\2\2b\u01d5\3\2\2\2d\u01dc\3\2\2\2f\u01e3\3\2\2\2h\u01ea\3"+
		"\2\2\2j\u01f1\3\2\2\2l\u020a\3\2\2\2n\u0211\3\2\2\2pq\7I\2\2qr\7t\2\2"+
		"rs\7c\2\2st\7o\2\2tu\7o\2\2uv\7c\2\2vw\7t\2\2wx\7<\2\2x\7\3\2\2\2yz\7"+
		"O\2\2z{\7c\2\2{|\7r\2\2|\t\3\2\2\2}~\7P\2\2~\177\7c\2\2\177\u0080\7o\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7u\2\2\u0082\u0083\7r\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\u0087\7<\2\2\u0087"+
		"\13\3\2\2\2\u0088\u0089\7V\2\2\u0089\u008a\7D\2\2\u008a\u008b\7F\2\2\u008b"+
		"\r\3\2\2\2\u008c\u008d\7V\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7i\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7<\2\2"+
		"\u0093\17\3\2\2\2\u0094\u0095\7o\2\2\u0095\u0096\7c\2\2\u0096\u0097\7"+
		"r\2\2\u0097\u0098\7u\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\7\2\2\u009d\21\3\2\2\2"+
		"\u009e\u009f\7e\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\b\3"+
		"\2\u00a9\23\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7z\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\t\4\2\u00af\25\3\2\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7q\2\2\u00b2\27\3\2\2\2\u00b3\u00b4\7a\2\2\u00b4"+
		"\u00b5\7E\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7v\2\2\u00bb\31\3\2"+
		"\2\2\u00bc\u00bd\7a\2\2\u00bd\u00be\7G\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7{\2\2\u00c2\33\3\2\2\2\u00c3\u00c4"+
		"\7a\2\2\u00c4\u00c5\7X\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7w\2\2\u00c8\u00c9\7g\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\7\60\2\2"+
		"\u00cb\37\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7]\2\2"+
		"\u00cf#\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3"+
		"\'\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6\7\60\2\2\u00d6)\3\2\2\2\u00d7"+
		"\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de+\3\2\2"+
		"\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"-\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7i\2\2\u00ed/\3\2\2\2\u00ee"+
		"\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\61\3\2"+
		"\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\63"+
		"\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\78\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\7D\2"+
		"\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7c\2\2\u0104\u0105"+
		"\7t\2\2\u0105\u0106\7{\2\2\u0106\65\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7v\2\2\u010e\67\3\2\2\2\u010f\u0110\7f\2\2\u0110"+
		"\u0111\7c\2\2\u0111\u0112\7v\2\2\u0112\u0113\7g\2\2\u01139\3\2\2\2\u0114"+
		"\u0115\7f\2\2\u0115\u0116\7c\2\2\u0116\u0117\7v\2\2\u0117\u0118\7g\2\2"+
		"\u0118\u0119\7V\2\2\u0119\u011a\7k\2\2\u011a\u011b\7o\2\2\u011b\u011c"+
		"\7g\2\2\u011c;\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120"+
		"\7o\2\2\u0120\u0121\7g\2\2\u0121=\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7q\2\2\u0124\u0125\7f\2\2\u0125\u0126\7g\2\2\u0126?\3\2\2\2\u0127\u0128"+
		"\7q\2\2\u0128\u0129\7k\2\2\u0129\u012a\7f\2\2\u012aA\3\2\2\2\u012b\u012c"+
		"\7k\2\2\u012c\u012d\7f\2\2\u012dC\3\2\2\2\u012e\u012f\7o\2\2\u012f\u0130"+
		"\7c\2\2\u0130\u0131\7t\2\2\u0131\u0132\7m\2\2\u0132\u0133\7f\2\2\u0133"+
		"\u0134\7q\2\2\u0134\u0135\7y\2\2\u0135\u0136\7p\2\2\u0136E\3\2\2\2\u0137"+
		"\u0138\7w\2\2\u0138\u0139\7p\2\2\u0139\u013a\7u\2\2\u013a\u013b\7k\2\2"+
		"\u013b\u013c\7i\2\2\u013c\u013d\7p\2\2\u013d\u013e\7g\2\2\u013e\u013f"+
		"\7f\2\2\u013f\u0140\7K\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142"+
		"G\3\2\2\2\u0143\u0144\7r\2\2\u0144\u0145\7q\2\2\u0145\u0146\7u\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7v\2\2\u0148\u0149\7k\2\2\u0149\u014a\7x\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7K\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\7v\2\2\u014eI\3\2\2\2\u014f\u0150\7z\2\2\u0150\u0151\7j\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7o\2\2\u0153\u0154\7n\2\2\u0154K\3\2\2\2\u0155\u0157"+
		"\t\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159M\3\2\2\2\u015a\u015e\t\3\2\2\u015b\u015d\t\4\2\2"+
		"\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015fO\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0165\t\3\2\2\u0162"+
		"\u0164\t\5\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166Q\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c"+
		"\t\6\2\2\u0169\u016b\t\7\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dS\3\2\2\2\u016e\u016c\3\2\2\2"+
		"\u016f\u0173\t\6\2\2\u0170\u0172\t\7\2\2\u0171\u0170\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u017e\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\7\60\2\2\u0177\u017b\t\6\2\2\u0178\u017a\t"+
		"\b\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0176\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"U\3\2\2\2\u0182\u0186\t\6\2\2\u0183\u0185\t\7\2\2\u0184\u0183\3\2\2\2"+
		"\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0193"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\60\2\2\u018a\u018e\t\6\2\2"+
		"\u018b\u018d\t\b\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0189\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\60\2\2\u0197"+
		"\u019b\t\3\2\2\u0198\u019a\t\b\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019cW\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019e\u01a2\7$\2\2\u019f\u01a1\n\t\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7$\2\2\u01a6Y\3\2\2\2\u01a7\u01a8"+
		"\t\n\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b,\5\2\u01aa[\3\2\2\2\u01ab\u01ac"+
		"\7\f\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b-\5\2\u01ae]\3\2\2\2\u01af\u01b0"+
		"\7\61\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\13\2\2\2"+
		"\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9"+
		"\u01ba\7\61\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\b.\6\2\u01bc_\3\2\2\2"+
		"\u01bd\u01be\7\61\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c3\3\2\2\2\u01c0\u01c2"+
		"\n\13\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2"+
		"\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7"+
		"\b/\6\2\u01c7a\3\2\2\2\u01c8\u01ca\n\f\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d2\n\r\2\2\u01cf\u01d1\t\n\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01cb\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\b\60\7\2\u01dac\3\2\2\2\u01db\u01dd\t\f\2\2\u01dc\u01db\3\2\2\2"+
		"\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\b\61\5\2\u01e1e\3\2\2\2\u01e2\u01e4\n\f\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\b\62\7\2\u01e8g\3\2\2\2\u01e9\u01eb"+
		"\t\f\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\b\63\5\2\u01efi\3\2\2\2"+
		"\u01f0\u01f2\n\f\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4k\3\2\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7"+
		"\7q\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\t\16\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0200\3\2"+
		"\2\2\u01fd\u01ff\n\f\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0203\u0207\n\r\2\2\u0204\u0206\t\n\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u020a\u01f5\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\b\65"+
		"\7\2\u020fm\3\2\2\2\u0210\u0212\t\f\2\2\u0211\u0210\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\b\66\5\2\u0216o\3\2\2\2 \2\3\4\5\u0158\u015e\u0165\u016c\u0173"+
		"\u017b\u0180\u0186\u018e\u0193\u019b\u01a2\u01b5\u01c3\u01cb\u01d2\u01d7"+
		"\u01de\u01e5\u01ec\u01f3\u01fb\u0200\u0207\u020c\u0213\b\7\3\2\7\4\2\7"+
		"\5\2\2\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}