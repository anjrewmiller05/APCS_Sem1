package chess;

public class King extends Piece {

    public King(int id, boolean white, int row, int col) {
        super("King", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }
        return true;
    }

    public String getSymbol() {return "()";}
    
}