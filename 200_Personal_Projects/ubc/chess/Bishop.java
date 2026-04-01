package chess;

public class Bishop extends Piece {

    public Bishop(int id, boolean white, int row, int col) {
        super("Bishop", id, white, row, col);
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

        if(Math.abs(getRow() - row) != Math.abs(getColumn() - col)) {
            return false;
        }

        int moved = Math.abs(getRow() - row);

        if(getRow() > row) {
            if(getColumn() > col) {

                for(int i = 1; i < moved; i++) {
                    if(board.whosThere(getRow() - i, getColumn() - i) != null) {
                        return false;
                    }
                }
            }
            else {
                for(int i = 1; i < moved; i++) {
                    if(board.whosThere(getRow() - i, getColumn() + i) != null) {
                        return false;
                    }
                }
            }
        }
        else {
            if(getColumn() > col) {
                for(int i = 1; i < moved; i++) {
                    if(board.whosThere(getRow() + i, getColumn() - i) != null) {
                        return false;
                    }
                }
            }
            else {
                for(int i = 1; i < moved; i++) {
                    if(board.whosThere(getRow() + i, getColumn() + i) != null) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public void setCheckStatus(Board board, King king) {
        king.setCheck(isValidMove(board, king.getRow(), king.getColumn()));
    }

    public String getSymbol() {return "/\\";}

}