/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author olive
 */
public class EsquemaRatonCerrar implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e){
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    e.getComponent().setBackground(Color.red);
    System.out.println("¿quieres salir de TODO?");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.gray);
    }
    
    
}
