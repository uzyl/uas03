/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopir;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Uzyl
 */
public class sopir6 extends JPanel{
    private Image sopir6;
    
    public sopir6() {
        sopir6 = new ImageIcon(getClass().getResource("/sopir/sopir6.jpg")).getImage();
    }
 
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
 
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(sopir6, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
