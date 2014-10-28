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
    int x = a[0];
    for (int i = 0; i < a.length; i++){
        if (a[i] > x ){
	    x = a[i];
	}
	break;
  }  
    return x;
    
}



public int find (int n){
    int x = -1;
    for (int i = 0; i < a.length; i++){
        if (a[i] == n ){
	    x=i;
	}  
	break;
    }
    return x;
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

public int sum67(int[] nums) {
  int output = 0;
  boolean x = True;
  for (int i = 0; i < nums.length; i++){
  if (nums[i] == 6) {
  x = False;
  } else {
 if (nums[i] == 7) {
 x = True;
 }
 }
 if ( x = True) {
 output += ;
 }
  
  
}


