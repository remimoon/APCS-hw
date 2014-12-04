public class OSA extends SuperArray{

  public OSA(){
	super();
    }


    public boolean add(String w){
	int i = getData().length;
	int place = i;
	for (int j = 0; j < i; j ++){
	    if (getData()[j] == null || w.compareTo(getData()[j]) <= 0) {
		place = j;
		break;
	    }
	}
	super.add(place, w);
	return true;
    }
}
