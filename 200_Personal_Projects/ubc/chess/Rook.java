package chess;

public class Rook extends Piece {
    
    public Rook(int id, boolean white, int row, int col) {
        super("Rook", id, white, row, col);
    }
    
    public boolean isValidMove(int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }
        return true;
    }
    
}