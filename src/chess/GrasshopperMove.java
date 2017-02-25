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
public class GrasshopperMove extends PossibleMove {

    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if(GameFrame.btn[x][y].getPiece().getPlayer() == 1){
            player1GrassHopperValidPath(x, y);
        } else if(GameFrame.btn[x][y].getPiece().getPlayer() == 2){
            player2GrassHopperValidPath(x, y);
        }
    }

    public void player1GrassHopperValidPath(int x, int y) {
        for (int p = x - 1, q = y - 1; p - 1 > -1; p--, q--) {
            if (q - 1 > -1 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p - 1][q - 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p - 1][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p - 1][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p - 1][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }

        for (int p = x - 1, q = y + 1; p - 1 > -1; p--, q++) {
            if (q + 1 < 8 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p - 1][q + 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p - 1][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p - 1][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p - 1][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }

        for (int p = x + 1, q = y - 1; p + 1 < 8; p++, q--) {
            if (q - 1 > -1 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q - 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p + 1][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p + 1][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }

        for (int p = x + 1, q = y + 1; p + 1 < 8; p++, q++) {
            if (q + 1 < 8 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q + 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p + 1][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p + 1][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }
        //From Top to Bottom
        for (int p = x + 1, q = y; p + 1 < 8; p++) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p + 1][q].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathY(q);
                    break;
                } else if (GameFrame.btn[p + 1][q].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathY(q);
                    break;
                }
            }
        }
        //From Bottom to top
        for (int p = x - 1, q = y; p - 1 > -1; p--) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p - 1][q].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p - 1][q].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathY(q);
                    break;
                } else if (GameFrame.btn[p - 1][q].getPiece().getPlayer() == 0) {
                    System.out.println("p = " + (p + 1) + "q = " + q);
                    GameFrame.btn[p - 1][q].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathY(q);
                    break;
                }
            }
        }
        //From Right to left
        for (int p = x, q = y - 1; q - 1 > -1; q--) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p][q - 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }
        //From Left to Right
        for (int p = x, q = y + 1; q + 1 < 8; q++) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p][q + 1].getPiece().getPlayer() == 2) {
                    GameFrame.btn[p][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }
    }

    public void player2GrassHopperValidPath(int x, int y) {
        for (int p = x - 1, q = y - 1; p - 1 > -1; p--, q--) {
            if (q - 1 > -1 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p - 1][q - 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p - 1][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p - 1][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p - 1][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }

        for (int p = x - 1, q = y + 1; p - 1 > -1; p--, q++) {
            if (q + 1 < 8 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p - 1][q + 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p - 1][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p - 1][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p - 1][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }

        for (int p = x + 1, q = y - 1; p + 1 < 8; p++, q--) {
            if (q - 1 > -1 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q - 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p + 1][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p + 1][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }

        for (int p = x + 1, q = y + 1; p + 1 < 8; p++, q++) {
            if (q + 1 < 8 && (GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q + 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p + 1][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p + 1][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }
        //From Top to Bottom
        for (int p = x + 1, q = y; p + 1 < 8; p++) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p + 1][q].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p + 1][q].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathY(q);
                    break;
                } else if (GameFrame.btn[p + 1][q].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p + 1][q].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathX(p + 1);
                    GameFrame.btn[p + 1][q].getPiece().setPossiblePathY(q);
                    break;
                }
            }
        }
        //From Bottom to top
        for (int p = x - 1, q = y; p - 1 > -1; p--) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 2 || GameFrame.btn[p][q].getPiece().getPlayer() == 1)) {
                if (GameFrame.btn[p - 1][q].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p - 1][q].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathY(q);
                    break;
                } else if (GameFrame.btn[p - 1][q].getPiece().getPlayer() == 0) {
                    System.out.println("p = " + (p + 1) + "q = " + q);
                    GameFrame.btn[p - 1][q].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathX(p - 1);
                    GameFrame.btn[p - 1][q].getPiece().setPossiblePathY(q);
                    break;
                }
            }
        }
        //From Right to left
        for (int p = x, q = y - 1; q - 1 > -1; q--) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 2 || GameFrame.btn[p][q].getPiece().getPlayer() == 1)) {
                if (GameFrame.btn[p][q - 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p][q - 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                } else if (GameFrame.btn[p][q - 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p][q - 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q - 1].getPiece().setPossiblePathY(q - 1);
                    break;
                }
            }
        }
        //From Left to Right
        for (int p = x, q = y + 1; q + 1 < 8; q++) {
            if ((GameFrame.btn[p][q].getPiece().getPlayer() == 1 || GameFrame.btn[p][q].getPiece().getPlayer() == 2)) {
                if (GameFrame.btn[p][q + 1].getPiece().getPlayer() == 1) {
                    GameFrame.btn[p][q + 1].setBackground(Color.decode("#fd0a0a"));
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                } else if (GameFrame.btn[p][q + 1].getPiece().getPlayer() == 0) {
                    GameFrame.btn[p][q + 1].setBackground(Color.decode("#89b945"));
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathX(p);
                    GameFrame.btn[p][q + 1].getPiece().setPossiblePathY(q + 1);
                    break;
                }
            }
        }
    }
}
