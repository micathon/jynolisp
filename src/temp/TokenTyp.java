package iconst;

public enum TokenTyp {
	ALPHA, NUMERIC, PUNCT, INVALID,
	KEYWORD, BLTINFUNC, SYSFUNC, IDENTIFIER,
	BINARY, OCTAL, HEXADECIMAL, DECIMAL, LONG, FLOAT,
	OPENPAR, CLOSEPAR, SEMICOLON, CMTLINE, CMTBLK, STRLIT, OPERATOR,
	ERRSYM, ERRESC, ERRDOT, ERRCLOSEBRACE, ERRCLOSEQUOTE, ERRINCMTEOF,
	ERRIDENTIFIER, ERRIDOVERSLASH, ERRSYSFUNC, ERROP, ERRNUM,
	ERRSTKOVRFLW, ERRSTKUNDFLW, ERRFREE, ERRPOSTPARTOK, 
	ERRDOMISSINGBLK, ERRPARENRPT, ERRBADPOPBYTE,
	ERRMULTISTRLITBADCHAR;
	
	public static final TokenTyp values[] = values();
}