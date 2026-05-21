/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazgrafica.clases;

/**
 *
 * @author olive
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class EsquemaRaton implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {
    Frame miMarco = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelMenuSur = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenu = new FlowLayout();
        Button botonOpcion1 = new Button("Opción 1");
        Button botonOpcion2 = new Button("Opción 2");
        Button botonOpcion3 = new Button("Opción 3");
        
        Button botonEste = new Button(" PRECIONA ESTO Y CERRRAR TODO CON * ");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");
        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenu);
        miMarco.add(panelGeneral);
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelGeneral.add(panelMenuSur,BorderLayout.SOUTH);
        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);
        miMarco.setSize(800, 150);
        miMarco.setTitle("Ventana con BorderLayout");
        miMarco.setVisible(true);
        
        Label titulo = new Label("ventana con etiquetas");
        
        panelMenuNorte.add(titulo);

        TextField nombre = new TextField(15);
        TextField apellidos = new TextField(35);
        TextField nacionalidad = new TextField("Chileno", 15);

        panelMenuNorte.add(nombre);
        panelMenuSur.add(apellidos);
        panelMenuSur.add(nacionalidad);
        // interrupcion de teclado
        botonEste.addKeyListener(new InterrupcionDeTeclado());
        // metodo interrupcion de ventana
        miMarco.addWindowListener(new InterrupcionesDeVentana());
}
@Override
public void mousePressed(MouseEvent evento) {
}
@Override
public void mouseReleased(MouseEvent evento) {
}
@Override
public void mouseEntered(MouseEvent evento) {
evento.getComponent().setBackground(Color.green);
    System.out.println("Entar a una ventana con muchas cosas");
}
@Override
public void mouseExited(MouseEvent evento) {
evento.getComponent().
setBackground(Color.gray);
    System.out.println("¿porque no quieres entrar a otra ventana?");
}

}
