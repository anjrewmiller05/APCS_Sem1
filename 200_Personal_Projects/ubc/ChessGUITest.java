import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import chess.*;

/**
 * Minimal Swing chess GUI front-end.
 * Back-end API integration points are clearly marked with TODO comments.

 * Assumptions:
 * - Back-end provides a method to fetch the current board state.
 * - Board is 8x8, and each square is either null or a piece object/string.
 * - If a piece is missing from the array, it has been captured.

 * You can replace the placeholder backend calls with your actual API.
 */
public class ChessGUITest extends JFrame {

    private final JButton[][] squares = new JButton[8][8];
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

                btn.addComponentListener(new java.awt.event.ComponentAdapter() {
                    @Override
                    public void componentResized(java.awt.event.ComponentEvent e) {
                        resizeIcon(btn);
                    }
                });

                // Color the board
                if ((row + col) % 2 == 0) {
                    btn.setBackground(new Color(240, 217, 181)); // light
                } else {
                    btn.setBackground(new Color(181, 136, 99)); // dark
                }

                final int r = row;
                final int c = col;

                btn.addActionListener( _ ->handleSquareClick(r, c));

                squares[row][col] = btn;
                boardPanel.add(btn);
            }
        }
    }

    private void handleSquareClick(int row, int col) {
        if (selectedFrom == null) {
            // First click: select source square
            selectedFrom = new Point(row, col);
            pieceToMove = board.whoBeThere(selectedFrom.x, selectedFrom.y);
            if (pieceToMove != null && (whiteTurn == pieceToMove.isWhite())) {
                highlightSquare(row, col, true);
            } else {
                selectedFrom = null;
            }
        } else {
            // Second click: attempt move
            if (game.isValidMove(pieceToMove, row, col) && game.move(pieceToMove, row, col)) {
                board = game.getBoard();
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
                Piece piece = board.whoBeThere(row, col);

                if (piece == null) {
                    btn.setText("");
                    btn.setIcon(null);
                } else {
                    // For now, just show text like "wP", "bK", etc.
                    // You can replace with icons later.
                    String color = piece.isWhite() ? "white":"black";
                    URL imgURL = getClass().getResource("images/" + color + "/" + piece.getName() + ".png");
                    if (imgURL != null) {
                        ImageIcon originalIcon = new ImageIcon(imgURL);
                        btn.putClientProperty("origin", originalIcon);
                        btn.setIcon(originalIcon);
                        resizeIcon(btn);
                        btn.setText("");
                    } else {
                        btn.setForeground(piece.isWhite() ? Color.WHITE: Color.BLACK);
                        btn.setText(piece.getSymbol());
                        btn.setIcon(null);
                    }
                }
            }
        }
        switch (game.gameStatus()) {
            case ChessGame.GAME_CHECK -> setTitle(getTitle() + " - CHECK");
            case ChessGame.GAME_CHECKMATE -> setTitle(getTitle() + " - CHECKMATE");
            case ChessGame.GAME_STALEMATE-> setTitle(getTitle() + " - STALEMATE");
        }
    }

    private void resizeIcon(JButton btn) {
        Object origin = btn.getClientProperty("origin");
        if (origin instanceof ImageIcon) {
            ImageIcon originalIcon = (ImageIcon) origin;

            int bWidth = btn.getWidth();
            int bHeight = btn.getHeight();

            if (bWidth > 0 && bHeight > 0) {
                int size = Math.min(bWidth, bHeight) - 10;

                // Create a high-quality buffered image
                BufferedImage resizedImg = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2 = resizedImg.createGraphics();

                // --- THE "HD" SETTINGS ---
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Draw the original image onto our new canvas
                g2.drawImage(originalIcon.getImage(), 0, 0, size, size, null);
                g2.dispose();

                btn.setIcon(new ImageIcon(resizedImg));
            }
        }
    }

    /**
     * Entry point for the front-end chess program.
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessGUITest());
    }

}