// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, BLCOMMENT=43, WHITESPACE=44, 
		STR_START=45, E_NEWLINE=46, STRING_BODY_PLAIN=47;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "BOOL_CONST", "TYPEID", "OBJECTID", "INT_CONST", "LPAREN", "RPAREN", 
		"COLON", "ATSYM", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", 
		"LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", "ASSIGN", "BLCOMMENT", 
		"WHITESPACE", "STR_START", "STRING_END", "E_NEWLINE", "STRING_BODY_PLAIN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "BLCOMMENT", "WHITESPACE", "STR_START", "E_NEWLINE", "STRING_BODY_PLAIN"
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



		/*
			YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
		*/

		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
		* DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}

		public void processString() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			//write your code to test strings here

		}


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u012a\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c1\n\25\3\26\3\26\7\26"+
		"\u00c5\n\26\f\26\16\26\u00c8\13\26\3\27\3\27\7\27\u00cc\n\27\f\27\16\27"+
		"\u00cf\13\27\3\30\6\30\u00d2\n\30\r\30\16\30\u00d3\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\7*\u00fe"+
		"\n*\f*\16*\u0101\13*\3*\5*\u0104\n*\3*\3*\3*\3*\3*\3+\6+\u010c\n+\r+\16"+
		"+\u010d\3+\3+\3,\3,\3,\3,\3,\3-\3-\7-\u0119\n-\f-\16-\u011c\13-\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3/\6/\u0127\n/\r/\16/\u0128\3\u00ff\2\60\4\r\6\31\b"+
		"\34\n\35\f\36\16\37\20 \22!\24\"\26#\30$\32%\34&\36\' (\")$*&+(,*\6,\4"+
		".\5\60\7\62\t\64\n\66\138\f:\16<\17>\20@\21B\22D\23F\24H\25J\26L\27N\30"+
		"P\32R\33T-V.X/Z\2\\\60^\61\4\2\3\31\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4"+
		"\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2QQqq\4\2RRr"+
		"r\4\2YYyy\4\2XXxx\4\2FFff\4\2WWww\3\2C\\\7\2\62;C\\aac|~~\3\2c|\3\2\62"+
		";\7\2\n\f\16\17\"\"^^xx\b\2\2\2\17\17$$GHQQ^^\u0132\2\4\3\2\2\2\2\6\3"+
		"\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2"+
		"\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3"+
		"\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3"+
		"\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64"+
		"\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3"+
		"\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2"+
		"\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\3"+
		"Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\be\3\2\2\2\nk\3"+
		"\2\2\2\fp\3\2\2\2\16s\3\2\2\2\20v\3\2\2\2\22y\3\2\2\2\24\u0082\3\2\2\2"+
		"\26\u0086\3\2\2\2\30\u008b\3\2\2\2\32\u0090\3\2\2\2\34\u0095\3\2\2\2\36"+
		"\u009b\3\2\2\2 \u00a0\3\2\2\2\"\u00a5\3\2\2\2$\u00a8\3\2\2\2&\u00ac\3"+
		"\2\2\2(\u00b3\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2.\u00c9\3\2\2\2\60"+
		"\u00d1\3\2\2\2\62\u00d5\3\2\2\2\64\u00d7\3\2\2\2\66\u00d9\3\2\2\28\u00db"+
		"\3\2\2\2:\u00dd\3\2\2\2<\u00df\3\2\2\2>\u00e1\3\2\2\2@\u00e3\3\2\2\2B"+
		"\u00e5\3\2\2\2D\u00e7\3\2\2\2F\u00e9\3\2\2\2H\u00eb\3\2\2\2J\u00ed\3\2"+
		"\2\2L\u00ef\3\2\2\2N\u00f1\3\2\2\2P\u00f3\3\2\2\2R\u00f6\3\2\2\2T\u00f9"+
		"\3\2\2\2V\u010b\3\2\2\2X\u0111\3\2\2\2Z\u011a\3\2\2\2\\\u0122\3\2\2\2"+
		"^\u0126\3\2\2\2`a\7=\2\2a\5\3\2\2\2bc\7?\2\2cd\7@\2\2d\7\3\2\2\2ef\t\2"+
		"\2\2fg\t\3\2\2gh\t\4\2\2hi\t\5\2\2ij\t\5\2\2j\t\3\2\2\2kl\t\6\2\2lm\t"+
		"\3\2\2mn\t\5\2\2no\t\6\2\2o\13\3\2\2\2pq\t\7\2\2qr\t\b\2\2r\r\3\2\2\2"+
		"st\t\b\2\2tu\t\7\2\2u\17\3\2\2\2vw\t\b\2\2wx\t\t\2\2x\21\3\2\2\2yz\t\b"+
		"\2\2z{\t\t\2\2{|\t\n\2\2|}\t\6\2\2}~\t\13\2\2~\177\t\b\2\2\177\u0080\t"+
		"\f\2\2\u0080\u0081\t\5\2\2\u0081\23\3\2\2\2\u0082\u0083\t\3\2\2\u0083"+
		"\u0084\t\6\2\2\u0084\u0085\t\f\2\2\u0085\25\3\2\2\2\u0086\u0087\t\3\2"+
		"\2\u0087\u0088\t\r\2\2\u0088\u0089\t\r\2\2\u0089\u008a\t\16\2\2\u008a"+
		"\27\3\2\2\2\u008b\u008c\t\16\2\2\u008c\u008d\t\r\2\2\u008d\u008e\t\r\2"+
		"\2\u008e\u008f\t\3\2\2\u008f\31\3\2\2\2\u0090\u0091\t\f\2\2\u0091\u0092"+
		"\t\n\2\2\u0092\u0093\t\6\2\2\u0093\u0094\t\t\2\2\u0094\33\3\2\2\2\u0095"+
		"\u0096\t\17\2\2\u0096\u0097\t\n\2\2\u0097\u0098\t\b\2\2\u0098\u0099\t"+
		"\3\2\2\u0099\u009a\t\6\2\2\u009a\35\3\2\2\2\u009b\u009c\t\2\2\2\u009c"+
		"\u009d\t\4\2\2\u009d\u009e\t\5\2\2\u009e\u009f\t\6\2\2\u009f\37\3\2\2"+
		"\2\u00a0\u00a1\t\6\2\2\u00a1\u00a2\t\5\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a4"+
		"\t\2\2\2\u00a4!\3\2\2\2\u00a5\u00a6\t\r\2\2\u00a6\u00a7\t\7\2\2\u00a7"+
		"#\3\2\2\2\u00a8\u00a9\t\t\2\2\u00a9\u00aa\t\6\2\2\u00aa\u00ab\t\17\2\2"+
		"\u00ab%\3\2\2\2\u00ac\u00ad\t\b\2\2\u00ad\u00ae\t\5\2\2\u00ae\u00af\t"+
		"\20\2\2\u00af\u00b0\t\r\2\2\u00b0\u00b1\t\b\2\2\u00b1\u00b2\t\21\2\2\u00b2"+
		"\'\3\2\2\2\u00b3\u00b4\t\t\2\2\u00b4\u00b5\t\r\2\2\u00b5\u00b6\t\f\2\2"+
		"\u00b6)\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\t\13\2\2\u00b9\u00ba\t"+
		"\22\2\2\u00ba\u00c1\t\6\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\t\4\2\2\u00bd"+
		"\u00be\t\3\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c1\t\6\2\2\u00c0\u00b7\3\2"+
		"\2\2\u00c0\u00bb\3\2\2\2\u00c1+\3\2\2\2\u00c2\u00c6\t\23\2\2\u00c3\u00c5"+
		"\t\24\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7-\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\t"+
		"\25\2\2\u00ca\u00cc\t\24\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce/\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\u00d2\t\26\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\61\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6"+
		"\63\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8\65\3\2\2\2\u00d9\u00da\7<\2\2\u00da"+
		"\67\3\2\2\2\u00db\u00dc\7B\2\2\u00dc9\3\2\2\2\u00dd\u00de\7.\2\2\u00de"+
		";\3\2\2\2\u00df\u00e0\7-\2\2\u00e0=\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2?"+
		"\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4A\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6"+
		"C\3\2\2\2\u00e7\u00e8\7\u0080\2\2\u00e8E\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea"+
		"G\3\2\2\2\u00eb\u00ec\7?\2\2\u00ecI\3\2\2\2\u00ed\u00ee\7}\2\2\u00eeK"+
		"\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0M\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"O\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7?\2\2\u00f5Q\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f7\u00f8\7/\2\2\u00f8S\3\2\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb"+
		"\7,\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5T*\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7,\2\2\u0106\u0107\7+\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\b*\2\2\u0109U\3\2\2\2\u010a\u010c\t\27\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b+\2\2\u0110W\3\2\2\2\u0111\u0112"+
		"\7$\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b,\2\2\u0114\u0115\b,\3\2\u0115"+
		"Y\3\2\2\2\u0116\u0119\5^/\2\u0117\u0119\5\\.\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7$\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\b-\4\2\u0120\u0121\b-\5\2\u0121[\3\2\2\2\u0122"+
		"\u0123\7^\2\2\u0123\u0124\7\17\2\2\u0124]\3\2\2\2\u0125\u0127\n\30\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129_\3\2\2\2\16\2\3\u00c0\u00c6\u00cd\u00d3\u00ff\u0103\u010d"+
		"\u0118\u011a\u0128\6\b\2\2\7\3\2\6\2\2\t\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}