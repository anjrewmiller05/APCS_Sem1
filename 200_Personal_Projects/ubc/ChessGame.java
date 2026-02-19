import chess.*;

import java.util.*;

public class ChessGame {
    public static final int GAME_GOOD = 0;
    public static final int GAME_CHECK = 1;
    public static final int GAME_CHECKMATE = 2;
    public static final int GAME_STALEMATE = 3;

    private Piece[] whitePieces;
    private Piece[] blackPieces;
    private Board board;

    private void resetGame() {
        whitePieces = new Piece [16];
        blackPieces = new Piece [16];
        whitePieces[0] = new Pawn(1, true, 6, 0);
        whitePieces[1] = new Pawn(2, true, 6, 1);
        whitePieces[2] = new Pawn(3, true, 6, 2);
        whitePieces[3] = new Pawn(4, true, 6, 3);
        whitePieces[4] = new Pawn(5, true, 6, 4);
        whitePieces[5] = new Pawn(6, true, 6, 5);
        whitePieces[6] = new Pawn(7, true, 6, 6);
        whitePieces[7] = new Pawn(8, true, 6, 7);
        whitePieces[8] = new Rook(1, true, 7, 0);
        whitePieces[9] = new Rook(2, true, 7, 7);
        whitePieces[10] = new Knight(1, true, 7, 1);
        whitePieces[11] = new Knight(2, true, 7, 6);
        whitePieces[12] = new Bishop(1, true, 7, 5);
        whitePieces[13] = new Bishop(2, true, 7, 2);
        whitePieces[14] = new Queen(1, true, 7, 3);
        whitePieces[15] = new King(1, true, 7, 4);


        blackPieces[0] = new Pawn(1, false, 1, 0);
        blackPieces[1] = new Pawn(2, false, 1, 1);
        blackPieces[2] = new Pawn(3, false, 1, 2);
        blackPieces[3] = new Pawn(4, false, 1, 3);
        blackPieces[4] = new Pawn(5, false, 1, 4);
        blackPieces[5] = new Pawn(6, false, 1, 5);
        blackPieces[6] = new Pawn(7, false, 1, 6);
        blackPieces[7] = new Pawn(8, false, 1, 7);
        blackPieces[8] = new Rook(1, false, 0, 0);
        blackPieces[9] = new Rook(2, false, 0, 7);
        blackPieces[10] = new Knight(1, false, 0, 1);
        blackPieces[11] = new Knight(2, false, 0, 6);
        blackPieces[12] = new Bishop(1, false, 0, 5);
        blackPieces[13] = new Bishop(2, false, 0, 2);
        blackPieces[14] = new Queen(1, false, 0, 3);
        blackPieces[15] = new King(1, false, 0, 4);

        board = new Board(whitePieces, blackPieces);
    }

    private String getAllPieces(Piece [] pieces) {
        String list = "";
        for (int x = 0; x < pieces.length; x++) {
            if(pieces[x] != null) {
                list += x + ": " + pieces[x].getName() + pieces[x].getId() + " (" + pieces[x].getRow() + "," + pieces[x].getColumn() + ")\t";
                if (x < 10) {
                    list += "\t";
                }
                if(x % 2 != 0) {
                    list += "\n";
                }
            }

        }
        return list;
    }
    
    public void startTextGame() {
        Scanner sc = new Scanner(System.in);

        resetGame();

        while(gameStatus() != GAME_CHECKMATE || gameStatus() != GAME_STALEMATE) {

            while (true) {
                System.out.println();
                board.printBoard();
                System.out.println(getAllPieces(whitePieces));
                System.out.print("White's move, which piece would you like to move?  ");
                int piece = sc.nextInt();
                System.out.print("To which row?  ");
                int row = sc.nextInt();
                System.out.print("To which column?  ");
                int column = sc.nextInt();
                
                if(piece >= 0 && piece < 16) {
                    if (!isValidMove(whitePieces[piece], row, column)) {
                        System.out.println("Invalid move - try again");
                    } else {
                        move(whitePieces[piece], row, column);
                        break;
                    }
                }
            }

            while (true) {
                System.out.println();
                board.printBoard();
                System.out.println(getAllPieces(blackPieces));
                System.out.print("Black's move, which piece would you like to move?  ");
                int piece = sc.nextInt();
                System.out.print("To which row?  ");
                int row = sc.nextInt();
                System.out.print("To which column?  ");
                int column = sc.nextInt();

                if (piece >= 0 && piece < 16) {
                    if (!isValidMove(blackPieces[piece], row, column)) {
                        System.out.println("Invalid move - try again");
                    } else {
                        move(blackPieces[piece], row, column);
                        break;
                    }
                }
            }
        }
    }

    public Board startGuiGame() {
        resetGame();
        return board;
    }
    public boolean isValidMove(Piece p, int row, int col) {
        return p.isValidMove(board, row, col);
    }
    public Board move(Piece p, int row, int col) {
        board.moveBoard(p.getColumn(), col, p.getRow(), row);
        p.move(row, col);
        return board;
    }
    public int gameStatus()  { //returns 0 if good, 1 if check, 2 if checkmate, 3 if stalemate
        return GAME_GOOD;
    }

    
    public static void main(String[] args) {
        System.out.println("Starting new Chess Game");
        ChessGame game = new ChessGame();
        game.startTextGame();
    }
}