import java.io.*;
import java.util.*;

public class Driver {

	static ArrayList<Integer> ai = new ArrayList<Integer>();

    public static void randomArrayy() {
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    ai.add(r.nextInt(5));
	}
	System.out.println("w/ duplicates: " + ai);
    }


    public static void main(String[] args) {
	randomArrayy();
	for (int i = 0; i < ai.size()-1; i++){
	    /*
~~~~another way~~~~~
	      if ((ai.get(i) == ai.get(i+1)){
		ai.remove(i);
		i--;
		  }
	    */

	    if ((ai.get(i) == ai.get(i+1)) || (ai.get(i) == ai.get(i-1))){
		ai.remove(i);	
	    }
	}	
	System.out.println("w/out duplicates: " + ai);
    }
}
