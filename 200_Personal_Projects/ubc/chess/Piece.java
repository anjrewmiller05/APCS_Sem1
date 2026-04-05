package chess;

public abstract class Piece {

    private final String name;
    private final int id;
    private final boolean white;
    private int row;
    private int col;
    private boolean captured;
    private int moveCount;


    public Piece(String name, int id, boolean white, int startingRow, int startingCol) {
        this.name = name;
        this.id = id;
        this.white = white;
        this.row = startingRow;
        this.col = startingCol;
        this.captured = false;
        this.moveCount = 0;
    }

    public abstract boolean isValidMove(Board board, int row, int col);

    public void setCheckStatus(Board board, King king) {
        king.setCheck(getCheckStatus(board, king));
        System.out.println();
    }

    public boolean getCheckStatus(Board board, King king) {
        for(Piece[] rowOfSquares : board.squares) {
            for(Piece p : rowOfSquares) {
                if (p != null && king.isWhite() != p.isWhite()) {
                    boolean inCheck = p.isValidMove(board, king.getRow(), king.getColumn());
                    if (inCheck) {
                        System.out.println(king.isWhite() + " in check");
                        return true;
                    }
                }
            }
        }
        System.out.println(king.isWhite() + " not in check");
        return false;
    }

    public abstract String getSymbol();

    public boolean move(Board board, int row, int col, King opposingKing, King yourKing) {
        int previousRow = this.row;
        int previousCol = this.col;
        this.row = row;
        this.col = col;
        if(getCheckStatus(board, yourKing)) {
            this.row = previousRow;
            this.col = previousCol;
            if(moveCount == 0 && this instanceof Pawn) {
                ((Pawn) this).resetMaxMoves();
            }
            return false;
        }
        setCheckStatus(board, opposingKing);
        moveCount++;
        return true;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return col;
    }

    public boolean isWhite() {
        return white;
    }

    public void capture() {
        captured = true;
    }

    public boolean isCaptured() {
        return captured;
    }


}