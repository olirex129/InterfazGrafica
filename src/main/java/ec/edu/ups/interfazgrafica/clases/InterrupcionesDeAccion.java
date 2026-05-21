/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author olive
 */
public class InterrupcionesDeAccion implements ActionListener{
    @Override
public void actionPerformed(ActionEvent evento) {
Component componente = (Component) evento.getSource();
String accionRealizada = evento.getActionCommand();
System.out.println("Componente: " + componente.getName());
System.out.println("Suceso: " + accionRealizada);
System.out.println();
    
}
}
