
@interface Info{
	
  int AuthorId() default 0;
  String AuthorName() default "";
  String Supervisor() default "";

}

public class Assignment2{
	
	@Info
	public void Employee()
	{
		System.out.println("Workss");
	}
	
	 public static void main(String[] args) throws Exception {
		 
		 Assignment2 ob  = new Assignment2();
		 
				 ob.Employee();
	        
	    }
}
