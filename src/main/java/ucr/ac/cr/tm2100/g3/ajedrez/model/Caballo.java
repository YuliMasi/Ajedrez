/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.ajedrez.model;

import javax.swing.ImageIcon;

/**
 *
 * @author Yuliana
 */
public class Caballo extends Pieza{
    
    public Caballo(int x, int y, String color)  {
        super(x, y, null, color);
        ImageIcon caballoImg;
        if(color.equalsIgnoreCase("negro")){
            caballoImg=new ImageIcon("./src/main/resources/img/knightB.png");
        }else if (color.equalsIgnoreCase("blanco")){
          caballoImg=new ImageIcon("./src/main/resources/img/knightW.png");
        } else {
            caballoImg = null;
            System.err.println("El color " + color + " no existe");
            System.exit(1);
        }
        this.setImagen(caballoImg);
    }
    
    public void mover(){
    }
}
