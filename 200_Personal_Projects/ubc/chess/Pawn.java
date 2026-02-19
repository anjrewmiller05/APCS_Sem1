package chess;

public class Pawn extends Piece {
    private int maxMoves = 2;
    public Pawn(int id, boolean white, int row, int col) {
        super("Pawn", id, white, row, col);
    }

    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) { // if it's off the board
             return false;
        }
        if(getColumn() - 1 > col || getColumn() + 1 < col) { // moves more than one column (needed for captures)
            return false;
        }

        Piece blocker = board.whosThere(row, col);
        if(isWhite()) {
            if(getRow() - maxMoves > row) {
                return false;
            }

            if(blocker != null) { // if pawn is landing on smth
                return false;
            }
            else if(getRow() - row == 2) { // if pawn is moving through another piece
                Piece blocker2 = board.whosThere(row + 1, col);
                if(blocker2 != null) {
                    return false;
                }
            }
        }
        else {
            if(getRow() + maxMoves < row) {
                return false;
            }

            if(blocker != null) { // if pawn is landing on smth
                return false;
            }
            else if(getRow() + row == 2) { // if pawn is moving through another piece
                Piece blocker2 = board.whosThere(row - 1, col);
                if(blocker2 != null) {
                    return false;
                }
            }
        }
        maxMoves = 1;
        return true;
    }

    public String getSymbol() {return "..";}
    
}