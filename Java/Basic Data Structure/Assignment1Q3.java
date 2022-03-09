import java.util.Scanner;

class SiCi {
	
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	
        double si = 0;
        si = (principalAmount*time*interestRate)/100;
        return  si;
        
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        
    	double ci = 0;
        ci = (principalAmount * (Math.pow((1+interestRate),time)) ) - principalAmount;
        return ci;
        
    }
}
public class Assignment1Q3 {
    public static void main(String[] args) {
    	
        SiCi ob = new SiCi();
        int time;
        double principalAmounnt,interestRate;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter principal Amount: ");
        principalAmounnt = sc.nextDouble();
        
        System.out.println("Enter Annual interest rate: ");
        interestRate = sc.nextDouble();
        
        System.out.println("Enter period of time: ");
        time = sc.nextInt();


        System.out.println("Simple interest for the principal Amount Rs. "+principalAmounnt+" for "+time+" years is Rs. " + ob.simpleInterest(principalAmounnt,time,interestRate));

        System.out.println("Compound interest for the principal Amount Rs. "+principalAmounnt+" for "+time+" years is Rs. " + ob.simpleInterest(principalAmounnt,time,interestRate));

    }
}