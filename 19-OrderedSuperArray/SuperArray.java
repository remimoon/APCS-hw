public class SuperArray {
    static String[] data;
    int last;

        // set up the initial instance variables
 
    public SuperArray() {
	data = new String[10];
	for (int i=0;i<10;i++) {
	    data[i] = "";
	}
    }

    public String[] getData(){
	return data;
    }

   public void getLast() {
	int i = 0;
	for(int j = data.length; j > 0; j--) {
	    if (!(data[j].isEmpty())) {
	        i = j;
	    }
	}
	last = i;
    }

    public boolean add(String i){
	if (data.length > size()){
	    data[size()] = i;
	}
	else{
	    String[] added = new String[data.length+1];
	    for (int index = 0; index < data.length; index++){
		added[index] = data[index];
	    }
	    added[added.length-1] = i;
	}
	return true;
    }

    public boolean add(int index, String w){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
	int x = data.length;
	if (x > size()){
	    String [] old = new String[x];
	    for (int b = 0; b < x; b++){
		old[b] = data[b];
	    }
	    data[index] = w;
	    for (int a = index; a < old.length; a++){
		data[index + a] = old[index + a];
	    }
	}else {
	    String[] added = new String[x+1];
	    for (int b = 0; index < x; b++){
		added[b] = data[b];
	    }
	    data[index]=w;
	    for (int c = index + 1; c < x; c++){
	    added[c] = data[c-1];
	    }
	}
	return true;
    }


    public void shift(String newvalue){
	getLast();
	int i;
	for (i = last; i > 0 && newvalue.compareTo(data[i-1]) < 0 ; i--) {
	    data[i] = data[i-1];
	}
	data[i]=newvalue;
    }


    public int size() {
        // returns the number of items in the list (not the array size)
	int count = 0;
	int size = 0;
	while (count < data.length){
	    if (data[count].equals(null)){
		count ++;
	    } else {
		count++;
		size++;
	    }
	}
	return size;
    }


    public String get(int index) {
        // returns the item at location index of the list
            return data[index];
        }



    public static String[] Order(String[] x){
	String [] ordered = new String[x.length];
	for(int j=0; j < ordered.length; j++){
	    for (int i=j+1 ; i < ordered.length + 1; i++){
		if(x[i].compareTo(x[j]) < 0){
		    String temp = x[j];
		    x[j]= ordered[i];
		    ordered[i]=temp;
		}
	    }
	}
	return ordered;
    }
    

    public static String set(int index, String i){
        // sets the item at location index to value i
        // returns the old value.

	String old = data[index];
	data[index] = i;
	return old;
	}
 

    public String remove(int index){
        // removes the item at index i
        // returns the old value

	String old = data[index];
	String []removed = new String[data.length - 1];
	for (int i = 0; i < index; i++){
	    removed[i] = data[i];
	}
	for (int j = index; j < data.length; j++){
	    removed[j-1] = data[j];
	}
	return old;
    }

}
