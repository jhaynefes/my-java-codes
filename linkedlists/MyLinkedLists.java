package MyLinkedLists;
import java.util.*;

// author @sollano_jhaynefe

public class MyLinkedLists {
    public static void main(String[] args) {
        
        LinkedList <String> songs = new LinkedList <String> ();
            songs.add("Slow Down");
            songs.add("Don't Freak");
            songs.add("Clouds");
            songs.add("Waiting Shed");
            songs.add("I Know A Place");
            System.out.println(songs);
        
        LinkedList <String> artists = new LinkedList <String> ();
            artists.add("Mac Ayres");
            artists.add("The Aces");
            artists.add("Any Name's Okay");
            artists.add("Glaiza De Castro");
            artists.add("MUNA");
            System.out.println(artists);
            
        LinkedList <String> playlist = new LinkedList <String> ();
            
            for (int i = 0; i < songs.size(); i++) {
            playlist.add(songs.get(i) + " - " + artists.get(i));
            }
            
            for (String song : playlist){
                System.out.println(song);
            }

    }
}
