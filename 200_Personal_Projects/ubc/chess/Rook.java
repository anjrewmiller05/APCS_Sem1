package chess;

public class Rook extends Piece {
    
    public Rook(int id, boolean white, int row, int col) {
        super ("Rook", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if it's off the board
             return false;   
        }

        if (getColumn() != col && getRow() != row) {
            return false;
        }

        Piece blocker = board.whosThere(row, col);
        if (blocker != null) {
            if ((isWhite() && blocker.isWhite()) || (!isWhite() && !blocker.isWhite())) {
                return false;
            }
        }

        if (getRow() < row) {
            for (int i = row - 1; i > getRow(); i--) {
                Piece blocker2 = board.whosThere(i, col);
                if(blocker2 != null) {
                    return false;
                }
            }
        }
        else if (getRow() > row) {
            for (int i = row + 1; i < getRow(); i++){
                Piece blocker2 = board.whosThere(i, col);
                if(blocker2 != null) {
                    return false;
                }
            }
        }
        else if (getColumn() < col) {
            for (int i = col - 1; i > getColumn(); i--) {
                Piece blocker2 = board.whosThere(row, i);
                if (blocker2 != null) {
                    return false;
                }
            }
        }
        else {
            for (int i = col + 1; i < getColumn(); i++) {
                Piece blocker2 = board.whosThere(row, i);
                if (blocker2 != null) {
                    return false;
                }
            }
        }

        return true;
    }

    public String getSymbol() {return "[]";}
    
}