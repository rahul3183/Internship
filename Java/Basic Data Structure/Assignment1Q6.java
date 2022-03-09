import java.util.Scanner;

class Login{
	
    String userId = "Ajay";
    String password = "password";

    public String loginUser(String user, String pass) {
    	
        if(user.equals(userId) && pass.equals(password))
            return "y";
        else
            return "n";
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	
        Login ob = new Login();

        int TotalLoginAttempt =0;
        String userId;
        String password;
        
        Scanner sc = new Scanner(System.in);

        while(true) {
        	
            System.out.println("Enter userId: ");
            userId = sc.next();

            System.out.println("Enter password: ");
            password = sc.next();

            String request = ob.loginUser(userId, password);
            
            if(request.equals("y"))
            {
                System.out.println("Welcome " + userId);
                break;
            }
            else
            {
            	TotalLoginAttempt++;
            	
                if(TotalLoginAttempt==3) 
                {
                    System.out.println("You have entered wrong credentials 3 times \nContact Admin");
                    break;
                }
                
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }
        }
    }
}