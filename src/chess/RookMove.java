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
public class RookMove extends PossibleMove {

    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if (GameFrame.btn[x][y].getPiece().getPlayer() == 1) {
            player1RookValidPath(x, y);
        } else if (GameFrame.btn[x][y].getPiece().getPlayer() == 2) {
            player2RookValidPath(x, y);
        }
    }

    public void player1RookValidPath(int x, int y) {
        for (int p = x + 1; p < 8; p++) {
            if (GameFrame.btn[p][y].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 1) {
                break;
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][y].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
                break;
            }
        }

        for (int p = x - 1; p > -1; p--) {
            if (GameFrame.btn[p][y].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 1) {
                break;
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 2) {
                GameFrame.btn[p][y].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
                break;
            }
        }

        for (int p = y - 1; p > -1; p--) {
            if (GameFrame.btn[x][p].getPiece().getPlayer() == 0) {
                GameFrame.btn[x][p].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 1) {
                break;
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 2) {
                GameFrame.btn[x][p].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
                break;
            }
        }
        for (int p = y + 1; p < 8; p++) {
            if (GameFrame.btn[x][p].getPiece().getPlayer() == 0) {
                GameFrame.btn[x][p].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 1) {
                break;
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 2) {
                GameFrame.btn[x][p].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
                break;
            }
        }
    }

    public void player2RookValidPath(int x, int y) {
        for (int p = x + 1; p < 8; p++) {
            if (GameFrame.btn[p][y].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 2) {
                break;
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][y].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
                break;
            }
        }

        for (int p = x - 1; p > -1; p--) {
            if (GameFrame.btn[p][y].getPiece().getPlayer() == 0) {
                GameFrame.btn[p][y].setBackground(Color.decode("#89b945"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 2) {
                break;
            } else if (GameFrame.btn[p][y].getPiece().getPlayer() == 1) {
                GameFrame.btn[p][y].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[p][y].getPiece().setPossiblePathX(p);
                GameFrame.btn[p][y].getPiece().setPossiblePathY(y);
                break;
            }
        }

        for (int p = y - 1; p > -1; p--) {
            if (GameFrame.btn[x][p].getPiece().getPlayer() == 0) {
                GameFrame.btn[x][p].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 2) {
                break;
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 1) {
                GameFrame.btn[x][p].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
                break;
            }
        }
        for (int p = y + 1; p < 8; p++) {
            if (GameFrame.btn[x][p].getPiece().getPlayer() == 0) {
                GameFrame.btn[x][p].setBackground(Color.decode("#89b945"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 2) {
                break;
            } else if (GameFrame.btn[x][p].getPiece().getPlayer() == 1) {
                GameFrame.btn[x][p].setBackground(Color.decode("#fd0a0a"));
                GameFrame.btn[x][p].getPiece().setPossiblePathX(x);
                GameFrame.btn[x][p].getPiece().setPossiblePathY(p);
                break;
            }
        }
    }
}
