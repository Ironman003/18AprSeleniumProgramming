package Basics;

public class PalindromeString {


		 public static void main(String[] args) 
		   {  
		       String reverse = ""; 
		       String originl ="madam"; 
		       int length = originl.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + originl.charAt(i);  
		      if (originl.equals(reverse))  
		         System.out.println("'" +originl +"'" +" is a palindrome.");  
		      else  
		         System.out.println("'" +originl + "'" +"isn't a palindrome.");     
		  }
}