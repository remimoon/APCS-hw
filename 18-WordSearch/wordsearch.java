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
	    if ((40 - col) < w.length()){
		if ( checkH(w,row,col,true) == false){
		    System.out.println("error overlaps wrong");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = w.charAt(i-1);
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
		if ((40 - col) < w.length()){     //reversing, if word goes off board
		    addwordHB(w,row,col);
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
	    if ((20-row) < w.length()){
		if ( checkH(w,row,col,true) == false){
		    System.out.println("error overlaps wrong");
		} else {
		    for (int i = w.length(); i > 0; i--){
			board[row][col] = w.charAt(i-1);
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
		if ((20-row) < w.length()){     //reversing, if word goes off board
		    addwordVB(w,row,col);
		} else {
		    for (int i = 0; i < w.length(); i++){
			board[row][col] = w.charAt(i);
			row++;
		    }
		}
	    }
	}
    }

    public boolean checkVD(String w, int row, int col, boolean RL){

    }
    
    //Diagonal Right to Left
    public void addwordDRL(String w, int row, int col){
	if (row > 20 || col > 40){
	    System.out.print("error, rows/col out of bound");
	} else {


    public static void main(String[] args) {
	wordsearch w = new wordsearch();
	System.out.println(w);
	w.addwordH("hello",3,15); //should work 
	w.addwordH("look",3,14); //test illegal overlap
	w.addwordH("look",3,18); //test legal overlap	
	w.addwordV("hi",5,10); //should work
	w.addwordH("hello",5,10); //legal overlap
	//	w.addwordV("hey",19,5); //test should be out of bounds
	//	w.addwordH("look",10,37); //test should go off board n reverse	
	System.out.println(w);
    }

}
