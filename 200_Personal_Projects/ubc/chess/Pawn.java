package chess;

public class Pawn extends Piece {
    private int maxMoves = 2;
    public Pawn(int id, boolean white, int row, int col) {
        super("Pawn", id, white, row, col);
    }
    
    public boolean isValidMove(int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if it's off the board
             return false;   
        }
        if(getColumn() - 1 > col || getColumn() + 1 < col) { // moves more than one column (needed for captures)
            return false;
        }
        if(isWhite()) {
            if(getRow() - maxMoves > row) {
                return false;
            }
        }
        else {
            if(getRow() + maxMoves < row) {
                return false;
            }
        }
        maxMoves = 1;
        return true;
    }

    public String getSymbol() {return "..";}
    
}