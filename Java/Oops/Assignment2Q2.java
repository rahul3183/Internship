import java.util.ArrayList;

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        this.salary= salary;
        return salary;

    }    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int totalSal=0;
        for(Integer sal:employeeSalaries){
            totalSal+=sal;
        }
        return totalSal;
    }
    
 
    
public static void main(String[] args) {
	
        Assignment2Q2 ob1 = new Assignment2Q2();

        Manager manager = new Manager();

        int managerSalary =manager.getSalary(ob1.salary);

        Labour labour = new Labour();
        int labourSalary = labour.getSalary(ob1.salary);

        ArrayList<Integer> employeeSalaryList = new ArrayList<>();
        employeeSalaryList.add(managerSalary);
        employeeSalaryList.add(labourSalary);
        
        for(double x: employeeSalaryList)
        {
        	 System.out.println(x);
        }
    }
}

class Manager extends Assignment2Q2 {

    public int getSalary(int salary) {
         int incentive = 5000;
         return salary+incentive;
     }
 }

class Labour extends Assignment2Q2 {

    public int getSalary(int salary) {
         int overtime = 500;
         return salary+overtime;
     }
 }  
