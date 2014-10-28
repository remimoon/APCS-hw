import java.util.*;

public class  Arraystuff {
    private int[] a;

public Arraystuff(int[] a) {
	this.a = a;
    }

    /*   public Arraystuff(){
	this.n = n;
	} */
    
	//  int find(n) - returns the index of the first occurence of n in the array or -1 if n isn't in the array.
	// int maxVal() - return the largest value in the array

    //code keeps saying variable x might not be intialized, not sure why
	
public int maxVal (){
    int x;
    for (int i = 0; i < a.length; i++){
        if (a[i] >  a[i+1] ){
	    x = a[i];
	}else {
	   x  = a[i+1];
	}
  }  
    return x;
    
}



public int find (int n){
    int x;
    for (int i = 0; i < a.length; i++){
        if (a[i] == n ){
	    x=i;
	}else{
	    x=-1;
	}  
 }
    return x;
}


}


