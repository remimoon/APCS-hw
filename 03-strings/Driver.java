import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	String s= "remi moon";
	System.out.println("location of space:"+ s.indexOf(" "));
	String firstname= s.substring(0,4);
	System.out.println("my first name:"+ firstname);
	String lastname= s.substring(5);
	System.out.println("my last name:"+ lastname);

    }
}
