
public boolean mixStart(String str) {
if (str.length() < 3) return false;
String two = str.substring(1, 3);
 if (two.equals("ix")) {
    return true;
  } else {
    return false;
  
}
}

public String makeOutWord(String out, String word) {
 
  String S= out.substring(0,2) + word + out.substring(2,4);
  return S;
  
}

public String firstHalf(String str) {
  String S= str.substring(0, (str.length() / 2));
  return S;
}
