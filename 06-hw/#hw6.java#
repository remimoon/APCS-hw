public class hw6 {

    // took about 20 min
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
}

//took about 5 min

public String stringBits(String str) {
  String S = "";
  int a = 0;
  while (a < str.length()) {
  S = S + str.substring(a,a+1);
  a= a + 2;
  }
  return S;
}


// doesnt work for stringYak("yak123ya") → "123ya" 
//took about 20 min
public String stringYak(String str) {
  String s = "";
  int a = 0;
  while (a < str.length()) {
  if ( str.charAt(a)=='y'&& str.charAt(a+2)=='k') {
  a=a+2;
  } else { 
  s = s + str.substring(a,a+1);
  }
  a = a + 1;
  }
  return s;
}


    //took about 15 min
public int stringMatch(String a, String b) {
    int s = 0;
    while ((a.length() > 1) && (b.length() > 1)) {
	if (a.substring(0,2).equals(b.substring(0,2))){
	    s = s + 1;
	}
	    a = a.substring(1);
	    b = b.substring(1);
	
    }
    return s;
}
}
