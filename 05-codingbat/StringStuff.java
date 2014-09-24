public class StringStuff{
    public String nonStart(String a, String b) {
  return a.substring(1)+b.substring(1);
}

    public String makeAbba(String a, String b) {
  String S= a+b+b+a;
  return S;
}


    public int diff21(int n) {

  if (n > 21) {
  return Math.abs((21 - n) * 2);
  }
  else {
  return Math.abs(21-n);
}
}
}
