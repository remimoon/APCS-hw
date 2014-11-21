import java.io.*;
import java.util.*;

public class ReadFile{
    public static void main(String[] args){
	try {
	    Scanner sc = new Scanner(new File("words.txt"));
	    while (sc.hasNext()){
		String s = sc.next();
		System.out.println("Next line: " + s);
	    }
	}catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
    }
}
