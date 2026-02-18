package chess;

public abstract class Piece {
    
    private String name;
    private int id;
    private boolean white;
    private int row;
    private int col;

    
    public Piece(String name, int id, boolean white, int startingRow, int startingCol) {
        this.name = name;
        this.id = id;
        this.white = white;
        this.row = startingRow;
        this.col = startingCol;
    }
    
    public abstract boolean isValidMove(int row, int col);

    public abstract String getSymbol();
    
    public void move(int row, int col) {
            this.row = row;
            this.col = col;
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
    
    
}