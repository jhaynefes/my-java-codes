package runamountdue;
import java.util.*;
// @sollano_jhaynefe

public class RunAmountDue {

    public static void main(String[] args) {
        
        Scanner jgs = new Scanner(System.in);
        
        AmountDue due = new AmountDue();
        
        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount");
        
        int press = jgs.nextInt();
        
        switch(press){
            case 1: {
                double itemPrice = jgs.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(itemPrice));
                break;
            }case 2: {
                double itemPrice = jgs.nextDouble();
                int itemQuantity = jgs.nextInt();
                System.out.println("Amount due is " + due.computeAmountDue(itemPrice, itemQuantity));
                break;
            }case 3: {
                double itemPrice = jgs.nextDouble();
                int itemQuantity = jgs.nextInt();
                double itemDiscount = jgs.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(itemPrice, itemQuantity, itemDiscount));
                break;
            }default: {
                System.out.println("Invalid Input!");
                break;
            }
        }

    }
}
