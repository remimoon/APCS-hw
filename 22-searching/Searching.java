
import java.util.*;
import java.util.*;


public abstract class Searching implements Comparable{

    private Comparable[] a;

    public Searching(){
	a = new Searching[10];
    }

    public Searching (int len){
	a = new Searching[len];
    }

    public void additem(String s){
	for(int i=0; i<a.length; i++){
	    if(a[i]==null){
		a[i]=s;
		break;
	    }
	}
    }

    public void Sort(){
	Arrays.sort(a);
    }

 public Comparable lsearch(String s){
	for(int i=0; i<a.length; i++){
	    if(a[i]==s){
		return s;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable s){
	int low = -1;
	int high = a.length;
	while(high-low>1){
	    int c = s.compareTo(a[(high + low)/2]);
	    if(c==0){
		return s;
	    } else {
		if(c>0){
		    low=(high + low)/2;
		} else {
		    if(c<0){
			high=(high + low)/2;
		    }
		}
	    }
	}
	return null;
   }
   
}

