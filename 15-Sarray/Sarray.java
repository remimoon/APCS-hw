public class Sarray {
    int[] data;
    int   last;

    public Sarray() {
        // set up the initial instance variables
	data = new int[10];
	last = 5;
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


    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
	if (data.length > size()){
	    int[]old = int[data.length];
	    old[]=data[];
	    data[index] = i;
	    for (int a = 1; a < old.length - index; a++;){
		data[index + a] = old[index + a];
	    }
	}else {
	    int[] added = new int[data.length+1];
	    for (int b = 0; index < data.index; b++){
		added[b] = data[b];
	    }
	    data[index]=i;
	    for (int c = index+ 1; c < data.length; c++){
	    added[c] = data[c-1];
	    }
	}
	return true;
	}
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	int index = 0;
	searchFromEnd:
	for (int i = data.length; i>0 ; i--){
	    if (data[i] != 0) {
		index = i+1;
		break searchFromEnd;
	    }
	}
	return index;
    }

    public int get(int index) {
        // returns the item at location index of the list
	return data[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value.
	int old = data[index];
	data[index] = i;
	return old;
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int old = data[index];
	for (int i = index; i < size(); i++){
	    data[i] = data[i+1];
	}
	return old;
    }
}
