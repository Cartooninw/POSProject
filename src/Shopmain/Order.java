/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopmain;

/**
 *
 * @author babos
 */
public class Order extends javax.swing.JFrame implements InterOrder{

    private Itemlist<String> selectedItems = new Itemlist<>();
    /**
     * Creates new form NewJFrame
     */
    public Order() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NameBig = new javax.swing.JLabel();
        PriceBig = new javax.swing.JLabel();
        TypeBig = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fdname1 = new javax.swing.JLabel();
        fdprice1 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        fdtype1 = new javax.swing.JLabel();
        fdname2 = new javax.swing.JLabel();
        fdprice2 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        fdtype2 = new javax.swing.JLabel();
        fdname3 = new javax.swing.JLabel();
        fdprice3 = new javax.swing.JLabel();
        check3 = new javax.swing.JCheckBox();
        fdtype3 = new javax.swing.JLabel();
        fdname4 = new javax.swing.JLabel();
        fdprice4 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        fdtype4 = new javax.swing.JLabel();
        fdname5 = new javax.swing.JLabel();
        fdprice5 = new javax.swing.JLabel();
        check5 = new javax.swing.JCheckBox();
        fdtype5 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        ConfirmOrder1 = new javax.swing.JButton();

        jLabel12.setText("Fried Fish");

        jLabel13.setText("250 baht");

        jLabel14.setText("FriedFood");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        NameBig.setBackground(new java.awt.Color(255, 255, 51));
        NameBig.setForeground(new java.awt.Color(255, 255, 255));
        NameBig.setText("Name");

        PriceBig.setForeground(new java.awt.Color(255, 255, 255));
        PriceBig.setText("Price");

        TypeBig.setForeground(new java.awt.Color(255, 255, 255));
        TypeBig.setText("Type");

        fdname1.setText("Fried Fish");

        fdprice1.setText("250 baht");

        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        fdtype1.setText("FriedFood");

        fdname2.setText("Fried Fish");

        fdprice2.setText("250 baht");

        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        fdtype2.setText("FriedFood");

        fdname3.setText("Fried Fish");

        fdprice3.setText("250 baht");

        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        fdtype3.setText("FriedFood");

        fdname4.setText("Fried Fish");

        fdprice4.setText("250 baht");

        check4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check4ActionPerformed(evt);
            }
        });

        fdtype4.setText("FriedFood");

        fdname5.setText("Fried Fish");

        fdprice5.setText("250 baht");

        check5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check5ActionPerformed(evt);
            }
        });

        fdtype5.setText("FriedFood");

        Reset.setBackground(new java.awt.Color(255, 255, 0));
        Reset.setText("Reset");
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });

        ConfirmOrder1.setBackground(new java.awt.Color(0, 255, 51));
        ConfirmOrder1.setText("Confirm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameBig)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fdname1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceBig)
                            .addComponent(fdprice1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check2)
                        .addGap(18, 18, 18)
                        .addComponent(fdname2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(fdprice2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check3)
                        .addGap(18, 18, 18)
                        .addComponent(fdname3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(fdprice3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check4)
                        .addGap(18, 18, 18)
                        .addComponent(fdname4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(fdprice4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check5)
                        .addGap(18, 18, 18)
                        .addComponent(fdname5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(fdprice5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeBig)
                    .addComponent(fdtype1)
                    .addComponent(fdtype2)
                    .addComponent(fdtype3)
                    .addComponent(fdtype4)
                    .addComponent(fdtype5))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameBig)
                    .addComponent(PriceBig)
                    .addComponent(TypeBig))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdname1)
                        .addComponent(fdprice1)
                        .addComponent(fdtype1)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdname2)
                        .addComponent(fdprice2)
                        .addComponent(fdtype2)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdname3)
                        .addComponent(fdprice3)
                        .addComponent(fdtype3)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdname4)
                        .addComponent(fdprice4)
                        .addComponent(fdtype4)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdname5)
                        .addComponent(fdprice5)
                        .addComponent(fdtype5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check2ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check3ActionPerformed

    private void check4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check4ActionPerformed

    private void check5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check5ActionPerformed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ResetMouseClicked
    private void ConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // Check which items are selected and add them to the ArrayList
        if (check1.isSelected()) {
            selectedItems.add("Fried Fish");
        }
        if (check2.isSelected()) {
            selectedItems.add("Another Item");
            // Add other items in a similar way
        }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmOrder1;
    private javax.swing.JLabel NameBig;
    private javax.swing.JLabel PriceBig;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel TypeBig;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JLabel fdname1;
    private javax.swing.JLabel fdname2;
    private javax.swing.JLabel fdname3;
    private javax.swing.JLabel fdname4;
    private javax.swing.JLabel fdname5;
    private javax.swing.JLabel fdprice1;
    private javax.swing.JLabel fdprice2;
    private javax.swing.JLabel fdprice3;
    private javax.swing.JLabel fdprice4;
    private javax.swing.JLabel fdprice5;
    private javax.swing.JLabel fdtype1;
    private javax.swing.JLabel fdtype2;
    private javax.swing.JLabel fdtype3;
    private javax.swing.JLabel fdtype4;
    private javax.swing.JLabel fdtype5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

        private static class Itemlist<T> {

        public Itemlist() {
        }

        private void add(String fried_Fish) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }    
    
}
