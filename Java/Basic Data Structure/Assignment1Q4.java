import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	
        double sum = subject1Marks + subject2Marks + subject3Marks;
        
        if(sum>60 && ((subject1Marks+subject2Marks <=60) && (subject2Marks+subject3Marks<=60) && subject1Marks+subject3Marks<=60))
            return "Passed";
        else if((sum<60 || (subject1Marks>60 && subject2Marks<60 && subject3Marks<60)) || (sum<60 || (subject2Marks>60 && subject1Marks<60 && subject3Marks<60)) || (sum<60 || (subject3Marks>60 && subject2Marks<60 && subject1Marks<60)) )
            return "failed";
        else
            return "passed\npromoted";
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
    	
    	ResultDeclaration ob = new ResultDeclaration();
    	 
        double subject1Marks,subject2Marks,subject3Marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1: ");
        subject1Marks = sc.nextDouble();

        System.out.println("Enter marks of subject 2: ");
        subject2Marks = sc.nextDouble();

        System.out.println("Enter marks of subject 3: ");
        subject3Marks = sc.nextDouble();

        System.out.println(ob.declareResults(subject1Marks,subject2Marks,subject3Marks));
        
    }
}