import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public ArrayList<Integer> armstrongNumbersInRange(int min , int max)
    {
    	ArrayList<Integer> result = new ArrayList<Integer>(); 
    	
    	for(int i = min;i <= max;i++)
    	{
    		int num = i;
    		int rem = 0;
        	int res = 0;
    		while(num != 0) 
    		{
                rem = num % 10;
                res += rem * rem * rem;
                num /= 10;
            }
    		
    		if(res == i)
        		result.add(i);
    	}
    	
    	return result;
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

    
       ArrayList<Integer> result = new ArrayList<Integer>(); 
       
       ArmstrongNumBetweenRange ob = new ArmstrongNumBetweenRange();
       
       result = ob.armstrongNumbersInRange(100, 999);
       
       for(int i:result)
       {
    	   System.out.println(i);
       }
       
      ob.armstrongNumbersInRange(100, 999);


    }
}