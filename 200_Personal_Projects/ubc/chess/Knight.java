package chess;

public class Knight extends Piece {

    public Knight(int id, boolean white, int row, int col) {
        super("Knight", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if its off the board
             return false;   
        }
        if(row == getRow() || col == getColumn()) {
            return false;
        }

        if(Math.abs(row - getRow()) > 2 || Math.abs(col - getColumn()) > 2) {
            return false;
        }

        Piece blocker = board.whosThere(row, col);
        if(blocker != null) {
            if ((isWhite() && blocker.isWhite()) || (!isWhite() && !blocker.isWhite())) {
                return false;
            }
        }

        if(Math.abs(row - getRow()) == 2) {
            if(Math.abs(col - getColumn()) != 1) {
                return false;
            }
        }

        if(Math.abs(row - getRow()) == 1) {
            if(Math.abs(col - getColumn()) != 2) {
                return false;
            }
        }

        return true;
    }

    public void setCheckStatus(Board board, King king) {
        king.setCheck(isValidMove(board, king.getRow(), king.getColumn()));
    }

    public String getSymbol() {return "<>";}
    
}