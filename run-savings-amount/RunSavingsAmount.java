package RunSavingsAccount;
import java.util.*;

// @author sollano_jhaynefe

public class RunSavingsAccount {
    public static void main(String[] args) {
        
        Scanner jgs = new Scanner(System.in);
        
        SavingsAccount savings = new SavingsAccount();
        System.out.print("Enter interest rate: ");
        double iRate = jgs.nextDouble();
        savings.setInterestRate(iRate);
        
        System.out.print("Enter Deposit Amount: ");
        double deposit1 = jgs.nextDouble();
        savings.deposit(deposit1);
        System.out.println("Your new balance is: " + savings.getBalance());
        
        System.out.println("Press 'D' for another deposit or 'W' for withdraw");
        String press = jgs.next().toUpperCase();
        
        if (press.equals("D")){
            System.out.print("Enter Deposit Amount: ");
            double deposit2 = jgs.nextDouble();
            savings.deposit(deposit2);
            if(savings.getBalance()>=1000){
                savings.addInterest();
                savings.showBalance(savings);
            } else { savings.showBalance(savings);}
        } else if(press.equals("W")){
            System.out.print("Enter Withdraw Amount: ");
            double withdraw1 = jgs.nextDouble();
            savings.withdraw(withdraw1);
            savings.showBalance(savings);
        } else {
            System.out.print("Invalid Input");
        }
    }
}
