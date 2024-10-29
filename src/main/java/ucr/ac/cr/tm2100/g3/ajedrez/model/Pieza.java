/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.ajedrez.model;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Yuliana
 */
public class Pieza {
    private int x, y;
    private String color;
    private ImageIcon imagen;
    
    public Pieza(int x, int y,ImageIcon imagen, String color){
        this.x=x;
        this.y=y;
        this.imagen=imagen;
        this.color=color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
   public void dibujar(Graphics g){
       imagen.paintIcon(null, g, x, y);
   }
   
   
}
