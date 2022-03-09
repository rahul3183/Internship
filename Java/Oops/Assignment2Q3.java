import java.util.ArrayList;

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int availBal=0;
        for(Integer i:cash){
            availBal+=i;
        }
        return availBal;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        Assignment2Q3 assignment2Q3 = new Assignment2Q3();

        CurrentAccount currentAccount = new CurrentAccount();
        int currentBal = currentAccount.getCash();

        SavingsAccount savingsAccount =new SavingsAccount();
        int savingBal = savingsAccount.getCash();

        ArrayList<Integer> cash = new ArrayList<>();
        cash.add(currentBal);
        cash.add(savingBal);

        System.out.println("Total cash in the bank " + assignment2Q3.totalCashInBank(cash));

    }
}
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    
    public int getCash() {
        return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    
    public int getCash() {
        return  totalDeposits+fixedDepositAmount;
    }
}