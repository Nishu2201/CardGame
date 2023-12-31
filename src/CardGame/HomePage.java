/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Nishu
 */
public class HomePage extends javax.swing.JFrame {
      
    private Timer colorTimer;
    private int colorIndex =0;
    
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        startColorTransition();
    }
    private void startColorTransition(){
         colorTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColorEffect();
            }
        });
        colorTimer.start();
    }
    private void updateColorEffect() {

        Color[] colors = {
            new Color(0, 255, 153),
            new Color(180, 50, 80), // Change this to the color you desire
            new Color(252, 223, 3), 
        };

        gname.setForeground(colors[colorIndex]);

        colorIndex = (colorIndex + 1) % colors.length;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        gname = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        GIF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, -1, -1));

        kGradientPanel2.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/Bot2.png"))); // NOI18N
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 370, 440));

        StartButton.setBackground(new java.awt.Color(0, 204, 102));
        StartButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StartButton.setForeground(new java.awt.Color(255, 255, 255));
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        kGradientPanel2.add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 300, 50));

        gname.setFont(new java.awt.Font("Serif", 1, 64)); // NOI18N
        gname.setForeground(new java.awt.Color(255, 255, 255));
        gname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gname.setText("Playing Cards");
        gname.setAlignmentY(0.3F);
        gname.setDoubleBuffered(true);
        gname.setInheritsPopupMenu(false);
        kGradientPanel2.add(gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 480, 170));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 690, 100, 170));

        GIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gifCard.gif"))); // NOI18N
        kGradientPanel2.add(GIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Created by @Nishu");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 170, 40));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 790, 590));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 750, 100, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 100, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 100, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 100, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 100, 110));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 100, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 100, 110));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 100, 110));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 100, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 100, 110));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 100, 110));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 100, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 100, 110));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 100, 110));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 110));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 100, 110));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 100, 110));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 100, 110));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 100, 110));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 100, 110));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, 100, 110));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 100, 110));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 100, 110));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, 100, 110));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 100, 110));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 100, 110));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 110));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 110));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 110));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 110));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 110));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CardGame/CardPic.png"))); // NOI18N
        kGradientPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 110));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
    CardGame cardgame = new CardGame();
    this.dispose();
    }//GEN-LAST:event_StartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        HomePage homepage = new HomePage();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GIF;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel gname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
