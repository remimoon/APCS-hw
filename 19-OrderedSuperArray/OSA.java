public class OSA extends SuperArray{

    public String[] Order(){
	String [] ordered = new String[data.length];
	for(int j=0; j < ordered.length; j++){
	    for (int i=j+1 ; i< ordered.length; i++){
		if(Array[i].compareTo(Array[j])<0){
		    String temp= ordered[j];
		    Array[j]= ordered[i];
		    Array[i]=temp;
		}
	    }
	}
	return ordered[];
    }
    
    public boolean add(String i){

	
		}
	    }
	}

     System.out.print(Array[j]);
 }
}

http://stackoverflow.com/questions/12986386/sorting-an-array-of-strings-with-java
