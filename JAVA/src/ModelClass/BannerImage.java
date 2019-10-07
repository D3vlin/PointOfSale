/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author AlexJPZ
 */
public class BannerImage extends javax.swing.JPanel{
     public BannerImage() {
          this.setSize(1370,30);
      }
    @Override
      public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon backgroundImage = new ImageIcon(new ImageIcon(getClass().getResource("../Images/Banner.png")).getImage());
        g.drawImage(backgroundImage.getImage(), 0,0, tam.width, tam.height,null);
        setOpaque(false);
        super.paintComponents(g);
      }
}
