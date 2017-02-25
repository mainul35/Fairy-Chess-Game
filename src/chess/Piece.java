/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;

/**
 *
 * @author Mainul35
 */
public class Piece {
    private int player = 0;
    private String name = "";
    protected static ArrayList<Integer> possiblePathX = new ArrayList<>();
    protected static ArrayList<Integer> possiblePathY = new ArrayList<>();

    /**
     * @return the player
     */
    public int getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(int player) {
        this.player = player;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the possiblePathX
     */
    public ArrayList<Integer> getPossiblePathX() {
        return possiblePathX;
    }

    /**
     * @param possiblePathX the possiblePathX to set
     */
    public void setPossiblePathX(int possiblePathX) {
        this.possiblePathX.add(possiblePathX);
    }

    /**
     * @return the possiblePathY
     */
    public ArrayList<Integer> getPossiblePathY() {
        return possiblePathY;
    }

    /**
     * @param possiblePathY the possiblePathY to set
     */
    public void setPossiblePathY(int possiblePathY) {
        this.possiblePathY.add(possiblePathY);
    }
    
}
