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
        if(blocker != null) {
            if (blocker.isWhite() == isWhite()) {
                return false;
            }
        }
        if (getRow() == row) {
            return false;
        }

        if(getColumn() != col && getRow() == row) {
            return false;
        }

        if(getColumn() != col) {
            if(blocker == null) {
                return false;
            }
        }

        if(isWhite()) {
            if(getRow() < row) {
                return false;
            }
            if(getRow() - maxMoves > row) {
                return false;
            }

            if(getRow() - row == 2) { // if pawn is moving through another piece
                Piece blocker2 = board.whosThere(row + 1, col);
                if(blocker2 != null) {
                    return false;
                }
            }
        }
        else {
            if(getRow() > row) {
                return false;
            }
            if(getRow() + maxMoves < row) {
                return false;
            }

            if(getRow() + row == 2) { // if pawn is moving through another piece
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