package chess;

public class Knight extends Piece {

    public Knight(int id, boolean white, int row, int col) {
        super("Knight", id, white, row, col);
    }
    
    public boolean isValidMove(int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }
        return true;
    }

    public String getSymbol() {return "<>";}
    
}