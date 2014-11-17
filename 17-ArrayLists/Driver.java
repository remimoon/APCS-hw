import java.io.*;
import java.util.*;

public class Driver {

   static Random r = new Random();
    
   static ArrayList<Integer> ai = new ArrayList<Integer>();
   static ArrayList<Integer> randomai = new ArrayList<Integer>();


    public static void ai(){
    for ( int i = 0; i < 20; i++) {
	ai.add(i);
    }

    System.out.println(ai);
    }

    public static void main (String[]args){
	ai();
	while (ai.size()>0){
	    int random = r.nextInt(ai.size());
	    int removed = ai.remove(random);
	    randomai.add(removed);
	}
        System.out.println(randomai);
    }

    
}
