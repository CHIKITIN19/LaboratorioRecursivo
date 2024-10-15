/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Horse;

import AjedrezRecursivo.Tablero;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 9567
 */
public class Ajedrez extends javax.swing.JFrame implements IView{
    private JButton[][] botonesTablero;
    private Horse controler;
    private Tablero tablero;
    
    
    
    
    /**
     * Creates new form Ajedrez
     */
    public Ajedrez() {
        botonesTablero = new JButton[8][8];
        tablero = new Tablero();
        initComponents();
        initializeBotonesTablero();
        pedirCoordenadasIniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRestablecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 0));

        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton2);

        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton1);

        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton3);

        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton4);

        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton5);

        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton6);

        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton8);

        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton7);

        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton9);

        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton10);

        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton11);

        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton12);

        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton13);

        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton14);

        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton15);

        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton16);

        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton17);

        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton18);

        jButton19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton19);

        jButton20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton20);

        jButton21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton21);

        jButton22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton22);

        jButton23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton23);

        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton24);

        jButton25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton25);

        jButton26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton26);

        jButton27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton27);

        jButton28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton28);

        jButton29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton29);

        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton30);

        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton31);

        jButton32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton32);

        jButton33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton33);

        jButton34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton34);

        jButton35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton35);

        jButton36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton36);

        jButton37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton37);

        jButton38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton38);

        jButton39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton39);

        jButton40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton40);

        jButton41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton41);

        jButton42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton42);

        jButton43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton43);

        jButton44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton44);

        jButton45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton45);

        jButton46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton46);

        jButton47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton47);

        jButton48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton48);

        jButton49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton49);

        jButton50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton50);

        jButton51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton51);

        jButton52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton52);

        jButton53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton53);

        jButton54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton54);

        jButton55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton55);

        jButton56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton56);

        jButton57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton57);

        jButton58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton58);

        jButton59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton59);

        jButton60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton60);

        jButton61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton61);

        jButton62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton62);

        jButton63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton63);

        jButton64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton64);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setText("Reiniciar Tablero");

        btnRestablecer.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnRestablecer.setText("Restablecer");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnRestablecer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(btnRestablecer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        resetTablero();

    }//GEN-LAST:event_btnRestablecerActionPerformed

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
            java.util.logging.Logger.getLogger(Ajedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajedrez().setVisible(true);
                
            }
        });
    }
    private void printComponentNames(Container container) {
        for (Component comp : container.getComponents()) {
            System.out.println(comp.getClass().getSimpleName() + ": " + comp.getName());
        }
    }
     private void initializeBotonesTablero() {
        Component[] components = jPanel1.getComponents();
        int index = 0;
        for (int i = 0; i < 8 && index < components.length; i++) {
            for (int j = 0; j < 8 && index < components.length; j++) {
                if (components[index] instanceof JButton) {
                    botonesTablero[i][j] = (JButton) components[index];
                }
                index++;
            }
        }
    }
    private void pedirCoordenadasIniciales() {
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese X inicial (0-7):"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Y inicial (0-7):"));


            if (x < 0 || x >= 8 || y < 0 || y >= 8) {
                JOptionPane.showMessageDialog(this, "Coordenadas invalidas. Ingrese valores entre 0 y 7.");
                return;
            }

            Tablero();
            controler = new Horse(tablero, this, x, y);  


            new Thread(() -> {
                controler.IniciarRecorrido(x, y);
            }).start();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada invalida. Por favor, ingrese valores numéricos.");
    }
}

//     public void actualizarCasilla(int x, int y, int paso) {
//        if (x >= 0 && x < 8 && y >= 0 && y < 8 && botonesTablero[x][y] != null) {
//            botonesTablero[x][y].setText(String.valueOf(paso));
//            botonesTablero[x][y].setBackground(Color.GREEN);
//        } else {
//            System.out.println("Error: Coordenadas invalidas : (" + x + ", " + y + ")");
//        }
//    }

    public void Tablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (botonesTablero[i][j] != null) {
                    botonesTablero[i][j].setText(" X ");
                    botonesTablero[i][j].setBackground(Color.YELLOW);
                }
            }
        }
        
    }
    private void resetTablero() {
        
        tablero = new Tablero(); 

        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (botonesTablero[i][j] != null) {
                    botonesTablero[i][j].setText(" X ");
                    botonesTablero[i][j].setBackground(Color.YELLOW);  
                }
            }
        }
        pedirCoordenadasIniciales();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestablecer;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton25;
    public javax.swing.JButton jButton26;
    public javax.swing.JButton jButton27;
    public javax.swing.JButton jButton28;
    public javax.swing.JButton jButton29;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton30;
    public javax.swing.JButton jButton31;
    public javax.swing.JButton jButton32;
    public javax.swing.JButton jButton33;
    public javax.swing.JButton jButton34;
    public javax.swing.JButton jButton35;
    public javax.swing.JButton jButton36;
    public javax.swing.JButton jButton37;
    public javax.swing.JButton jButton38;
    public javax.swing.JButton jButton39;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton40;
    public javax.swing.JButton jButton41;
    public javax.swing.JButton jButton42;
    public javax.swing.JButton jButton43;
    public javax.swing.JButton jButton44;
    public javax.swing.JButton jButton45;
    public javax.swing.JButton jButton46;
    public javax.swing.JButton jButton47;
    public javax.swing.JButton jButton48;
    public javax.swing.JButton jButton49;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton50;
    public javax.swing.JButton jButton51;
    public javax.swing.JButton jButton52;
    public javax.swing.JButton jButton53;
    public javax.swing.JButton jButton54;
    public javax.swing.JButton jButton55;
    public javax.swing.JButton jButton56;
    public javax.swing.JButton jButton57;
    public javax.swing.JButton jButton58;
    public javax.swing.JButton jButton59;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton60;
    public javax.swing.JButton jButton61;
    public javax.swing.JButton jButton62;
    public javax.swing.JButton jButton63;
    public javax.swing.JButton jButton64;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private Component findComponentByName(JPanel jPanel, String name) {
                for (Component comp : jPanel.getComponents()) {
            if (name.equals(comp.getName())) {
                return comp;
            }
        }
        return null;
    }

    @Override
    public void UpdateCasilla(int x, int y, int paso) {
     if (botonesTablero[x][y] != null) {
        botonesTablero[x][y].setText(String.valueOf(paso)); 
        botonesTablero[x][y].setBackground(Color.GREEN);
    }
  }
}
