/* This is all working 
By Rabia Akhtar and Remi Moon */ 
public class lab{

public boolean nearHundred(int n) {
  if (Math.abs(100 - n) <= 10) {
  return true; 
  }
  else {
  if (Math.abs(200 - n) <= 10) {
  return true ;
  }
  else {
  return false;
  }
 } 
}


public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5) {
  return 0 ;
  }
  else {
  if ((tea>= (2 * candy)) || (candy >= (2* tea))) {
  return 2;
  } 
  else { 
  if (tea >= 5 && candy >=5) {
  return 1;
  }
  else {
  return 0;
  }
  }
  }
}


public boolean lastDigit(int a, int b, int c) {
  int A = a%10;
  int B = b%10;
  int C = c%10;
  if (A == B || A == C || B ==C) {
  return true;
  }
  else {
  return false ;
  }
}
}
