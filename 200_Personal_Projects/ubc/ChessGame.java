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
        StringBuilder list = new StringBuilder();
        for (int x = 0; x < pieces.length; x++) {
            if(pieces[x] != null && !pieces[x].isCaptured()) {
                list.append(x).append(": ").append(pieces[x].getName()).append(pieces[x].getId())
                        .append(" (").append(pieces[x].getRow()).append(",").append(pieces[x].getColumn()).append(")\t");
                if (x < 10) {
                    list.append("\t");
                }
                if(x % 2 != 0) {
                    list.append("\n");
                }
            }

        }
        return list.toString();
    }
    
    public void startTextGame() {
        Scanner sc = new Scanner(System.in);

        resetGame();

        while(gameStatus(board, (King)whitePieces[15]) != GAME_CHECKMATE || gameStatus(board, (King)whitePieces[15]) != GAME_STALEMATE) {
            boolean success = false;
            while (!success) {
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
                    if (!isValidMove(whitePieces[piece], row, column) || whitePieces[piece].isCaptured()) {
                        System.out.println("Invalid move - try again");
                    } else {
                        success = move(whitePieces[piece], row, column);
                    }
                }
            }

            success = false;
            while (!success) {
                if(gameStatus(board, (King)blackPieces[15]) == GAME_CHECKMATE || gameStatus(board, (King)blackPieces[15]) == GAME_STALEMATE) {
                    break;
                }
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
                    if (!isValidMove(blackPieces[piece], row, column) || blackPieces[piece].isCaptured()) {
                        System.out.println("Invalid move - try again");
                    } else {
                        success = move(blackPieces[piece], row, column);
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
        return p.isValidMove(board, row, col, getKing(p.isWhite()));
    }

    public boolean move(Piece p, int row, int col) {
        Piece p1 = board.squares[row][col];
        board.moveBoard(p.getColumn(), col, p.getRow(), row);
        boolean success;
        King k;
        if(p.isWhite()) {
            k = (King)blackPieces[15];
            ((King)whitePieces[15]).setCheck(false);
            success = p.move(board, row, col, k, (King)whitePieces[15]);
        }
        else {
            k = (King)whitePieces[15];
            ((King)blackPieces[15]).setCheck(false);
            success = p.move(board, row, col, k, (King)blackPieces[15]);
        }

        if(!success) {
            board.squares[row][col] = p1;
            board.squares[p.getRow()][p.getColumn()] = p;
        }

        return success;
    }

    public King getKing(boolean isWhite) {
        if(isWhite){return (King)whitePieces[15];}
        return (King)blackPieces[15];
    }

    public int gameStatus(Board board, King opposingKing){
        for(Piece[] rowOfSquares : board.squares) {
            for (Piece p : rowOfSquares) {
                if(p != null && opposingKing.isWhite() == p.isWhite()) {
                    for(int y = 0; y < 8; y++) {
                        for(int x = 0; x < 8; x++) {
                            if(p.isValidMove(board, y, x, opposingKing)) {
                                if(opposingKing.isCheck()) {
                                    if(opposingKing.isWhite()) {
                                        System.out.println("White's king is in check");
                                    }
                                    else {
                                        System.out.println("Black's king is in check");
                                    }
                                    return GAME_CHECK;
                                }
                                System.out.println();
                                return GAME_GOOD;
                            }
                        }
                    }
                }
            }
        }
        if(opposingKing.isCheck()) {
            if(opposingKing.isWhite()) {
                System.out.println("White's king is checkmated, game over!");
                System.exit(0);
            }
            else {
                System.out.println("Black's king is checkmated, game over!");
                System.exit(0);
            }
            return GAME_CHECKMATE;
        }
        else {
            System.out.println("The game has ended in a stalemate");
            System.exit(0);
            return GAME_STALEMATE;
        }
    }

    public Board getBoard() {
        return board;
    }


    @SuppressWarnings("all")
    public static void main(String[] args) {
        System.out.println("Starting new Chess Game");
        ChessGame game = new ChessGame();
        game.startTextGame();
    }
}