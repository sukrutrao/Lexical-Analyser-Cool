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
		reportError(text.substring(0,1));
	}
}

// definitions for all tokens
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
INT_ERROR	: [0-9]+[A-Z|a-z|_]+ {processCharacter();};

// if there is an unmatched closing comment
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
WHITESPACE	: ('\n' | '\f' | '\r' | '\t' | '\u000b' | ' ')+ -> skip ;

// if we have reached the start of a string, then enter the STRING_MODE mode
STR_START	: '"' -> skip, pushMode(STRING_MODE);
// if we have reached the start of a block comment, then enter the COMMENT_MODE mode
COMMENT_START	: '(*' -> skip, pushMode(COMMENT_MODE);
// to handle single line comments
SINGLE_LINE_COMMENT	: ('--'~('\n')*'\n' 
					| '--'~('\n')*(EOF))  -> skip
					;

// for any character that does not start a valid identifier
INCORRECT_CHARACTERS	: . {processCharacter();};

// mode to handle strings
mode STRING_MODE;
// if the end of the string has been reached, process and pop
STRING_END	: '"' {processString();} -> popMode;
// if we have an unescaped newline, then stop reading, report error, and go to default mode
NEWLINE		: '\n' {reportError("Unterminated string constant");} -> mode(DEFAULT_MODE) ;
// if we have an EOF inside the string, the report error and go to default mode
F_EOF_STR	: .(EOF) {reportError("EOF in string constant");}->  mode(DEFAULT_MODE) ;
// to consume all characters in the string except unescaped newlines, unescaped quotes, and EOF
STRING_BODY_PLAIN	: (~( '"' | '\n' | '\u0000')('\\''\n')?('\\''\"')?)+ -> more;
// if the string contains NULL character
STRING_BODY_WITH_NULL	: ('\u0000')(.*?)('\n' | '"') {reportError("String contains NULL character");} -> mode(DEFAULT_MODE);

// mode to handle block comments
mode COMMENT_MODE;
// if a new block comment is starting, we recurse down into this mode
COMMENT_START_CM	: '(*' -> skip, pushMode(COMMENT_MODE);
// if the block comment ended, we pop to one level up
COMMENT_END	: '*)' -> skip, popMode;
// if an EOF is found in a comment, then report an error and return to the default mode
EOF_F		: .(EOF) {reportError("EOF in comment");} -> mode(DEFAULT_MODE);
// if any other character is found, just consume and skip it
ANYTHING 	: . -> skip;