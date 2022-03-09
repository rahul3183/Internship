import java.lang.String;
public class javaStrings {
	
	public static void main(String[] args) {
		
	// 1 // Finding length of a string	
	String str = "Hello World";
	
	System.out.println(str.length()); 
	
	// 2  Concatenation of two strings
	String s1 = "Hello";
	String s2 = " How are you";
	
	System.out.println(s1.concat(s2));  
		
	//3 Converting string to lowercase and upercase
	String s3 = "Java String pool refers to collection of Strings which are stored in heap memory";
	
	System.out.println(s3.toLowerCase()); 
	
	System.out.println(s3.toUpperCase());
	
	//4 Replacing Characters
	System.out.println(s3.replace("a", "$")); 
	
	//5 Checking if a word present in a string
	System.out.println(s3.contains("collection"));
	
	//6 matching two strings
	String s4 = "“java string pool refers to collection of strings which are stored in heap memory";
	
	System.out.println(s3.matches(s4)); 
	
	System.out.println(s3.equals(s4)); 
	
	
	/******* Java StringBuffer *******/
	
	System.out.println("\n\nJava StringBuffer\n");
	
	// 1 Appending multiple strings
	
	StringBuffer s5 = new StringBuffer("StringBuffer ");
	StringBuffer s6 = new StringBuffer("is a peer class of String ");
	StringBuffer s7 = new StringBuffer("that provides much of ");
	StringBuffer s8 = new StringBuffer("the functionality of strings ");
	
	s5.append(s6);
	s7.append(s8);
	StringBuffer s9 = s5.append(s7);
	
	System.out.println(s9);
	
	
	// 2 Inserting at specific position
	
	StringBuffer s10 = new StringBuffer("It is used to  at the specified index position");
	
	s10.insert(15, "insert text ");
	
	System.out.println(s10);
	
	//3  Reversing a String
	
	StringBuffer s11 = new StringBuffer("This method returns the reversed object on which it was called");
	
	System.out.println(s11.reverse());
	
	
	/******* Java StringBuilder *******/
	
	System.out.println("\n\nJava StringBuilder\n");
	
	// 1 Appending multiple strings
	
		StringBuilder s12 = new StringBuilder("StringBuffer ");
		StringBuilder s13 = new StringBuilder("is a peer class of String ");
		StringBuilder s14 = new StringBuilder("that provides much of ");
		StringBuilder s15 = new StringBuilder("the functionality of strings ");
		
		s12.append(s13);
		s14.append(s15);
		StringBuilder s16 = s12.append(s14);
		
		System.out.println(s16);
		
		
		// 2 Inserting at specific position
		
		StringBuilder s17 = new StringBuilder("It is used to  at the specified index position");
		
		s17.insert(15, "insert text ");
		
		System.out.println(s17);
		
		//3  Reversing a String
		
		StringBuilder s18 = new StringBuilder("This method returns the reversed object on which it was called");
		
		System.out.println(s18.reverse());
		
		
	
	}
	
}
