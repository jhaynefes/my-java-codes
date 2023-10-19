package labexer5b;
import java.util.*;

// author @sollano_jhaynefe

public class QuizBee {
    public Scanner jgs = new Scanner(System.in);
  
    public static void main (String args[]) {
        QuizBee main = new QuizBee();
            main.welcomer();
    }
    
    public void welcomer(){
        System.out.println("Welcome to Quiz Bee!");
        System.out.println("Would you like to start playing now?");
        System.out.println("Press [Y] for YES.");
        System.out.println("Press any key for NO.");
        String pick = jgs.next();
        
        if(pick.equalsIgnoreCase("Y")){
            quizBee();
        }
        else{
            System.out.println("Exiting the program.");
            System.out.println("Program closed.");
        }
    }

    
    public void quizBee() {
        int score = 0;
        String q[] = new String[10];
        String ans[] = new String[10];
        String a[] = new String[10];
        String b[] = new String[10];
        String c[] = new String[10];
        
            //Q1
            q[0] = "1.) What is the largest animal on Earth?";
            a[0] = "A. Elephant";
            b[0] = "B. Blue Whale";
            c[0] = "C. Giraffe";
            ans[0] = "b";
            //Q2
            q[1] = "2.} What is the planet closest to the Sun?";
            a[1] = "A. Mercury";
            b[1] = "B. Earth";
            c[1] = "C. Jupiter";
            ans[1] = "a";
            //Q3
            q[2] = "3.} Who wrote the book 'To Kill A Mockingbird'?";
            a[2] = "A. J.K Rowling";
            b[2] = "B. Harper Lee";
            c[2] = "C. Stephen King";
            ans[2] = "b";
            //Q4
            q[3] = "4.} What is the capital of Spain?";
            a[3] = "A. Madrid";
            b[3] = "B. Barcelona";
            c[3] = "C. Seville";
            ans[3] = "a";
            //Q5
            q[4] = "5.} What is the highest mountain in the world?";
            a[4] = "A. Mt. McKinley";
            b[4] = "B. Mt. Kilimanjaro";
            c[4] = "C. Mt. Everest";
            ans[4] = "c";
            //Q6
            q[5] = "6.} Who invented the telephone?";
            a[5] = "A. Thomas Edison";
            b[5] = "B. Alexander Graham Bell";
            c[5] = "C. Isaac Newton";
            ans[5] = "b";
            //Q7
            q[6] = "7.} How many players are on a soccer team?";
            a[6] = "A. 10";
            b[6] = "B. 11";
            c[6] = "C. 12";
            ans[6] = "b";
            //Q8
            q[7] = "8.} What is the smallest country in the world?";
            a[7] = "A. Monaco";
            b[7] = "B. San Marino";
            c[7] = "C. Vatican City";
            ans[7] = "c";
            //Q9
            q[8] = "9.} Who painted Mona Lisa?";
            a[8] = "A. Leonardo da Vinci";
            b[8] = "B. Vincent van Gogh";
            c[8] = "C. Pablo Picasso";
            ans[8] = "a";
            //Q10
            q[9] = "10.} What is the name of the Greek God of Love?";
            a[9] = "A. Mercury";
            b[9] = "B. Eros";
            c[9] = "C. Mars";
            ans[9] = "b";
            
    System.out.println("Quiz Bee");
    for(int x = 0; x < 10; x++) {
        try {
        System.out.println(q[x]);
        System.out.println(a[x]);
        System.out.println(b[x]);
        System.out.println(c[x]);
        System.out.print("Enter answer: ");
        String input = jgs.next();
        System.out.println("");
            if(input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("b") || input.equalsIgnoreCase("c")) {
            if(input.equalsIgnoreCase(ans[x])){
                score++;
                }
            }
            else if(input.matches(".*\\d.*") ||
                input.matches("[^a-zA-Z0-9]")) {
        throw new NumAndCharException();
            }
            else if(input == null || input.isEmpty() || input.matches(" ")) {
                throw new EmptyInputException();
            }
            else {
        throw new InvalidLetterException();
            }
        }
        catch(NumAndCharException|EmptyInputException|InvalidLetterException e) {
            System.out.println(e.getMessage());
            --x;
        }
    }
        System.out.print("Your score is: " + score + " out of 10.");
}
    public class NumAndCharException extends Exception {
        public NumAndCharException(){
            super("ERROR: Number or Special Characters are not allowed. \n");
        }
    }

    public class EmptyInputException extends Exception {
        public EmptyInputException(){
            super("ERROR: Input is Empty. \n");
        }
    }
    public class InvalidLetterException extends Exception {
        public InvalidLetterException(){
            super("ERROR: Invalid Letter. A, B, or C only. \n");
        }
    }
}
