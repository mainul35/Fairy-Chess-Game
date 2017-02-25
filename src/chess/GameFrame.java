/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mainul35
 */
public class GameFrame extends JFrame {

    private static byte currentX = 0, currentY = 0;
    protected static Button[][] btn = new Button[8][8];
    protected static int clickCount = 0;
    protected static byte clickX[] = new byte[5];
    protected static byte clickY[] = new byte[5];
    protected static final String BLACK_PAWN = "images/pawn_black.png";
    protected static final String BLACK_ROOK = "images/rook_black.png";
    protected static final String BLACK_KNIGHT = "images/knight_black.png";
    protected static final String BLACK_BISHOP = "images/bishop_black.png";
    protected static final String BLACK_QUEEN = "images/queen_black.png";
    protected static final String BLACK_KING = "images/king_black.png";
    protected static final String BLACK_EMPRESS = "images/empress_black.png";
    protected static final String BLACK_GRASSHOPPER = "images/grasshopper_black.png";

    protected static final String WHITE_PAWN = "images/pawn_white.png";
    protected static final String WHITE_ROOK = "images/rook_white.png";
    protected static final String WHITE_KNIGHT = "images/knight_white.png";
    protected static final String WHITE_BISHOP = "images/bishop_white.png";
    protected static final String WHITE_QUEEN = "images/queen_white.png";
    protected static final String WHITE_KING = "images/king_white.png";
    protected static final String WHITE_EMPRESS = "images/empress_white.png";
    protected static final String WHITE_GRASSHOPPER = "images/grasshopper_white.png";

    String[][] setOfBlackPiece = {
        {BLACK_KING, BLACK_PAWN, BLACK_PAWN, BLACK_QUEEN,
            BLACK_ROOK, BLACK_GRASSHOPPER, BLACK_KNIGHT, BLACK_PAWN,
            BLACK_PAWN, BLACK_KNIGHT, BLACK_ROOK, BLACK_BISHOP,
            BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN
        },
        {BLACK_PAWN, BLACK_PAWN, BLACK_KING, BLACK_QUEEN,
            BLACK_PAWN, BLACK_GRASSHOPPER, BLACK_PAWN, BLACK_PAWN,
            BLACK_BISHOP, BLACK_PAWN, BLACK_BISHOP, BLACK_ROOK,
            BLACK_KNIGHT, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN
        },
        {BLACK_PAWN, BLACK_KING, BLACK_EMPRESS, BLACK_PAWN,
            BLACK_ROOK, BLACK_QUEEN, BLACK_PAWN, BLACK_PAWN,
            BLACK_BISHOP, BLACK_ROOK, BLACK_KNIGHT, BLACK_PAWN,
            BLACK_PAWN, BLACK_KNIGHT, BLACK_PAWN, BLACK_BISHOP
        },
        {BLACK_KNIGHT, BLACK_ROOK, BLACK_EMPRESS, BLACK_KING,
            BLACK_PAWN, BLACK_QUEEN, BLACK_PAWN, BLACK_BISHOP,
            BLACK_PAWN, BLACK_BISHOP, BLACK_PAWN, BLACK_PAWN,
            BLACK_ROOK, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN
        },
        {BLACK_EMPRESS, BLACK_ROOK, BLACK_PAWN, BLACK_KNIGHT,
            BLACK_KING, BLACK_PAWN, BLACK_QUEEN, BLACK_BISHOP,
            BLACK_PAWN, BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP,
            BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN
        },
        {BLACK_ROOK, BLACK_KNIGHT, BLACK_PAWN, BLACK_GRASSHOPPER,
            BLACK_KING, BLACK_PAWN, BLACK_QUEEN, BLACK_BISHOP,
            BLACK_ROOK, BLACK_PAWN, BLACK_PAWN, BLACK_BISHOP,
            BLACK_PAWN, BLACK_KNIGHT, BLACK_PAWN, BLACK_PAWN
        }
    };

    String[][] setOfWhitePiece = {
        {WHITE_PAWN, WHITE_KNIGHT, WHITE_ROOK, WHITE_BISHOP,
            WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN,
            WHITE_KING, WHITE_PAWN, WHITE_PAWN, WHITE_QUEEN,
            WHITE_ROOK, WHITE_GRASSHOPPER, WHITE_KNIGHT, WHITE_PAWN
        },
        {WHITE_BISHOP, WHITE_PAWN, WHITE_BISHOP, WHITE_ROOK,
            WHITE_KNIGHT, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN,
            WHITE_PAWN, WHITE_PAWN, WHITE_KING, WHITE_QUEEN,
            WHITE_PAWN, WHITE_GRASSHOPPER, WHITE_PAWN, WHITE_PAWN
        },
        {WHITE_BISHOP, WHITE_ROOK, WHITE_KNIGHT, WHITE_PAWN,
            WHITE_PAWN, WHITE_KNIGHT, WHITE_PAWN, WHITE_BISHOP,
            WHITE_PAWN, WHITE_KING, WHITE_EMPRESS, WHITE_PAWN,
            WHITE_ROOK, WHITE_QUEEN, WHITE_PAWN, WHITE_PAWN
        },
        {WHITE_PAWN, WHITE_BISHOP, WHITE_PAWN, WHITE_PAWN,
            WHITE_ROOK, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN,
            WHITE_KNIGHT, WHITE_ROOK, WHITE_EMPRESS, WHITE_KING,
            WHITE_PAWN, WHITE_QUEEN, WHITE_PAWN, WHITE_BISHOP
        },
        {WHITE_PAWN, WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP,
            WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_EMPRESS,
            WHITE_ROOK, WHITE_PAWN, WHITE_KNIGHT,
            WHITE_KING, WHITE_PAWN, WHITE_QUEEN, WHITE_BISHOP
        },
        {WHITE_ROOK, WHITE_PAWN, WHITE_PAWN, WHITE_BISHOP,
            WHITE_PAWN, WHITE_KNIGHT, WHITE_PAWN, WHITE_PAWN,
            WHITE_ROOK, WHITE_KNIGHT, WHITE_PAWN, WHITE_GRASSHOPPER,
            WHITE_KING, WHITE_PAWN, WHITE_QUEEN, WHITE_BISHOP
        }
    };

    private void initComponents() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(8, 8));
        int randomWhite = new Random().nextInt(setOfWhitePiece.length);
//        System.err.println(randomWhite);
        int randomBlack = new Random().nextInt(setOfBlackPiece.length);
//        System.out.println(randomBlack);
        int p = 0;
        for (byte x = 0; x < 8; x++) {
            for (byte y = 0; y < 8; y++) {
                btn[x][y] = new Button();
                Piece piece = new Piece();
                if ((x + y) % 2 == 0) {
                    btn[x][y].setBackground(Color.decode("#f99595"));
                } else if ((x + y) % 2 == 1) {
                    btn[x][y].setBackground(Color.decode("#d2c8c8"));
                }

                switch (x) {
                    case 0:
                    case 1:
                        piece.setName(setOfBlackPiece[randomBlack][p]);
                        piece.setPlayer(2);
                        btn[x][y].setPiece(piece);
                        btn[x][y].setImage(setOfBlackPiece[randomBlack][p]);
                        p++;
                        break;
                    case 6:
                    case 7:
                        piece.setName(setOfWhitePiece[randomWhite][p]);
                        piece.setPlayer(1);
                        btn[x][y].setPiece(piece);
                        btn[x][y].setImage(setOfWhitePiece[randomWhite][p]);
                        p++;
                        break;
                    default:
                        p = 0;
                        break;
                }
                currentX = x;
                currentY = y;
                btn[x][y].addActionListener((ActionEvent e) -> {
                    System.err.println(clickCount);
                    clickCount++;

                    Button button = (Button) e.getSource();
                    for (byte i = 0; i < 8; i++) {
                        for (byte j = 0; j < 8; j++) {
                            if (btn[i][j] == button) {
                                currentX = i;
                                currentY = j;
                                btn[i][j].repaint();
                            }
                            if ((i + j) % 2 == 0) {
                                btn[i][j].setBackground(Color.decode("#f99595"));
                            } else if ((i + j) % 2 == 1) {
                                btn[i][j].setBackground(Color.decode("#d2c8c8"));
                            }
                        }
                    }

                    if (clickCount == 1 && btn[currentX][currentY].getPiece().getPlayer() != 1) {
                        System.err.println("@line 166 " + clickCount);
                        clickCount--;
                        JOptionPane.showMessageDialog(null, "Please select a white piece to move!");
                    } else if (clickCount == 1 && btn[currentX][currentY].getPiece().getPlayer() == 1) {
                        System.err.println("@line 173 " + clickCount);

                        switch (btn[currentX][currentY].getPiece().getName()) {
                            case BLACK_BISHOP:
                            case WHITE_BISHOP:
                                BishopMove bishopMove = new BishopMove();
                                bishopMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_EMPRESS:
                            case WHITE_EMPRESS:
                                EmpressMove empressMove = new EmpressMove();
                                empressMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_GRASSHOPPER:
                            case WHITE_GRASSHOPPER:
                                GrasshopperMove grasshopperMove = new GrasshopperMove();
                                grasshopperMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KING:
                            case WHITE_KING:
                                KingMove kingMove = new KingMove();
                                kingMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KNIGHT:
                            case WHITE_KNIGHT:
                                KnightMove knightMove = new KnightMove();
                                knightMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_PAWN:
                            case WHITE_PAWN:
                                PawnMove pawnMove = new PawnMove();
                                pawnMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_QUEEN:
                            case WHITE_QUEEN:
                                QueenMove queenMove = new QueenMove();
                                queenMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_ROOK:
                            case WHITE_ROOK:
                                RookMove rookMove = new RookMove();
                                rookMove.possibleMove(currentX, currentY);
                                break;
                        }
                    } else if (clickCount == 2 && btn[currentX][currentY].getPiece().getPlayer() == 1) {
                        System.out.println("@Line 219 " + clickCount);

                        switch (btn[currentX][currentY].getPiece().getName()) {
                            case BLACK_BISHOP:
                            case WHITE_BISHOP:
                                BishopMove bishopMove = new BishopMove();
                                bishopMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_EMPRESS:
                            case WHITE_EMPRESS:
                                EmpressMove empressMove = new EmpressMove();
                                empressMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_GRASSHOPPER:
                            case WHITE_GRASSHOPPER:
                                GrasshopperMove grasshopperMove = new GrasshopperMove();
                                grasshopperMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KING:
                            case WHITE_KING:
                                KingMove kingMove = new KingMove();
                                kingMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KNIGHT:
                            case WHITE_KNIGHT:
                                KnightMove knightMove = new KnightMove();
                                knightMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_PAWN:
                            case WHITE_PAWN:
                                PawnMove pawnMove = new PawnMove();
                                pawnMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_QUEEN:
                            case WHITE_QUEEN:
                                QueenMove queenMove = new QueenMove();
                                queenMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_ROOK:
                            case WHITE_ROOK:
                                RookMove rookMove = new RookMove();
                                rookMove.possibleMove(currentX, currentY);
                                break;
                        }
                        clickCount = 1;
                    } else if (clickCount == 2) {
                        boolean found = false;
                        System.out.println("@line 224 " + clickCount);
                        for (int i = 0; i < Piece.possiblePathX.size(); i++) {
                            System.err.println(Piece.possiblePathX.get(i) + "\t" + Piece.possiblePathY.get(i));
                            System.out.println(currentX + "\t" + currentY);
                            if (Piece.possiblePathX.get(i) == currentX && Piece.possiblePathY.get(i) == (currentY)) {
                                found = true;
                                break;
                            }
                        }
                        if (found == true) {
                            btn[currentX][currentY].setImage(btn[clickX[clickCount - 1]][clickY[clickCount - 1]].getImageSource());
                            btn[currentX][currentY].setPiece(btn[clickX[clickCount - 1]][clickY[clickCount - 1]].getPiece());
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].setImage("");
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].setPiece(new Piece());
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].repaint();
                            btn[currentX][currentY].repaint();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid path selection");
                            clickCount = 1;
                        }
                        Piece.possiblePathX.clear();
                        Piece.possiblePathY.clear();
                    } else if (clickCount == 3 && btn[currentX][currentY].getPiece().getPlayer() != 2) {
                        clickCount--;
                        JOptionPane.showMessageDialog(null, "Please select a black piece to move!");

                    } else if (clickCount == 3 && btn[currentX][currentY].getPiece().getPlayer() == 2) {
                        System.err.println("@line 239 " + clickCount);
                        switch (btn[currentX][currentY].getPiece().getName()) {
                            case BLACK_BISHOP:
                            case WHITE_BISHOP:
                                BishopMove bishopMove = new BishopMove();
                                bishopMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_EMPRESS:
                            case WHITE_EMPRESS:
                                EmpressMove empressMove = new EmpressMove();
                                empressMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_GRASSHOPPER:
                            case WHITE_GRASSHOPPER:
                                GrasshopperMove grasshopperMove = new GrasshopperMove();
                                grasshopperMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KING:
                            case WHITE_KING:
                                KingMove kingMove = new KingMove();
                                kingMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KNIGHT:
                            case WHITE_KNIGHT:
                                KnightMove knightMove = new KnightMove();
                                knightMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_PAWN:
                            case WHITE_PAWN:
                                PawnMove pawnMove = new PawnMove();
                                pawnMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_QUEEN:
                            case WHITE_QUEEN:
                                QueenMove queenMove = new QueenMove();
                                queenMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_ROOK:
                            case WHITE_ROOK:
                                RookMove rookMove = new RookMove();
                                rookMove.possibleMove(currentX, currentY);
                                break;
                        }
                    } else if (clickCount == 4 && btn[currentX][currentY].getPiece().getPlayer() == 2) {
                        System.out.println("@Line 286 " + clickCount);
                        switch (btn[currentX][currentY].getPiece().getName()) {
                            case BLACK_BISHOP:
                            case WHITE_BISHOP:
                                BishopMove bishopMove = new BishopMove();
                                bishopMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_EMPRESS:
                            case WHITE_EMPRESS:
                                EmpressMove empressMove = new EmpressMove();
                                empressMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_GRASSHOPPER:
                            case WHITE_GRASSHOPPER:
                                GrasshopperMove grasshopperMove = new GrasshopperMove();
                                grasshopperMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KING:
                            case WHITE_KING:
                                KingMove kingMove = new KingMove();
                                kingMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_KNIGHT:
                            case WHITE_KNIGHT:
                                KnightMove knightMove = new KnightMove();
                                knightMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_PAWN:
                            case WHITE_PAWN:
                                PawnMove pawnMove = new PawnMove();
                                pawnMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_QUEEN:
                            case WHITE_QUEEN:
                                QueenMove queenMove = new QueenMove();
                                queenMove.possibleMove(currentX, currentY);
                                break;
                            case BLACK_ROOK:
                            case WHITE_ROOK:
                                RookMove rookMove = new RookMove();
                                rookMove.possibleMove(currentX, currentY);
                                break;
                        }
                        clickCount = 3;
                    } else if (clickCount == 4) {
                        boolean found = false;
                        System.out.println("@line 291 " + clickCount);
                        for (int i = 0; i < Piece.possiblePathX.size(); i++) {
                            System.err.println(Piece.possiblePathX.get(i) + "\t" + Piece.possiblePathY.get(i));
                            System.out.println(currentX + "\t" + currentY);
                            if (Piece.possiblePathX.get(i) == (currentX) && Piece.possiblePathY.get(i) == (currentY)) {
                                found = true;
                                break;
                            }
                        }
                        if (found == true) {
                            btn[currentX][currentY].setImage(btn[clickX[clickCount - 1]][clickY[clickCount - 1]].getImageSource());
                            btn[currentX][currentY].setPiece(btn[clickX[clickCount - 1]][clickY[clickCount - 1]].getPiece());
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].setImage("");
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].setPiece(new Piece());
                            btn[clickX[clickCount - 1]][clickY[clickCount - 1]].repaint();
                            btn[currentX][currentY].repaint();
                            clickCount = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid path selection");
                            clickCount = 3;
                        }
                        Piece.possiblePathX.clear();
                        Piece.possiblePathY.clear();
                    }

                    clickX[clickCount] = currentX;
                    clickY[clickCount] = currentY;
                });
                center.add(btn[x][y]);
            }
        }

        this.setLayout(new BorderLayout());
        this.add(center, BorderLayout.CENTER);
        this.setSize(750, 700);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.initComponents();
    }
}
