/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author 57301
 */
public interface Carga {
    
    public static BufferedImage cargaDeImagenes(String ruta){
         try {
            return ImageIO.read(Carga.class.getResource(ruta));
        } catch (IOException ex) {
            System.out.println("Visual Error");
            return null;
        }
    }
     public static Clip cargaDeSonidos(String ruta){
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Carga.class.getResource(ruta)));
            return clip;
        } catch (LineUnavailableException ex) {  
            return null;
        } catch (UnsupportedAudioFileException ex) {
            return null;
        } catch (IOException ex) {
            System.out.println("ERROR DE AUDIO");
            return null;
        }
    }

    
}
