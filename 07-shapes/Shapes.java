
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
	    int spaces = height-stars;
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

    public String tri3(int h){
	String s="";
	int row,spaces,stars;
	// For row n, there are 1 + 2(n-1) stars
	// For row n, there are a - n
	for (row = 1; row <= h; row++){
	    for (spaces=h-row; spaces>0; spaces--){
		s=s+" ";
	    }
	    for (stars=( 1+2*(row -1)); stars>0; stars--){
		s=s+"*";
	    }
	    s=s+"\n";
        
	}
	   
	
	return s;
    }

    public String diamond(int h) {
	String s="";
	int row,spaces,stars;

	for (row = 1; row <=h; row++){
	    if (row <= (h/2)+1){
	    for (spaces=h-row-2; spaces>0; spaces--){
		s=s+" ";
	    }
	    for (stars=(1+2*(row -1)); stars>0; stars--){
		s=s+"*";
        
	    }	s+="\n";
	    } else {
		for (spaces=(row-(h/2)-1); spaces>0; spaces--){
		s=s+" ";
	    }
	        for (stars=(2 * (h-row)+1); stars>0; stars--){
		s=s+"*";
		}
		s+="\n";}
	}
	    
	return s;
    }






public String tri4(int a) {
	int rowcounter;
	int starcounter;
	int spacecounter;
	String output="";

	for(rowcounter=1;rowcounter<=a;rowcounter++){
	    for(spacecounter=rowcounter-1;spacecounter>0;spacecounter--){
		output= output + " ";

		 }
	    for(starcounter=a-rowcounter+1;starcounter>0;starcounter--){
	    
		    output= output+ "*";
		}
	    
		    output=output+"\n";
	}
	return output;
}}


	     
