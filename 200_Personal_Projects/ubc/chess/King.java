package chess;

public class King extends Piece {
    private boolean check = false;
    public King(int id, boolean white, int row, int col) {
        super("King", id, white, row, col);
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

        if(Math.abs(row - getRow()) != 1 && Math.abs(col - getColumn()) != 1) {
            return false;
        }

        if(Math.abs(col - getColumn()) != 1 && Math.abs(row - getRow()) != 1) {
            return false;
        }

        return true;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getSymbol() {return "()";}
    
}