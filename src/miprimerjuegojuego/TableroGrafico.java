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
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author 57301
 */
public class TableroGrafico extends javax.swing.JFrame {

    Nodo ptr;
    Nodo ptr1;
    Nodo ptr2;
    Nodo ptr3;
    Nodo p = new Nodo();
    Nodo j1 = new Nodo();
    Nodo j2 = new Nodo();
    Nodo j3 = new Nodo();
    int cont = 0;
    int acum = 0;
    int acum2 = 0;
    int acum3 = 0;
    int sw1 = 0;
    int sw2 = 0;
    int sw3 = 0;
    int contGanadores = 0;
    boolean g1 = false, g2 = false, g3 = false;
    boolean carcel = false, carcel2 = false, carcel3 = false;
    int cont1LanzamientoCarcel = 0, cont2LanzamientoCarcel = 0, cont3LanzamientoCarcel = 0;
    int cont16 = 0, cont26 = 0, cont36 = 0;
    int mayor = -1, medio = -1, menor = -1;
    Ganadores g = new Ganadores();
    JLabel gMayor = new JLabel();
    JLabel gMedio = new JLabel();
    JLabel gMenor = new JLabel();
    String colorMayor = null, colorMedio = null, colorMenor = null;
    Sounds dados;
    Sounds fSound;
    int sw = 0;
    int swSound = 0;
    Color temp = null;
    int prision1 = 0, prision2 = 0, prision3 = 0;

    /**
     * Creates new form TableroGrafico
     */
    public TableroGrafico() {
        initComponents();
        Imagen.init();
        //mostrarFondo();
        ptr = null;
        aggCasillaALista();
        mostrarDado();
        soundButton();
        ptr1 = ptr;
        ptr2 = ptr;
        ptr3 = ptr;
        turno.setVisible(false);
        prision.setVisible(false);
        dados = new Sounds(Imagen.dados);
    }

    private void soundButton() {
        ImageIcon volumen = new ImageIcon(getClass().getResource("/logo/iconoCon.png"));
        Icon s = new ImageIcon(volumen.getImage().getScaledInstance(sonido.getWidth(), sonido.getHeight(), Image.SCALE_AREA_AVERAGING));
        sonido.setIcon(s);
        sonido.setHorizontalAlignment(SwingConstants.CENTER);
        this.repaint();
        temp = sonido.getBackground();
    }

    public void aggCasillaALista() {//Agregando nodos a la lista para poder hacer los movimientos.
        ptr = p.aggNodo(ptr, casilla0, 0, true);
        ptr = p.aggNodo(ptr, casilla1, 1, false);
        ptr = p.aggNodo(ptr, casilla2, 2, false);
        ptr = p.aggNodo(ptr, casilla3, 3, false);
        ptr = p.aggNodo(ptr, casilla4, 4, false);
        ptr = p.aggNodo(ptr, casilla5, 5, false);
        ptr = p.aggNodo(ptr, casilla6, 6, false);
        ptr = p.aggNodo(ptr, casilla7, 7, false);
        ptr = p.aggNodo(ptr, casilla8, 8, false);
        ptr = p.aggNodo(ptr, casilla9, 9, false);
        ptr = p.aggNodo(ptr, casilla10, 10, false);
        ptr = p.aggNodo(ptr, casilla11, 11, false);
        ptr = p.aggNodo(ptr, casilla12, 12, false);
        ptr = p.aggNodo(ptr, casilla13, 13, false);
        ptr = p.aggNodo(ptr, casilla14, 14, false);
        ptr = p.aggNodo(ptr, casilla15, 15, false);
        ptr = p.aggNodo(ptr, casilla16, 16, false);
        ptr = p.aggNodo(ptr, casilla17, 17, false);
        ptr = p.aggNodo(ptr, casilla18, 18, false);
        ptr = p.aggNodo(ptr, casilla19, 19, false);
        ptr = p.aggNodo(ptr, casilla20, 20, false);
        ptr = p.aggNodo(ptr, casilla21, 21, false);
        ptr = p.aggNodo(ptr, casilla22, 22, false);
        ptr = p.aggNodo(ptr, casilla23, 23, false);
        ptr = p.aggNodo(ptr, casilla24, 24, false);
        ptr = p.aggNodo(ptr, casilla25, 25, false);
        ptr = p.aggNodo(ptr, casilla26, 26, false);
        ptr = p.aggNodo(ptr, casilla27, 27, false);
        ptr = p.aggNodo(ptr, casilla28, 28, false);
        ptr = p.aggNodo(ptr, casilla29, 29, false);
        ptr = p.aggNodo(ptr, casilla30, 30, false);
        ptr = p.aggNodo(ptr, casilla31, 31, false);
        ptr = p.aggNodo(ptr, casilla32, 32, false);
        ptr = p.aggNodo(ptr, casilla33, 33, false);
        ptr = p.aggNodo(ptr, casilla34, 34, false);
        ptr = p.aggNodo(ptr, casilla35, 35, false);
        // p.mostrarNodos(ptr);
    }

    public void recibirJugador1(int sw) {
        Icon jug1;
        switch (sw) {
            case 1:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                jug1 = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(jugador1.getWidth(), jugador1.getHeight(), Image.SCALE_DEFAULT));
                jugador1.setIcon(jug1);
                jugador1.setBackground(Color.yellow);
                this.repaint();
                break;
            case 2:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                jug1 = new ImageIcon(jugadorAzul.getImage().getScaledInstance(jugador1.getWidth(), jugador1.getHeight(), Image.SCALE_DEFAULT));
                jugador1.setIcon(jug1);
                jugador1.setBackground(Color.blue);
                this.repaint();
                break;
            case 3:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                jug1 = new ImageIcon(jugadorVerde.getImage().getScaledInstance(jugador1.getWidth(), jugador1.getHeight(), Image.SCALE_DEFAULT));
                jugador1.setIcon(jug1);
                jugador1.setBackground(Color.green);
                this.repaint();
                break;
            case 4:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                jug1 = new ImageIcon(jugadorRojo.getImage().getScaledInstance(jugador1.getWidth(), jugador1.getHeight(), Image.SCALE_DEFAULT));
                jugador1.setIcon(jug1);
                jugador1.setBackground(Color.red);
                this.repaint();
                break;
        }
    }

    public void recibirJugador2(int sw) {
        Icon jug2;
        switch (sw) {
            case 1:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                jug2 = new ImageIcon(jugadorAzul.getImage().getScaledInstance(jugador2.getWidth(), jugador2.getHeight(), Image.SCALE_DEFAULT));
                jugador2.setIcon(jug2);
                jugador2.setBackground(Color.blue);
                this.repaint();
                break;
            case 2:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                jug2 = new ImageIcon(jugadorVerde.getImage().getScaledInstance(jugador2.getWidth(), jugador2.getHeight(), Image.SCALE_DEFAULT));
                jugador2.setIcon(jug2);
                jugador2.setBackground(Color.green);
                this.repaint();
                break;
            case 3:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                jug2 = new ImageIcon(jugadorRojo.getImage().getScaledInstance(jugador2.getWidth(), jugador2.getHeight(), Image.SCALE_DEFAULT));
                jugador2.setIcon(jug2);
                jugador2.setBackground(Color.red);
                this.repaint();
                break;
            case 4:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                jug2 = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(jugador2.getWidth(), jugador2.getHeight(), Image.SCALE_DEFAULT));
                jugador2.setIcon(jug2);
                jugador2.setBackground(Color.yellow);
                this.repaint();
                break;
        }
    }

    public void recibirJugador3(int sw) {
        Icon jug3;
        switch (sw) {
            case 1:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                jug3 = new ImageIcon(jugadorVerde.getImage().getScaledInstance(jugador3.getWidth(), jugador3.getHeight(), Image.SCALE_DEFAULT));
                jugador3.setIcon(jug3);
                jugador3.setBackground(Color.green);
                this.repaint();
                break;
            case 2:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                jug3 = new ImageIcon(jugadorRojo.getImage().getScaledInstance(jugador3.getWidth(), jugador3.getHeight(), Image.SCALE_DEFAULT));
                jugador3.setIcon(jug3);
                jugador3.setBackground(Color.red);
                this.repaint();
                break;
            case 3:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                jug3 = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(jugador3.getWidth(), jugador3.getHeight(), Image.SCALE_DEFAULT));
                jugador3.setIcon(jug3);
                jugador3.setBackground(Color.yellow);
                this.repaint();
                break;
            case 4:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                jug3 = new ImageIcon(jugadorAzul.getImage().getScaledInstance(jugador3.getWidth(), jugador3.getHeight(), Image.SCALE_DEFAULT));
                jugador3.setIcon(jug3);
                jugador3.setBackground(Color.blue);
                this.repaint();
                break;
        }
    }

    public void recibirFondo(int sw) {
        switch (sw) {
            case 1:
                casilla0.setForeground(Color.white);
                casilla0.setBackground(Color.gray);
                ImageIcon fondo1 = new ImageIcon(getClass().getResource("/fondo/1.png"));
                Icon f1 = new ImageIcon(fondo1.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
                this.fondo.setIcon(f1);
                this.repaint();
                fSound = new Sounds(Imagen.musicaF1);
                fSound.fondo();
                fSound.cambioVolumen(-20f);
                break;

            case 2:
                ImageIcon fondo2 = new ImageIcon(getClass().getResource("/fondo/2.jpg"));
                Icon f2 = new ImageIcon(fondo2.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
                this.fondo.setIcon(f2);
                this.repaint();
                fSound = new Sounds(Imagen.musicaF2);
                fSound.fondo();
                fSound.cambioVolumen(-15f);
                break;

            case 3:
                casilla0.setForeground(Color.black);
                casilla0.setBackground(Color.white.darker());
                ImageIcon fondo3 = new ImageIcon(getClass().getResource("/fondo/3.jpg"));
                Icon f3 = new ImageIcon(fondo3.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
                this.fondo.setIcon(f3);
                this.repaint();
                fSound = new Sounds(Imagen.musicaF3);
                fSound.fondo();
                fSound.cambioVolumen(-20f);
                break;
        }
    }

    public void mostrarDado() {
        ImageIcon caraDado = new ImageIcon(getClass().getResource("/dado/dado1.png"));
        Icon cara = new ImageIcon(caraDado.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
        dado.setIcon(cara);
        this.repaint();
    }

    public void mostrarJugadores() {
        ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
        Icon jug1 = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(jugador1.getWidth(), jugador1.getHeight(), Image.SCALE_DEFAULT));
        jugador1.setIcon(jug1);
        this.repaint();

        ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
        Icon jug2 = new ImageIcon(jugadorAzul.getImage().getScaledInstance(jugador2.getWidth(), jugador2.getHeight(), Image.SCALE_DEFAULT));
        jugador2.setIcon(jug2);
        this.repaint();

        ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
        Icon jug3 = new ImageIcon(jugadorRojo.getImage().getScaledInstance(jugador3.getWidth(), jugador3.getHeight(), Image.SCALE_DEFAULT));
        jugador3.setIcon(jug3);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Piso = new javax.swing.JPanel();
        dado = new javax.swing.JButton();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        sonido = new javax.swing.JButton();
        prision = new javax.swing.JLabel();
        casilla0 = new javax.swing.JLabel();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla3 = new javax.swing.JLabel();
        casilla4 = new javax.swing.JLabel();
        casilla5 = new javax.swing.JLabel();
        casilla6 = new javax.swing.JLabel();
        casilla7 = new javax.swing.JLabel();
        casilla8 = new javax.swing.JLabel();
        casilla9 = new javax.swing.JLabel();
        casilla10 = new javax.swing.JLabel();
        casilla11 = new javax.swing.JLabel();
        casilla12 = new javax.swing.JLabel();
        casilla13 = new javax.swing.JLabel();
        casilla14 = new javax.swing.JLabel();
        casilla15 = new javax.swing.JLabel();
        casilla16 = new javax.swing.JLabel();
        casilla17 = new javax.swing.JLabel();
        casilla18 = new javax.swing.JLabel();
        casilla19 = new javax.swing.JLabel();
        casilla20 = new javax.swing.JLabel();
        casilla21 = new javax.swing.JLabel();
        casilla22 = new javax.swing.JLabel();
        casilla23 = new javax.swing.JLabel();
        casilla24 = new javax.swing.JLabel();
        casilla25 = new javax.swing.JLabel();
        casilla26 = new javax.swing.JLabel();
        casilla27 = new javax.swing.JLabel();
        casilla28 = new javax.swing.JLabel();
        casilla29 = new javax.swing.JLabel();
        casilla30 = new javax.swing.JLabel();
        casilla31 = new javax.swing.JLabel();
        casilla32 = new javax.swing.JLabel();
        casilla33 = new javax.swing.JLabel();
        casilla34 = new javax.swing.JLabel();
        casilla35 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Piso.setBackground(new java.awt.Color(153, 153, 153));
        Piso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Piso.setOpaque(false);
        Piso.setLayout(null);

        dado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dado.setBorderPainted(false);
        dado.setContentAreaFilled(false);
        dado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadoMouseClicked(evt);
            }
        });
        dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoActionPerformed(evt);
            }
        });
        Piso.add(dado);
        dado.setBounds(690, 160, 200, 170);

        jugador1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jugador1.setForeground(new java.awt.Color(255, 255, 255));
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jugador1.setText("1");
        Piso.add(jugador1);
        jugador1.setBounds(140, 480, 50, 50);

        jugador2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jugador2.setForeground(new java.awt.Color(255, 255, 255));
        jugador2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jugador2.setText("2");
        Piso.add(jugador2);
        jugador2.setBounds(140, 420, 50, 50);

        jugador3.setBackground(new java.awt.Color(255, 255, 255));
        jugador3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jugador3.setForeground(new java.awt.Color(255, 255, 255));
        jugador3.setText("3");
        jugador3.setToolTipText("");
        Piso.add(jugador3);
        jugador3.setBounds(140, 360, 50, 50);

        turno.setBackground(new java.awt.Color(0, 0, 0));
        turno.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setText("jLabel1");
        turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        turno.setOpaque(true);
        Piso.add(turno);
        turno.setBounds(210, 210, 280, 40);

        sonido.setBackground(new java.awt.Color(188, 72, 239));
        sonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonidoActionPerformed(evt);
            }
        });
        Piso.add(sonido);
        sonido.setBounds(540, 210, 100, 90);

        prision.setBackground(new java.awt.Color(0, 0, 0));
        prision.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        prision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prision.setText("jLabel1");
        prision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prision.setOpaque(true);
        Piso.add(prision);
        prision.setBounds(240, 260, 220, 40);

        getContentPane().add(Piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1100, 550));

        casilla0.setBackground(new java.awt.Color(0, 0, 0));
        casilla0.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla0.setForeground(new java.awt.Color(255, 255, 255));
        casilla0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla0.setText("META");
        casilla0.setAutoscrolls(true);
        casilla0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla0.setOpaque(true);
        getContentPane().add(casilla0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 200));

        casilla1.setBackground(new java.awt.Color(113, 45, 144));
        casilla1.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla1.setForeground(new java.awt.Color(255, 255, 255));
        casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla1.setText("1");
        casilla1.setAutoscrolls(true);
        casilla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla1.setOpaque(true);
        getContentPane().add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 100, 50));

        casilla2.setBackground(new java.awt.Color(113, 45, 144));
        casilla2.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla2.setForeground(new java.awt.Color(255, 255, 255));
        casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla2.setText("2");
        casilla2.setAutoscrolls(true);
        casilla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla2.setOpaque(true);
        getContentPane().add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 100, 50));

        casilla3.setBackground(new java.awt.Color(113, 45, 144));
        casilla3.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla3.setForeground(new java.awt.Color(255, 255, 255));
        casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla3.setText("3");
        casilla3.setAutoscrolls(true);
        casilla3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla3.setFocusable(true
        );
        casilla3.setOpaque(true);
        getContentPane().add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 100, 50));

        casilla4.setBackground(new java.awt.Color(113, 45, 144));
        casilla4.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla4.setForeground(new java.awt.Color(255, 255, 255));
        casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla4.setText("4");
        casilla4.setAutoscrolls(true);
        casilla4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla4.setOpaque(true);
        getContentPane().add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 100, 50));

        casilla5.setBackground(new java.awt.Color(113, 45, 144));
        casilla5.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla5.setForeground(new java.awt.Color(255, 255, 255));
        casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla5.setText("5");
        casilla5.setAutoscrolls(true);
        casilla5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla5.setFocusable(true
        );
        casilla5.setOpaque(true);
        getContentPane().add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 100, 50));

        casilla6.setBackground(new java.awt.Color(113, 45, 144));
        casilla6.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla6.setForeground(new java.awt.Color(255, 255, 255));
        casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla6.setText("6");
        casilla6.setAutoscrolls(true);
        casilla6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla6.setOpaque(true);
        getContentPane().add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 100, 50));

        casilla7.setBackground(new java.awt.Color(113, 45, 144));
        casilla7.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla7.setForeground(new java.awt.Color(255, 255, 255));
        casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla7.setText("7");
        casilla7.setAutoscrolls(true);
        casilla7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla7.setOpaque(true);
        getContentPane().add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 100, 50));

        casilla8.setBackground(new java.awt.Color(113, 45, 144));
        casilla8.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla8.setForeground(new java.awt.Color(255, 255, 255));
        casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla8.setText("8");
        casilla8.setAutoscrolls(true);
        casilla8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla8.setOpaque(true);
        getContentPane().add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 100, 50));

        casilla9.setBackground(new java.awt.Color(113, 45, 144));
        casilla9.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla9.setForeground(new java.awt.Color(255, 255, 255));
        casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla9.setText("9");
        casilla9.setAutoscrolls(true);
        casilla9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla9.setOpaque(true);
        getContentPane().add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, 100, 50));

        casilla10.setBackground(new java.awt.Color(113, 45, 144));
        casilla10.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla10.setForeground(new java.awt.Color(255, 255, 255));
        casilla10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla10.setText("10");
        casilla10.setAutoscrolls(true);
        casilla10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla10.setOpaque(true);
        getContentPane().add(casilla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 100, 50));

        casilla11.setBackground(new java.awt.Color(113, 45, 144));
        casilla11.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla11.setForeground(new java.awt.Color(255, 255, 255));
        casilla11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla11.setText("11");
        casilla11.setAutoscrolls(true);
        casilla11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla11.setOpaque(true);
        getContentPane().add(casilla11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 100, 50));

        casilla12.setBackground(new java.awt.Color(113, 45, 144));
        casilla12.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla12.setForeground(new java.awt.Color(255, 255, 255));
        casilla12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla12.setText("12");
        casilla12.setAutoscrolls(true);
        casilla12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla12.setFocusable(true
        );
        casilla12.setOpaque(true);
        getContentPane().add(casilla12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 100, 50));

        casilla13.setBackground(new java.awt.Color(113, 45, 144));
        casilla13.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla13.setForeground(new java.awt.Color(255, 255, 255));
        casilla13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla13.setText("13");
        casilla13.setAutoscrolls(true);
        casilla13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla13.setOpaque(true);
        getContentPane().add(casilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 100, 50));

        casilla14.setBackground(new java.awt.Color(113, 45, 144));
        casilla14.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla14.setForeground(new java.awt.Color(255, 255, 255));
        casilla14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla14.setText("14");
        casilla14.setAutoscrolls(true);
        casilla14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla14.setOpaque(true);
        getContentPane().add(casilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 100, 50));

        casilla15.setBackground(new java.awt.Color(113, 45, 144));
        casilla15.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla15.setForeground(new java.awt.Color(255, 255, 255));
        casilla15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla15.setText("15");
        casilla15.setAutoscrolls(true);
        casilla15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla15.setOpaque(true);
        getContentPane().add(casilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 100, 50));

        casilla16.setBackground(new java.awt.Color(113, 45, 144));
        casilla16.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla16.setForeground(new java.awt.Color(255, 255, 255));
        casilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla16.setText("16");
        casilla16.setAutoscrolls(true);
        casilla16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla16.setOpaque(true);
        getContentPane().add(casilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 100, 50));

        casilla17.setBackground(new java.awt.Color(113, 45, 144));
        casilla17.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla17.setForeground(new java.awt.Color(255, 255, 255));
        casilla17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla17.setText("17");
        casilla17.setAutoscrolls(true);
        casilla17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla17.setOpaque(true);
        getContentPane().add(casilla17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 100, 50));

        casilla18.setBackground(new java.awt.Color(113, 45, 144));
        casilla18.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla18.setForeground(new java.awt.Color(255, 255, 255));
        casilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla18.setText("18");
        casilla18.setAutoscrolls(true);
        casilla18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla18.setOpaque(true);
        getContentPane().add(casilla18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 100, 50));

        casilla19.setBackground(new java.awt.Color(113, 45, 144));
        casilla19.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla19.setForeground(new java.awt.Color(255, 255, 255));
        casilla19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla19.setText("19");
        casilla19.setAutoscrolls(true);
        casilla19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla19.setFocusable(true
        );
        casilla19.setOpaque(true);
        getContentPane().add(casilla19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 100, 50));

        casilla20.setBackground(new java.awt.Color(113, 45, 144));
        casilla20.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla20.setForeground(new java.awt.Color(255, 255, 255));
        casilla20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla20.setText("20");
        casilla20.setAutoscrolls(true);
        casilla20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla20.setOpaque(true);
        getContentPane().add(casilla20, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 100, 50));

        casilla21.setBackground(new java.awt.Color(113, 45, 144));
        casilla21.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla21.setForeground(new java.awt.Color(255, 255, 255));
        casilla21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla21.setText("21");
        casilla21.setAutoscrolls(true);
        casilla21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla21.setOpaque(true);
        getContentPane().add(casilla21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 100, 50));

        casilla22.setBackground(new java.awt.Color(113, 45, 144));
        casilla22.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla22.setForeground(new java.awt.Color(255, 255, 255));
        casilla22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla22.setText("22");
        casilla22.setAutoscrolls(true);
        casilla22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla22.setOpaque(true);
        getContentPane().add(casilla22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 100, 50));

        casilla23.setBackground(new java.awt.Color(113, 45, 144));
        casilla23.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla23.setForeground(new java.awt.Color(255, 255, 255));
        casilla23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla23.setText("23");
        casilla23.setAutoscrolls(true);
        casilla23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla23.setFocusable(true
        );
        casilla23.setName(""); // NOI18N
        casilla23.setOpaque(true);
        getContentPane().add(casilla23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 100, 50));

        casilla24.setBackground(new java.awt.Color(113, 45, 144));
        casilla24.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla24.setForeground(new java.awt.Color(255, 255, 255));
        casilla24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla24.setText("24");
        casilla24.setAutoscrolls(true);
        casilla24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla24.setName(""); // NOI18N
        casilla24.setOpaque(true);
        getContentPane().add(casilla24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, 50));

        casilla25.setBackground(new java.awt.Color(113, 45, 144));
        casilla25.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla25.setForeground(new java.awt.Color(255, 255, 255));
        casilla25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla25.setText("25");
        casilla25.setAutoscrolls(true);
        casilla25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla25.setName(""); // NOI18N
        casilla25.setOpaque(true);
        getContentPane().add(casilla25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 100, 50));

        casilla26.setBackground(new java.awt.Color(113, 45, 144));
        casilla26.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla26.setForeground(new java.awt.Color(255, 255, 255));
        casilla26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla26.setText("26");
        casilla26.setAutoscrolls(true);
        casilla26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla26.setFocusable(true
        );
        casilla26.setName(""); // NOI18N
        casilla26.setOpaque(true);
        getContentPane().add(casilla26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 100, 50));

        casilla27.setBackground(new java.awt.Color(113, 45, 144));
        casilla27.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla27.setForeground(new java.awt.Color(255, 255, 255));
        casilla27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla27.setText("27");
        casilla27.setAutoscrolls(true);
        casilla27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla27.setName(""); // NOI18N
        casilla27.setOpaque(true);
        getContentPane().add(casilla27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 50));

        casilla28.setBackground(new java.awt.Color(113, 45, 144));
        casilla28.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla28.setForeground(new java.awt.Color(255, 255, 255));
        casilla28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla28.setText("28");
        casilla28.setAutoscrolls(true);
        casilla28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla28.setName(""); // NOI18N
        casilla28.setOpaque(true);
        getContentPane().add(casilla28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 50));

        casilla29.setBackground(new java.awt.Color(113, 45, 144));
        casilla29.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla29.setForeground(new java.awt.Color(255, 255, 255));
        casilla29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla29.setText("29");
        casilla29.setAutoscrolls(true);
        casilla29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla29.setFocusable(true
        );
        casilla29.setName(""); // NOI18N
        casilla29.setOpaque(true);
        getContentPane().add(casilla29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 50));

        casilla30.setBackground(new java.awt.Color(113, 45, 144));
        casilla30.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla30.setForeground(new java.awt.Color(255, 255, 255));
        casilla30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla30.setText("30");
        casilla30.setAutoscrolls(true);
        casilla30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla30.setFocusable(true
        );
        casilla30.setName(""); // NOI18N
        casilla30.setOpaque(true);
        getContentPane().add(casilla30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 50));

        casilla31.setBackground(new java.awt.Color(113, 45, 144));
        casilla31.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla31.setForeground(new java.awt.Color(255, 255, 255));
        casilla31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla31.setText("31");
        casilla31.setAutoscrolls(true);
        casilla31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla31.setName(""); // NOI18N
        casilla31.setOpaque(true);
        getContentPane().add(casilla31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 50));

        casilla32.setBackground(new java.awt.Color(113, 45, 144));
        casilla32.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla32.setForeground(new java.awt.Color(255, 255, 255));
        casilla32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla32.setText("32");
        casilla32.setAutoscrolls(true);
        casilla32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla32.setName(""); // NOI18N
        casilla32.setOpaque(true);
        getContentPane().add(casilla32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 50));

        casilla33.setBackground(new java.awt.Color(113, 45, 144));
        casilla33.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla33.setForeground(new java.awt.Color(255, 255, 255));
        casilla33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla33.setText("33");
        casilla33.setAutoscrolls(true);
        casilla33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla33.setName(""); // NOI18N
        casilla33.setOpaque(true);
        getContentPane().add(casilla33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 50));

        casilla34.setBackground(new java.awt.Color(113, 45, 144));
        casilla34.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla34.setForeground(new java.awt.Color(255, 255, 255));
        casilla34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla34.setText("34");
        casilla34.setAutoscrolls(true);
        casilla34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla34.setName(""); // NOI18N
        casilla34.setOpaque(true);
        getContentPane().add(casilla34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 50));

        casilla35.setBackground(new java.awt.Color(113, 45, 144));
        casilla35.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        casilla35.setForeground(new java.awt.Color(255, 255, 255));
        casilla35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla35.setText("35");
        casilla35.setAutoscrolls(true);
        casilla35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla35.setName(""); // NOI18N
        casilla35.setOpaque(true);
        getContentPane().add(casilla35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 50));

        fondo.setBackground(new java.awt.Color(0, 102, 153));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadoMouseClicked
        int tirada = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);  // Valor entre M y N, ambos incluidos.
        int i = tirada;
        switch (tirada) {
            case 1:
                dados.reproducir();
                mostrarDado();
                System.out.println("1");
                break;
            case 2:
                dados.reproducir();
                ImageIcon caraDado2 = new ImageIcon(getClass().getResource("/dado/dado2.png"));
                Icon cara2 = new ImageIcon(caraDado2.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
                dado.setIcon(cara2);
                this.repaint();
                System.out.println("2");
                break;
            case 3:
                dados.reproducir();
                ImageIcon caraDado3 = new ImageIcon(getClass().getResource("/dado/dado3.png"));
                Icon cara3 = new ImageIcon(caraDado3.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
                dado.setIcon(cara3);
                this.repaint();
                System.out.println("3");
                break;
            case 4:
                dados.reproducir();
                ImageIcon caraDado4 = new ImageIcon(getClass().getResource("/dado/dado4.png"));
                Icon cara4 = new ImageIcon(caraDado4.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
                dado.setIcon(cara4);
                this.repaint();
                System.out.println("4");
                break;
            case 5:
                dados.reproducir();
                ImageIcon caraDado5 = new ImageIcon(getClass().getResource("/dado/dado5.png"));
                Icon cara5 = new ImageIcon(caraDado5.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
                dado.setIcon(cara5);
                this.repaint();
                System.out.println("5");
                break;
            case 6:
                dados.reproducir();
                ImageIcon caraDado6 = new ImageIcon(getClass().getResource("/dado/dado6.png"));
                Icon cara6 = new ImageIcon(caraDado6.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_AREA_AVERAGING));
                dado.setIcon(cara6);
                this.repaint();
                System.out.println("6");
                break;

        }

        switch (cont) {
            case 0:
                turno.setForeground(jugador1.getBackground());
                if (carcel) {
                    prision.setText("JUGADOR " + (cont + 1) + " EN CÁRCEL");
                    prision.setForeground(jugador1.getBackground());
                    prision.setVisible(true);
                } else {
                    prision.setVisible(false);
                }

                break;
            case 1:
                turno.setForeground(jugador2.getBackground());
                if (carcel2) {
                    prision.setText("JUGADOR " + (cont + 1) + " EN CÁRCEL");
                    prision.setForeground(jugador2.getBackground());
                    prision.setVisible(true);
                } else {
                    prision.setVisible(false);
                }

                break;
            case 2:
                turno.setForeground(jugador3.getBackground());
                if (carcel3) {
                    prision.setText("JUGADOR " + (cont + 1) + " EN CÁRCEL");
                    prision.setForeground(jugador3.getBackground());
                    prision.setVisible(true);
                } else {
                    prision.setVisible(false);
                }
                break;
        }

        moverse(i);
    }//GEN-LAST:event_dadoMouseClicked

    private void sonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonidoActionPerformed
        swSound++;
        if (swSound % 2 != 0) {
            ImageIcon volumen = new ImageIcon(getClass().getResource("/logo/iconoSIn.png"));
            Icon s = new ImageIcon(volumen.getImage().getScaledInstance(sonido.getWidth(), sonido.getHeight(), Image.SCALE_AREA_AVERAGING));
            sonido.setIcon(s);
            sonido.setHorizontalAlignment(SwingConstants.CENTER);
            sonido.setBackground(temp);
            this.repaint();
            fSound.detener();
        } else {
            soundButton();
            sonido.setBackground(temp);
            this.repaint();
            fSound.fondo();
        }
    }//GEN-LAST:event_sonidoActionPerformed

    private void dadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoActionPerformed

    }//GEN-LAST:event_dadoActionPerformed

    public void moverse(int i) {
        turno.setVisible(true);
        turno.setText("TURNO DEL JUGADOR " + (cont + 1));
        Point casillaTemp;
        switch (cont) {
            case 0:
                if (!g1) {
                    acum += i;
                    if (acum <= 36) {//Valida que no se pase el acumulador

                        if (cont16 < 3) { //VALIDA QUE SOLO SI NO HA GANADO, JUEGUE

                            if (!carcel) {   //VALIDA QUE EL JUGADOR NO ESTÉ EN LA CARCEL 
                                System.out.println("acum 1 " + acum);
                                ptr1 = j1.recorrerNodo(ptr, acum, i);
                                casillaTemp = ptr1.casilla.getLocation();

                                jugador1.setLocation((int) casillaTemp.x, (int) casillaTemp.y - 30);
                                if (!g2) {
                                    cont = 1;
                                } else if (!g3) {
                                    cont = 2;
                                } else {
                                    if (sw == 0) {
                                        sw++;
                                        cont = 0;
                                        acum -= i;
                                        moverse(i);
                                    } else {
                                        mostrarGanadores();
                                    }

                                }

                                if (ptr1.equals(ptr2) && !g2) { //SE MANDA A LA CARCEL AL QUE ESTÉ EN LA CASILLA PREVIAMENTE
                                    jugador2.setLocation(140, 420);
                                    acum2 = 0;
                                    carcel2 = true;
                                    System.out.println("EN LA CÁRCEL SE ENCUENTRA EL JUGADOR 2");
                                }

                                if (ptr1.equals(ptr3) && !g3) {
                                    jugador3.setLocation(140, 360);
                                    acum3 = 0;
                                    carcel3 = true;
                                    System.out.println("EN LA CÁRCEL SE ENCUENTRA EL JUGADOR 3");
                                }

                                if (acum == 36) { //LO VUELVE GANADOR
                                    jugador1.setLocation((int) casilla0.getLocation().x, 480);
                                    g1 = true;
                                    contGanadores++;
                                    if (contGanadores == 2) {
                                        g.lugar2.setIcon(g.setIconJug2(jugador1.getBackground().getRGB()));
                                        // mostrarGanadores();
                                    } else if (contGanadores == 1) {
                                        g.ganador.setIcon(g.setIconJug1(jugador1.getBackground().getRGB()));
                                    }
                                }

                                if (i == 6) {
                                    cont = 0;
                                    cont16++;
                                } else {
                                    cont16 = 0;
                                }

                            } else {    //VALIDAR LA SALIDA DE LA CARCEL
                                if (cont1LanzamientoCarcel <= 3) {

                                    if (i == 6 && cont1LanzamientoCarcel <= 3) {
                                        acum = 0;
                                        cont = 1;
                                        carcel = false;
                                        cont1LanzamientoCarcel = 0;
                                        prision.setText("JUGADOR 1 LIBRE");
                                        //cont16 = -1;
                                        //moverse(1);
                                    } else if (i != 6 && cont1LanzamientoCarcel < 3) {
                                        acum = 0;
                                        carcel = true;
                                        cont = 0;
                                        cont1LanzamientoCarcel++;
                                        if (g3 && g2) {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 0;
                                                acum3 -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }
                                    }

                                    if (i != 6 && cont1LanzamientoCarcel == 3) {
                                        acum = 0;
                                        carcel = true;
                                        cont1LanzamientoCarcel = 0;

                                        if (!g2) {
                                            cont = 1;// SI EN EL INTENTO 3 NO SACA 6, YA PERDIÓ EL TURNO
                                        } else if (!g3) {
                                            cont = 2;
                                        } else {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 0;
                                                acum -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }

                                    }

                                }

                            }

                        } else if (cont16 == 3) {
                            contGanadores++;
                            g1 = true;
                            jugador1.setLocation((int) casilla0.getLocation().x, 480);
                            if (contGanadores == 2) {
                                g.lugar2.setIcon(g.setIconJug2(jugador1.getBackground().getRGB()));
                                //mostrarGanadores();
                            } else if (contGanadores == 1) {
                                g.ganador.setIcon(g.setIconJug1(jugador1.getBackground().getRGB()));
                            }
                        }

                    } else {

                        acum -= i;
                        if (i != 6) {
                            cont16 = 0;
                        }

                        if (i == 6) {
                            cont = 0;
                            if (cont16 <= 2) {
                                cont16++;
                            }
                            if (cont16 == 3) {
                                g1 = true;
                                contGanadores++;
                                jugador1.setLocation((int) casilla0.getLocation().x, 480);
                                if (contGanadores == 2) {
                                    g.lugar2.setIcon(g.setIconJug2(jugador1.getBackground().getRGB()));
                                    //   mostrarGanadores();
                                } else if (contGanadores == 1) {
                                    g.ganador.setIcon(g.setIconJug1(jugador1.getBackground().getRGB()));
                                }
                            }
                        } else if (!g2) {
                            cont = 1;
                        } else if (!g3) {
                            cont = 2;
                        } else {
                            if (sw == 0) {
                                sw++;
                                cont = 0;
                                acum -= i;
                                moverse(i);
                            } else {
                                mostrarGanadores();
                            }
                        }
                    }

                } else {
                    if (!g2) {
                        cont = 1;
                    } else if (!g3) {
                        cont = 2;
                    } else {
                        if (sw == 0) {
                            sw++;
                            cont = 0;
                            acum -= i;
                            moverse(i);
                        } else {
                            mostrarGanadores();
                        }
                    }
                }
                break;

            case 1:

                if (!g2) {

                    acum2 += i; //SE LE AGREGA VALOR DEL DADO PARA AVANZAR

                    if (acum2 <= 36) {   //SÓLO AVANZA SI NO HA GANADO

                        if (cont26 < 3) {    //SI NO HA TENIDO 3 VECES EL 6

                            if (!carcel2) {     //SI NO ESTÁ EN LA CÁRCEL

                                System.out.println("acum 2 " + acum2);
                                ptr2 = j2.recorrerNodo(ptr, acum2, i);  //PARA MOVERSE
                                casillaTemp = ptr2.casilla.getLocation();   //UBICACIÓN DE LA CASILLA EN LA QUE QUEDÓ
                                jugador2.setLocation((int) casillaTemp.x, (int) casillaTemp.y - 30);    //PARA DEJARLO EN EL CENTRO DE LA CASILLA
                                if (!g3) {  //EL SIGUIENTE ES EL JUGADOR 3, PERO SI YA GANÓ, PASA A LA SGTE
                                    cont = 2;
                                } else if (!g1) {   //SI EL JUGADOR 3 YA GANÓ, Y EL 1RO TAMBIÉN, ÉL QUEDA COMO PERDEDOR
                                    cont = 0;
                                } else {
                                    if (sw == 0) {
                                        sw++;
                                        cont = 1;
                                        acum2 -= i;
                                        moverse(i);
                                    } else {
                                        mostrarGanadores();
                                    }
                                }

                                if (ptr2.equals(ptr1) && !g1) { //MATA AL JUGADOR1 SI ESTE NO HA GANADO
                                    jugador1.setLocation(140, 480);
                                    acum = 0;
                                    carcel = true;
                                    System.out.println("EN LA CARCEL SE ENCUENTRA EL JUGADOR 1");
                                }

                                if (ptr2.equals(ptr3) && !g3) { //MATA AL JUGADOR 3 SI ESTE NO HA GANADO
                                    jugador3.setLocation(140, 360);
                                    acum3 = 0;
                                    carcel3 = true;
                                    System.out.println("EN LA CÁRCEL SE ENCUENTRA EL JUGADOR 3");
                                }

                                if (acum2 == 36) {  //CUANDO EL TOTAL ES EXACTAMENTE IGUAL AL TOTAL DE CASILLAS DEL TABLERO
                                    g2 = true;  //SE CONVIERTE EN GANADOR
                                    jugador2.setLocation((int) casilla0.getLocation().x, 420);
                                    contGanadores++;
                                    if (contGanadores == 2) {
                                        g.lugar2.setIcon(g.setIconJug2(jugador2.getBackground().getRGB()));
                                        //mostrarGanadores();
                                    } else if (contGanadores == 1) {
                                        g.ganador.setIcon(g.setIconJug1(jugador2.getBackground().getRGB()));
                                    }
                                }

                                if (i == 6) { //SI EL DADO ARROJA 6 Y ESTE NO ACABA DE SALIR DE LA CARCEL
                                    cont = 1;
                                    cont26++;
                                } else {
                                    cont26 = 0;
                                }

                            } else {

                                if (cont2LanzamientoCarcel <= 3) {  //PARA SALIR DE LA CARCEL

                                    if (i == 6 && cont2LanzamientoCarcel <= 3) {
                                        acum2 = 0;
                                        cont = 2;
                                        carcel2 = false;
                                        cont2LanzamientoCarcel = 0;
                                        //cont26 = -1;
                                        prision.setText("JUGADOR 2 LIBRE");
                                        // moverse(6); //SI SALE, SE UBICA EN LA CASILLA 6, PERO NO PUEDE TIRAR OTRA VEZ
                                    } else if (i != 6 && cont2LanzamientoCarcel < 3) {
                                        acum2 = 0;
                                        carcel2 = true;
                                        cont = 1;
                                        cont2LanzamientoCarcel++; //SI NO HA SACADO 6, TIENE HASTA 3 INTENTOS
                                        if (g1 && g3) {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 1;
                                                acum3 -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }
                                    }

                                    if (i != 6 && cont2LanzamientoCarcel == 3) {
                                        acum2 = 0;
                                        carcel2 = true;
                                        cont2LanzamientoCarcel = 0;

                                        if (!g3) {
                                            cont = 2;// SI EN EL INTENTO 3 NO SACA 6, YA PERDIÓ EL TURNO
                                        } else if (!g1) {
                                            cont = 0;
                                        } else {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 1;
                                                acum2 -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }

                                    }

                                }

                            }

                        } else if (cont26 == 3) {
                            g2 = true;
                            contGanadores++;
                            jugador2.setLocation((int) casilla0.getLocation().x, 420);

                            if (contGanadores == 2) {
                                g.lugar2.setIcon(g.setIconJug2(jugador2.getBackground().getRGB()));
                                //mostrarGanadores();
                            } else if (contGanadores == 1) {
                                g.ganador.setIcon(g.setIconJug1(jugador2.getBackground().getRGB()));
                            }

                        }

                    } else {

                        //SI SU ACUMPULADOR PASÓ DE 36, SE LE QUITA LA CANTIDAD
                        acum2 -= i;

                        if (i != 6) {
                            cont26 = 0;
                        }

                        if (i == 6) {
                            cont = 1;
                            if (cont26 <= 2) {
                                cont26++;
                            }
                            if (cont26 == 3) {
                                g2 = true;
                                contGanadores++;
                                jugador2.setLocation((int) casilla0.getLocation().x, 420);
                                if (contGanadores == 2) {
                                    g.lugar2.setIcon(g.setIconJug2(jugador2.getBackground().getRGB()));
                                    //mostrarGanadores();
                                } else if (contGanadores == 1) {
                                    g.ganador.setIcon(g.setIconJug1(jugador2.getBackground().getRGB()));
                                }
                            }
                        } else if (!g3) {
                            cont = 2;
                        } else if (!g1) {
                            cont = 0;
                        } else {
                            if (sw == 0) {
                                sw++;
                                cont = 1;
                                acum2 -= i;
                                moverse(i);
                            } else {
                                mostrarGanadores();
                            }
                        }

                    }
                } else {
                    if (!g3) {
                        cont = 2;
                    } else if (!g1) {
                        cont = 0;
                    } else {
                        if (sw == 0) {
                            sw++;
                            cont = 1;
                            acum2 -= i;
                            moverse(i);
                        } else {
                            mostrarGanadores();
                        }
                    }

                }
                break;

            case 2:
                if (!g3) {
                    acum3 += i;

                    if (acum3 <= 36) {

                        if (cont36 < 3) {

                            if (!carcel3) {

                                System.out.println("acum 3 " + acum3);
                                ptr3 = j3.recorrerNodo(ptr, acum3, i);
                                casillaTemp = ptr3.casilla.getLocation();
                                jugador3.setLocation((int) casillaTemp.x, (int) casillaTemp.y - 30);
                                if (!g1) {
                                    cont = 0;
                                } else if (!g2) {
                                    cont = 1;
                                } else {
                                    if (sw == 0) {
                                        sw++;
                                        cont = 2;
                                        acum3 -= i;
                                        moverse(i);
                                    } else {
                                        mostrarGanadores();
                                    }
                                }

                                if (ptr3.equals(ptr1) && !g1) {
                                    jugador1.setLocation(140, 480);
                                    acum = 0;
                                    carcel = true;
                                    System.out.println("EN LA CARCEL SE ENCUENTRA EL JUGADOR 1");
                                }

                                if (ptr3.equals(ptr2) && !g2) {
                                    jugador2.setLocation(140, 420);
                                    acum2 = 0;
                                    carcel2 = true;
                                    System.out.println("EN LA CÁRCEL SE ENCUENTRA EL JUGADOR 2");
                                }

                                if (acum3 == 36) {
                                    g3 = true;
                                    jugador3.setLocation((int) casilla0.getLocation().x, 360);
                                    contGanadores++;
                                    if (contGanadores == 2) {
                                        g.lugar2.setIcon(g.setIconJug2(jugador3.getBackground().getRGB()));
                                        //mostrarGanadores();
                                    } else if (contGanadores == 1) {
                                        g.ganador.setIcon(g.setIconJug1(jugador3.getBackground().getRGB()));
                                    }

                                }

                                if (i == 6) {
                                    cont = 2;
                                    cont36++;
                                } else {
                                    cont36 = 0;
                                }

                            } else {
                                if (cont3LanzamientoCarcel <= 3) {

                                    if (i == 6 && cont3LanzamientoCarcel <= 3) {
                                        acum3 = 0;
                                        cont = 0;
                                        carcel3 = false;
                                        // cont36 = -1;
                                        cont3LanzamientoCarcel = 0;
                                        prision.setText("JUGADOR 3 LIBRE");
                                        //moverse(6);
                                    } else if (i != 6 && cont3LanzamientoCarcel < 3) {
                                        acum3 = 0;
                                        carcel3 = true;
                                        cont = 2;
                                        cont3LanzamientoCarcel++;
                                        if (g1 && g2) {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 2;
                                                acum3 -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }
                                    }

                                    if (i != 6 && cont3LanzamientoCarcel == 3) {
                                        carcel3 = true;
                                        acum3 = 0;
                                        cont3LanzamientoCarcel = 0;

                                        if (!g1) {
                                            cont = 0;// SI EN EL INTENTO 3 NO SACA 6, YA PERDIÓ EL TURNO
                                        } else if (!g2) {
                                            cont = 1;
                                        } else {
                                            if (sw == 0) {
                                                sw++;
                                                cont = 2;
                                                acum3 -= i;
                                                moverse(i);
                                            } else {
                                                mostrarGanadores();
                                            }
                                        }

                                    }

                                }
                            }

                        } else if (cont36 == 3) {
                            contGanadores++;
                            g3 = true;
                            jugador3.setLocation((int) casilla0.getLocation().x, 360);
                            if (contGanadores == 2) {
                                g.lugar2.setIcon(g.setIconJug2(jugador3.getBackground().getRGB()));
                                // mostrarGanadores();
                            } else if (contGanadores == 1) {
                                g.ganador.setIcon(g.setIconJug1(jugador3.getBackground().getRGB()));
                            }
                        }

                    } else {

                        acum3 -= i;

                        if (i != 6) {
                            cont36 = 0;
                        }

                        if (i == 6) {
                            cont = 2;
                            if (cont36 <= 2) {
                                cont36++;
                            }
                            if (cont36 == 3) {
                                g3 = true;
                                contGanadores++;
                                jugador3.setLocation((int) casilla0.getLocation().x, 360);
                                if (contGanadores == 2) {
                                    g.lugar2.setIcon(g.setIconJug2(jugador3.getBackground().getRGB()));
                                    //  mostrarGanadores();
                                } else if (contGanadores == 1) {
                                    g.ganador.setIcon(g.setIconJug1(jugador3.getBackground().getRGB()));
                                }

                            }
                        } else if (!g1) {
                            cont = 0;
                        } else if (!g2) {
                            cont = 1;
                        } else {
                            if (sw == 0) {
                                sw++;
                                cont = 2;
                                acum3 -= i;
                                moverse(i);
                            } else {
                                mostrarGanadores();
                            }
                        }

                    }
                } else {
                    if (!g1) {
                        cont = 0;
                    } else if (!g2) {
                        cont = 1;
                    } else {
                        if (sw == 0) {
                            sw++;
                            cont = 2;
                            acum3 -= i;
                            moverse(i);
                        } else {
                            mostrarGanadores();
                        }
                    }
                }
                break;
        }

    }

    public void mostrarGanadores() {
        if (contGanadores == 2) {
            if (!g1) {
                g.perdedor.setIcon(g.setIconJug3(jugador1.getBackground().getRGB()));
            } else if (!g2) {
                g.perdedor.setIcon(g.setIconJug3(jugador2.getBackground().getRGB()));
            } else {
                g.perdedor.setIcon(g.setIconJug3(jugador3.getBackground().getRGB()));
            }
        }
        if ((g1 && g2 && !g3) || (g1 && g3 && !g2) || (g2 && g3 && !g1)) {
            fSound.detener();
            g.setIconImage(Imagen.logo);
            g.setResizable(false);
            g.setTitle("CAMINO ESPACIAL");
            g.setBounds(450, 150, 510, 440);
            this.setVisible(false);
            g.setVisible(true);
            g.pistaG();
        }

        if (contGanadores == 3 && sw >= 1) {
            switch (cont) {
                case 0:
                    g.perdedor.setIcon(g.setIconJug3(jugador1.getBackground().getRGB()));
                    break;
                case 1:
                    g.perdedor.setIcon(g.setIconJug3(jugador2.getBackground().getRGB()));
                    break;
                case 2:
                    g.perdedor.setIcon(g.setIconJug3(jugador3.getBackground().getRGB()));
                    break;
            }
            fSound.detener();
            g.setIconImage(Imagen.logo);
            g.setResizable(false);
            g.setTitle("CAMINO ESPACIAL");
            g.setBounds(450, 150, 510, 440);
            this.setVisible(false);
            g.setVisible(true);
            g.pistaG();
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroGrafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Piso;
    private javax.swing.JLabel casilla0;
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla10;
    private javax.swing.JLabel casilla11;
    private javax.swing.JLabel casilla12;
    private javax.swing.JLabel casilla13;
    private javax.swing.JLabel casilla14;
    private javax.swing.JLabel casilla15;
    private javax.swing.JLabel casilla16;
    private javax.swing.JLabel casilla17;
    private javax.swing.JLabel casilla18;
    private javax.swing.JLabel casilla19;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla20;
    private javax.swing.JLabel casilla21;
    private javax.swing.JLabel casilla22;
    private javax.swing.JLabel casilla23;
    private javax.swing.JLabel casilla24;
    private javax.swing.JLabel casilla25;
    private javax.swing.JLabel casilla26;
    private javax.swing.JLabel casilla27;
    private javax.swing.JLabel casilla28;
    private javax.swing.JLabel casilla29;
    private javax.swing.JLabel casilla3;
    private javax.swing.JLabel casilla30;
    private javax.swing.JLabel casilla31;
    private javax.swing.JLabel casilla32;
    private javax.swing.JLabel casilla33;
    private javax.swing.JLabel casilla34;
    private javax.swing.JLabel casilla35;
    private javax.swing.JLabel casilla4;
    private javax.swing.JLabel casilla5;
    private javax.swing.JLabel casilla6;
    private javax.swing.JLabel casilla7;
    private javax.swing.JLabel casilla8;
    private javax.swing.JLabel casilla9;
    private javax.swing.JButton dado;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel prision;
    private javax.swing.JButton sonido;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables

}
/* switch (paso) {
            case 1:
                if (mayor == -1 && colorMayor == null) {
                    mayor = sw;
                    gMayor = player;
                    colorMayor = gMayor.getBackground().toString();
                }
                break;
            case 2:
                if (medio == -1 && colorMedio != null) {
                    medio = sw;
                    gMedio = player;
                    colorMedio = gMedio.getBackground().toString();
                }
                break;
            case 3:
                if (menor == -1 && colorMenor != null) {
                    menor = sw;
                    gMenor = player;
                    colorMenor = gMenor.getBackground().toString();
                }
                break;
        }
        if (mayor != -1 && medio != -1 && menor != -1) {
            g.recibirJugadores(gMayor, gMedio, gMenor);*/
