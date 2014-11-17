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

    public static void main(String[] args) {
	ai();
	for (int i = ai.size(); i > 1; i--){
	    int random = r.nextInt(ai.size());
	    randomai.set(i,ai.get(random));
	    ai.remove(ai.indexOf(random));
	}
	System.out.print(randomai);
    }
}
