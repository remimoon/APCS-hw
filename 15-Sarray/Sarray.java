public class Sarray {
    int[] data;
    int   last;
    public Sarray() {
        // set up the initial instance variables
	data = new int[10];
	last = 0;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (data.length > size()){
	    data[size()] = i;
	}
	else{
	    int[] added = new int[data.length+1];
	    for (int index = 0; index < data.length; index++){
		added[index] = data[index];
	    }
	    added[added.length-1] = i;
	}
	return true;
    }


    public boolean add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
	 int x = data.length;
	if (x > size()){
	    int[] old = new int[x];
	    for (int b = 0; b < x; b++){
		old[b] = data[b];
	    }
	    data[index] = i;
	    for (int a = index; a < old.length; a++){
		data[index + a] = old[index + a];
	    }
	}else {
	    int[] added = new int[x+1];
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


    public int size() {
        // returns the number of items in the list (not the array size)
	return data.length;
    }


    public int get(int index) {
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

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value.

	/*
	try{
	    if (index > (size()-1)) {
		this.niceError();
		    }
	*/
	int old = data[index];
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

    public int remove(int index){
        // removes the item at index i
        // returns the old value

	/*
	try{
    	if (index > (size()-1)){
	    this.niceError();
		}
	*/
	int old = data[index];
	int[]removed = new int[data.length - 1];
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
}
