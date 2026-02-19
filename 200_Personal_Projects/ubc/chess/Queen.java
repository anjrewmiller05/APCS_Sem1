package chess;

public class Queen extends Piece {

    public Queen(int id, boolean white, int row, int col) {
        super("Queen", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }
        return true;
    }

    public String getSymbol() {return "{}";}
    
}