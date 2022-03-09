
interface  Arithmetic{
	
    public  double ArithmeticOperation (int num1,int num2);

}

public class Assignment4Q1 {
	
    public double addition(int num1,int num2){
        Arithmetic add = (int n1,int n2)-> n1 + n2;
        return add.ArithmeticOperation(num1,num2);
    }
    
    public double subtraction(int num1,int num2){
        Arithmetic sub = (int n1,int n2)-> n1 - n2;
        return sub.ArithmeticOperation(num1,num2);
    }
    
    public double multiplication(int num1,int num2){
        Arithmetic mul = (int n1,int n2)-> n1 * n2;
        return mul.ArithmeticOperation(num1,num2);
    }
    
    public double division(int num1,int num2){
        Arithmetic div= (int n1,int n2)-> (double) n1/n2;
        return div.ArithmeticOperation(num1,num2);
    }
    
    public static void main(String[] args) {
    	
        Assignment4Q1 ob = new Assignment4Q1();
        System.out.println(ob.addition(13,5));
        System.out.println(ob.subtraction(13,5));
        System.out.println(ob.multiplication(13,5));
        System.out.println(ob.division(13,5));
    }
}
