/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author olive
 */
public class EsquemaRatonPe implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        Frame miVentana = new Frame("Prueba eventos de acción");
        Panel miPanel = new Panel(new GridLayout(3, 1));
        Button boton = new Button("Componente 1");
        boton.addFocusListener(new InterrupcionesDeEnfoque());
        TextField campoDeTexto = new TextField("Texto del campo 8");
        List lista = new List(3);
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");
        miPanel.add(boton);
        miPanel.add(campoDeTexto);
        miPanel.add(lista);
        boton.addActionListener(new InterrupcionesDeAccion());
        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());
        miVentana.add(miPanel);
        miVentana.setSize(400, 200);
        miVentana.setVisible(true);
        // para poder cerrar solo esta ventana con la x de la ventana
        miVentana.addWindowListener(new InterrupcionesDeVentana());

        // Otra ventana
        Frame ventana = new Frame("Prueba eventos de elemento");
        Panel panel = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        panel.add(diesel);
        panel.add(farosXenon);
        panel.add(llantasAleacion);
        panel.add(pinturaMetalizada);
        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        ventana.add(panel);
        ventana.setSize(400, 200);
        ventana.setVisible(true);
        
        ventana.addWindowListener(new InterrupcionesDeVentana());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.green);
        System.out.println("Entar a dos ventanas");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.gray);
        System.out.println("¿porque no quieres entrar a otra ventana?");

    }

}
