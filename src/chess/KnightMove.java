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
public class KnightMove extends PossibleMove {

    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if (GameFrame.btn[x][y].getPiece().getPlayer() == 1) {
            player1KnightValidMove(x, y);
        } else if (GameFrame.btn[x][y].getPiece().getPlayer() == 2) {
            player2KnightValidMove(x, y);
        }
    }

    public void player1KnightValidMove(int x, int y) {
        if (x + 2 < 8 && y + 1 < 8 && GameFrame.btn[x + 2][y + 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 2][y + 1].getPiece().getPlayer() == 2) {
                GameFrame.btn[x + 2][y + 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            } else {
                GameFrame.btn[x + 2][y + 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            }

        }
        if (x + 2 < 8 && y - 1 > -1 && GameFrame.btn[x + 2][y - 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 2][y - 1].getPiece().getPlayer() == 2) {
                GameFrame.btn[x + 2][y - 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            } else {
                GameFrame.btn[x + 2][y - 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            }
        }
        if (x - 2 > -1 && y + 1 < 8 && GameFrame.btn[x - 2][y + 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 2][y + 1].getPiece().getPlayer() == 2) {
                GameFrame.btn[x - 2][y + 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            } else {
                GameFrame.btn[x - 2][y + 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            }
        }
        if (x - 2 > -1 && y - 1 > -1 && GameFrame.btn[x - 2][y - 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 2][y - 1].getPiece().getPlayer() == 2) {
                GameFrame.btn[x - 2][y - 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            } else {
                GameFrame.btn[x - 2][y - 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            }
        }
        if (x + 1 < 8 && y + 2 < 8 && GameFrame.btn[x + 1][y + 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 1][y + 2].getPiece().getPlayer() == 2) {
                GameFrame.btn[x + 1][y + 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            } else {
                GameFrame.btn[x + 1][y + 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            }
        }
        if (x + 1 < 8 && y - 2 > -1 && GameFrame.btn[x + 1][y - 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 1][y - 2].getPiece().getPlayer() == 2) {
                GameFrame.btn[x + 1][y - 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            } else {
                GameFrame.btn[x + 1][y - 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            }
        }
        if (x - 1 > -1 && y + 2 < 8 && GameFrame.btn[x - 1][y + 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 1][y + 2].getPiece().getPlayer() == 2) {
                GameFrame.btn[x - 1][y + 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            } else {
                GameFrame.btn[x - 1][y + 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            }
        }
        if (x - 1 > -1 && y - 2 > -1 && GameFrame.btn[x - 1][y - 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 1][y - 2].getPiece().getPlayer() == 2) {
                GameFrame.btn[x - 1][y - 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            } else {
                GameFrame.btn[x - 1][y - 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            }
        }
    }

    public void player2KnightValidMove(int x, int y) {
        if (x + 2 < 8 && y + 1 < 8 && GameFrame.btn[x + 2][y + 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 2][y + 1].getPiece().getPlayer() == 1) {
                GameFrame.btn[x + 2][y + 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            } else {
                GameFrame.btn[x + 2][y + 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            }

        }
        if (x + 2 < 8 && y - 1 > -1 && GameFrame.btn[x + 2][y - 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 2][y - 1].getPiece().getPlayer() == 1) {
                GameFrame.btn[x + 2][y - 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            } else {
                GameFrame.btn[x + 2][y - 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            }
        }
        if (x - 2 > -1 && y + 1 < 8 && GameFrame.btn[x - 2][y + 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 2][y + 1].getPiece().getPlayer() == 1) {
                GameFrame.btn[x - 2][y + 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            } else {
                GameFrame.btn[x - 2][y + 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 1);
            }
        }
        if (x - 2 > -1 && y - 1 > -1 && GameFrame.btn[x - 2][y - 1].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 2][y - 1].getPiece().getPlayer() == 1) {
                GameFrame.btn[x - 2][y - 1].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            } else {
                GameFrame.btn[x - 2][y - 1].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 2);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 1);
            }
        }
        if (x + 1 < 8 && y + 2 < 8 && GameFrame.btn[x + 1][y + 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 1][y + 2].getPiece().getPlayer() == 1) {
                GameFrame.btn[x + 1][y + 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            } else {
                GameFrame.btn[x + 1][y + 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            }
        }
        if (x + 1 < 8 && y - 2 > -1 && GameFrame.btn[x + 1][y - 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x + 1][y - 2].getPiece().getPlayer() == 1) {
                GameFrame.btn[x + 1][y - 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            } else {
                GameFrame.btn[x + 1][y - 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x + 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            }
        }
        if (x - 1 > -1 && y + 2 < 8 && GameFrame.btn[x - 1][y + 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 1][y + 2].getPiece().getPlayer() == 1) {
                GameFrame.btn[x - 1][y + 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            } else {
                GameFrame.btn[x - 1][y + 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y + 2);
            }
        }
        if (x - 1 > -1 && y - 2 > -1 && GameFrame.btn[x - 1][y - 2].getPiece().getPlayer() != GameFrame.btn[x][y].getPiece().getPlayer()) {
            if (GameFrame.btn[x - 1][y - 2].getPiece().getPlayer() == 1) {
                GameFrame.btn[x - 1][y - 2].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            } else {
                GameFrame.btn[x - 1][y - 2].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][y].getPiece().setPossiblePathX(x - 1);
                GameFrame.btn[x][y].getPiece().setPossiblePathY(y - 2);
            }
        }
    }
}
