import java.io.*;
import java.util.*;

public class wordsearch {

 private char[][] board,key;
		private ArrayList<String> words;
		private ArrayList<String> wordsInPuzzle;



    public wordsearch(int r, int c){
	words = new ArrayList<String>();

	Scanner sc = null;

	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open wordlist");
	    System.exit(0);
	}

	while (sc.hasNext()){
	    words.add(sc.next());
	}

	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public wordsearch(){
	this(20,40);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++){
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    /*
  public String reverse(String s) {
        String reversedString = "";
        for(int i=s.length(); i>0; i--) {
            reversedString += s.charAt(i-1);
        }   
        return reversedString;
    }

       public boolean checkH(String w, int row, int col, boolean reverse){
	int l = 0;
	boolean result = true;
	if (reverse == true){
	    while (l < w.length()){
		while (result != false){
		if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
		    result = false;
		} else {
		    l++;
		    col--;
		    result = true;
		}
		}
	    }
	} else {
	    while (result != false){
		while (l < w.length()){
		if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
		    result = false;
		} else {
		    l++;
		    col++;
		    result = true;
		}
	    }
	    }
	}
    return result;
    }

   public void addwordHB(String w, int row, int col){
       if (row >  board.length || col >  board[0].length){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,true) == false){
		System.out.println("error overlaps wrong");
	    } else {
	    if (( board[0].length-row) < w.length()){
		    System.out.println("error goes off board");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = reverse(w).charAt(i-1);
			col--;
		    }
		}
	    }
	}
   }


    public void addwordH(String w, int row, int col){
	if (row >  board.length || col >  board[0].length){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,false) == false){
		System.out.println("error, overlaps wrong");
	    }else{
		if (( board[0].length - col) < w.length()){   
		    System.out.println("error, goes off board");
		} else {
		    for (int i = 0; i < w.length(); i++){
			board[row][col] = w.charAt(i);
			col++;
		    }
		}
	    }
	}
    }

 public boolean checkV(String w, int row, int col, boolean reverse){
	int l = 0;
	boolean result = true;
	if (reverse == true){
	    while (result != false){

		while (l < w.length()){
		if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
		    result = false;
		} else {
		    l++;
		    row++;
		    result = true;
		}
	    }
	    }
	} else {
	    while (result != false){
		while (l < w.length()){
		if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
		    result = false;
		} else {
		    l++;
		    row--;
		    result = true;
		}
	     }
	}
	}
    return result;
 }


 public void addwordVB(String w, int row, int col){
	if (row >  board.length || col >  board[0].length){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,true) == false){
		System.out.println("error overlaps wrong");
	    } else {
	    if (( board.length - row) < w.length()){
		    System.out.println("error goes off board");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = reverse(w).charAt(i-1);
			row--;
		    }
		}
	    }
	}
   }

    public void addwordV(String w, int row, int col){
	if (row >  board.length || col >  board[0].length){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkV(w,row,col,false) == false){
		System.out.println("error, overlaps wrong");
	    } else { 
		if (( board.length-row) < w.length()){   
		    System.out.println("error, goes off board");
		} else {
		    for (int i = 0; i < w.length(); i++){
			board[row][col] = w.charAt(i);
			row++;
		    }
		}
	    }
	}
    }

    //for diagonally
    //RL right to left, TB top to bottom
    public boolean checkD(String w, int row, int col, boolean RL, boolean TB){
	int l = 0;
	boolean result = true;
	if (RL == true && TB == true){
	    while (result != false){
		while (l < w.length()){
		if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
		    result = false;
		} else {
		    l++;
		    row++;
		    col--;
		    result = true;
		}
	     }	    
	    }
	} else {
	    if (RL == true && TB == false){
		while (result != false){
		    while (l < w.length()){
		    if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
			result = false;
		    } else {
			l++;
			row--;
			col--;
			result = true;
		    }
		}
		}
	    } else {
		if (RL == false && TB == true){
		    while (result != false){
			while (l < w.length()){
			if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
			    result = false;
			} else {
			    l++;
			    row++;
			    col++;
			    result = true;
			}
		    }
		    }
		} else {
		    if (RL == false && TB == false){
			while (result != false){
			    while (l < w.length()){
			    if (board[row][col]!='.' && board[row][col]!=w.charAt(l)){
				result = false;
			    } else {
				l++;
				row--;
				col++;
			    }
			    }
			}
		    }
		}
	    }
	}  	
    return result;
    }
	

    
    
    //Diagonal Right to Left
    public void addwordDRL(String w, int row, int col, boolean TB){
	if (row >  board.length || col >  board[0].length){
	    System.out.print("error, rows/col out of bound");
	} else {
	    if (TB == true){
		if ((board[0].length-col) < w.length() || ( board.length-row)< w.length()){
		    if (checkD(w, row, col, true, true) == false){
			System.out.println("error overlaps wrong");
		    } else {
			for (int i = w.length(); i > 0; i--){
			    board[row][col] = w.charAt(i-1);
			    row++;
			    col--;
			}
		    }
		}
	    } else {
		if (checkD(w, row, col, true, false) == false){
		    System.out.println("error overlaps wrong");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = w.charAt(i-1);
			row--;
			col--;
		    }
		}
	    }
	}
    }
	    
  //Diagonal Left to Right
    public void addwordDLR(String w, int row, int col, boolean TB){
	if (row >  board.length || col >  board[0].length){
	    System.out.print("error, rows/col out of bound");
	} else {
	    if (TB == true){
		if (( board[0].length-col) < w.length() || ( board.length-row)< w.length()){
		    if (checkD(w, row, col, false, true) == false){
			System.out.println("error overlaps wrong");
		    } else {
			for (int i = w.length(); i > 0; i--){
			    board[row][col] = w.charAt(i-1);
			    row++;
			    col++;
			}
		    }
		}
	    } else {
		if (checkD(w, row, col, false, false) == false){
		    System.out.println("error overlaps wrong");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = w.charAt(i-1);
			row--;
			col++;
		    }
		}
	    }
	}
    }

  public boolean addWord(String w){
      rnd = new Random();
      char[][] test = board;
      int x = rnd.nextInt(board[0].length);
      int y = rnd.nextInt(board.length);
      int shuffle = rnd.nextInt(8);
      if (shuffle == 0){
	  addwordH(w,x,y);
      } else {
	  if (shuffle == 1){
	      addwordV(w,x,y);
	  } else {
	      if (shuffle == 2){
		  addwordHB(w,x,y);
	      } else {
		  if (shuffle == 3){
		      addwordVB(w,x,y);
		  } else {
		      if (shuffle == 4){
			  addwordDRL(w,x,y,true);
		      } else {
			  if (shuffle == 5){
			      addwordDRL(w,x,y,false);
			  } else {
			      if (shuffle == 6){
				  addwordDLR(w,x,y,true);
			      } else {
				  if (shuffle == 7){
				      addwordDLR(w,x,y,false);
				  }
			      }
			  }
		      }
		  }
	      }
	  }
      }

      if (test.equals(board)){
	  return false;
      } else {
	  return true;	  
      }
  }
 
 */   


    private void makeKey() {
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		key[i][j]=board[i][j];
	    }
	}
    }
	
    public String getKey(){
	String s = "";
	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    	
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
				
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}
	r = row;
	c = col;

	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c = c + deltaCol;
	}
	return true;
    }

    public boolean addWord(String w) {
	Random rnd = new Random();
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int deltaRow = -1 + rnd.nextInt(3);
	int deltaCol = -1 + rnd.nextInt(3);

	if (deltaRow == 0 && deltaCol == 0){
	    return false;
	}
	return addWordHelper(w,row,col,deltaRow,deltaCol);

    }

    public void buildPuzzle(int numwords){
	Random rnd = new Random();
	words = new ArrayList<String>();
	int i = 0;
	while (i<numwords) {
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (addWord(word)){
		wordsInPuzzle.add(word);
		words.remove(wordIndex);
		i++;
	    }
	}

	makeKey();

	for (i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if (board[i][j]=='.'){										
		    String letters = "abcdefghijklmnopqrstuvwxyz";
		    board[i][j] = letters.charAt(rnd.nextInt(letters.length()));
		}
	    }
	}
    }
    
    public String getWords() {
	return ""+wordsInPuzzle;
    }

    public static void main(String[] args) {
	Random rnd = new Random();
	wordsearch w = new wordsearch(rnd.nextInt(30),rnd.nextInt(50));
	System.out.println(w);
	w.buildPuzzle(25);
	System.out.println(w);
	System.out.println(w.getKey());
    }
}
