import java.util.*;

class Contact
{
	String Name;
	String Email;
	String Gender;
	int Phone;
	
    
    public Contact(String Name,String Email, String Gender) 
    {  
    	this.Name = Name;
    	this.Email = Email;
    	this.Gender = Gender;
    }
    
    public String toString()
    {
        return this.Name + " " + this.Email + " "
            + this.Gender;
    }
    
}
   

class Assignment1
{
    public static void main (String[] args)
    {
    	
    	Contact ob = new Contact("Rahul","ra@gmail.com","Male");
    	Contact ob2 = new Contact("Abhi","ab@gmail.com","Male");
    	Contact ob3 = new Contact("Simran","sim@gmail.com","Female");
    	
    	TreeMap<Long,Contact> map = new TreeMap<>();
        
    	map.put((long)58525561, ob);
    	map.put((long)31834554, ob2);
    	map.put((long)98151454, ob3);
        
    	// Fetching All keys
    	System.out.println("****** Fetching All keys ********\n");
        System.out.println(map.keySet());
        
     // Fetching All values
        System.out.println("\n****** Fetching All values ********\n");
        System.out.println(map.values());
    	
    	// Fetching All key-value pairs
        System.out.println("\n****** Fetching All keys value pairs ********\n");
        System.out.println(map);
        
        
   
    }
}
