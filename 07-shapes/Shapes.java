
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
   
   

    public String tri1(int h) {
	String s = "";
	int a = 1;
	while (h>0){
	    int b = 1;
	    while (b <= a){
		    s += "*";
		    b++;
		}
	    a++;
	    s=s+ "\n";
	    h--;
	}       return s;
    }
    /*
 int i,j;
for (i=0;i<h;i++){
for (j=0; j<=1; j++){
s=s+"*"
}
s=s+"\n"
}
return s
    */

    public String tri2(int height){
	String s = "";
	int a = 1;
	while (height>0){
	    int stars = 1;
	    int spaces = height-b;
	    while (spaces > 0){
		    s += " ";
		    spaces --;
		}
	    while (stars <= a){
		    s += "*";
		    stars++;
		}
	    a++;
	    s=s+ "\n";
	    height--;
	}
       return s;
    }
    /*
int h;
int i;
String s = "";
for (h=0;h<=height;h++){
for (i=0;i<height-h;i++){
s=s+".";
}
for (i=0; i<h;i++){

s=s+"\n"
}
return s;
}
    */
}	   
