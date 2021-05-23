/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author 57301
 */
public class Ganadores extends javax.swing.JFrame {

    ImageIcon mayor, medio, menor;
    Icon mayor1, medio1, menor1;
    Sounds f;
    Menu m;

    /**
     * Creates new form Ganadores
     */
    public Ganadores() {
        initComponents();
        mostrarFondo();
        f = new Sounds(Imagen.posiciones);
    }

    private void mostrarFondo() {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/fondo/blue.jpg"));
        Icon f = new ImageIcon(fondo.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
        this.fondo.setIcon(f);
        this.repaint();
    }

    public void pistaG() {
        f.cambioVolumen(-15f);
        f.fondo();
    }

    public Icon setIconJug1(int num) {
        Icon temp = null;
        switch (num) {
            case -16776961:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                temp = new ImageIcon(jugadorAzul.getImage().getScaledInstance(ganador.getWidth(), ganador.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -16711936:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                temp = new ImageIcon(jugadorVerde.getImage().getScaledInstance(ganador.getWidth(), ganador.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -65536:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                temp = new ImageIcon(jugadorRojo.getImage().getScaledInstance(ganador.getWidth(), ganador.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -256:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                temp = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(ganador.getWidth(), ganador.getHeight(), Image.SCALE_DEFAULT));
                break;
        }

        return temp;
    }

    public Icon setIconJug2(int num) {
        Icon temp = null;
        switch (num) {
            case -16776961:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                temp = new ImageIcon(jugadorAzul.getImage().getScaledInstance(lugar2.getWidth(), lugar2.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -16711936:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                temp = new ImageIcon(jugadorVerde.getImage().getScaledInstance(lugar2.getWidth(), lugar2.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -65536:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                temp = new ImageIcon(jugadorRojo.getImage().getScaledInstance(lugar2.getWidth(), lugar2.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -256:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                temp = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(lugar2.getWidth(), lugar2.getHeight(), Image.SCALE_DEFAULT));
                break;
        }

        return temp;
    }

    public Icon setIconJug3(int num) {
        Icon temp = null;
        switch (num) {
            case -16776961:
                ImageIcon jugadorAzul = new ImageIcon(getClass().getResource("/jugador/jugadorAzul.png"));
                temp = new ImageIcon(jugadorAzul.getImage().getScaledInstance(perdedor.getWidth(), perdedor.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -16711936:
                ImageIcon jugadorVerde = new ImageIcon(getClass().getResource("/jugador/jugadorVerde.png"));
                temp = new ImageIcon(jugadorVerde.getImage().getScaledInstance(perdedor.getWidth(), perdedor.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -65536:
                ImageIcon jugadorRojo = new ImageIcon(getClass().getResource("/jugador/jugadorRojo.png"));
                temp = new ImageIcon(jugadorRojo.getImage().getScaledInstance(perdedor.getWidth(), perdedor.getHeight(), Image.SCALE_DEFAULT));
                break;
            case -256:
                ImageIcon jugadorAmarillo = new ImageIcon(getClass().getResource("/jugador/jugadorAmarillo.png"));
                temp = new ImageIcon(jugadorAmarillo.getImage().getScaledInstance(perdedor.getWidth(), perdedor.getHeight(), Image.SCALE_DEFAULT));
                break;
        }

        return temp;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        lugar2 = new javax.swing.JLabel();
        perdedor = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        replay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 153, 0));
        jLabel3.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RAKING");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 440, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.yellow));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 110));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Kristen ITC", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Kristen ITC", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 208, 130, -1));
        getContentPane().add(ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 91, 91));
        getContentPane().add(lugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 81, 81));
        getContentPane().add(perdedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 71, 71));

        exit.setBackground(new java.awt.Color(153, 0, 153));
        exit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("SALIR");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 190, -1));

        replay.setBackground(new java.awt.Color(153, 0, 153));
        replay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        replay.setForeground(new java.awt.Color(255, 255, 255));
        replay.setText("MENÚ PRINCIPAL");
        replay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                replayMouseClicked(evt);
            }
        });
        getContentPane().add(replay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡PARTIDA TERMINADA!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 330, 48));

        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoMouseClicked(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 520, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseClicked

    }//GEN-LAST:event_fondoMouseClicked

    private void replayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replayMouseClicked
        Imagen.init();
        this.setVisible(false);
        m = new Menu();
        f.detener();
        
        m.setIconImage(Imagen.logo);
        m.setTitle("CAMINO ESPACIAL");
        m.setResizable(false);
        m.setLocation(450, 150);
        m.setSize(633, 381);
        m.setVisible(true);
    }//GEN-LAST:event_replayMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(Ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel ganador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel lugar2;
    public javax.swing.JLabel perdedor;
    private javax.swing.JButton replay;
    // End of variables declaration//GEN-END:variables
}
