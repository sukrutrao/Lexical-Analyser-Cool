lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{

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
}

/*
	WRITE ALL LEXER RULES BELOW
*/

SEMICOLON   : ';';
DARROW      : '=>';
CLASS		: [Cc][Ll][Aa][Ss][Ss] ;
ELSE		: [Ee][Ll][Ss][Ee] ;
FI			: [Ff][Ii];
IF			: [Ii][Ff] ;
IN 			: [Ii][Nn] ;
INHERITS	: [Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss] ;
LET			: [Ll][Ee][Tt] ;
LOOP		: [Ll][Oo][Oo][Pp] ;
POOL		: [Pp][Oo][Oo][Ll] ;
THEN		: [Tt][Hh][Ee][Nn] ;
WHILE		: [Ww][Hh][Ii][Ll][Ee] ;
CASE		: [Cc][Aa][Ss][Ee] ;
ESAC		: [Ee][Ss][Aa][Cc] ;
OF			: [Oo][Ff] ;
NEW			: [Nn][Ee][Ww] ;
ISVOID		: [Ii][Ss][Vv][Oo][Ii][Dd] ;
NOT			: [Nn][Oo][Tt] ;
BOOL_CONST	: 't'[Rr][Uu][Ee] | 'f'[Aa][Ll][Ss][Ee] ;
TYPEID		: [A-Z][a-z|A-Z|0-9|_]* ;
OBJECTID	: [a-z][a-z|A-Z|0-9|_]* ;
INT_CONST	: [0-9]+ ;
/*OPEN_COMMENT	: '(*'(BLOCK_COMMENT | ~('*' | '(') | '*'~(')') | '('~('*') )*EOF {reportError("EOF in comment");} -> more;
BLOCK_COMMENT	: '(*'(BLOCK_COMMENT | ~('*' | '(') | '*'~(')') | '('~('*') )*'*)' -> skip;*/

STRAY_COMMENT	: '*)' {reportError("Unmatched *)");};

LPAREN		: '(' ;
RPAREN		: ')' ;
COLON		: ':' ;
ATSYM		: '@' ;
COMMA		: ',' ;
PLUS		: '+' ;
MINUS		: '-' ;
STAR		: '*' ;
SLASH		: '/' ;
TILDE		: '~' ;
LT			: '<' ;
EQUALS		: '=' ;
LBRACE		: '{' ;
RBRACE		: '}' ;
DOT			: '.' ;
LE  		: '<=' ;
ASSIGN		: '<-' ;
//BLCOMMENT	: '(*'.*?BLCOMMENT?'*)' -> skip;
WHITESPACE	: [\n\f\r\v\b\t ]+ -> skip ;
/*STR_CONST	: '"'~('\u0000' | [EOF] | '"' | '\u000d' )* '"' {processString();};*/
/*STR_CONST	: '"'~('\u0000' | [EOF] | '"' | '\n')*'"' {processString();}
			| '"'~('\u0000' | '"' | '\n')*[EOF] {reportError("String contains EOF");}
			| '"'~([EOF] | '"' | '\u0000')*'\n' {reportError("Unterminated string");}
			;*/

STR_START	: '"' -> skip, pushMode(STRING_MODE);
COMMENT_START	: '(*' -> skip, pushMode(COMMENT_MODE);
SINGLE_LINE_COMMENT	: ('--'~('\n' | [EOF])*'\n' 
					| '--'~('\n' | [EOF])*(EOF))  -> skip
					;

INCORRECT_CHARACTERS	: . {processCharacter();};


mode STRING_MODE;
//STRING	: (STRING_BODY_PLAIN | E_NEWLINE)*;
STRING_END	: '"' {processString();} -> popMode;
NEWLINE		: '\n' {reportError("Unterminated string constant");} -> mode(DEFAULT_MODE) ;
//NULL_CHAR	: '\u0000' {reportError("String contains null character");} -> mode(DEFAULT_MODE) ;
F_EOF_STR	: .(EOF) {reportError("EOF in string constant");}->  mode(DEFAULT_MODE) ;
STRING_BODY_PLAIN	: (~('\u0000' | [EOF] | '"' | '\n')('\\''\n')?('\\''\"')?)+ -> more//{processString();}
				    ; //TODO unescaped newline - maybe done
//fragment END_QUOTE	: ~('\\')'"';
/*BACKSLASH	: '\\' -> skip, pushMode(ESCAPE_MODE);

mode ESCAPE_MODE;
NEWLINE		: '\n' -> popMode;*/

mode COMMENT_MODE;
COMMENT_START_CM	: '(*' -> skip, pushMode(COMMENT_MODE);
COMMENT_END	: '*)' -> skip, popMode;
EOF_F		: .(EOF) {reportError("EOF in comment");} -> mode(DEFAULT_MODE);
ANYTHING 	: . -> skip;
/*NOT_EOF_STAR : ~([EOF] | '*' | '(') ;
STAR_WITHOUT_PARENTHESES : '*'~(')') ;
PARENTHESES_WITHOUT_STAR	:  '('~('*');
THINGS_TO_SKIP	: (NOT_EOF_STAR | STAR_WITHOUT_PARENTHESES | PARENTHESES_WITHOUT_STAR)* -> skip;*/

/*NO_STAR	: (~([EOF])~('*')?)+ -> skip;
EOF_F	: EOF {reportError("EOF in comment");} -> mode(DEFAULT_MODE);
STAR_WITHOUT_PARENTHESIS	: (~([EOF])('*'~(')'))?)+ -> skip;*/
