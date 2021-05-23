/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjuegojuego;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 57301
 */
public class Fondos extends javax.swing.JFrame {

    int sw;
    int player1 = 0, player2 = 0, player3 = 0;
    TableroGrafico tg = new TableroGrafico();

    public Fondos() {
        initComponents();
        mostrarFondo();
        mostrarOpciones();
    }

    private void mostrarFondo() {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/fondo/blue.jpg"));
        Icon f = new ImageIcon(fondo.getImage().getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_DEFAULT));
        this.fondo.setIcon(f);
        this.repaint();
    }

    private void mostrarOpciones() {
        ImageIcon fondo1 = new ImageIcon(getClass().getResource("/fondo/1.png"));
        Icon f1 = new ImageIcon(fondo1.getImage().getScaledInstance(this.op1.getWidth(), this.op1.getHeight(), Image.SCALE_DEFAULT));
        this.op1.setIcon(f1);
        this.repaint();

        ImageIcon fondo2 = new ImageIcon(getClass().getResource("/fondo/2.jpg"));
        Icon f2 = new ImageIcon(fondo2.getImage().getScaledInstance(this.op2.getWidth(), this.op2.getHeight(), Image.SCALE_DEFAULT));
        this.op2.setIcon(f2);
        this.repaint();

        ImageIcon fondo3 = new ImageIcon(getClass().getResource("/fondo/3.jpg"));
        Icon f3 = new ImageIcon(fondo3.getImage().getScaledInstance(this.op3.getWidth(), this.op3.getHeight(), Image.SCALE_DEFAULT));
        this.op3.setIcon(f3);
        this.repaint();
    }

    public void confirmarFichas(int player1, int player2, int player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    private void emergente(int sw) {
        tg.recibirJugador1(player1);
        tg.recibirJugador2(player2);
        tg.recibirJugador3(player3);
        tg.recibirFondo(sw);
        Imagen.init();
        tg.setIconImage(Imagen.logo);
        tg.setTitle("CAMINO ESPACIAL");
        tg.setResizable(false);
        tg.setLocation(100, 30);
        tg.setSize(1180, 645);
        this.setVisible(false);
        tg.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op3 = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        decision = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        op3.setText("jLabel1");
        op3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        op3.setOpaque(true);
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 155, 120));

        op1.setText("jLabel1");
        op1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        op1.setOpaque(true);
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 155, 120));

        op2.setText("jLabel1");
        op2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        op2.setOpaque(true);
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 120, 155, 120));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione su tablero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 350, 48));

        decision.setBackground(new java.awt.Color(153, 0, 153));
        decision.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        decision.setForeground(new java.awt.Color(255, 255, 255));
        decision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fondo 1", "Fondo 2", "Fondo 3" }));
        decision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decisionActionPerformed(evt);
            }
        });
        getContentPane().add(decision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, 44));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 540, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decisionActionPerformed
        String seleccion = (String) decision.getSelectedItem();
        switch (seleccion) {
            case "Fondo 1":
                sw = 1;
                break;
            case "Fondo 2":
                sw = 2;
                break;
            case "Fondo 3":
                sw = 3;
                break;
        }
        emergente(sw);
    }//GEN-LAST:event_decisionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Fondos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fondos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fondos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fondos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fondos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> decision;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel op3;
    // End of variables declaration//GEN-END:variables

}
