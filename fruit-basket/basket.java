import java.util.Scanner;
import java.util.Stack;

// author @sollano_jhaynefe

public class Basket {
    static Stack<String> Basket = new Stack<>();

    public static void removeFruit() {
        Basket.pop();
        if (Basket.isEmpty()) {
            System.out.println("No more fruits");
            System.exit(0);
        } else {
        	System.out.println("Fruit(s) in the basket: " + Basket);
        }
    }

    public static void main(String[] args) {
        Scanner jgs = new Scanner(System.in);
        System.out.println("Catch and eat any of these fruits: (Apple, Orange, Mango, Guava)");
        System.out.print("How many fruits would you like to catch? ");
        int quantity = jgs.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M, or G.");
        for (int i = 1; i <= quantity; i++) {
            System.out.print("Fruit " + i + " of " + quantity + ": ");
            String selection = jgs.next();
            if (selection.equalsIgnoreCase("a")) {
                Basket.push("'apple'");
            } else if (selection.equalsIgnoreCase("o")) {
                Basket.push("'orange'");
            } else if (selection.equalsIgnoreCase("m")) {
                Basket.push("'mango'");
            } else if (selection.equalsIgnoreCase("g")) {
                Basket.push("'guava'");
            } else {
                System.out.println("Invalid");
                i--;
            }
        }
        System.out.println("Your basket now has: " + Basket);
        while (true) {
            System.out.print("Press E to eat a fruit. ");
            String eat = jgs.next();
            if (eat.equalsIgnoreCase("e")) {
                removeFruit();
                
            }
        }
    }
}
