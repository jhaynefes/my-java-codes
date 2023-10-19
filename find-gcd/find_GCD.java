package gcd;
import java.util.Scanner;

// author @sollano_jhaynefe

public class find_GCD {

    public static void main(String[] args) {
        Scanner jgs = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = jgs.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = jgs.nextInt();
        int find_gcd = find_gcd(num1, num2);

        System.out.print("The GCD of " + num1 + " and " + num2 + " is " + find_gcd + ".");
    }

    public static int find_gcd(int num1, int num2)
    {
        if (num2 != 0)
            return find_gcd(num2, num1 % num2);
        else
            return num1;
    }
}
