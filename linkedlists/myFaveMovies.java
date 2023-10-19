package LinkedLists;
import java.util.*;

// author @sollano_jhaynefe

public class myFaveMovies {
    public static void main(String[] args) {
        
        LinkedList <String> favMovies = new LinkedList <String> ();
            favMovies.add("Harry Potter and the Goblet of Fire");
            favMovies.add("Descendants 1, 2, and 3");
            favMovies.add("Camp Rock 2");
            favMovies.add("Encanto");
            
            for (int i = 0; i < 4; i++) {
            System.out.println(favMovies.get(i));
            }
     }
}
