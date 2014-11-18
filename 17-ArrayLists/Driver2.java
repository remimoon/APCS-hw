import java.util.*;

public class Driver2 {

   static int[] l = new int[20];

    public static void l(){
    for (int i=1; i<21; i++){
	l[i] = i;
    }
    System.out.println(l);
    }

   static Random r = new Random();

    public static void main (String[] args){
	l();
	int[] randoml = new int[l.length];
	for (int i = 0; i < l.length; i++){
	    int random = r.nextInt(l.length);
	    if (l[random] == 0){
		i--;
	    } else {
		if (l[random] != 0){
		    l[random] = randoml[i];
		    l[random] = 0;
		}
	    }
	}
	System.out.println(randoml);
    }
}
