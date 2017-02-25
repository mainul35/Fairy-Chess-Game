/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
//import sun.java2d.pipe.DrawImage;

/**
 *
 * @author Mainul35
 */
public class Button extends JButton{
    
    Image image = null;
    private String imageSource = null;
    private Piece piece = new Piece();

    public Button() {
        setSize(150, 150);
    }

    
    /**
     * @return the piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * @param piece the piece to set
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    /**
     * @param imageLocation
     */
    public void setImage(String imageLocation) {
        try {
            if(imageLocation.equals("")){
                this.image = null;
            }else{
                this.imageSource = imageLocation;
                this.image = ImageIO.read(new File(imageLocation));
            }
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 25, 15, 50, 50, null); // see javadoc for more info on the parameters            
    }
    
    public String getImageSource(){
        return this.imageSource;
    }
}
