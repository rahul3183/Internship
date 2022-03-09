import java.util.*;

class Employee implements Comparable<Employee>
{
	int ID;
	String Name;
	String Department;
	String Salary;
	
    
    public Employee(int ID,String Name,String Department, String Salary) 
    {  
    	this.ID = ID;
    	this.Name = Name;
    	this.Department = Department;
    	this.Salary = Salary;
    }


	public int compareTo(Employee o) {
		return 0;
	}
    
}
   

class Assignment3
{
    public static void main (String[] args)
    {
    	
    	Employee ob = new Employee(101,"Rahul","IT","50,000");
    	Employee ob2 = new Employee(102,"Aman","IT","50,000");
    	Employee ob3 = new Employee(105,"Rakesh","IT","50,000");
    	
    	Set<Employee> set = new TreeSet<>();
        
    	set.add(ob);
    	set.add(ob2);
    	set.add(ob3);
    	set.add(new Employee(106,"Anjali","IT","55,000"));
    	set.add(new Employee(107,"Amit","Marketing","60,000"));
    	set.add(new Employee(107,"Aman","Marketing","60,000"));
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Select a option \n 1: ID \n 2: Name \n 3: Department \n 4: Salary ");
    	int choice = sc.nextInt();
    	
        
    	switch(choice)
    	{
    		case 1: 
    			for(Employee data:set)
    			{  
    	    	   System.out.println(data.ID + " \n");  
    	    	} 
    			break;
    		case 2: 
    			for(Employee data:set)
    			{  
    	    	   System.out.println(data.Name + " \n");  
    	    	} 
    			break;
    		case 3: 
    			for(Employee data:set)
    			{  
    	    	   System.out.println(data.Department + " \n");  
    	    	} 
    			break;
    		case 4: 
    			for(Employee data:set)
    			{  
    	    	   System.out.println(data.Salary + " \n");  
    	    	} 
    			break;
    		default: System.out.println(" Invalid Option ");  
    	}

    }
}