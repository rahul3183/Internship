import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String s)
    {
        super(s);
    }
}

class IllegalBankTransactionException extends Exception
{
    public IllegalBankTransactionException(String s)
    {
        super(s);
    }
}

class Login{
	
	double accountBalance;
	int userID;
	
    public Login()
    {
    	System.out.println("Enter user ID ");
    	Scanner sc = new Scanner(System.in);
		userID = sc.nextInt();
    	
    }
    
    public double balance()
    {
    	return accountBalance;
    }

    
    public void deposit(double accountBalance)
    {
    	this.accountBalance = accountBalance;
    }

    public void withdraw(double amount) {
    	
        if(amount <= accountBalance && accountBalance > 0 && amount > 0)
        {
        	System.out.println("withdrawal Successful");
        }
        else if(amount > accountBalance)
        {
        	try {
        		
        		throw new InsufficientBalanceException("Invalid amount");
        	}
        	catch(InsufficientBalanceException ex)
        	{
        		ex.printStackTrace();
        	}
        }
        else if(amount < 0)
        {
        	try {
        		
        		throw new IllegalBankTransactionException("Illegal Transaction");
        	}
        	catch(IllegalBankTransactionException ex)
        	{
        		ex.printStackTrace();
        	}
        }
    }

}
public class Assignment2 {
	 public static void main(String[] args) {
	 
		 
		 Login ob = new Login();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter amount to deposit");
		 int input = sc.nextInt();
		 ob.deposit(input);
		 
		 ob.balance();
		 
		 System.out.println("Enter amount to withdraw");
		 input = sc.nextInt();
		 
		 ob.withdraw(input);
		 
		 
	 }
}
