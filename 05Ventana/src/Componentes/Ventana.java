/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author demon
 */
public class Ventana extends JFrame implements ActionListener {
    
    //declaro los componentes de la ventana
    JLabel labelTitulo;
    private JPanel mipanelprincipal;
    private JPanel panelColor;
    private JButton botoncolor;
    private Color color;
    
    public Ventana(){
        iniciarComponentes();
        setTitle("Ventana de Ejemplo de Colores");
        setSize(550, 440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes() {
        mipanelprincipal = new JPanel();
        mipanelprincipal.setLayout(null);
        
        //ya tengo que empezar a agregar cada componente
        labelTitulo = new JLabel();
        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //aqui es donde tengo que programar por ejemplo agregar un ticket
    }

    
    
    
    
}
