/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author olive
 */
public class InterrupcionesDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " abierta");
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Si pulsas aqui se cierra la ventana " + e.getWindow().getName());
        e.getWindow().dispose();

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " cerrada");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " minimizada");

        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()     + " activa (en uso)");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " desactivada (fuera de uso)");
        
    }
    
}
