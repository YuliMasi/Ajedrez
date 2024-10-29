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
public class Peones extends Pieza{
    
    public Peones(int x, int y, String color) {
        super(x, y, null, color);
        ImageIcon peonImg;
        if(color.equalsIgnoreCase("negro")){
            peonImg = new ImageIcon("./src/main/resources/img/pawnB.png");
        }else if(color.equalsIgnoreCase("blanco")){
            peonImg = new ImageIcon("./src/main/resources/img/pawnW.png");
        }else{
            peonImg = null;
            System.err.println("Esta pieza no existe");
            System.exit(1);
        }
        this.setImagen(peonImg);
    }
    
}
