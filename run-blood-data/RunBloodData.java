package runblooddata;
import java.util.Scanner;

// author @sollano_jhaynefe

public class RunBloodData {
    public static void main(String[] args) {
        Scanner jgs = new Scanner(System.in);
        String input1;
        String input2;
        
        System.out.print("Enter blood type of patient: ");
        input1 = jgs.nextLine().toUpperCase();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = jgs.nextLine();

        BloodData bd;

        if (input1.isEmpty() || input2.isEmpty()) {
            bd = new BloodData();
        } else {
            bd = new BloodData(input1, input2);
        }

        bd.display();
        jgs.close();
    }
}
