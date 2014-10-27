import java.util.*;

public class  Arraystuff {
  public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}
    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);



	//  int find(n) - returns the index of the first occurence of n in the array or -1 if n isn't in the array.
	// int maxVal() - return the largest value in the array


	
    }
    
}
