public class Frame {
       //frame works updated on 10/9
    // took 15 min starting from scratch
     public String frame (int r, int c){
	 String s = "";
	 for (int row=0;row<r;row++){
	     if (row==0 || row == (r-1)) {
		 for (int a=0;a<c;a++){
		     s+= "*";
		 }
		 s+="\n";
	     }else{
		 for (int a=0;a<c;a++){
		     if (a==0||a==(c-1)){
			 s+="*";
		     }else {
			 s+=" ";
		     }
		 }
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
