import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chess.*;

/**
 * Minimal Swing chess GUI front-end.
 * Back-end API integration points are clearly marked with TODO comments.
 *
 * Assumptions:
 * - Back-end provides a method to fetch the current board state.
 * - Board is 8x8, and each square is either null or a piece object/string.
 * - If a piece is missing from the array, it has been captured.
 *
 * You can replace the placeholder backend calls with your actual API.
 */
public class ChessGUITest extends JFrame {

    private JButton[][] squares = new JButton[8][8];
    ChessGame game;
    Board board;

    // Track user selection for moves
    private Point selectedFrom = null;
    private Piece pieceToMove = null;
    private boolean whiteTurn;


    public ChessGUITest() {
        setTitle("Chess - White's Turn");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(8, 8));
        game = new ChessGame();
        board = game.startGuiGame();
        whiteTurn = true;
        initializeBoard(boardPanel);

        add(boardPanel, BorderLayout.CENTER);

        // Initial board load
        refreshBoard();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeBoard(JPanel boardPanel) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(70, 70));

                // Color the board
                if ((row + col) % 2 == 0) {
                    btn.setBackground(new Color(240, 217, 181)); // light
                } else {
                    btn.setBackground(new Color(181, 136, 99)); // dark
                }

                final int r = row;
                final int c = col;

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleSquareClick(r, c);
                    }
                });

                squares[row][col] = btn;
                boardPanel.add(btn);
            }
        }
    }

    private void handleSquareClick(int row, int col) {
        if (selectedFrom == null) {
            // First click: select source square
            selectedFrom = new Point(row, col);
            pieceToMove = board.whosThere(selectedFrom.x, selectedFrom.y);
            if (pieceToMove != null && (whiteTurn == pieceToMove.isWhite())) {
                highlightSquare(row, col, true);
            } else {
                selectedFrom = null;
            }
        } else {
            // Second click: attempt move
            Point to = new Point(row, col);


            if (game.isValidMove(pieceToMove, row, col)) {
                board = game.move(pieceToMove, row, col);
                whiteTurn = !whiteTurn;
                setTitle(whiteTurn ? "Chess - White's Turn" : "Chess - Black's Turn");
            }
            // After move, refresh board
            refreshBoard();

            // Clear selection
            highlightSquare(selectedFrom.x, selectedFrom.y, false);
            selectedFrom = null;
            pieceToMove = null;
        }
    }

    private void highlightSquare(int row, int col, boolean highlight) {
        JButton btn = squares[row][col];
        if (highlight) {
            btn.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        } else {
            btn.setBorder(UIManager.getBorder("Button.border"));
        }
    }

    private void refreshBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton btn = squares[row][col];
                Piece piece = board.whosThere(row, col);

                if (piece == null) {
                    btn.setText("");
                } else {
                    // For now, just show text like "wP", "bK", etc.
                    // You can replace with icons later.
                    btn.setForeground(piece.isWhite() ? Color.WHITE: Color.BLACK);
                    btn.setText(piece.getSymbol());
                }
            }
        }
        switch (game.gameStatus()) {
            case ChessGame.GAME_CHECK -> setTitle(getTitle() + " - CHECK");
            case ChessGame.GAME_CHECKMATE -> setTitle(getTitle() + " - CHECKMATE");
            case ChessGame.GAME_STALEMATE-> setTitle(getTitle() + " - STALEMATE");
        }
    }

    /**
     * Entry point for the front-end chess program.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessGUITest());
    }

}