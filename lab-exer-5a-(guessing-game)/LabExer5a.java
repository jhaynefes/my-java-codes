package labexer5a;
import java.util.*;

// author @sollano_jhaynefe

public class LabExer5A {

    public static void main(String[] args) {
       
        Scanner jgs = new Scanner(System.in);
        Random jhy = new Random();
        
        System.out.println("Welcome to the GUESSING GAME!");
        int max = 10;
        
        int ranNum = jhy.nextInt(max);
        int attempts = 0;
        int guess = 0;
        
        boolean success = false;
        try{
        while(!success){
           
                System.out.println("Guess a number from 1 and 10!");
                guess = jgs.nextInt();
                attempts++;
                
                if (guess == ranNum){
                    success = true;
                    System.out.println("Congrats! You got it in " + attempts + " tries.");
                }
                else if (guess < ranNum){
                    System.out.println("Guess is too low, try again.");
                }
                else if (guess > ranNum){
                    System.out.println("Guess is too high, try again.");
                }
        }
        if (guess > 10)
        throw new Exception();
        }
        catch (Exception e) {
        System.out.println("Please enter a valid number from 1 to 10 only.");
        }
    }
}
