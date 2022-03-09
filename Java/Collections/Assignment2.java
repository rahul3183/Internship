import java.util.HashSet;

class Product
{
	String Name;
	
    
    public Product(String Name) 
    {  
    	this.Name = Name;
    }
    
    public String toString()
    {
        return this.Name;
    }
    
}
   

class Assignment2
{
    public static void main (String[] args)
    {
    	Product ob = new Product("Book");
    	
    	
    	HashSet<Product> hash = new HashSet<>();
        
    	hash.add(new Product("Phone"));
    	hash.add(new Product("Laptop"));
    	hash.add(ob);
    	hash.add(ob); // Duplicate Object
    	hash.add(new Product("Pen"));
    	hash.add(new Product("Pencil"));
    	hash.add(new Product("Cycle"));
    	hash.add(new Product("Wire"));
    	hash.add(new Product("Camera"));
    	hash.add(new Product("PS5"));
        
    	// Fetching All Value
    	System.out.println("****** Fetching All Values in Hashset ********\n");
        System.out.println(hash);
        

        
        
   
    }
}