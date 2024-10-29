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
public class Alfil extends Pieza{
    
    public Alfil(int x, int y, String color) {
        super(x, y, null, color);
        ImageIcon alfilImg;
        if(color.equalsIgnoreCase("negro")){
            alfilImg = new ImageIcon("./src/main/resources/img/bishopB.png");
        }else if(color.equalsIgnoreCase("blanco")){
            alfilImg = new ImageIcon("./src/main/resources/img/bishopW.png");
        }else{
            alfilImg = null;
            System.err.println("Error, ste color no existe");
            System.exit(1);
        }
        this.setImagen(alfilImg);
    }    
}
