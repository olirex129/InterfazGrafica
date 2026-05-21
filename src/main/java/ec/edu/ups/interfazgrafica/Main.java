/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.interfazgrafica;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import ec.edu.ups.interfazgrafica.clases.EsquemaRaton;
import ec.edu.ups.interfazgrafica.clases.EsquemaRatonCerrar;
import ec.edu.ups.interfazgrafica.clases.EsquemaRatonPe;
import ec.edu.ups.interfazgrafica.clases.InterrupcionesDeVentana;

/**
 *
 * @author olive
 */
public class Main {

    public static void main(String[] args) {
        
        /*
        MiVentana v1 = new MiVentana();
        MiVentana v2 = new MiVentana("Ventana2");
        MiVentana v3 = new MiVentana("Ventana3",400,200,100,500);
        */
        /*
        Button botonHold = new Button("Hold");
        
        //Creamos un FlowLayout el cual tiene la direccion que va a tener 
        //El panel 
        
        FlowLayout posicionamientoSecuencia = new FlowLayout(FlowLayout.CENTER);
        
        
        
        //Creamos un panel
        Panel miPanelGeneral = new Panel();
        
        Panel miPanel1 = new Panel(posicionamientoSecuencia);
        
        Panel miPanel2 = new Panel();
        
        Panel miPanelTitulo = new Panel();
        //Creamos una ventana nueameva
        
        Frame miVentana = new Frame();
        //Creamos un boton nuevo
        
        Button botonHola = new Button("TITULO");
        Button botonQueHace = new Button("Que Hace");
        Button botonCama = new Button("Cama");
        Button botonDormir = new Button("domir");
        
        //Agregamos propiedades a ventana
        
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botón");
        miVentana.setVisible(true);
        //añadimos el panel a la ventana
        
        miVentana.add(miPanelGeneral);
        //añadimos el boton al panel
        miPanelTitulo.add(botonHola);
        miPanel1.add(botonQueHace,BorderLayout.SOUTH);
        miPanel1.add(botonCama);
        miPanel1.add(botonDormir);
        miPanel2.add(botonDormir);
        miPanel2.add(botonHold);
        
        //añadir paneles a paneles
        miPanelGeneral.add(miPanelTitulo,BorderLayout.NORTH);
        miPanelGeneral.add(miPanel2,BorderLayout.CENTER);
        miPanelGeneral.add(miPanel1);
        */
       
        Frame miVentana = new Frame("Esquema de eventos");
        Panel miPanel = new Panel();
        Button botonHola = new Button("OPCION 1");
        Button botonAdios = new Button("SALIR");
        Button botonPe = new Button("OPCION 2");
        miPanel.add(botonHola);
        miPanel.add(botonAdios); 
        miPanel.add(botonPe);
        miVentana.add(miPanel);
        miVentana.setSize(500, 150);
        miVentana.setVisible(true);
        
        botonHola.addMouseListener(new EsquemaRaton());
        
        botonAdios.addMouseListener(new EsquemaRatonCerrar());
        
        botonPe.addMouseListener(new EsquemaRatonPe());
        
        miVentana.addWindowListener(new InterrupcionesDeVentana());
        
        
        
        
        
        
        
        
    }
}
