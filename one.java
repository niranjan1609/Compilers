import java.util.Scanner;

public class one {

		 public static void main(String args[]){
			 Scanner sc = new Scanner(System.in);
			 String in= sc.nextLine();
			 String[] ar =in.split(" ");
			 for(int i=0;i<ar.length;i++) {	 	
				 if(ar[i].equals("+") || ar[i].equals("-")|| ar[i].equals("*")||ar[i].equals("/")||ar[i].equals("%")) 
					 arithematic(ar[i]);
				 else if(ar[i].equals("||")|| ar[i].equals("&&")||ar[i].equals("!=")||ar[i].equals("=="))
					 Logical(ar[i]);
				 else if(ar[i].equals("=")) 
					 Assignment(ar[i]);
				 else if(ar[i].equals("("))
					 Left_Paranthesis(ar[i]);
				 else if(ar[i].equals(")"))
					 Right_Paranthesis(ar[i]);
				 else if(ar[i].equals("{"))
					 Left_curly_braces(ar[i]);
				 else if(ar[i].equals("}"))
					 Right_curly_braces(ar[i]);
				 else if(ar[i].equals("var")||ar[i].equals("main"))
					 Key_words(ar[i]);
				 else if(ar[i].equals("integer")|| ar[i].equals("char")||ar[i].equals("string")||ar[i].equals("float")) 
					 Data_Types(ar[i]);
				else if(ar[i].equals("input"))
					input_function(ar[i]);
				else if(ar[i].equals("output"))
					output_function(ar[i]);
				else if(ar[i].equals(",")||ar[i].equals(";"))
						 ar[i]="";
				else
					Identifiers(ar[i]);
			 }
					 
		 }
		 
		 static void arithematic(String ar) {
				 System.out.println(ar+"-Arithmetic operators");
			}
		 
		 static void Logical(String ar) {
				 System.out.println(ar+"-Logical Operators");
		 }
		 static void Assignment(String ar) {
			 
				 System.out.println(ar+"-Assignment Operator");
				 
		 }
		 static void Left_Paranthesis(String ar) {
				 System.out.println(ar+"-Left Paranthesis");
		 }
		 static void Right_Paranthesis(String ar) {
				 System.out.println(ar+"-Right Paranthesis");
		 }
		 static void Left_curly_braces(String ar) {
				 System.out.println(ar+"-Left curly braces");
		 }
		 static void Right_curly_braces(String ar) {
				 System.out.println(ar+"-Right curly braces");
		 }
		 static void Data_Types(String ar) {
				 System.out.println(ar+"-Data Types");}
		 
		 
		 static void Key_words(String ar) {
			 System.out.println(ar+"-Key Words");
		 }
		 static void input_function(String ar) 		{			 
			 System.out.println(ar+"-input function");
		 }
		 static void output_function(String ar) {
			 System.out.println(ar+"-output function");
		 }
		 static void Identifiers(String ar) {
				System.out.println(ar+"-Identifiers");

		 }
		 
		 
	 
			
		
		


}
