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
public class sopir2 extends JPanel{
    private Image sopir2;
    
    public sopir2() {
        sopir2 = new ImageIcon(getClass().getResource("/sopir/sopir2.png")).getImage();
    }
 
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
 
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(sopir2, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
    
}
