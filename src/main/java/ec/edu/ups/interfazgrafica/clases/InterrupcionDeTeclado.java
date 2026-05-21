/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author olive
 */
public class InterrupcionDeTeclado extends KeyAdapter{
@Override
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
    if (e.getKeyChar() == '*') {
        System.exit(0);
        }
    }

}
    
