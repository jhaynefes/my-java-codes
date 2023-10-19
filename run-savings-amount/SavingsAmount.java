package RunSavingsAccount;

// @author sollano_jhaynefe

public class SavingsAccount {
    private double balance;
    public static double interestRate = 0;
    
    public static void setInterestRate(double newRate){
        interestRate = newRate;
    }
    
    public static double getInterestRate(){
        return interestRate;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public double withdraw(double amount){
        if (balance>=amount){
            balance = balance - amount;}
        else if (balance < amount){
        System.out.println("Insufficient Funds. Try Again!");}
        return amount;}
    
    public void addInterest(){
        double interest = balance * interestRate;
        balance = balance + interest;
    }
    
    public static void showBalance(SavingsAccount account){
        System.out.println("Your new balance is: " + account.getBalance());
    }
}
