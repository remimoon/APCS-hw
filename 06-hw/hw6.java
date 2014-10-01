public class hw6 {

public String frontTimes(String str, int n) {
    String s ="";
    if (str.length() > 3) {
	String front = str;
	while (n>0){
	    s = s + front;
	    n = n - 1;
	}
    } else {
      String front = str.substring (0,3);
     while (n>0){
      s = s + front;
      n = n - 1;
     }}
    return s;
}}
