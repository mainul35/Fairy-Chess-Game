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
public class ClickHistory {
    private static int clickX[] = new int[10000000];
    private static int clickY[] = new int[10000000];
    static int clickCounter = 0;
    /**
     * @return the clickX
     */
    public static int[] getClickX() {
        return clickX;
    }

    /**
     * @param aClickX the clickX to set
     */
    public static void setClickX(int aClickX) {
        clickX[clickCounter] = aClickX;
    }

    /**
     * @return the clickY
     */
    public static int[] getClickY() {
        return clickY;
    }

    /**
     * @param aClickY the clickY to set
     */
    public static void setClickY(int aClickY) {
        clickY[clickCounter++] = aClickY;
    }
}
