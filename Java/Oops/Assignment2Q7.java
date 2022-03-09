import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}

class Candy extends DesertItem {
	
    int totalCandies = 0;
    int Dollar = 60;
    public int addCandies(int candies){
        this.totalCandies+=candies;
        return totalCandies;
    }

    public int getCost() {
        return totalCandies * Dollar;
    }
}
class Cookie extends DesertItem {
	
    int totalCookies=0;
    int Euro = 70;
    public int addCookies(int cookies){

    	totalCookies +=cookies;
        return  totalCookies;
    }

   
    public int getCost() {
        return totalCookies * Euro;
    }
}

class IceCream extends DesertItem {
	
    int totalIceCream=0;
    public int addIceCreams(int iceCreams){
        totalIceCream += iceCreams;
        return totalIceCream;
    }
    
    public int getCost() {
        return totalIceCream * 1;
    }
}
public class Assignment2Q7 {
	
    Scanner sc = new Scanner(System.in);
    
    private void selectRoles(){

        System.out.println("Enter your role. \n Enter C for Customer or O for Owner");

        String role;
        role = sc.next();

        roles(role);
    }
    
    private void roles(String role){
    	
        if(role.toUpperCase().equals("C")){
            placeOrder();
        }
        else if(role.toUpperCase().equals("O"))
            addItems();
        else
            System.out.println("Invalid Entry");
    }
    
    private void addItems() {
    	
        System.out.println("Choose an item to add \n 1. Candy \n 2. Cookie \n3. Ice Cream");
        int choice;
        choice = sc.nextInt();
        addItemsOperation(choice);
    }
    
    private void addItemsOperation(int choice) {

            switch (choice) {
                case 1:
                	int amount,total;
                    Candy candy = new Candy();
                    System.out.println("Enter Total Candies ");
                    amount = sc.nextInt();
                    total = candy.addCandies(amount);
                    System.out.println("Candies added");
                    break;
                case 2:
                    Cookie cookie = new Cookie();
                    System.out.println("Enter total cookies");
                    amount = sc.nextInt();
                    total = cookie.addCookies(amount);
                    System.out.println("Cookies added");
                    break;
                case 3:
                    IceCream iceCream = new IceCream();
                    System.out.println("Enter total Ice Cream");
                    amount = sc.nextInt();
                    total = iceCream.addIceCreams(amount);
                    System.out.println("Ice Creams added");
                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
    }
    
    private void placeOrder() {
    	
        System.out.println("Choose itmes to be placed :");
        System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
        System.out.println("Enter your choice: ");
        int ch;
        ch = sc.nextInt();
        placeOrderOperation(ch);
    }
    
    private void placeOrderOperation(int choice) {
        switch (choice) {
            case 1:
                Candy candy = new Candy();
                System.out.println("Enter total candies");

                int total = candy.getCost();
                System.out.println("Candies placed succesfully and total cost is " + total);
                break;
            case 2:
                Cookie cookie = new Cookie();
                System.out.println("Enter the amount of cookies to be placed ");

                total = cookie.getCost();
                System.out.println("Cookies placed succesfully and total  cost is " + total);
                break;
            case 3:
                IceCream iceCream = new IceCream();
                System.out.println("Enter the amount of Ice Cream to be added ");

                total = iceCream.getCost();
                System.out.println("Ice Creams placed succesfully and total cost is : " + total);
            default:
                System.out.println("please enter valid number!");
                break;
        }

    }
    
    public static void main(String[] args) {
    	
        Assignment2Q7 assignment2Q7 = new Assignment2Q7();
        assignment2Q7.selectRoles();

    }

}