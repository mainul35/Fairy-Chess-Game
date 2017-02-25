/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Mainul35
 */
public class EmpressMove extends PossibleMove{
    private RookMove rookMove = new RookMove();
    private KnightMove knightMove = new KnightMove();
    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if(GameFrame.btn[x][y].getPiece().getPlayer() == 1){
            rookMove.player1RookValidPath(x, y);
            knightMove.player1KnightValidMove(x, y);
        } else if(GameFrame.btn[x][y].getPiece().getPlayer() == 2){
            knightMove.player2KnightValidMove(x, y);
            rookMove.player2RookValidPath(x, y);
        }
    }
}
