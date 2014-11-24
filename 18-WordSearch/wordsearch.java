import java.io.*;
import java.util.*;

public class wordsearch {
    private char[][] board;

    public wordsearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++){
		board[i][j] ='.';
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
		if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
		    l++;
		    col--;
		    result = true;
		} else {
		    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			result = false;
			break;
		    }
		}
	    }
	} else {
	    while (l < w.length()){
		if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
		    l++;
		    col++;
		    result = true;
		} else {
		    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			result = false;
			break;
		    }
		}
	    }
	}
    return result;
    }

   public void addwordHB(String w, int row, int col){
       if (row > 20 || col > 40){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,true) == false){
		System.out.println("error overlaps wrong");
	    } else {
	    if ((20-row) < w.length()){
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
	if (row > 20 || col > 40){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,false) == false){
		System.out.println("error, overlaps wrong");
	    }else{
		if ((40 - col) < w.length()){   
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
	    while (l < w.length()){
		if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
		    l++;
		    row++;
		    result = true;
		} else {
		    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			result = false;
			break;
		    }
		}
	    }
	} else {
	    while (l < w.length()){
		if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
		    l++;
		    row--;
		    result = true;
		} else {
		    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			result = false;
			break;
		    }
		}
	    }
	}
    return result;
    }


 public void addwordVB(String w, int row, int col){
	if (row > 20 || col > 40){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkH(w,row,col,true) == false){
		System.out.println("error overlaps wrong");
	    } else {
	    if ((20-row) < w.length()){
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
	if (row > 20 || col > 40){
	    System.out.println("error, rows/col out of bound");
	} else {
	    if ( checkV(w,row,col,false) == false){
		System.out.println("error, overlaps wrong");
	    } else { 
		if ((20-row) < w.length()){   
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
	    while (l < w.length()){
		if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
		    l++;
		    row++;
		    col--;
		    result = true;
		} else {
		    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			result = false;
			break;
		    }
		}
	    }
	} else {
	    if (RL == true && TB == false){
		while (l < w.length()){
		    if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
			l++;
			row--;
			col--;
			result = true;
		} else {
			if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
			    result = false;
			    break;
			}
		    }
		}
	    } else {
		if (RL == false && TB == true){
		    while (l < w.length()){
			if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
			    l++;
			    row++;
			    col++;
			    result = true;
			} else {
			    if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
				result = false;
				break;
			    }
			}
		    }
		} else {
		    if (RL == false && TB == false){
			while (l < w.length()){
			    if ((board[row][col] == '.') || (board[row][col] == w.charAt(l))){
				l++;
				row--;
				col++;
				result = true;
			    } else {
				if ((board[row][col] != '.' || board[row][col] != w.charAt(l))){
				    result = false;
				    break;
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
	if (row > 20 || col > 40){
	    System.out.print("error, rows/col out of bound");
	} else {
	    if (TB == true){
		if ((40-col) < w.length() || (20-row)< w.length()){
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
	if (row > 20 || col > 40){
	    System.out.print("error, rows/col out of bound");
	} else {
	    if (TB == true){
		if ((40-col) < w.length() || (20-row)< w.length()){
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
      Random r = new Random();
      char[][] test = board;
      int x = r.nextInt(board[0].length);
      int y = r.nextInt(board.length);
      int shuffle = r.nextInt(8);
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
 


    


    public static void main(String[] args) {
	wordsearch w = new wordsearch();
	System.out.println(w);
	w.addwordH("hello",3,15); //should work 
	//	w.addwordH("look",3,14); //test illegal overlap
	w.addwordH("look",3,18); //test legal overlap	
	w.addwordV("hi",5,10); //should work
	w.addwordH("hello",5,10); //legal overlap
	w.addwordVB("corn",7,35);
	w.addwordDRL("muffin",15,30,false);
	w.addwordDLR("hi",2,2,false);
	//	w.addwordV("hey",19,5); //test should be out of bounds
	//	w.addwordH("look",10,37); //test should go off board n reverse	
	System.out.println(w);
    }

}
