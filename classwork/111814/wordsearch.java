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

    public void addwordH(String w, int row, int col){
	for (int i = 0; i < w.length(); i++){
	    board[row][col] = w.chatAr(i);
	    c++;
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,15); //should work 
	w.addWordH("look",3,14); //test illegal overlap
	w.addWordH("look",3,10); //test legal overlap				
	System.out.println(w);
    }

}
