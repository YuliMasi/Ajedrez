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
public class Torre extends Pieza{
    
    public Torre(int x, int y, String color) {
        super(x, y, null, color);
        ImageIcon torreImg;
        if(color.equalsIgnoreCase("negro")){
            torreImg = new ImageIcon("./src/main/resources/img/rookB.png");
        }else if(color.equalsIgnoreCase("blanco")){
            torreImg = new ImageIcon("./src/main/resources/img/rookW.png");
        }else{
            torreImg=null;
            System.err.println("Error, este color pieza no existe");
        }
        this.setImagen(torreImg);
    }
    
}
