/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author olive
 */
public class InterrupcionesDeEnfoque implements FocusListener {

    @Override
    public void focusGained(FocusEvent Evento) {
        System.out.println("Se ha entrado en el componente");
    }

    @Override
    public void focusLost(FocusEvent Evento) {
        System.out.println("Se ha salido del componente");
    }
}
