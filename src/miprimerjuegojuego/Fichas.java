/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 57301
 */
public class Fichas extends javax.swing.JFrame {

    int sw = 0;
    int sw2 = 0;
    int sw3 = 0;
    String aleatorio1 = null, aleatorio2 = null, aleatorio3 = null;
    boolean ocu1 = false;
    boolean ocu2 = false;
    boolean ocu3 = false;
    String jug2 = null;
    String jug1 = null;
    String jug3 = null;
    Nodo ptr;
    Nodo q = new Nodo();
    Nodo ptr1;
    JLabel color1 = new JLabel();
    JLabel color2 = new JLabel();
    JLabel color3 = new JLabel();
    TableroGrafico tg = new TableroGrafico();
    Fondos fondos = new Fondos();
    Sounds selec;

    /**
     * Creates new form fichasSeleccion
     */
    public Fichas() {
        initComponents();
        mostrarFondo();
        p.setVisible(false);
        prop1.setVisible(false);
        prop3.setVisible(false);
        mostrarFichas();
        ptr = null;
        ptr1 = ptr;
        sig.setVisible(false);
        selec = new Sounds(Imagen.seleccion);
    }

    private void mostrarFondo() {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/fondo/blue.jpg"));
        Icon f = new ImageIcon(fondo.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
        this.fondo.setIcon(f);
        this.repaint();
    }

    public void mostrarFichas() {
        //FICHA AMARILLA
        ImageIcon jAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
        Icon jugA1 = new ImageIcon(jAmarillo.getImage().getScaledInstance(fichaAmarilla.getWidth(), fichaAmarilla.getHeight(), Image.SCALE_DEFAULT));
        fichaAmarilla.setIcon(jugA1);
        this.repaint();
        ptr = q.aggNodo(ptr, fichaAmarilla, 1, false);
        //FICHA AZUL
        ImageIcon jAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
        Icon jugA2 = new ImageIcon(jAzul.getImage().getScaledInstance(fichaAzul.getWidth(), fichaAzul.getHeight(), Image.SCALE_DEFAULT));
        fichaAzul.setIcon(jugA2);
        this.repaint();
        ptr = q.aggNodo(ptr, fichaAzul, 2, false);
        //FICHA VERDE
        ImageIcon jVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
        Icon jugV = new ImageIcon(jVerde.getImage().getScaledInstance(fichaVerde.getWidth(), fichaVerde.getHeight(), Image.SCALE_DEFAULT));
        fichaVerde.setIcon(jugV);
        this.repaint();
        ptr = q.aggNodo(ptr, fichaVerde, 3, false);
        //FICHA ROJA
        ImageIcon jRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
        Icon jugR = new ImageIcon(jRojo.getImage().getScaledInstance(fichaRoja.getWidth(), fichaRoja.getHeight(), Image.SCALE_DEFAULT));
        fichaRoja.setIcon(jugR);
        this.repaint();
        ptr = q.aggNodo(ptr, fichaRoja, 4, false);
        q.mostrarNodos(ptr);
    }

    public void confirmarFichas() {
        if (ocu1 && ocu2 && ocu3) {
            sig.setVisible(true);
        }
    }

    public void emergente() {
        Imagen.init();
        fondos.setIconImage(Imagen.logo);
        fondos.setTitle("CAMINO ESPACIAL");
        fondos.setResizable(false);
        fondos.setVisible(true);
        fondos.setBounds(this.getBounds());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugador1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JComboBox<>();
        jugador3 = new javax.swing.JComboBox<>();
        fichaAmarilla = new javax.swing.JLabel();
        fichaAzul = new javax.swing.JLabel();
        fichaVerde = new javax.swing.JLabel();
        fichaRoja = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prop2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        prop1 = new javax.swing.JLabel();
        prop3 = new javax.swing.JLabel();
        sig = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugador1.setBackground(new java.awt.Color(153, 0, 153));
        jugador1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jugador1.setForeground(new java.awt.Color(255, 255, 255));
        jugador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatorio", "Amarillo", "Azul", "Verde", "Rojo" }));
        jugador1.setLightWeightPopupEnabled(false);
        jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugador1MouseClicked(evt);
            }
        });
        jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 133, 44));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione su ficha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 300, 48));

        jugador2.setBackground(new java.awt.Color(153, 0, 153));
        jugador2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jugador2.setForeground(new java.awt.Color(255, 255, 255));
        jugador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatorio", "Azul", "Verde", "Rojo", "Amarillo" }));
        jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 133, 44));

        jugador3.setBackground(new java.awt.Color(153, 0, 153));
        jugador3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jugador3.setForeground(new java.awt.Color(255, 255, 255));
        jugador3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatorio", "Verde", "Rojo", "Amarillo", "Azul" }));
        jugador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador3ActionPerformed(evt);
            }
        });
        getContentPane().add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 133, 44));

        fichaAmarilla.setText("jLabel2");
        getContentPane().add(fichaAmarilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 91, 91));

        fichaAzul.setText("jLabel2");
        getContentPane().add(fichaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 91, 91));

        fichaVerde.setText("jLabel2");
        getContentPane().add(fichaVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 91, 91));

        fichaRoja.setText("jLabel2");
        getContentPane().add(fichaRoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 91, 91));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JUGADOR 3");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 130, -1));

        prop2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        prop2.setForeground(new java.awt.Color(255, 255, 255));
        prop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prop2.setText("JUGADOR 2");
        getContentPane().add(prop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JUGADOR 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        p.setBackground(new java.awt.Color(153, 0, 153));
        p.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p.setText("jLabel4");
        p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p.setOpaque(true);
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, -1));
        p.getAccessibleContext().setAccessibleName("");

        prop1.setBackground(new java.awt.Color(153, 0, 153));
        prop1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        prop1.setForeground(new java.awt.Color(255, 255, 255));
        prop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prop1.setText("prop1");
        prop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prop1.setOpaque(true);
        getContentPane().add(prop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, -1));
        prop1.getAccessibleContext().setAccessibleDescription("");

        prop3.setBackground(new java.awt.Color(153, 0, 153));
        prop3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        prop3.setForeground(new java.awt.Color(255, 255, 255));
        prop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prop3.setText("jLabel4");
        prop3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prop3.setOpaque(true);
        getContentPane().add(prop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 130, -1));

        sig.setBackground(new java.awt.Color(153, 0, 153));
        sig.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        sig.setForeground(new java.awt.Color(255, 255, 255));
        sig.setText("SIGUIENTE");
        sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigMouseClicked(evt);
            }
        });
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });
        getContentPane().add(sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador1ActionPerformed
        selec.cambioVolumen(6f);
        selec.reproducir();
        String seleccion = (String) jugador1.getSelectedItem();
        if (sw == 0 && ocu1 == false) {
            switch (seleccion) {
                case "Aleatorio":
                    int j = (int) (Math.floor(Math.random() * ((jugador1.getItemCount() - 1) - 1 + 1) + 1));
                    System.out.println(j);
                    aleatorio1 = jugador1.getItemAt(j);
                    while ((aleatorio1.equals(aleatorio2)) || (aleatorio1.equals(aleatorio3))) {
                        aleatorio1 = jugador1.getItemAt(j);
                    }
                    System.out.println(aleatorio1);
                    switch (aleatorio1) {
                        case "Amarillo":
                            fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                            jug1 = "AMARILLO";
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Amarillo")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Amarillo")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color1 = fichaAmarilla;
                            sw = 1;
                            break;
                        case "Azul":
                            fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                            jug1 = "AZUL";
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Azul")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Azul")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color1 = fichaAzul;
                            sw = 2;
                            break;
                        case "Verde":
                            fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                            jug1 = "VERDE";
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Verde")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Verde")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color1 = fichaVerde;
                            sw = 3;
                            break;
                        case "Rojo":
                            fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                            jug1 = "ROJO";
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Rojo")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Rojo")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color1 = fichaRoja;
                            sw = 4;
                            break;
                    }
                    break;
                case "Amarillo":
                    fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                    jug1 = "AMARILLO";
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Amarillo")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Amarillo")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color1 = fichaAmarilla;
                    sw = 1;
                    break;
                case "Azul":
                    fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                    jug1 = "AZUL";
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Azul")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Azul")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color1 = fichaAzul;
                    sw = 2;
                    break;
                case "Verde":
                    fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                    jug1 = "VERDE";
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Verde")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Verde")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color1 = fichaVerde;
                    sw = 3;
                    break;
                case "Rojo":
                    fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                    jug1 = "ROJO";
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Rojo")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Rojo")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color1 = fichaRoja;
                    sw = 4;
                    break;
            }
            ocu1 = true;
            jugador1.setVisible(false);
            prop1.setVisible(true);
            prop1.setText(jug1);
            confirmarFichas();
        }
    }//GEN-LAST:event_jugador1ActionPerformed

    private void jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador2ActionPerformed
        selec.cambioVolumen(6f);
        selec.reproducir();
        String seleccion = (String) jugador2.getSelectedItem();
        if (sw2 == 0 && ocu2 == false) {
            switch (seleccion) {
                case "Aleatorio":
                    int j = (int) (Math.floor(Math.random() * ((jugador2.getItemCount() - 1) - 1 + 1) + 1));
                    System.out.println(j);
                    aleatorio2 = jugador2.getItemAt(j);
                    while ((aleatorio2.equals(aleatorio3)) || (aleatorio2.equals(aleatorio1))) {
                        aleatorio2 = jugador2.getItemAt(j);
                        System.out.println(aleatorio2);
                    }
                    System.out.println(aleatorio2);
                    switch (aleatorio2) {
                        case "Amarillo":
                            fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                            jug2 = "AMARILLO";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Amarillo")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Amarillo")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color2 = fichaAmarilla;
                            sw2 = 4;
                            break;
                        case "Azul":
                            fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                            jug2 = "AZUL";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Azul")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Azul")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color2 = fichaAzul;
                            sw2 = 1;
                            break;
                        case "Verde":
                            fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                            jug2 = "VERDE";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Verde")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Verde")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color2 = fichaVerde;
                            sw2 = 2;
                            break;
                        case "Rojo":
                            fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                            jug2 = "ROJO";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Rojo")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador3.getItemCount(); i++) {
                                if (jugador3.getItemAt(i).equals("Rojo")) {
                                    jugador3.removeItemAt(i);
                                    break;
                                }
                            }
                            color2 = fichaRoja;
                            sw2 = 3;
                            break;
                    }
                    break;
                case "Amarillo":
                    fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                    jug2 = "AMARILLO";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Amarillo")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Amarillo")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color2 = fichaAmarilla;
                    sw2 = 4;
                    break;
                case "Azul":
                    fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                    jug2 = "AZUL";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Azul")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Azul")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color2 = fichaAzul;
                    sw2 = 1;
                    break;
                case "Verde":
                    fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                    jug2 = "VERDE";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Verde")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Verde")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color2 = fichaVerde;
                    sw2 = 2;
                    break;
                case "Rojo":
                    fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                    jug2 = "ROJO";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Rojo")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador3.getItemCount(); i++) {
                        if (jugador3.getItemAt(i).equals("Rojo")) {
                            jugador3.removeItemAt(i);
                            break;
                        }
                    }
                    color2 = fichaRoja;
                    sw2 = 3;
                    break;
            }
            ocu2 = true;
            jugador2.setVisible(false);
            p.setVisible(true);
            p.setText(jug2);
            confirmarFichas();
        }
    }//GEN-LAST:event_jugador2ActionPerformed

    private void jugador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador3ActionPerformed
        selec.cambioVolumen(6f);
        selec.reproducir();
        String seleccion = (String) jugador3.getSelectedItem();
        if (sw3 == 0 && ocu3 == false) {
            switch (seleccion) {
                case "Aleatorio":
                    //Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
                    int j = (int) (Math.floor(Math.random() * ((jugador3.getItemCount() - 1) - 1 + 1) + 1));
                    aleatorio3 = jugador3.getItemAt(j);
                    System.out.println(j);
                    while ((aleatorio3.equals(aleatorio1)) || (aleatorio3.equals(aleatorio2))) {
                        aleatorio3 = jugador3.getItemAt(j);
                        System.out.println(aleatorio3);
                    }
                    System.out.println(aleatorio3);
                    switch (aleatorio3) {
                        case "Amarillo":
                            fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                            jug3 = "AMARILLO";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Amarillo")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Amarillo")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            color3 = fichaAmarilla;
                            sw3 = 3;
                            break;
                        case "Azul":
                            fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                            jug3 = "AZUL";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Azul")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Azul")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            color3 = fichaAzul;
                            sw3 = 4;
                            break;
                        case "Verde":
                            fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                            jug3 = "VERDE";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Verde")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Verde")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            color3 = fichaVerde;
                            sw3 = 1;
                            break;
                        case "Rojo":
                            fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                            jug3 = "ROJO";
                            for (int i = 0; i < jugador1.getItemCount(); i++) {
                                if (jugador1.getItemAt(i).equals("Rojo")) {
                                    jugador1.removeItemAt(i);
                                    break;
                                }
                            }
                            for (int i = 0; i < jugador2.getItemCount(); i++) {
                                if (jugador2.getItemAt(i).equals("Rojo")) {
                                    jugador2.removeItemAt(i);
                                    break;
                                }
                            }
                            color3 = fichaRoja;
                            sw3 = 2;
                            break;
                    }
                    break;
                case "Amarillo":
                    fichaAmarilla.setBorder(BorderFactory.createLineBorder(Color.yellow));
                    jug3 = "AMARILLO";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Amarillo")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Amarillo")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    color3 = fichaAmarilla;
                    sw3 = 3;
                    break;
                case "Azul":
                    fichaAzul.setBorder(BorderFactory.createLineBorder(Color.blue));
                    jug3 = "AZUL";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Azul")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Azul")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    color3 = fichaAzul;
                    sw3 = 4;
                    break;
                case "Verde":
                    fichaVerde.setBorder(BorderFactory.createLineBorder(Color.green));
                    jug3 = "VERDE";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Verde")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Verde")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    color3 = fichaVerde;
                    sw3 = 1;
                    break;
                case "Rojo":
                    fichaRoja.setBorder(BorderFactory.createLineBorder(Color.red));
                    jug3 = "ROJO";
                    for (int i = 0; i < jugador1.getItemCount(); i++) {
                        if (jugador1.getItemAt(i).equals("Rojo")) {
                            jugador1.removeItemAt(i);
                            break;
                        }
                    }
                    for (int i = 0; i < jugador2.getItemCount(); i++) {
                        if (jugador2.getItemAt(i).equals("Rojo")) {
                            jugador2.removeItemAt(i);
                            break;
                        }
                    }
                    color3 = fichaRoja;
                    sw3 = 2;
                    break;
            }
            ocu3 = true;
            jugador3.setVisible(false);
            prop3.setVisible(true);
            prop3.setText(jug3);
            confirmarFichas();
        }
    }//GEN-LAST:event_jugador3ActionPerformed

    private void jugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador1MouseClicked

    }//GEN-LAST:event_jugador1MouseClicked

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        
    }//GEN-LAST:event_sigActionPerformed

    private void sigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigMouseClicked
        fondos.confirmarFichas(sw, sw2, sw3);
        selec.reproducir();
        selec.cambioVolumen(6f);
//            tg.recibirJugador1(color1, sw);
//            tg.recibirJugador2(color2, sw2);
//            tg.recibirJugador3(color3, sw3);
        this.setVisible(false);
        emergente();
    }//GEN-LAST:event_sigMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fichas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fichaAmarilla;
    private javax.swing.JLabel fichaAzul;
    private javax.swing.JLabel fichaRoja;
    private javax.swing.JLabel fichaVerde;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jugador1;
    private javax.swing.JComboBox<String> jugador2;
    private javax.swing.JComboBox<String> jugador3;
    private javax.swing.JLabel p;
    private javax.swing.JLabel prop1;
    private javax.swing.JLabel prop2;
    private javax.swing.JLabel prop3;
    private javax.swing.JButton sig;
    // End of variables declaration//GEN-END:variables

}
