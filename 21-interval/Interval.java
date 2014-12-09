import java.util.*;
import java.util.*;

public class Interval {

    public int low,high;
    private static Random r = new Random();
    private static int numIntervals = 0;

    private void setup(int l, int h){
	high = h;
	low = l;
	numIntervals = numIntervals + 1;
    //if numIntervals not static, would not return as 1,2,3 but more as 1,1,1

    }
    public Interval(){
	int l = r.nextInt(100);
	int h = l + r.nextInt(100) + 1;
	setup(l,h);
    }

    public Interval(int l, int h){
	setup(l,h);
    }


    public String toString(){
	//	String s = numIntervals + "--> [" + low + "," + high + "]";
	String s = "[" + low + "," + high + "]";
	return s;
    }

    public static void stuff(){
	System.out.println("stuff");
    }

    public static void main (String[] args){
	for (int i = 0; i < 10; i++){
	    System.out.println(new Interval());
	}

	/*	stuff();
 works because stuff() is static and belongs to class so we can call without Interval.__ because we are in that class

	Interval x = new Interval();
	x.stuff();  but we can still call it off an instance
	*/

	Interval [] a = new Interval[10];
	for (int j = 0; j < 10; j++){
	    a[j] = new Interval();
	}
	return a;
    }
}
