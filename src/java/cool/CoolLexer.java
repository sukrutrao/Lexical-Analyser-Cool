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
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "BOOL_CONST", "TYPEID", "OBJECTID", "INT_CONST", 
		"STR_CONST", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", 
		"ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", 
		"POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5\7\5"+
		"h\n\5\f\5\16\5k\13\5\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\7\6\7u\n\7\r\7"+
		"\16\7v\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\2\2+\3\r\5\31\7\6\t\4\13\5"+
		"\r\7\17\b\21\t\23\n\25\13\27\f\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\32\61\33\63\34\65\35\67\369\37; =!?\"A#C$E%G&I\'K(M)O*Q"+
		"+S,\3\2\30\4\2TTtt\4\2WWww\4\2GGgg\4\2CCcc\4\2NNnn\4\2UUuu\3\2C\\\7\2"+
		"\62;C\\aac|~~\3\2c|\3\2\62;\5\2C\\c|~~\4\2EEee\4\2HHhh\4\2KKkk\4\2PPp"+
		"p\4\2JJjj\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\u00fb\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2"+
		"\2\2\5W\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13l\3\2\2\2\rt\3\2\2\2\17x\3\2\2"+
		"\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2"+
		"\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!"+
		"\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099\3"+
		"\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61\u00a2\3\2\2\2\63"+
		"\u00a5\3\2\2\2\65\u00ab\3\2\2\2\67\u00b0\3\2\2\29\u00b3\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00b9\3\2\2\2?\u00c2\3\2\2\2A\u00c6\3\2\2\2C\u00cb\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d5\3\2\2\2I\u00db\3\2\2\2K\u00e0\3\2\2\2M\u00e5\3\2"+
		"\2\2O\u00e8\3\2\2\2Q\u00ec\3\2\2\2S\u00f3\3\2\2\2UV\7=\2\2V\4\3\2\2\2"+
		"WX\7?\2\2XY\7@\2\2Y\6\3\2\2\2Z[\7V\2\2[\\\t\2\2\2\\]\t\3\2\2]d\t\4\2\2"+
		"^_\7H\2\2_`\t\5\2\2`a\t\6\2\2ab\t\7\2\2bd\t\4\2\2cZ\3\2\2\2c^\3\2\2\2"+
		"d\b\3\2\2\2ei\t\b\2\2fh\t\t\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j\n\3\2\2\2ki\3\2\2\2lp\t\n\2\2mo\t\t\2\2nm\3\2\2\2or\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2q\f\3\2\2\2rp\3\2\2\2su\t\13\2\2ts\3\2\2\2uv\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2w\16\3\2\2\2x|\7$\2\2y{\t\f\2\2zy\3\2\2\2{~\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7$\2\2\u0080\20\3"+
		"\2\2\2\u0081\u0082\7*\2\2\u0082\22\3\2\2\2\u0083\u0084\7+\2\2\u0084\24"+
		"\3\2\2\2\u0085\u0086\7<\2\2\u0086\26\3\2\2\2\u0087\u0088\7B\2\2\u0088"+
		"\30\3\2\2\2\u0089\u008a\7.\2\2\u008a\32\3\2\2\2\u008b\u008c\7-\2\2\u008c"+
		"\34\3\2\2\2\u008d\u008e\7/\2\2\u008e\36\3\2\2\2\u008f\u0090\7,\2\2\u0090"+
		" \3\2\2\2\u0091\u0092\7\61\2\2\u0092\"\3\2\2\2\u0093\u0094\7\u0080\2\2"+
		"\u0094$\3\2\2\2\u0095\u0096\7>\2\2\u0096&\3\2\2\2\u0097\u0098\7?\2\2\u0098"+
		"(\3\2\2\2\u0099\u009a\7}\2\2\u009a*\3\2\2\2\u009b\u009c\7\177\2\2\u009c"+
		",\3\2\2\2\u009d\u009e\7\60\2\2\u009e.\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"\62\3\2\2\2\u00a5\u00a6\t\r\2\2\u00a6\u00a7\t\6\2\2\u00a7\u00a8\t\5\2"+
		"\2\u00a8\u00a9\t\7\2\2\u00a9\u00aa\t\7\2\2\u00aa\64\3\2\2\2\u00ab\u00ac"+
		"\t\4\2\2\u00ac\u00ad\t\6\2\2\u00ad\u00ae\t\7\2\2\u00ae\u00af\t\4\2\2\u00af"+
		"\66\3\2\2\2\u00b0\u00b1\t\16\2\2\u00b1\u00b2\t\17\2\2\u00b28\3\2\2\2\u00b3"+
		"\u00b4\t\17\2\2\u00b4\u00b5\t\16\2\2\u00b5:\3\2\2\2\u00b6\u00b7\t\17\2"+
		"\2\u00b7\u00b8\t\20\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t\17\2\2\u00ba\u00bb"+
		"\t\20\2\2\u00bb\u00bc\t\21\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00be\t\2\2\2"+
		"\u00be\u00bf\t\17\2\2\u00bf\u00c0\t\22\2\2\u00c0\u00c1\t\7\2\2\u00c1>"+
		"\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00c5\t\22\2\2"+
		"\u00c5@\3\2\2\2\u00c6\u00c7\t\6\2\2\u00c7\u00c8\t\23\2\2\u00c8\u00c9\t"+
		"\23\2\2\u00c9\u00ca\t\24\2\2\u00caB\3\2\2\2\u00cb\u00cc\t\24\2\2\u00cc"+
		"\u00cd\t\23\2\2\u00cd\u00ce\t\23\2\2\u00ce\u00cf\t\6\2\2\u00cfD\3\2\2"+
		"\2\u00d0\u00d1\t\22\2\2\u00d1\u00d2\t\21\2\2\u00d2\u00d3\t\4\2\2\u00d3"+
		"\u00d4\t\20\2\2\u00d4F\3\2\2\2\u00d5\u00d6\t\25\2\2\u00d6\u00d7\t\21\2"+
		"\2\u00d7\u00d8\t\17\2\2\u00d8\u00d9\t\6\2\2\u00d9\u00da\t\4\2\2\u00da"+
		"H\3\2\2\2\u00db\u00dc\t\r\2\2\u00dc\u00dd\t\5\2\2\u00dd\u00de\t\7\2\2"+
		"\u00de\u00df\t\4\2\2\u00dfJ\3\2\2\2\u00e0\u00e1\t\4\2\2\u00e1\u00e2\t"+
		"\7\2\2\u00e2\u00e3\t\5\2\2\u00e3\u00e4\t\r\2\2\u00e4L\3\2\2\2\u00e5\u00e6"+
		"\t\23\2\2\u00e6\u00e7\t\16\2\2\u00e7N\3\2\2\2\u00e8\u00e9\t\20\2\2\u00e9"+
		"\u00ea\t\4\2\2\u00ea\u00eb\t\25\2\2\u00ebP\3\2\2\2\u00ec\u00ed\t\17\2"+
		"\2\u00ed\u00ee\t\7\2\2\u00ee\u00ef\t\26\2\2\u00ef\u00f0\t\23\2\2\u00f0"+
		"\u00f1\t\17\2\2\u00f1\u00f2\t\27\2\2\u00f2R\3\2\2\2\u00f3\u00f4\t\20\2"+
		"\2\u00f4\u00f5\t\23\2\2\u00f5\u00f6\t\22\2\2\u00f6T\3\2\2\2\b\2cipv|\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}