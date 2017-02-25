/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Color;

/**
 *
 * @author Mainul35
 */
public class PawnMove extends PossibleMove {

    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void possibleMove(int x, int y) {
        pawnValidMove(x, y);
    }

    public void pawnValidMove(int x, int y) {
        if (GameFrame.btn[x][y].getPiece().getPlayer() == 1) {  //Check if there is a movable place in front of white pawn
            if (x - 1 > -1 && GameFrame.btn[x - 1][y].getPiece().getPlayer() != 1 && GameFrame.btn[x - 1][y].getPiece().getPlayer() != 2) {
                GameFrame.btn[x - 1][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y);
            }
        } else if (GameFrame.btn[x][y].getPiece().getPlayer() == 2) {   //Check if there is a movable place in front of black pawn
            if (x + 1 < 8 && GameFrame.btn[x + 1][y].getPiece().getPlayer() != 2 && GameFrame.btn[x + 1][y].getPiece().getPlayer() != 1) {
                GameFrame.btn[x + 1][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
//                System.out.println("in Pawn move class at line 37 "+x);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y);
            }
        }

        if (GameFrame.btn[x][y].getPiece().getPlayer() == 1) {
            try {
                if (x - 1 > -1 && y + 1 < 8 || x - 1 > -1 && y - 1 > -1) {
                    if (GameFrame.btn[x - 1][y - 1].getPiece().getPlayer() == 2) {
                        GameFrame.btn[x - 1][y - 1].setBackground(Color.decode("#fd0a0a"));
                        GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                        GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
                        System.err.println("@Pawn move line 44");
                    }
                    if (GameFrame.btn[x - 1][y + 1].getPiece().getPlayer() == 2) {
                        GameFrame.btn[x - 1][y + 1].setBackground(Color.decode("#fd0a0a"));
                        GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                        GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        } else if (GameFrame.btn[x][y].getPiece().getPlayer() == 2) {
            try {
                if (x + 1 < 8 && y + 1 < 8 || x + 1 < 8 && y - 1 > -1) {
                    if (GameFrame.btn[x + 1][y + 1].getPiece().getPlayer() == 1) {
                        GameFrame.btn[x + 1][y + 1].setBackground(Color.decode("#fd0a0a"));
                        GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                        GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
                    }
                    if (GameFrame.btn[x + 1][y - 1].getPiece().getPlayer() == 1) {
                        GameFrame.btn[x + 1][y - 1].setBackground(Color.decode("#fd0a0a"));
                        GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                        GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
    }
}
