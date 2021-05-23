/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//PRESENTADO POR WILLIAM PEREZ Y NATALIA MENDOZA
/**
 *
 * @author 57301
 */
public class MiPrimerJuegoJuego extends JFrame {
    Menu m ;
        
    public MiPrimerJuegoJuego(){
        Imagen.init();
        m = new Menu();
        m.setIconImage(Imagen.logo);
        m.setTitle("CAMINO ESPACIAL");
        m.setResizable(false);
        m.setLocation(410,150);
        m.setSize(633, 390);
        m.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MiPrimerJuegoJuego juego = new MiPrimerJuegoJuego();
        
    }
}
