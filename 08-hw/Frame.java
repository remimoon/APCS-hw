public class Frame {
    //frame doesn't work :(
     public String frame (int r, int c){
	String s = "";
	int row;
	for (row=1;row<r; row++){
	    if (row == 1 || row == (r-1)){
		int i = 0;
		while (i < r){
		    s=s+"*";
		    i++;
		}
		s+="\n";
	    }else {
		s=s+"*";
		int a=0;
		while (a < (c-2)){
		    s=s+ " ";
		}
		s=s+"*";
		s+="\n";
	    }
	}
	return s;
    } 
   
    //WORKS 10 min
public String stringSplosion(String str) {
    String s="";
    int length = str.length();
    for (int place=1; place <= length; place++){
	    s= s + str.substring(0,place);
	}
    return s;
}
    
    //WORKS 15 min
public String stringX(String str) {
  String s="";
  int length=str.length();
  int place;
  for (place = 0; place<length; place++){
      String Char= Character.toString(str.charAt(place));
      if (place==0 || place==length-1){
	  s=s+Char;
      }else {
	  if (Char.equals( "x")) {
             s= s +"";
	  }else {
       s=s+Char;
   }}
  }
 return s;
}
}
