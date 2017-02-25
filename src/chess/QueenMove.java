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
public class QueenMove extends PossibleMove{

    private RookMove rookMove = new RookMove();
    private BishopMove bishopMove = new BishopMove();
    /**
     *
     * @param e
     */
    @Override
    public void possibleMove(int x, int y) {
        if(GameFrame.btn[x][y].getPiece().getPlayer() == 1){
            rookMove.player1RookValidPath(x, y);
            bishopMove.player1BishopValidPath(x, y);
        } else if(GameFrame.btn[x][y].getPiece().getPlayer() == 2){
            rookMove.player2RookValidPath(x, y);
            bishopMove.player2BishopValidPath(x, y);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
