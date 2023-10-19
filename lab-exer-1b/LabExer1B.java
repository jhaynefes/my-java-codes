package labexer1b;
import java.util.*;

// @author sollano_jhaynefe

public class LabExer1B {
    
    public static int num, add, plus;
    public static void main(String[] args) {
        
        Scanner jgs = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = jgs.nextInt();
        
        showNumberPlus10();
        showNumberPlus100();
        showNumberPlus1000();
    }
  
    public static void showNumberPlus10(){
        add = 10;
        plus = num + add;
        
        System.out.println(num + " plus 10 is " + plus + ".");
    }
  
    public static void showNumberPlus100(){
        add = 100;
        plus = num + add;
        
        System.out.println(num + " plus 100 is " + plus + ".");
    }
  
    public static void showNumberPlus1000(){
        add = 1000;
        plus = num + add;
        
        System.out.println(num + " plus 1000 is " + plus + ".");
    }
    jgs.close();
}
