package com.sun.java;

public class LegalNamings {
	// Legal names
	public static final int _a = 10; /*public variables declaration comes first*/
	private double how_much_long_u_want_u_can_create_a_variable_name;/*private/default variables declaration next*/
	private final int ___2_w = 20;
	private static String $c = "string data type.";
	private static long _$ = 244444777;

	public LegalNamings() {/*variables declarations followed by constructors*/
		how_much_long_u_want_u_can_create_a_variable_name = 7.99;
		System.out.println("----Constructor starts---- ");
		System.out.println("how_much_long_u_want_u_can_create_a_variable_name=  "
				+ how_much_long_u_want_u_can_create_a_variable_name);
		System.out.println("----Constructor Ends------ ");
	}
	public void firstMethod(){/*Next public Methods declaration comes*/
		long result=___2_w*_$;
		System.out.println("Result of firstMethod() :"+result);
		
	}
	public static void main(String p[]) {

		System.out.println("int _a= " + _a);
		System.out.println("long _$= " + _$);
		System.out.println("String $c is " + $c);
		LegalNamings legalNamings = new LegalNamings();
		legalNamings.firstMethod();
		/*
		 * Illegal declarations 
		 * String .7; 
		 * char 7g; 
		 * boolean e#; 
		 * float :k; 
		 * char -j;
		 */

		// COMPILATION ERROR OCCURED FOR ABOVE ILLEGAL DECLARARIONS

		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation
		 * problems: Syntax error on token "String", AssignmentOperator expected
		 * after this token String cannot be resolved to a variable Syntax error
		 * on token "7", delete this token Syntax error on token
		 * "Invalid Character", delete this token Syntax error on token ":",
		 * delete this token Syntax error on token "-", delete this token
		 * 
		 * at com.sun.java.LegalNamings.main(LegalNamings.java:16)
		 */
	}
}
