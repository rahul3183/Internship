class Rectangle5 extends Shape5 {
    
    public String draw() {
        return("Rectangle");
    }
}

class Line5 extends Shape5{
    
    public String draw() {
        return ("Line");
    }
}

class Cube5 extends Shape5 {
    
    public String draw() {
        return ("Cube");
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	
    	Shape5 ob = new Rectangle5();
    	Shape5 ob2 = new Line5();
    	Shape5 ob3 = new Cube5();
    	
    	System.out.println(ob.draw());
    	System.out.println(ob2.draw());
    	System.out.println(ob3.draw());
    }
}