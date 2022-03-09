abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "DatabasePersistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	
    	Persistence ob = new FilePersistence();
    	
    	System.out.println(ob.persist());
    	
    }
}


