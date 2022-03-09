import java.util.*;
public class Assignment4 {
	
	public static void main (String[] args)
    {
    	
		Calendar d = new GregorianCalendar(2012, 9, 5);
		Calendar d1 = new GregorianCalendar(2020, 19, 5);
		Calendar d2 = new GregorianCalendar(2013, 23, 8);
		Calendar d3 = new GregorianCalendar(2000, 7, 9);
		Calendar d4 = new GregorianCalendar(2007, 1, 4);
    	
    	LinkedList<Calendar> link = new LinkedList<>();
    	
    	link.add(d);
    	link.add(d1);
    	link.add(d2);
    	link.add(d3);
    	link.add(d4);

        Collections.reverse(link);
        
        for(Calendar date:link)
        {
        	 int year = date.get(Calendar.YEAR);
        	 int leap = year%4;
        	 System.out.println("\n Your Date of Birth is " + date.get(Calendar.DAY_OF_MONTH) + "-" + date.get(Calendar.MONTH) + "-" + year + (leap == 0? " and it was a leap year":" and it was not a leap year"));
        }
   
    }
	

}
