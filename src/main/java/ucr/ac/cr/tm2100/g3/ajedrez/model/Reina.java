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
public class Reina extends Pieza {

    public Reina(int x, int y, String color) {
        super(x, y, null, color);
        ImageIcon reinaImg;
        if (color.equalsIgnoreCase("negro")) {
            reinaImg = new ImageIcon("./src/main/resources/img/queenB.png");
        } else if (color.equalsIgnoreCase("blanco")) {
            reinaImg = new ImageIcon("./src/main/resources/img/queenW.png");
        } else {
            reinaImg = null;
            System.err.println("Error, este color no existe");
            System.exit(1);
        }
        this.setImagen(reinaImg);
    }

}
