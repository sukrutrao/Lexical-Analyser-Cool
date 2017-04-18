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
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, STRAY_COMMENT=43, WHITESPACE=44, 
		STR_START=45, COMMENT_START=46, SINGLE_LINE_COMMENT=47, INCORRECT_CHARACTERS=48, 
		STRING_END=49, NEWLINE=50, F_EOF_STR=51, COMMENT_START_CM=52, COMMENT_END=53, 
		EOF_F=54, ANYTHING=55;
	public static final int STRING_MODE = 1;
	public static final int COMMENT_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE", "COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "BOOL_CONST", "TYPEID", "OBJECTID", "INT_CONST", "STRAY_COMMENT", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", "PLUS", "MINUS", "STAR", 
		"SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "LE", "ASSIGN", 
		"WHITESPACE", "STR_START", "COMMENT_START", "SINGLE_LINE_COMMENT", "INCORRECT_CHARACTERS", 
		"STRING_END", "NEWLINE", "F_EOF_STR", "STRING_BODY_PLAIN", "COMMENT_START_CM", 
		"COMMENT_END", "EOF_F", "ANYTHING"
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
		"NOT", "STRAY_COMMENT", "WHITESPACE", "STR_START", "COMMENT_START", "SINGLE_LINE_COMMENT", 
		"INCORRECT_CHARACTERS", "STRING_END", "NEWLINE", "F_EOF_STR", "COMMENT_START_CM", 
		"COMMENT_END", "EOF_F", "ANYTHING"
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
			text = text.substring(0,text.length()-1);
			if(text.length() > 1024)
			{
				reportError("String constant too long");
				return;
			}
			if(text.indexOf('\0') != -1)
			{
				reportError("String contains null character");
				return;
			}
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

		public void processCharacter() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			reportError(text);
		}

		public void parseComment() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			skip();
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
			STRAY_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			INCORRECT_CHARACTERS_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			STRING_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			F_EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			EOF_F_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRAY_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unmatched *)");
			break;
		}
	}
	private void INCORRECT_CHARACTERS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			processCharacter();
			break;
		}
	}
	private void STRING_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			processString();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void F_EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			reportError("EOF in string constant");
			break;
		}
	}
	private void EOF_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u0171\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d2\n\25"+
		"\3\26\3\26\7\26\u00d6\n\26\f\26\16\26\u00d9\13\26\3\27\3\27\7\27\u00dd"+
		"\n\27\f\27\16\27\u00e0\13\27\3\30\6\30\u00e3\n\30\r\30\16\30\u00e4\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\6+\u0111\n+\r+\16+\u0112\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0126\n.\f.\16.\u0129\13.\3.\3.\3.\3.\3."+
		"\7.\u0130\n.\f.\16.\u0133\13.\3.\5.\u0136\n.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\5\63\u0150\n\63\3\63\3\63\5\63\u0154\n\63\6\63\u0156\n"+
		"\63\r\63\16\63\u0157\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\2\28\5\r\7\31\t\34\13\35\r\36\17\37\21 \23!\25\"\27#\31$\33%\35&\37\'"+
		"!(#)%*\'+),+\6-\4/\5\61\7\63-\65\t\67\n9\13;\f=\16?\17A\20C\21E\22G\23"+
		"I\24K\25M\26O\27Q\30S\32U\33W.Y/[\60]\61_\62a\63c\64e\65g\2i\66k\67m8"+
		"o9\5\2\3\4\32\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk"+
		"\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2F"+
		"Fff\4\2WWww\3\2C\\\7\2\62;C\\aac|~~\3\2c|\3\2\62;\7\2\n\f\16\17\"\"^^"+
		"xx\5\2\f\fGHQQ\7\2\2\2\f\f$$GHQQ\u0179\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2\3g\3\2\2\2\4i\3\2"+
		"\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tv\3\2\2\2"+
		"\13|\3\2\2\2\r\u0081\3\2\2\2\17\u0084\3\2\2\2\21\u0087\3\2\2\2\23\u008a"+
		"\3\2\2\2\25\u0093\3\2\2\2\27\u0097\3\2\2\2\31\u009c\3\2\2\2\33\u00a1\3"+
		"\2\2\2\35\u00a6\3\2\2\2\37\u00ac\3\2\2\2!\u00b1\3\2\2\2#\u00b6\3\2\2\2"+
		"%\u00b9\3\2\2\2\'\u00bd\3\2\2\2)\u00c4\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3"+
		"\2\2\2/\u00da\3\2\2\2\61\u00e2\3\2\2\2\63\u00e6\3\2\2\2\65\u00eb\3\2\2"+
		"\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u00ff\3\2\2\2K\u0101\3\2\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0107\3\2"+
		"\2\2S\u0109\3\2\2\2U\u010c\3\2\2\2W\u0110\3\2\2\2Y\u0116\3\2\2\2[\u011b"+
		"\3\2\2\2]\u0135\3\2\2\2_\u0139\3\2\2\2a\u013c\3\2\2\2c\u0141\3\2\2\2e"+
		"\u0146\3\2\2\2g\u0155\3\2\2\2i\u015b\3\2\2\2k\u0161\3\2\2\2m\u0167\3\2"+
		"\2\2o\u016d\3\2\2\2qr\7=\2\2r\6\3\2\2\2st\7?\2\2tu\7@\2\2u\b\3\2\2\2v"+
		"w\t\2\2\2wx\t\3\2\2xy\t\4\2\2yz\t\5\2\2z{\t\5\2\2{\n\3\2\2\2|}\t\6\2\2"+
		"}~\t\3\2\2~\177\t\5\2\2\177\u0080\t\6\2\2\u0080\f\3\2\2\2\u0081\u0082"+
		"\t\7\2\2\u0082\u0083\t\b\2\2\u0083\16\3\2\2\2\u0084\u0085\t\b\2\2\u0085"+
		"\u0086\t\7\2\2\u0086\20\3\2\2\2\u0087\u0088\t\b\2\2\u0088\u0089\t\t\2"+
		"\2\u0089\22\3\2\2\2\u008a\u008b\t\b\2\2\u008b\u008c\t\t\2\2\u008c\u008d"+
		"\t\n\2\2\u008d\u008e\t\6\2\2\u008e\u008f\t\13\2\2\u008f\u0090\t\b\2\2"+
		"\u0090\u0091\t\f\2\2\u0091\u0092\t\5\2\2\u0092\24\3\2\2\2\u0093\u0094"+
		"\t\3\2\2\u0094\u0095\t\6\2\2\u0095\u0096\t\f\2\2\u0096\26\3\2\2\2\u0097"+
		"\u0098\t\3\2\2\u0098\u0099\t\r\2\2\u0099\u009a\t\r\2\2\u009a\u009b\t\16"+
		"\2\2\u009b\30\3\2\2\2\u009c\u009d\t\16\2\2\u009d\u009e\t\r\2\2\u009e\u009f"+
		"\t\r\2\2\u009f\u00a0\t\3\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\t\f\2\2\u00a2"+
		"\u00a3\t\n\2\2\u00a3\u00a4\t\6\2\2\u00a4\u00a5\t\t\2\2\u00a5\34\3\2\2"+
		"\2\u00a6\u00a7\t\17\2\2\u00a7\u00a8\t\n\2\2\u00a8\u00a9\t\b\2\2\u00a9"+
		"\u00aa\t\3\2\2\u00aa\u00ab\t\6\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\t\2\2"+
		"\2\u00ad\u00ae\t\4\2\2\u00ae\u00af\t\5\2\2\u00af\u00b0\t\6\2\2\u00b0 "+
		"\3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2\u00b3\t\5\2\2\u00b3\u00b4\t\4\2\2\u00b4"+
		"\u00b5\t\2\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\t\r\2\2\u00b7\u00b8\t\7\2\2"+
		"\u00b8$\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba\u00bb\t\6\2\2\u00bb\u00bc\t"+
		"\17\2\2\u00bc&\3\2\2\2\u00bd\u00be\t\b\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c0"+
		"\t\20\2\2\u00c0\u00c1\t\r\2\2\u00c1\u00c2\t\b\2\2\u00c2\u00c3\t\21\2\2"+
		"\u00c3(\3\2\2\2\u00c4\u00c5\t\t\2\2\u00c5\u00c6\t\r\2\2\u00c6\u00c7\t"+
		"\f\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\t\13\2\2\u00ca\u00cb"+
		"\t\22\2\2\u00cb\u00d2\t\6\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\t\4\2\2\u00ce"+
		"\u00cf\t\3\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00d2\t\6\2\2\u00d1\u00c8\3\2"+
		"\2\2\u00d1\u00cc\3\2\2\2\u00d2,\3\2\2\2\u00d3\u00d7\t\23\2\2\u00d4\u00d6"+
		"\t\24\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8.\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\t"+
		"\25\2\2\u00db\u00dd\t\24\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\60\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e3\t\26\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7,\2\2"+
		"\u00e7\u00e8\7+\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\31\2\2\u00ea\64"+
		"\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee"+
		"8\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2<"+
		"\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7-\2\2\u00f6@\3"+
		"\2\2\2\u00f7\u00f8\7/\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7,\2\2\u00faD\3\2"+
		"\2\2\u00fb\u00fc\7\61\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7\u0080\2\2\u00fe"+
		"H\3\2\2\2\u00ff\u0100\7>\2\2\u0100J\3\2\2\2\u0101\u0102\7?\2\2\u0102L"+
		"\3\2\2\2\u0103\u0104\7}\2\2\u0104N\3\2\2\2\u0105\u0106\7\177\2\2\u0106"+
		"P\3\2\2\2\u0107\u0108\7\60\2\2\u0108R\3\2\2\2\u0109\u010a\7>\2\2\u010a"+
		"\u010b\7?\2\2\u010bT\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7/\2\2\u010e"+
		"V\3\2\2\2\u010f\u0111\t\27\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\b+\3\2\u0115X\3\2\2\2\u0116\u0117\7$\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\b,\3\2\u0119\u011a\b,\4\2\u011aZ\3\2\2\2\u011b\u011c\7*\2\2\u011c\u011d"+
		"\7,\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b-\3\2\u011f\u0120\b-\5\2\u0120"+
		"\\\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7/\2\2\u0123\u0127\3\2\2\2\u0124"+
		"\u0126\n\30\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u0136\7\f\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012d\u0131\3\2\2"+
		"\2\u012e\u0130\n\30\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0136\7\2\2\3\u0135\u0121\3\2\2\2\u0135\u012b\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\b.\3\2\u0138^\3\2\2\2\u0139\u013a\13\2\2\2"+
		"\u013a\u013b\b/\6\2\u013b`\3\2\2\2\u013c\u013d\7$\2\2\u013d\u013e\b\60"+
		"\7\2\u013e\u013f\3\2\2\2\u013f\u0140\b\60\b\2\u0140b\3\2\2\2\u0141\u0142"+
		"\7\f\2\2\u0142\u0143\b\61\t\2\u0143\u0144\3\2\2\2\u0144\u0145\b\61\n\2"+
		"\u0145d\3\2\2\2\u0146\u0147\13\2\2\2\u0147\u0148\7\2\2\3\u0148\u0149\b"+
		"\62\13\2\u0149\u014a\3\2\2\2\u014a\u014b\b\62\n\2\u014bf\3\2\2\2\u014c"+
		"\u014f\n\31\2\2\u014d\u014e\7^\2\2\u014e\u0150\7\f\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\7^\2\2\u0152"+
		"\u0154\7$\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u014c\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b\63\f\2\u015ah\3\2\2\2"+
		"\u015b\u015c\7*\2\2\u015c\u015d\7,\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\b\64\3\2\u015f\u0160\b\64\5\2\u0160j\3\2\2\2\u0161\u0162\7,\2\2\u0162"+
		"\u0163\7+\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\65\3\2\u0165\u0166\b\65"+
		"\b\2\u0166l\3\2\2\2\u0167\u0168\13\2\2\2\u0168\u0169\7\2\2\3\u0169\u016a"+
		"\b\66\r\2\u016a\u016b\3\2\2\2\u016b\u016c\b\66\n\2\u016cn\3\2\2\2\u016d"+
		"\u016e\13\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\67\3\2\u0170p\3\2\2"+
		"\2\20\2\3\4\u00d1\u00d7\u00de\u00e4\u0112\u0127\u0131\u0135\u014f\u0153"+
		"\u0157\16\3\31\2\b\2\2\7\3\2\7\4\2\3/\3\3\60\4\6\2\2\3\61\5\4\2\2\3\62"+
		"\6\5\2\2\3\66\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}