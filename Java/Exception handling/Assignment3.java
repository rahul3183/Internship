import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) throws UnsupportedOperationException {
    	

    	int a,b;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter first number");
    	a = sc.nextInt();
    	
    	System.out.println("Enter second number");
    	b = sc.nextInt();
    	
    	try
    	{
    		int division = a/b;
    		System.out.println("Value after divison is "+ division);
    	}
    	catch(ArithmeticException e)
    	{
    		e.printStackTrace();
    		throw new UnsupportedOperationException("You are trying to divide dividend by zero");
    	}
    	
    }
}