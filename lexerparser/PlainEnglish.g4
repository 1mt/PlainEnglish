grammar PlainEnglish ;

@header {
	package lexerparser;
}

/* PARSER START */
program
    : statement*
    ;

statement
    : block
    | variableStatement
    | emptyStatement
    | expressionStatement
    | returnStatement
    | functionDeclaration
    | ifStatement
    | iterationStatement
    | breakStatement
    | functionCall
    ;

block
    : 'please start' statementList? 'please stop'
    ;

statementList
    : statement+
    ;

variableStatement
    : VARDEFINE (GLOBAL)? IDENTIFIER (ASSIGN singleExpression)? DOT?
    ;


singleExpression
    : singleExpression arguments                                                                        # ArgumentsExpression
    | FUNCTION IDENTIFIER? 'with these parameters (' parameterList? ')' STARTFUNC statementList ENDFUNC # FunctionExpression
    | singleExpression INCREMENT                                                                        # IncrementExpression
    | singleExpression DECREASE                                                                         # DecreaseExpression
    | singleExpression (MULT | DIV | MOD) singleExpression                                              # MultiplicativeExpression
    | singleExpression (ADD | MINUS) singleExpression                                                   # AdditiveExpression
    | singleExpression (EQUALSCOM | NOTEQUALS) singleExpression                                         # EqualityExpression
    | singleExpression AND singleExpression                                                             # LogicalAndExpression
    | singleExpression OR singleExpression                                                              # LogicalOrExpression
    | singleExpression (LESSTHAN | GREATERTHAN | LESSTHANEQ | GREATERTHANEQ ) singleExpression          # RelationalExpression
    | literal                                                                                           # LiteralExpression
    | arrayLiteral                                                                                      # ArrayAssignmentExpression
    | arrayGet                                                                                          # ArrayLiteralExpression
    | '(' expressionSequence ')'                                                                        # ParenthesizedExpression
    | IDENTIFIER                                                                                        # IdentifierExpression
    ;
    
// duplicate of rule because it is handled in transpilation differently
singleExpression2
    : singleExpression2 arguments                                                                        # ArgumentsExpression2
    | FUNCTION IDENTIFIER? 'with these parameters (' parameterList? ')' STARTFUNC statementList ENDFUNC  # FunctionExpression2
    | singleExpression2 INCREMENT                                                                        # IncrementExpression2
    | singleExpression2 DECREASE                                                                         # DecreaseExpression2
    | singleExpression2 (MULT | DIV | MOD) singleExpression2                                             # MultiplicativeExpression2
    | singleExpression2 (ADD | MINUS) singleExpression2                                                  # AdditiveExpression2
    | singleExpression2 (EQUALSCOM | NOTEQUALS) singleExpression2                                        # EqualityExpression2
    | singleExpression2 AND singleExpression2                                                            # LogicalAndExpression2
    | singleExpression2 OR singleExpression2                                                             # LogicalOrExpression2
    | singleExpression2 (LESSTHAN | GREATERTHAN | LESSTHANEQ | GREATERTHANEQ ) singleExpression          # RelationalExpression2
    | literal                                                                                            # LiteralExpression2
    | arrayLiteral                                                                                       # ArrayAssignmentExpression2
    | arrayGet                                                                                           # ArrayLiteralExpression2
    | '(' expressionSequence ')'                                                                         # ParenthesizedExpression2
    | IDENTIFIER  																						 # LiteralExpression2
    ;
    
parameterList
    : parameterArg (',' parameterArg)*
    ;
parameterArg
    : IDENTIFIER (ASSIGN singleExpression)?
    ;

arguments
    : '('(singleExpression (',' singleExpression)* )?')'
    ;
literal
    : NULLLITERAL
    | BOOLEANLITERAL
    | STRINGLITERAL
    | numericLiteral
    ;
numericLiteral
    : DECIMALLITERAL
    | INTEGERLITERAL
    ;
arrayLiteral
    : 'please create a list [' ','* elementList? ','* ']'
    ;
arrayGet
	: ARRAYGET IDENTIFIER 'at the index' (INTEGERLITERAL+|IDENTIFIER) (ASSIGN singleExpression)?
	;
elementList
    : singleExpression (','+ singleExpression)*
    ;
// duplicate of rule because it is handled in transpilation differently
expressionSequence
    : singleExpression (',' singleExpression)*
    ;
    
expressionSequence2
    : singleExpression2 (',' singleExpression2)*
    ;
emptyStatement
    : DOT
    ;
ifStatement
    : IF expressionSequence2 ' is true then do' statement (ELSE statement)?
    ;

iterationStatement
    : WHILE 'this is true' expressionSequence2 'do this' statement                                                                      # WhileStatement
    | FOR expressionSequence2? 'on the condition' expressionSequence2? 'with the increment ' expressionSequence2? 'do this' statement     # ForStatement
    ;
expressionStatement
    : expressionSequence DOT
    ;
breakStatement
    : 'break' DOT
    ;
returnStatement
    : RETURN expressionSequence? DOT
    ;
functionDeclaration
    : FUNCTION IDENTIFIER 'with these parameters (' parameterList? ')' STARTFUNC statementList ENDFUNC
    ;
functionCall
	: 'call the function' IDENTIFIER 'with these parameters (' parameterList? ')' DOT
	;

/* LEXER START */
WHITESPACE : [ \n\t\r]+ -> channel(HIDDEN);
DOT : '.' ;
UNDERSCORE : '_' ;
LETTER : LOWERCASE|UPPERCASE ;
DOUBLEQUOTE : '"' ;
EQUALS : '=' ;
FUNCTION : 'please create the function' ;
VARDEFINE : 'please create the variable' ;
ASSIGN : 'set it to' ;
EQUALSCOM : 'is equal to' ;
NOTEQUALS : 'is not equal to' ;
STARTFUNC : 'please start function';
ENDFUNC : 'that is all';
IF : 'if';
ELSE : 'else do';
INCREMENT : 'increment';
DECREASE : 'decrease';
ADD : 'add';
MINUS : 'minus';
MULT : 'multiply';
DIV : 'divide';
MOD : 'mod';
AND : 'and';
OR : 'or';
GREATERTHAN : 'is greater than';
LESSTHAN : 'is less than';
GREATERTHANEQ : 'is greater or equal to';
LESSTHANEQ : 'is less than or equal to';
ARRAYGET: 'the value in the array';
GLOBAL: 'that is global';

FOR : 'for the loop';
WHILE : 'while';
BREAK : 'thankyou that is all';
RETURN : 'please return';
NULLLITERAL : 'null';
BOOLEANLITERAL : 'true'
               | 'false';
DECIMALLITERAL: DIGIT+ FRACTION;
INTEGERLITERAL : DIGIT+
               ;
STRINGLITERAL : DOUBLEQUOTE (LETTER|EQUALS|' ')+ DOUBLEQUOTE ;
IDENTIFIER : UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)+ ;

fragment
    DIGIT: [0-9] ;
fragment
    FRACTION : '.' DIGIT+;
fragment
	UPPERCASE: [A-Z] ;
fragment
	LOWERCASE : [a-z] ;