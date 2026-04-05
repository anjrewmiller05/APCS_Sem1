package chess;

public class Queen extends Piece {

    public Queen(int id, boolean white, int row, int col) {
        super("Queen", id, white, row, col);
    }
    
    public boolean isValidMove(Board board, int row, int col) {
        if (row > 7 || row < 0 || col < 0 || col > 7) {
             return false;   
        }

        Piece blocker = board.whoBeThere(row, col);
        if(blocker != null) {
            if ((isWhite() && blocker.isWhite()) || (!isWhite() && !blocker.isWhite())) {
                return false;
            }
        }

        if(row == getRow() && col == getColumn()) {
            return false;
        }
        if(row == getRow()) {
            if (getColumn() < col) {
                for (int i = col - 1; i > getColumn(); i--) {
                    Piece blocker2 = board.whoBeThere(row, i);
                    if (blocker2 != null) {
                        return false;
                    }
                }
            }
            else if(getColumn() > col) {
                for (int i = col + 1; i < getColumn(); i++) {
                    Piece blocker2 = board.whoBeThere(row, i);
                    if (blocker2 != null) {
                        return false;
                    }
                }
            }
        }
        if(col == getColumn()) {
            if (getRow() < row) {
                for (int i = row - 1; i > getRow(); i--) {
                    Piece blocker2 = board.whoBeThere(i, col);
                    if(blocker2 != null) {
                        return false;
                    }
                }
            }
            else if (getRow() > row) {
                for (int i = row + 1; i < getRow(); i++){
                    Piece blocker2 = board.whoBeThere(i, col);
                    if(blocker2 != null) {
                        return false;
                    }
                }
            }
        }

        if(row != getRow() && col != getColumn()) {
            if(Math.abs(getRow() - row) != Math.abs(getColumn() - col)) {
                return false;
            }

            int moved = Math.abs(getRow() - row);

            if(getRow() > row) {
                if(getColumn() > col) {

                    for(int i = 1; i < moved; i++) {
                        if(board.whoBeThere(getRow() - i, getColumn() - i) != null) {
                            return false;
                        }
                    }
                }
                else {
                    for(int i = 1; i < moved; i++) {
                        if(board.whoBeThere(getRow() - i, getColumn() + i) != null) {
                            return false;
                        }
                    }
                }
            }
            else {
                if(getColumn() > col) {
                    for(int i = 1; i < moved; i++) {
                        if(board.whoBeThere(getRow() + i, getColumn() - i) != null) {
                            return false;
                        }
                    }
                }
                else {
                    for(int i = 1; i < moved; i++) {
                        if(board.whoBeThere(getRow() + i, getColumn() + i) != null) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public String getSymbol() {return "{}";}

}