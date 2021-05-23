/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;

/**
 *
 * @author 57301
 */
public class Imagen {

    public static BufferedImage logo;
    public static BufferedImage sonidoOn;
    public static BufferedImage sonidoOff;
    public static Clip dados;
    public static Clip musicaF1;
    public static Clip musicaF2;
    public static Clip musicaF3;
    public static Clip seleccion;
    public static Clip posiciones;

    public static void init() {
        logo = Carga.cargaDeImagenes("/logo/logo.png");
        sonidoOn = Carga.cargaDeImagenes("/logo/iconoCon.png");
        sonidoOff = Carga.cargaDeImagenes("/logo/iconoSIn.png");
        dados = Carga.cargaDeSonidos("/music/dadosSound.wav");
        musicaF1 = Carga.cargaDeSonidos("/music/tablero1.wav");
        musicaF2 = Carga.cargaDeSonidos("/music/tablero2.wav");
        musicaF3 = Carga.cargaDeSonidos("/music/tablero3.wav");
        seleccion = Carga.cargaDeSonidos("/music/opcion.wav");
        posiciones = Carga.cargaDeSonidos("/music/ganadores.wav");
    }

}
