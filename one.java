package lab1;

import java.util.Scanner;

public class one {
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 String in= sc.nextLine();
		 String[] ar =in.split(" ");
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i].equals("+") || ar[i].equals("-")|| ar[i].equals("*")||ar[i].equals("/")||ar[i].equals("%")) {
				 System.out.println(ar[i]+"-Arithmetic operators");
			 	}
			 	 else if(ar[i].equals("||")|| ar[i].equals("&&")||ar[i].equals("!=")||ar[i].equals("=="))
				 System.out.println(ar[i]+"-Logical Operators");
			 	 else if(ar[i].equals("=")) {
				 System.out.println(ar[i]+"-Assaignment Operator");}
				 else if(ar[i].equals("("))
				 System.out.println(ar[i]+"-Left Paranthesis");
				 else if(ar[i].equals(")"))
				 System.out.println(ar[i]+"-Right Paranthesis");
				 else if(ar[i].equals("{"))
				 System.out.println(ar[i]+"-Left curly braces");
				 else if(ar[i].equals("}"))
				 System.out.println(ar[i]+"-Right curly braces");
				 else if(ar[i].equals("integer")|| ar[i].equals("char")||ar[i].equals("string")||ar[i].equals("float")) {
				 System.out.println(ar[i]+"-Data Types");}
				 else if(ar[i].equals("var")||ar[i].equals("main"))
					 System.out.println(ar[i]+"-Key Words");
				 else if(ar[i].equals("input"))
					 System.out.println(ar[i]+"-input function");
				 else if(ar[i].equals("output"))
					 System.out.println(ar[i]+"-output function");
				 else if(ar[i].equals(",")||ar[i].equals(";"))
					 ar[i]="";
				 else
					 System.out.println(ar[i]+"-Identifiers");
				 
		 }
	 }
 }
		
	


