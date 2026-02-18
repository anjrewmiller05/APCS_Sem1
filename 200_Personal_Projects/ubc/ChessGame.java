import chess.*;

import java.util.*;

public class ChessGame {
    private final Piece[] whitePieces;
    private final Piece[] blackPieces;
    private final Board board;

// TODO: Add printBoard();
    public ChessGame() {
        whitePieces = new Piece [16];
        blackPieces = new Piece [16];
        whitePieces[0] = new Rook(1, true, 7, 0);
        whitePieces[1] = new Rook(2, true, 7, 7);
        whitePieces[2] = new Pawn(1, true, 6, 0);
        whitePieces[3] = new Pawn(2, true, 6, 1);
        whitePieces[4] = new Pawn(3, true, 6, 2);
        whitePieces[5] = new Pawn(4, true, 6, 3);
        whitePieces[6] = new Pawn(5, true, 6, 4);
        whitePieces[7] = new Pawn(6, true, 6, 5);
        whitePieces[8] = new Pawn(7, true, 6, 6);
        whitePieces[9] = new Pawn(8, true, 6, 7);
        whitePieces[10] = new Knight(1, true, 7, 1);
        whitePieces[11] = new Knight(2, true, 7, 6);
        whitePieces[12] = new Bishop(1, true, 7, 5);
        whitePieces[13] = new Bishop(2, true, 7, 2);
        whitePieces[14] = new Queen(1, true, 7, 3);
        whitePieces[15] = new King(1, true, 7, 4);

        
        blackPieces[0] = new Rook(1, false, 0, 0);
        blackPieces[1] = new Rook(2, false, 0, 7);
        blackPieces[2] = new Pawn(1, false, 1, 0);
        blackPieces[3] = new Pawn(2, false, 1, 1);
        blackPieces[4] = new Pawn(3, false, 1, 2);
        blackPieces[5] = new Pawn(4, false, 1, 3);
        blackPieces[6] = new Pawn(5, false, 1, 4);
        blackPieces[7] = new Pawn(6, false, 1, 5);
        blackPieces[8] = new Pawn(7, false, 1, 6);
        blackPieces[9] = new Pawn(8, false, 1, 7);
        blackPieces[10] = new Knight(1, false, 0, 1);
        blackPieces[11] = new Knight(2, false, 0, 6);
        blackPieces[12] = new Bishop(1, false, 0, 5);
        blackPieces[13] = new Bishop(2, false, 0, 2);
        blackPieces[14] = new Queen(1, false, 0, 3);
        blackPieces[15] = new King(1, false, 0, 4);

        board = new Board(whitePieces, blackPieces);
    }
    
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean validMove = false;
        boolean checkmate = false;
        while(!checkmate) {

            while (!validMove) {
                board.printBoard();
                System.out.println("White's move, which piece would you like to move? ");
                System.out.println(getAllPieces(whitePieces));
                int piece = sc.nextInt();
                System.out.println("To which row?");
                int row = sc.nextInt();
                System.out.println("To which column?");
                int column = sc.nextInt();
                
                if(piece >= 0 && piece < 16) {
                    validMove = whitePieces[piece].isValidMove(row, column);
                }
                
                if (!validMove) {
                    System.out.println("Invalid move - try again");
                }
                else {
                    board.moveBoard(whitePieces[piece].getColumn(), column, whitePieces[piece].getRow(), row);
                    whitePieces[piece].move(row, column);
                }

            }

            validMove = false;
            while (!validMove) {
                board.printBoard();
                System.out.println("Black's move, which piece would you like to move? ");
                System.out.println(getAllPieces(blackPieces));
                int piece = sc.nextInt();
                System.out.println("To which row?");
                int row = sc.nextInt();
                System.out.println("To which column?");
                int column = sc.nextInt();

                if(piece >= 0 && piece < 16) {
                    validMove = whitePieces[piece].isValidMove(row, column);
                }

                if (!validMove) {
                    System.out.println("Invalid move - try again");
                }
                else {
                    board.moveBoard(blackPieces[piece].getColumn(), column, blackPieces[piece].getRow(), row);
                    blackPieces[piece].move(row, column);
                }
            }
            validMove = false;
        }
        
    }
    private String getAllPieces(Piece [] pieces) {
        String list = "";
        for (int x = 0; x < pieces.length; x++) {
            if(pieces[x] != null) {
                list += x + ": " + pieces[x].getName() + pieces[x].getId() + " (" + pieces[x].getRow() + "," + pieces[x].getColumn() + ")\n";
            }
            
        }
        return list;
    }

    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Ready to play? (y/n) ");
            String start = sc.nextLine();
            if(start.equalsIgnoreCase("y")) {
                ChessGame game = new ChessGame();
                game.startGame();
            }
            else if(start.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}