/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author 57301
 */
public class Sounds {

    private Clip clip;
    private FloatControl volumen;

    public Sounds(Clip clip) {
        this.clip = clip;
        volumen = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
    }

    public int getFramePosition() {
        return clip.getFramePosition();
    }

    public void reproducir() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void fondo() {
        clip.setFramePosition(0);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void detener() {
        clip.stop();
    }

    public void cambioVolumen(float valor) {
        volumen.setValue(valor);
    }
}
