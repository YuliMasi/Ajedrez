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
public class Rey extends Pieza{
    
    public Rey(int x, int y, String color) {
        super(x, y, null, color);
        ImageIcon reyImg;
        if(color.equalsIgnoreCase("negro")){
            reyImg = new ImageIcon("./src/main/resources/img/kingB.png");
        }else if(color.equalsIgnoreCase("blanco")){
            reyImg=new ImageIcon("./src/main/resources/img/kingW.png");
        }else{
            reyImg=null;
            System.err.println("Error, este color no existe");
            System.exit(1);
        }
        this.setImagen(reyImg);
    }
    
}
