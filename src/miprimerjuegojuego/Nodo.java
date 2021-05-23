/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author 57301
 */
public class Nodo {

    Nodo ptr;
    JLabel casilla;
    Nodo Link;
    int num;
    String descripcion;
    Nodo temp;
    boolean estado;

    public Nodo() {
        casilla = new JLabel();
    }

    public Nodo aggNodo(Nodo ptr, JLabel label, int num, boolean estado) {  
        //SE AGREGAN NODOS A LA LISTA PTR DE MANERA CIRCULAR, CADA NODO TIENE UNA CASILLA QUE ES UNA CELDA DEL TABLERO.
        Nodo p = ptr;
        Nodo q = new Nodo();
        q.casilla = label;
        q.num = num;
        q.estado = estado;
        if (ptr == null) {
            ptr = q;
            q.Link = ptr;
        } else {
            while (p.Link != ptr) {
                p = p.Link;
            }
            p.Link = q;
            q.Link = ptr;
        }
        return ptr;
    }

    public void mostrarNodos(Nodo ptr) {    //PARA CONFIRMAR QUE SE HICIERON LAS DEBIDAS AGREGACIONES A LA LISTA
                                               // SE PUEDE HABILITAR EN TABLERO GRÁFICO
        Nodo p = ptr;
        if (p == ptr) {
            System.out.println(p.casilla.getLocation() + " , " + p.casilla.getSize() + " , " + p.num + "," + p.estado);
            p = p.Link;
        }
        while (p != ptr) {
            System.out.println(p.casilla.getLocation() + " , " + p.casilla.getSize() + " , " + p.num);
            p = p.Link;
        }
    }

    public Nodo recorrerNodo(Nodo ptr, int num, int dado) { //SE RECIBE EL PTR DE LA LISTA QUE SE BUSCA RECORRER 
                                                             //Y EL NÚMERO HASTA DÓNDE LLEGARÁN LOS MOVIMIENTOS
        Nodo p = ptr;
        for (int i = 1; i <= num; i++) {
            p = p.Link;
        }
        return p;
    }

}
