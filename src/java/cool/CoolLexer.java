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
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, INT_ERROR=43, STRAY_COMMENT=44, 
		WHITESPACE=45, STR_START=46, COMMENT_START=47, SINGLE_LINE_COMMENT=48, 
		INCORRECT_CHARACTERS=49, STRING_END=50, NEWLINE=51, F_EOF_STR=52, STRING_BODY_WITH_NULL=53, 
		COMMENT_START_CM=54, COMMENT_END=55, EOF_F=56, ANYTHING=57;
	public static final int STRING_MODE = 1;
	public static final int COMMENT_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE", "COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "BOOL_CONST", "TYPEID", "OBJECTID", "INT_CONST", "INT_ERROR", "STRAY_COMMENT", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", "PLUS", "MINUS", "STAR", 
		"SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", "ASSIGN", 
		"WHITESPACE", "STR_START", "COMMENT_START", "SINGLE_LINE_COMMENT", "INCORRECT_CHARACTERS", 
		"STRING_END", "NEWLINE", "F_EOF_STR", "STRING_BODY_PLAIN", "STRING_BODY_WITH_NULL", 
		"COMMENT_START_CM", "COMMENT_END", "EOF_F", "ANYTHING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "INT_ERROR", "STRAY_COMMENT", "WHITESPACE", "STR_START", "COMMENT_START", 
		"SINGLE_LINE_COMMENT", "INCORRECT_CHARACTERS", "STRING_END", "NEWLINE", 
		"F_EOF_STR", "STRING_BODY_WITH_NULL", "COMMENT_START_CM", "COMMENT_END", 
		"EOF_F", "ANYTHING"
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
		/**
		* Function to process string constants
		*/
		public void processString() {
			// get the token corresponding to the string
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			// get the string from the token
			String text = t.getText();
			// remove the '"' at the end from the string
			text = text.substring(0,text.length()-1);
			if(text.length() > 1024) // if the string is too long
			{
				reportError("String constant too long");
				return;
			}
			if(text.indexOf('\0') != -1) // if the string contains a null character
			{
				reportError("String contains null character");
				return;
			}
			// string of characters that have a special meaning when escaped
			String escape_chars = "btnf";
			// string containing the meanings when escaped in the same order
			String escape_chars_results = "\b\t\n\f";
			// find the index of a backslash in the string
			int index = text.indexOf('\\');
			// till we keep finding a new backslash, keep resolving
			while(index != -1) 	{
				// check if the backslash is followed by a character that makes the combination have a different meaning
				int escape_index = escape_chars.indexOf(text.charAt(index+1));
				// if such a character is found
				if(escape_index != -1) 	{
					// replace both with the appropriate character
					text = text.substring(0,index) + escape_chars_results.charAt(escape_index) + text.substring(index+2);
				}
				else // if not found
				{
					// replace \c with c
					text = text.substring(0,index) + text.substring(index+1);
				}
				// get the index of the next backslash
				index = text.indexOf('\\');
			}
			// set the string text
			setText(text);
			// set the string token
			setType(STR_CONST);		
		}
		/**
		* Function to process single character constants that are not the starting
		* characters of any valid identifier
		*/
		public void processCharacter() {
			// get the token
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			// get the character
			String text = t.getText();
			// report the character as an error
			reportError(text);
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
		case 23:
			INT_ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			STRAY_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			INCORRECT_CHARACTERS_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			STRING_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			F_EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			STRING_BODY_WITH_NULL_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			EOF_F_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INT_ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("A");
			break;
		}
	}
	private void STRAY_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("Unmatched *)");
			break;
		}
	}
	private void INCORRECT_CHARACTERS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			processCharacter();
			break;
		}
	}
	private void STRING_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			processString();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void F_EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("EOF in string constant");
			break;
		}
	}
	private void STRING_BODY_WITH_NULL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("String contains NULL character");
			break;
		}
	}
	private void EOF_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			reportError("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u018d\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00d6\n\25\3\26\3\26\7\26\u00da\n\26\f\26\16\26\u00dd\13\26\3\27\3\27"+
		"\7\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3\30\6\30\u00e7\n\30\r\30\16\30"+
		"\u00e8\3\31\6\31\u00ec\n\31\r\31\16\31\u00ed\3\31\6\31\u00f1\n\31\r\31"+
		"\16\31\u00f2\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\6,\u0121\n,\r,\16,\u0122"+
		"\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u0136\n/\f/\16"+
		"/\u0139\13/\3/\3/\3/\3/\3/\7/\u0140\n/\f/\16/\u0143\13/\3/\5/\u0146\n"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u0160\n\64\3\64"+
		"\3\64\5\64\u0164\n\64\6\64\u0166\n\64\r\64\16\64\u0167\3\64\3\64\3\65"+
		"\3\65\7\65\u016e\n\65\f\65\16\65\u0171\13\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\3\u016f\2:\5\r\7\31\t\34\13\35\r\36\17\37\21 \23"+
		"!\25\"\27#\31$\33%\35&\37\'!(#)%*\'+),+\6-\4/\5\61\7\63-\65.\67\t9\n;"+
		"\13=\f?\16A\17C\20E\21G\22I\23K\24M\25O\26Q\27S\30U\32W\33Y/[\60]\61_"+
		"\62a\63c\64e\65g\66i\2k\67m8o9q:s;\5\2\3\4\33\4\2EEee\4\2NNnn\4\2CCcc"+
		"\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2Q"+
		"Qqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\4\2WWww\3\2C\\\7\2\62;C\\aac|~~\3"+
		"\2c|\3\2\62;\6\2C\\aac|~~\4\2\13\17\"\"\3\2\f\f\5\2\2\2\f\f$$\u0198\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2"+
		"\2\3e\3\2\2\2\3g\3\2\2\2\3i\3\2\2\2\3k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\4"+
		"q\3\2\2\2\4s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\tz\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u0085\3\2\2\2\17\u0088\3\2\2\2\21\u008b\3\2\2\2\23\u008e\3\2\2\2\25"+
		"\u0097\3\2\2\2\27\u009b\3\2\2\2\31\u00a0\3\2\2\2\33\u00a5\3\2\2\2\35\u00aa"+
		"\3\2\2\2\37\u00b0\3\2\2\2!\u00b5\3\2\2\2#\u00ba\3\2\2\2%\u00bd\3\2\2\2"+
		"\'\u00c1\3\2\2\2)\u00c8\3\2\2\2+\u00d5\3\2\2\2-\u00d7\3\2\2\2/\u00de\3"+
		"\2\2\2\61\u00e6\3\2\2\2\63\u00eb\3\2\2\2\65\u00f6\3\2\2\2\67\u00fb\3\2"+
		"\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0101\3\2\2\2?\u0103\3\2\2\2A\u0105"+
		"\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K"+
		"\u010f\3\2\2\2M\u0111\3\2\2\2O\u0113\3\2\2\2Q\u0115\3\2\2\2S\u0117\3\2"+
		"\2\2U\u0119\3\2\2\2W\u011c\3\2\2\2Y\u0120\3\2\2\2[\u0126\3\2\2\2]\u012b"+
		"\3\2\2\2_\u0145\3\2\2\2a\u0149\3\2\2\2c\u014c\3\2\2\2e\u0151\3\2\2\2g"+
		"\u0156\3\2\2\2i\u0165\3\2\2\2k\u016b\3\2\2\2m\u0177\3\2\2\2o\u017d\3\2"+
		"\2\2q\u0183\3\2\2\2s\u0189\3\2\2\2uv\7=\2\2v\6\3\2\2\2wx\7?\2\2xy\7@\2"+
		"\2y\b\3\2\2\2z{\t\2\2\2{|\t\3\2\2|}\t\4\2\2}~\t\5\2\2~\177\t\5\2\2\177"+
		"\n\3\2\2\2\u0080\u0081\t\6\2\2\u0081\u0082\t\3\2\2\u0082\u0083\t\5\2\2"+
		"\u0083\u0084\t\6\2\2\u0084\f\3\2\2\2\u0085\u0086\t\7\2\2\u0086\u0087\t"+
		"\b\2\2\u0087\16\3\2\2\2\u0088\u0089\t\b\2\2\u0089\u008a\t\7\2\2\u008a"+
		"\20\3\2\2\2\u008b\u008c\t\b\2\2\u008c\u008d\t\t\2\2\u008d\22\3\2\2\2\u008e"+
		"\u008f\t\b\2\2\u008f\u0090\t\t\2\2\u0090\u0091\t\n\2\2\u0091\u0092\t\6"+
		"\2\2\u0092\u0093\t\13\2\2\u0093\u0094\t\b\2\2\u0094\u0095\t\f\2\2\u0095"+
		"\u0096\t\5\2\2\u0096\24\3\2\2\2\u0097\u0098\t\3\2\2\u0098\u0099\t\6\2"+
		"\2\u0099\u009a\t\f\2\2\u009a\26\3\2\2\2\u009b\u009c\t\3\2\2\u009c\u009d"+
		"\t\r\2\2\u009d\u009e\t\r\2\2\u009e\u009f\t\16\2\2\u009f\30\3\2\2\2\u00a0"+
		"\u00a1\t\16\2\2\u00a1\u00a2\t\r\2\2\u00a2\u00a3\t\r\2\2\u00a3\u00a4\t"+
		"\3\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\t\f\2\2\u00a6\u00a7\t\n\2\2\u00a7"+
		"\u00a8\t\6\2\2\u00a8\u00a9\t\t\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\t\17\2"+
		"\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad\t\b\2\2\u00ad\u00ae\t\3\2\2\u00ae\u00af"+
		"\t\6\2\2\u00af\36\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\u00b2\t\4\2\2\u00b2"+
		"\u00b3\t\5\2\2\u00b3\u00b4\t\6\2\2\u00b4 \3\2\2\2\u00b5\u00b6\t\6\2\2"+
		"\u00b6\u00b7\t\5\2\2\u00b7\u00b8\t\4\2\2\u00b8\u00b9\t\2\2\2\u00b9\"\3"+
		"\2\2\2\u00ba\u00bb\t\r\2\2\u00bb\u00bc\t\7\2\2\u00bc$\3\2\2\2\u00bd\u00be"+
		"\t\t\2\2\u00be\u00bf\t\6\2\2\u00bf\u00c0\t\17\2\2\u00c0&\3\2\2\2\u00c1"+
		"\u00c2\t\b\2\2\u00c2\u00c3\t\5\2\2\u00c3\u00c4\t\20\2\2\u00c4\u00c5\t"+
		"\r\2\2\u00c5\u00c6\t\b\2\2\u00c6\u00c7\t\21\2\2\u00c7(\3\2\2\2\u00c8\u00c9"+
		"\t\t\2\2\u00c9\u00ca\t\r\2\2\u00ca\u00cb\t\f\2\2\u00cb*\3\2\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\t\13\2\2\u00ce\u00cf\t\22\2\2\u00cf\u00d6\t"+
		"\6\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\t\4\2\2\u00d2\u00d3\t\3\2\2\u00d3"+
		"\u00d4\t\5\2\2\u00d4\u00d6\t\6\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2"+
		"\2\2\u00d6,\3\2\2\2\u00d7\u00db\t\23\2\2\u00d8\u00da\t\24\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		".\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\t\25\2\2\u00df\u00e1\t\24\2"+
		"\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\60\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\t\26\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\62\3\2\2\2\u00ea\u00ec\t\26\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00f1\t\27\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\31\2\2\u00f5"+
		"\64\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7+\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fa\b\32\3\2\u00fa\66\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc8\3\2\2"+
		"\2\u00fd\u00fe\7+\2\2\u00fe:\3\2\2\2\u00ff\u0100\7<\2\2\u0100<\3\2\2\2"+
		"\u0101\u0102\7B\2\2\u0102>\3\2\2\2\u0103\u0104\7.\2\2\u0104@\3\2\2\2\u0105"+
		"\u0106\7-\2\2\u0106B\3\2\2\2\u0107\u0108\7/\2\2\u0108D\3\2\2\2\u0109\u010a"+
		"\7,\2\2\u010aF\3\2\2\2\u010b\u010c\7\61\2\2\u010cH\3\2\2\2\u010d\u010e"+
		"\7\u0080\2\2\u010eJ\3\2\2\2\u010f\u0110\7>\2\2\u0110L\3\2\2\2\u0111\u0112"+
		"\7?\2\2\u0112N\3\2\2\2\u0113\u0114\7}\2\2\u0114P\3\2\2\2\u0115\u0116\7"+
		"\177\2\2\u0116R\3\2\2\2\u0117\u0118\7\60\2\2\u0118T\3\2\2\2\u0119\u011a"+
		"\7>\2\2\u011a\u011b\7?\2\2\u011bV\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e"+
		"\7/\2\2\u011eX\3\2\2\2\u011f\u0121\t\30\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\b,\4\2\u0125Z\3\2\2\2\u0126\u0127\7$\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\b-\4\2\u0129\u012a\b-\5\2\u012a\\\3\2\2\2\u012b\u012c"+
		"\7*\2\2\u012c\u012d\7,\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b.\4\2\u012f"+
		"\u0130\b.\6\2\u0130^\3\2\2\2\u0131\u0132\7/\2\2\u0132\u0133\7/\2\2\u0133"+
		"\u0137\3\2\2\2\u0134\u0136\n\31\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u0146\7\f\2\2\u013b\u013c\7/\2\2\u013c\u013d\7/\2"+
		"\2\u013d\u0141\3\2\2\2\u013e\u0140\n\31\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0146\7\2\2\3\u0145\u0131\3\2\2\2\u0145"+
		"\u013b\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b/\4\2\u0148`\3\2\2\2\u0149"+
		"\u014a\13\2\2\2\u014a\u014b\b\60\7\2\u014bb\3\2\2\2\u014c\u014d\7$\2\2"+
		"\u014d\u014e\b\61\b\2\u014e\u014f\3\2\2\2\u014f\u0150\b\61\t\2\u0150d"+
		"\3\2\2\2\u0151\u0152\7\f\2\2\u0152\u0153\b\62\n\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0155\b\62\13\2\u0155f\3\2\2\2\u0156\u0157\13\2\2\2\u0157\u0158"+
		"\7\2\2\3\u0158\u0159\b\63\f\2\u0159\u015a\3\2\2\2\u015a\u015b\b\63\13"+
		"\2\u015bh\3\2\2\2\u015c\u015f\n\32\2\2\u015d\u015e\7^\2\2\u015e\u0160"+
		"\7\f\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0162\7^\2\2\u0162\u0164\7$\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0166\3\2\2\2\u0165\u015c\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\64\r\2"+
		"\u016aj\3\2\2\2\u016b\u016f\7\2\2\2\u016c\u016e\13\2\2\2\u016d\u016c\3"+
		"\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7$\2\2\u0173\u0174\b\65"+
		"\16\2\u0174\u0175\3\2\2\2\u0175\u0176\b\65\13\2\u0176l\3\2\2\2\u0177\u0178"+
		"\7*\2\2\u0178\u0179\7,\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\66\4\2\u017b"+
		"\u017c\b\66\6\2\u017cn\3\2\2\2\u017d\u017e\7,\2\2\u017e\u017f\7+\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\b\67\4\2\u0181\u0182\b\67\t\2\u0182p\3\2\2"+
		"\2\u0183\u0184\13\2\2\2\u0184\u0185\7\2\2\3\u0185\u0186\b8\17\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\b8\13\2\u0188r\3\2\2\2\u0189\u018a\13\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u018c\b9\4\2\u018ct\3\2\2\2\23\2\3\4\u00d5"+
		"\u00db\u00e2\u00e8\u00ed\u00f2\u0122\u0137\u0141\u0145\u015f\u0163\u0167"+
		"\u016f\20\3\31\2\3\32\3\b\2\2\7\3\2\7\4\2\3\60\4\3\61\5\6\2\2\3\62\6\4"+
		"\2\2\3\63\7\5\2\2\3\65\b\38\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}