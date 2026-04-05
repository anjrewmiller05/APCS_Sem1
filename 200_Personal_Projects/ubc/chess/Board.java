package chess;

public class Board {

    public Piece [][] squares;

    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String blue = "\u001B[34m";

    public Board(Piece[] whitePieces, Piece[] blackPieces) {
        squares = new Piece [8][8];

        for(Piece p : whitePieces) {
            int xpos = p.getColumn();
            int ypos = p.getRow();
            squares [ypos][xpos] = p;
        }
        for(Piece p : blackPieces) {
            int xpos = p.getColumn();
            int ypos = p.getRow();
            squares [ypos][xpos] = p;
        }
    }

    public void printBoard() {
        System.out.println("    0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  ");
        System.out.println("-------------------------------------------");
        for(int y = 0; y < squares.length; y++) {
            System.out.print(y + " ");
            for (int x = 0; x < squares[0].length; x++) {
                if (squares[y][x] == null) {
                    System.out.print("|" + "    ");
                } else if (squares[y][x].isWhite()) {
                    System.out.print("| " + blue + squares[y][x].getSymbol() + reset + " ");
                } else {
                    System.out.print("| " + red + squares[y][x].getSymbol() + reset + " ");
                }
            }
            System.out.println("|");
            System.out.println("-------------------------------------------");
        }
    }


    public void moveBoard(int startcol, int endcol, int startrow, int endrow) {
        if(squares[endrow][endcol] != null) {
            squares[endrow][endcol].capture();
        }
        squares[endrow][endcol] = squares[startrow][startcol];
        squares[startrow][startcol] = null;
    }

    public Piece whosThere(int row, int col) {
        return squares[row][col];
    }

}