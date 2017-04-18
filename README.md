# COOL Compiler #

This project builds a Lexical Analyzer for Cool.

### The Code

* The first line of the code specifies that the file is a lexer.
* Then, there is a list of tokens that are recognized by Cool. The lexical analyzer converts the code to tokens which will then be sent to the parser.
* Then, there are member functions. These are written in Java, the target language for the Lexical analyzer. They help in manipulating the strings that have been read. The following are the functions:

#### reportError()
This accepts a string as an argument, sets the text currently read to that string, and sets the token to be ERROR. This is used to report errors in the form of ERROR tokens, which can then be handled by the parser.

#### processString()
This function has been used to handle string constants. Every string constant candidate, that does not contain EOF, or an unescaped newline, or a null character, is sent to this function. The input string contains that '"' at the end when it enters the function. This is first removed using `text = text.substring(0,text.length()-1);`. Then, the string is checked for errors. First, it is checked for length. The limit allowed is 1024. This is done by `if(text.length() > 1024)`. If true, `reportError()` is called and the function returns. Then, all that remains to be checked is if any escape sequence needs to be parsed, for example, conversion of '\' and 'b' to '\b'. This is done by searching the string for backslashes, which is represented as '\\', as long as they are to be found. The only valid transitions are for b,n,t, and f. For all other characters, the backslash is simply removed. Once done, the modified text is set, and the token STR_CONST is set, and the function returns.

#### processCharacter()
This is used to report errors when a character that cannot be the start of any valid token is encountered. That character is sent to `reportError()`. Additionally, this function also performs the task of checking errors in INT_CONST. If an integer is followed by a string, say 123abc, then instead of giving `INT_CONST 123` and `STR_CONST abc`, it gives an error, with the message containing the character of the total string.

* After this, each token has been defined.
* The definitions for all syntactic symbols in Cool are simply the symbols themselves. For type and object identifiers, the conditions on their form as given in Section 10.1 of the Cool Manual are given as regular expressions. This holds for integer constants as well. A special check is done to ensure that an integer constant immediately followed by an alphabet or underscore is not interpreted as an integer followed by an identifier. For all keywords, case insensitivity has been imposed. For the boolean constants true and false, the condition that they must start with a lowercase symbol has been enforced.
* Whitespace is defined as per Section 10.5 of the Cool Manual. Any of `'\n'`, `'\t'`, `'\f'`, `'\r'`, `'\v'` and `' '` is taken to be a white space. These characters are read and skipped, as they correspond to no token. As ANTLR does not recognize `'\v'`, its unicode value, `'\u000b'` has been used.
* A STRAY_COMMENT rule has been defined to consume any unmatched comment ending, `*)`, and give an error.
* A SINGLE_LINE_COMMENT rule has been defined for single line comments, `--`. This consumes all characters till newline is reached, and if not, if EOF is reached.
* An INCORRECT_CHARACTERS rule has been defined to report errors for all characters that cannot start a valid token. The `processCharacter()` function is called. This is at the end so as to give it last preference, and so that it doesn't take the place of valid tokens.

#### Handling Strings
* The beginning of a string is first read by the rule STR_START, when a `'"'` is encountered. It skips this character and pushes the mode `STRING_MODE`.
* This mode corresponds to the lexical analyzer operating inside a string, and the rules are defined as such.
* The NEWLINE rule is called if an unescaped newline is found, and an error is reported. The mode is then changed to DEFAULT_MODE. This is done to ensure that from the next line, lexical analysis resumes as normal, and the remaining characters are not considered to be a part of the string.
* The F_EOF_STR rule is called if an EOF is found in the string. This again reports an error and goes back to the default mode.
* The STRING_BODY_WITH_NULL is for when the string contains a null character. It is represented by the unicode value `'\u0000'`. This needs special care, because though the string contains an error, the string must be read till the ending `'"'`. Morover, if subsequently a new line is found, then the mode should be switched back to the default mode. So, this regular expression checks for a null character, followed by any characters, and stops when it finds a `'"'` or a newline. Then, it reports an error and goes back to the default mode.
* The STRING_BODY_PLAIN is for all valid characters in a string. These are read and stored, by using the `more` lexer command of ANTLR. This also accepts escaped newlines and escaped double quotes.
* The STRING_END rule denotes that an `'"'` has been found, and the string till now, including the ending `'"'`, is sent to `processString()`. Then, we pop out of this mode.

#### Handling Block Comments
* When the start of a block comment, `(*` is encountered, the COMMENT_START skips it and pushes into the mode `COMMENT_MODE`.
* Here, the COMMENT_START_CM rule handles further instances of `(*`. When encountered, which push one level lower into the same mode, in order to handle nested comments easily. This is skipped as well.
* The COMMENT_END rule skips a `*)` and pops out one level up from this mode.
* The EOF_F rule checks if we have reached an EOF inside a comment. If so, an error is reported and we jump back to the default mode.
* The ANYTHING consumes all other characters and skips them, as is expected in comments, one character at a time.

### The Test Cases
* There are five main test cases. Each test case checks the conditions given in a subsection of Section 10 of the Cool Manual.

#### testcase1.cl
* Here, Section 10.1 has been tested.
* There are tests for integer constants, object identifiers, and type identifiers.
* It is also tested that an integer cannot contain alphabets or underscore.
* The test also checks if the symbols, such as `{},()-+` etc. are read correctly.

#### testcase2.cl
* Here, Section 10.2 has been tested.
* Valid strings have been entered to check if they are read correctly.
* The next line checks whether escaping happens correctly. It can be seen from the output that only b,n,t,f which follow a backslash are modified to give special characters, the rest of the backslashes are removed.
* Line 4 demonstrates that a wide variety of characters can be printed.
* Line 5 and 6 demonstrate a string containing an escaped newline.
* Line 7 and 8 demonstrate that an error is given if a string is split between lines without being escaped.
* Line 10 shows that a 1024 character string is accepted.
* Line 12 shows that a 1025 character string gives an error.
* Line 13 shows that a string containing EOF causes an error.

#### testcase3.cl
* Here, Section 10.3 has been tested.
* Lines 2 and 3 consist of a block comment, and it has been tested that many characters can be written inside them, and that they are ignored.
* Line 4 demonstrates a single line comment
* Line 5 shows nesting of comments, which passes through the lexical analyzer successfully.
* Line 6 shows that if extra `*)` is found, an error is given.
* Line 7 shows that if all comments are not closed, i.e., if a comment contains EOF, then an error is given.

#### testcase4.cl
* Here, Section 10.4 has been tested.
* The file contains all the keywords, and attempts to demonstrate their case insensivity by showing that their tokens are the same.
* This also shows that `True` and `true` are different, similarly for `false`, the first being a type id and the second being a bool constant.

#### testcase5.cl
* Here, Section 10.5 has been tested.
* This tests for all whitespace characters, `'\n'`, `'\f'`, `'\r'`, `'\t'`,`'\v'`, and `' '`.
* As expected, all of these are ignored.
* From Section 10.
