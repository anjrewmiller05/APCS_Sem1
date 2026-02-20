package chess;

public class Rook extends Piece {
    
    public Rook(int id, boolean white, int row, int col) {
        super("Rook", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }


        Piece blocker = board.whosThere(row, col);
        if(blocker != null) {
            if ((isWhite() && blocker.isWhite()) || (!isWhite() && !blocker.isWhite())) {
                return false;
            }
        }
        return true;
    }

    public String getSymbol() {return "[]";}
    
}