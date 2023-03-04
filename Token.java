/**
 * Object of enum to store Token codes
 * @author My Tran
 * @version 1.0
 */
enum Token
{
    //lexeme Token codes
    INT_LIT, 
    IDENT, 
    ADD_OP, 
    SUB_OP, 
    MULT_OP, 
    DIV_OP, 
    LEFT_PAREN, 
    RIGHT_PAREN, 

    //character classes
    LETTER,
    DIGIT,
    UNKNOWN,  

    //error Token codes
    EOF,
    WHILE_CODE,
    FOR_CODE,
    ASSIGN_OP, 
    IF_CODE,
    ELSE_CODE,
    DO_CODE,
    INT_CODE,
    FLOAT_CODE,
    SWITCH_CODE
}