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
public class BishopMove extends PossibleMove {

    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if (GameFrame.btn[x][y].getPiece().getPlayer() == 1) {
            player1BishopValidPath(x, y);
        } else if (GameFrame.btn[x][y].getPiece().getPlayer() == 2) {
            player2BishopValidPath(x, y);
        }
    }

    public void player1BishopValidPath(int x, int y) {
        for (int p = x - 1, q = y - 1; p > -1; p--, q--) {
            if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                break;
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x + 1, q = y + 1; p < 8; p++, q++) {
            if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                break;
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x + 1, q = y - 1; p < 8; p++, q--) {
            if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                break;
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x - 1, q = y + 1; p > -1; p--, q++) {
            if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                break;
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }
    }

    public void player2BishopValidPath(int x, int y) {
        for (int p = x - 1, q = y - 1; p > -1; p--, q--) {
            if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                break;
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x + 1, q = y + 1; p < 8; p++, q++) {
            if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                break;
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x + 1, q = y - 1; p < 8; p++, q--) {
            if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                break;
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q > -1 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }

        for (int p = x - 1, q = y + 1; p > -1; p--, q++) {
            if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 2) {
                break;
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][q].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
            } else if (q < 8 && GameFrame.btn[p][q].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][q].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][q].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][q].getPiece().setPossiblePathY(q);
                break;
            }
        }
    }
}