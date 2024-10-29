/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.ajedrez.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Yuliana
 */
public class ControladorJuego implements MouseListener {

   

    @Override
    public void mouseClicked(MouseEvent evento) {
        //JOptionPane.showMessageDialog(null,"Presiono clik en X="+evento.getX()+" Y="+evento.getY());
        System.out.println("Presiono clik en X=" + evento.getX() + " Y=" + evento.getY());
        
        //Buscar la posicion 
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
