package labexer2;
import java.util.*;

// author @sollano_jhaynefe

public class LabExer2 {

    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    private double amountDue;
    
    public static void main(String[] args) {
        LabExer2 labexer2 = new LabExer2();
        labexer2.readInput();
        labexer2.writeOutput();
        System.out.println("Amount due is " + labexer2.getTotalCost());
    }
    
        public void setName(String newItemName){
            itemName = newItemName;
        }
        
        public void setTotalCost(int quantity, double price){
            itemQuantity = quantity;
            itemPrice = price;
        }
        
        public String getItemName(){
            return itemName;
        }
        
        public double getTotalCost(){
            amountDue = itemQuantity + itemPrice;
            return amountDue;
        }
        
        public void readInput(){
            Scanner jgs = new Scanner(System.in);
            System.out.println("Enter the name of the item you are purchasing: ");
            itemName = jgs.nextLine();
            
            System.out.println("Enter the quantity and price separated by space: ");
            itemQuantity = jgs.nextInt();
            itemPrice = jgs.nextDouble();
        }
        
        public void writeOutput(){
            System.out.println("You are purchasing " + itemQuantity + " " +
            itemName + "(s) at " + itemPrice + " each.");
        }
            jgs.close();
}
