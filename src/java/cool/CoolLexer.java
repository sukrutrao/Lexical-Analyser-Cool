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
		STR_START=45, STRING_END=46, NEWLINE=47, NULL_CHAR=48, F_EOF_STR=49, STRING_BODY_PLAIN=50;
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
		"WHITESPACE", "STR_START", "STRING_END", "NEWLINE", "NULL_CHAR", "F_EOF_STR", 
		"STRING_BODY_PLAIN"
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
		"NOT", "BLCOMMENT", "WHITESPACE", "STR_START", "STRING_END", "NEWLINE", 
		"NULL_CHAR", "F_EOF_STR", "STRING_BODY_PLAIN"
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
			String escape_chars = "btnf";
			String escape_chars_results = "\b\t\n\f";
			int index = text.indexOf('\\');
			while(index != -1) 	{
				int escape_index = escape_chars.indexOf(text.charAt(index+1));
				if(escape_index != -1) 	{
					text = text.substring(0,index) + escape_chars_results.charAt(escape_index) + text.substring(index+2);
				}
				else
				{
					text = text.substring(0,index) + text.substring(index+1);
				}
				index = text.indexOf('\\');
			}
			setText(text);
			setType(STR_CONST);		
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			NULL_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			F_EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			STRING_BODY_PLAIN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void NULL_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("String contains null character");
			break;
		}
	}
	private void F_EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			reportError("String contains EOF	");
			break;
		}
	}
	private void STRING_BODY_PLAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			processString();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u013d\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c5"+
		"\n\25\3\26\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc\13\26\3\27\3\27\7\27"+
		"\u00d0\n\27\f\27\16\27\u00d3\13\27\3\30\6\30\u00d6\n\30\r\30\16\30\u00d7"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3*\7*\u0102\n*\f*\16*\u0105\13*\3*\5*\u0108\n*\3*\3*\3*\3*"+
		"\3*\3+\6+\u0110\n+\r+\16+\u0111\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5"+
		"\61\u0132\n\61\3\61\3\61\5\61\u0136\n\61\6\61\u0138\n\61\r\61\16\61\u0139"+
		"\3\61\3\61\3\u0103\2\62\4\r\6\31\b\34\n\35\f\36\16\37\20 \22!\24\"\26"+
		"#\30$\32%\34&\36\' (\")$*&+(,*\6,\4.\5\60\7\62\t\64\n\66\138\f:\16<\17"+
		">\20@\21B\22D\23F\24H\25J\26L\27N\30P\32R\33T-V.X/Z\60\\\61^\62`\63b\64"+
		"\4\2\3\31\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2"+
		"PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\4"+
		"\2WWww\3\2C\\\7\2\62;C\\aac|~~\3\2c|\3\2\62;\7\2\n\f\16\17\"\"^^xx\7\2"+
		"\2\2\f\f$$GHQQ\u0145\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2"+
		"\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3"+
		"\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2"+
		"\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2"+
		".\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2"+
		"\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2"+
		"F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3"+
		"\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2"+
		"\2\2\3`\3\2\2\2\3b\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bi\3\2\2\2\no\3\2\2\2"+
		"\ft\3\2\2\2\16w\3\2\2\2\20z\3\2\2\2\22}\3\2\2\2\24\u0086\3\2\2\2\26\u008a"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u0094\3\2\2\2\34\u0099\3\2\2\2\36\u009f\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00a9\3\2\2\2$\u00ac\3\2\2\2&\u00b0\3\2\2\2(\u00b7"+
		"\3\2\2\2*\u00c4\3\2\2\2,\u00c6\3\2\2\2.\u00cd\3\2\2\2\60\u00d5\3\2\2\2"+
		"\62\u00d9\3\2\2\2\64\u00db\3\2\2\2\66\u00dd\3\2\2\28\u00df\3\2\2\2:\u00e1"+
		"\3\2\2\2<\u00e3\3\2\2\2>\u00e5\3\2\2\2@\u00e7\3\2\2\2B\u00e9\3\2\2\2D"+
		"\u00eb\3\2\2\2F\u00ed\3\2\2\2H\u00ef\3\2\2\2J\u00f1\3\2\2\2L\u00f3\3\2"+
		"\2\2N\u00f5\3\2\2\2P\u00f7\3\2\2\2R\u00fa\3\2\2\2T\u00fd\3\2\2\2V\u010f"+
		"\3\2\2\2X\u0115\3\2\2\2Z\u011a\3\2\2\2\\\u011f\3\2\2\2^\u0124\3\2\2\2"+
		"`\u0129\3\2\2\2b\u0137\3\2\2\2de\7=\2\2e\5\3\2\2\2fg\7?\2\2gh\7@\2\2h"+
		"\7\3\2\2\2ij\t\2\2\2jk\t\3\2\2kl\t\4\2\2lm\t\5\2\2mn\t\5\2\2n\t\3\2\2"+
		"\2op\t\6\2\2pq\t\3\2\2qr\t\5\2\2rs\t\6\2\2s\13\3\2\2\2tu\t\7\2\2uv\t\b"+
		"\2\2v\r\3\2\2\2wx\t\b\2\2xy\t\7\2\2y\17\3\2\2\2z{\t\b\2\2{|\t\t\2\2|\21"+
		"\3\2\2\2}~\t\b\2\2~\177\t\t\2\2\177\u0080\t\n\2\2\u0080\u0081\t\6\2\2"+
		"\u0081\u0082\t\13\2\2\u0082\u0083\t\b\2\2\u0083\u0084\t\f\2\2\u0084\u0085"+
		"\t\5\2\2\u0085\23\3\2\2\2\u0086\u0087\t\3\2\2\u0087\u0088\t\6\2\2\u0088"+
		"\u0089\t\f\2\2\u0089\25\3\2\2\2\u008a\u008b\t\3\2\2\u008b\u008c\t\r\2"+
		"\2\u008c\u008d\t\r\2\2\u008d\u008e\t\16\2\2\u008e\27\3\2\2\2\u008f\u0090"+
		"\t\16\2\2\u0090\u0091\t\r\2\2\u0091\u0092\t\r\2\2\u0092\u0093\t\3\2\2"+
		"\u0093\31\3\2\2\2\u0094\u0095\t\f\2\2\u0095\u0096\t\n\2\2\u0096\u0097"+
		"\t\6\2\2\u0097\u0098\t\t\2\2\u0098\33\3\2\2\2\u0099\u009a\t\17\2\2\u009a"+
		"\u009b\t\n\2\2\u009b\u009c\t\b\2\2\u009c\u009d\t\3\2\2\u009d\u009e\t\6"+
		"\2\2\u009e\35\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2"+
		"\t\5\2\2\u00a2\u00a3\t\6\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5"+
		"\u00a6\t\5\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a8\t\2\2\2\u00a8!\3\2\2\2"+
		"\u00a9\u00aa\t\r\2\2\u00aa\u00ab\t\7\2\2\u00ab#\3\2\2\2\u00ac\u00ad\t"+
		"\t\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00af\t\17\2\2\u00af%\3\2\2\2\u00b0\u00b1"+
		"\t\b\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3\t\20\2\2\u00b3\u00b4\t\r\2\2"+
		"\u00b4\u00b5\t\b\2\2\u00b5\u00b6\t\21\2\2\u00b6\'\3\2\2\2\u00b7\u00b8"+
		"\t\t\2\2\u00b8\u00b9\t\r\2\2\u00b9\u00ba\t\f\2\2\u00ba)\3\2\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\t\13\2\2\u00bd\u00be\t\22\2\2\u00be\u00c5\t"+
		"\6\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\t\3\2\2\u00c2"+
		"\u00c3\t\5\2\2\u00c3\u00c5\t\6\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bf\3\2"+
		"\2\2\u00c5+\3\2\2\2\u00c6\u00ca\t\23\2\2\u00c7\u00c9\t\24\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"-\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\t\25\2\2\u00ce\u00d0\t\24\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2/\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\t\26\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\61\3\2\2\2\u00d9\u00da\7*\2\2\u00da\63\3\2\2\2\u00db\u00dc"+
		"\7+\2\2\u00dc\65\3\2\2\2\u00dd\u00de\7<\2\2\u00de\67\3\2\2\2\u00df\u00e0"+
		"\7B\2\2\u00e09\3\2\2\2\u00e1\u00e2\7.\2\2\u00e2;\3\2\2\2\u00e3\u00e4\7"+
		"-\2\2\u00e4=\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6?\3\2\2\2\u00e7\u00e8\7,"+
		"\2\2\u00e8A\3\2\2\2\u00e9\u00ea\7\61\2\2\u00eaC\3\2\2\2\u00eb\u00ec\7"+
		"\u0080\2\2\u00ecE\3\2\2\2\u00ed\u00ee\7>\2\2\u00eeG\3\2\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0I\3\2\2\2\u00f1\u00f2\7}\2\2\u00f2K\3\2\2\2\u00f3\u00f4\7"+
		"\177\2\2\u00f4M\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6O\3\2\2\2\u00f7\u00f8"+
		"\7>\2\2\u00f8\u00f9\7?\2\2\u00f9Q\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc"+
		"\7/\2\2\u00fcS\3\2\2\2\u00fd\u00fe\7*\2\2\u00fe\u00ff\7,\2\2\u00ff\u0103"+
		"\3\2\2\2\u0100\u0102\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\5T*\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b\7+\2\2\u010b\u010c\3\2\2"+
		"\2\u010c\u010d\b*\2\2\u010dU\3\2\2\2\u010e\u0110\t\27\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b+\2\2\u0114W\3\2\2\2\u0115\u0116\7$\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b,\2\2\u0118\u0119\b,\3\2\u0119Y\3\2\2\2\u011a"+
		"\u011b\7$\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b-\2\2\u011d\u011e\b-\4"+
		"\2\u011e[\3\2\2\2\u011f\u0120\7\f\2\2\u0120\u0121\b.\5\2\u0121\u0122\3"+
		"\2\2\2\u0122\u0123\b.\6\2\u0123]\3\2\2\2\u0124\u0125\7\2\2\2\u0125\u0126"+
		"\b/\7\2\u0126\u0127\3\2\2\2\u0127\u0128\b/\6\2\u0128_\3\2\2\2\u0129\u012a"+
		"\7\2\2\3\u012a\u012b\b\60\b\2\u012b\u012c\3\2\2\2\u012c\u012d\b\60\6\2"+
		"\u012da\3\2\2\2\u012e\u0131\n\30\2\2\u012f\u0130\7^\2\2\u0130\u0132\7"+
		"\f\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0134\7^\2\2\u0134\u0136\7$\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0138\3\2\2\2\u0137\u012e\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\61\t\2"+
		"\u013cc\3\2\2\2\16\2\3\u00c4\u00ca\u00d1\u00d7\u0103\u0107\u0111\u0131"+
		"\u0135\u0139\n\b\2\2\7\3\2\6\2\2\3.\2\4\2\2\3/\3\3\60\4\3\61\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}