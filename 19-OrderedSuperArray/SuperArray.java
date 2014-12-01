public class SuperArray {
    static String[] data = new String [10];
    String last;

        // set up the initial instance variables




    public String[] add(String i){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (data.length > size()){
	    data[size()] = i;
	    return Order(data);
	}
	else{
	    String[] added = new String[data.length+1];
	    for (int index = 0; index < data.length; index++){
		added[index] = data[index];
	    }
	    added[added.length-1] = i;
	    return Order(added);
	}
    }


    /*   public boolean add(int index, String i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
	 int x = data.length;
	if (x > size()){
	    String[] old = new String [x];
	    for (int b = 0; b < x; b++){
		old[b] = data[b];
	    }
	    data[index] = i;
	    for (int a = index; a < old.length; a++){
		data[index + a] = old[index + a];
	    }
	}else {
	    String[] added = new String[x+1];
	    for (int b = 0; index < x; b++){
		added[b] = data[b];
	    }
	    data[index]=i;
	    for (int c = index+ 1; c < x; c++){
	    added[c] = data[c-1];
	    }
	}
	return true;
    }
    */

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

	/*
	try {
            if (index > (size()-1) ) {
                this.niceError();
            }
	*/
            return data[index];
        }
    /*
        catch (ArrayIndexOutOfBounds a) {
            System.out.println("this array index is not in bounds " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("this index is not in bounds " + i);
        }

    }
    */



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

	/*
	try{
	    if (index > (size()-1)) {
		this.niceError();
		    }
	*/
	String old = data[index];
	data[index] = i;
	return old;
	}
    /*
	catch (ArrayIndexOutOfBounds a) {
            System.out.println("this array index is not in bounds " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("this index is not in bounds " + i);
        }

    }
    */

    public String remove(int index){
        // removes the item at index i
        // returns the old value

	/*
	try{
    	if (index > (size()-1)){
	    this.niceError();
		}
	*/
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
    /*
	catch (ArrayIndexOutOfBounds a) {
            System.out.println("this array index is not in bounds " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("this index is not in bounds " + i);
        }
    }
    */

 public void niceError() {
        System.out.println("nice error message :)");
    }

    public static void main (String[]args){
	String[] x = {"hey","crash","sort","cat","mom","math","error","compsci"};
        System.out.println(Order(x));
	//	System.out.println(x.add("add"));
    }
}
