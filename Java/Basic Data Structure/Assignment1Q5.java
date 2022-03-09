import java.util.Scanner;

class TaxAmount{
	
    double tax=0;
    
    public double calculateTaxAmount(int ctc){
    	
        if(ctc>0 && ctc<=180000)
            tax= 0;
        else if(ctc >= 180001 && ctc <=300000)
            tax = (ctc*10)/100;
        else if(ctc>=300001 && ctc<=500000)
            tax = (ctc*20)/100;
        else if(ctc>=500001 && ctc <=1000000)
            tax = (ctc*30)/100;

        return tax;
        
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
    	
        TaxAmount ob = new TaxAmount();
        
        int ctc;
        double tax;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter CTC: ");
        ctc = sc.nextInt();

        tax = ob.calculateTaxAmount(ctc);
        System.out.println("Total payable Tax : " + tax);
        
    }
}