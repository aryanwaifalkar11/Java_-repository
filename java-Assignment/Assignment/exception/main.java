package com.exception;

import java.util.Scanner;

public class main {

	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String S= sc.nextLine();
		try {
		if(S.length()> 80) {
			throw new ExceptionLineTooLong ("The string is too long");
		}
		else {
			System.out.println("String length: " + S.length());
		}
		}
		catch(ExceptionLineTooLong e){
			System.out.println(e.getMessage());	
		}
         sc.close();
	}
   
}
