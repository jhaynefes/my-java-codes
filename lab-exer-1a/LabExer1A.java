package labexer1a;
import java.util.*;

//@author Jhaynefe_Sollano

public class LabExer1A {
    public static void main(String[] args) {
        
        Scanner jgs = new Scanner(System.in);
        
        System.out.println("What is your favorite number?");
        int faveNumber = jgs.nextInt();
        
        System.out.println("Who is your favorite cartoon character?");
        String faveCartChar = jgs.next();
        
        System.out.println("What is your first name?");
        String fName = jgs.next();
        
        System.out.println("What is your middle initial?");
        char mi = jgs.next().charAt(0);
        
        System.out.println("What is your last name?");
        String lName = jgs.next();
        
        System.out.println("What is your nickname?");
        String nickName = jgs.next();
        
        System.out.println(" ");
        System.out.println(faveNumber + " is my favorite number.");
        System.out.println("I love " + faveCartChar + "!");
        System.out.println("My name is " + fName + " " + mi + " " + lName);
        System.out.println("You can call me " + nickName);
    }
}
