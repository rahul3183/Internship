
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	
    	int rem = 0;
    	int result = 0;
    	
    	int numOrg = num;
    	
    	while(num != 0) {
            rem = num % 10;
            result += rem * rem * rem;
            num /= 10;
        }
    	
    	if(result == numOrg)
    		return true;
    	else
    		return false;
    	
    	}
    }

public class Assignment1Q1 {
    public static void main(String[] args) 
    {
    	ArmstrongOrNot ob = new ArmstrongOrNot();
    	
    	System.out.println(ob.armstrongCheck(371));
    	
    	System.out.println(ob.armstrongCheck(375));
    }
}
