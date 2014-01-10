package com.sun.java;

/**
 * 
 * 1.When equating two strings, are the leading or trailing spaces considered?
 * ANS:-YES
 * 
 * 2. Can we equate strings those having just spaces.
 * ANS:-It is possible.
 * 
 * 3. Can we equate 'A' with “A”? (note the first is a character and second is a string.)
 * ANS:- [Compilation error line.no:25]Cannot invoke equals(String) on the primitive type char
 * 
Coding Exercises
1. Write a program to print a string by changing the case of each of its characters.
2. Write a program to print a string by reversing its content.
 * @author tgopalakrishnan
 *
 */
public class StringManipulation {
	static char s1='A';
	static String s2="A";
	static String s3="GOOD";

	
	public static void main(String[] gopal){
		/*System.out.println(s1.equals(s2));*/
		String s4 = null;
		System.out.println(s3.toLowerCase());
		

		System.out.println(s3.length()-1);

		for (int i=s3.length()-1;i<0;i--){
			//s4 = s4+s3.substring(i);
			System.out.println(i);
			System.out.println(s3.substring(i));
		}
		System.out.println("Reverse of string s3: "+ s4+"..");
			
		
		
	}

}
