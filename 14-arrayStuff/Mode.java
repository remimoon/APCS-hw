  import java.io.*;
import java.util.*;

public class Mode {

		/*
			n - size of the array
			m - max value for each element
		*/
    public Mode(int n,int m){
	Random r = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }

    public int freq(int n){
	int times = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] == a[n]){
		times += 1;
	    }
	}
	return times;

}

public int maxVal (int[] n){
    int x = n[0];
    for (int i = 0; i < n.length; i++){
        if (n[i] > x ){
	    x = n[i];
	}
  }  
    return x;
    
}

 //------------------MODE---------------------------------

    public int mode(int[] n){
	int output = n[0];
        for (int i = 1; i < n.length; i++)
	    if (freq(n[i]) > freq(n[i-1])){
		output = n[i];
	    }else{
		output = output;
	    }
	return output;
    }

    public int fastmode(int[] n){
	int x = maxVal(n);
	int[] count = new int[x+1];
	for (int i = 0; i < n.length; i++){
	    count[n[i]]++;
	}
	return maxVal(count);
    }


//----------------------------------
public static void main(String[] args) {
    int arraylength=20,
    	maxvalue=20;

      if (args.length > 0) {
    	arraylength = Integer.parseInt(args[0]);
      }
       if (args.length > 1) {
    	maxvalue = Integer.parseInt(args[1]);
       }
				
     Mode m = new Mode(arraylength,maxvalue);

    System.out.println(m);
				// System.out.println("Mode value: "+m.mode());
				// System.out.println("Faster mode value: "+m.fastmode());
}

}
