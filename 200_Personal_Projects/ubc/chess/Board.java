package chess;

public class Board {

    Piece [][] board;

    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String blue = "\u001B[34m";

    public Board(Piece[] whitePieces, Piece[] blackPieces) {
        board = new Piece [8][8];

        for(int i = 0; i < whitePieces.length; i++) {
            int xpos = whitePieces[i].getColumn();
            int ypos = whitePieces[i].getRow();
            board [ypos][xpos] = whitePieces[i];
        }
        for(int i = 0; i < blackPieces.length; i++) {
            int xpos = blackPieces[i].getColumn();
            int ypos = blackPieces[i].getRow();
            board [ypos][xpos] = blackPieces[i];
        }
    }

    public void printBoard() {
        System.out.println("    0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  ");
        System.out.println("-------------------------------------------");
        for(int y = 0; y < board.length; y++) {
            System.out.print(y + " ");
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == null) {
                    System.out.print("|" + "    ");
                } else if (board[y][x].isWhite()) {
                    System.out.print("| " + blue + board[y][x].getSymbol() + reset + " ");
                } else {
                    System.out.print("| " + red + board[y][x].getSymbol() + reset + " ");
                }
            }
            System.out.println("|");
            System.out.println("-------------------------------------------");
        }
    }

    public void moveBoard(int startcol, int endcol, int startrow, int endrow) {
        board[endrow][endcol] = board[startrow][startcol];
        board[startrow][startcol] = null;
    }

    public Piece whosThere(int row, int col) {
        return board[row][col];
    }

}
