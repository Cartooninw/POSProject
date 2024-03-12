/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopmain;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import MainUser.Userinterface;
import MainUser.SingleUserManager;
/**
 *
 * @author babos
 */
public class Order extends javax.swing.JFrame implements temporarilycart{
    /**
     * Creates new form NewJFrame
     */
    
    ArrayList<Object> usernameob = new ArrayList<>();
    String getusername ;
    public Order() {
        initComponents();
            
    }
    
    public void getUserList(Object[] username) {
        usernameob.add(username[0].toString());
        usernameob.add(username[1].toString());
        usernameob.add(username[2].toString());

    }
    
    public void setUsername(String tousername) {
        this.getusername = tousername;
        System.out.println(this.getusername);
        username.setText(tousername);
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
        reset = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        sortfriedfood = new javax.swing.JCheckBox();
        sortseafood = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        discout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        items = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();

        jLabel12.setText("Fried Fish");

        jLabel13.setText("250 baht");

        jLabel14.setText("FriedFood");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        confirm.setBackground(new java.awt.Color(153, 255, 153));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "items", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cart);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("List");

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        sortfriedfood.setText("FriedFood");
        sortfriedfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortfriedfoodActionPerformed(evt);
            }
        });

        sortseafood.setText("SeaFood");
        sortseafood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortseafoodActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Food type");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Search");

        discout.setBackground(new java.awt.Color(51, 51, 51));
        discout.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        discout.setForeground(new java.awt.Color(255, 255, 255));
        discout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        discout.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Total Discout");

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Padkaprow",  new Double(85.0), "FriedFood"},
                {"GGG",  new Double(12.0), "SeaFood"},
                {"FFF",  new Double(523.0), "FriedFood"},
                {"AAA",  new Double(999.0), "SeaFood"}
            },
            new String [] {
                "name", "price", "type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(items);
        if (items.getColumnModel().getColumnCount() > 0) {
            items.getColumnModel().getColumn(0).setResizable(false);
            items.getColumnModel().getColumn(1).setResizable(false);
            items.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        username.setText("ForUsername");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sortfriedfood)
                                .addGap(41, 41, 41)
                                .addComponent(sortseafood))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(160, 160, 160))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(discout, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(373, 373, 373)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(username)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortfriedfood)
                    .addComponent(sortseafood)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_resetMouseClicked

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
       sumorder newsum = new sumorder();
       newsum.toordertable();
       newsum.show();
       newsum.setLocationRelativeTo(this);
       newsum.setVisible(true);
       
    }//GEN-LAST:event_confirmActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        DefaultTableModel cartmodel = (DefaultTableModel) cart.getModel();
        int selectedRowIndex = items.getSelectedRow();
        if(selectedRowIndex != -1){
        String name = items.getValueAt(selectedRowIndex, 0).toString();
        String price = items.getValueAt(selectedRowIndex, 1).toString();
        String type = items.getValueAt(selectedRowIndex, 2).toString();
        
        switch (type) {
            case "FriedFood":
                cartlist.addcart(new FriedFood(name,Double.parseDouble(price)));
                break;
            case "SeaFood":
                cartlist.addcart(new SeaFood(name,Double.parseDouble(price)));
                break;
        }
        if (cartmodel.getRowCount() > 0 ) {
                cartmodel.setRowCount(0);
        }
        for (Menu item : cartlist.getcart()) {
                Object[] myobject = {item.getName(),item.getPrice()};
                cartmodel.addRow(myobject);
            }
        } else {
//            JOptionPane.showMessageDialog(this,"Please select an item");
            JOptionPane.showMessageDialog(this, "Please Select an item");     
//              JOptionPane.showMessageDialog(this, "Please select an item");

        }
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) cart.getModel() ;
        model.setRowCount(0);
        cartlist.clearcart();
        
    }//GEN-LAST:event_resetActionPerformed

    private void sortseafoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortseafoodActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) items.getModel();
        TableRowSorter newsort = new TableRowSorter<>(model);

        if (sortseafood.isSelected()) {
        newsort.setRowFilter(RowFilter.regexFilter("SeaFood",2));
        items.setRowSorter(newsort);
         model.fireTableDataChanged();   
        } else {
            newsort.setRowFilter(RowFilter.regexFilter("",2));
            items.setRowSorter(newsort);
            model.fireTableDataChanged(); 
        }
        
    }//GEN-LAST:event_sortseafoodActionPerformed

    private void sortfriedfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortfriedfoodActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) items.getModel();
        TableRowSorter newsort = new TableRowSorter<>(model);

        if (sortfriedfood.isSelected()) {
        newsort.setRowFilter(RowFilter.regexFilter("FriedFood",2));
        items.setRowSorter(newsort);
         model.fireTableDataChanged();   
        } else {
            newsort.setRowFilter(RowFilter.regexFilter("",2));
            items.setRowSorter(newsort);
            model.fireTableDataChanged(); 
        }
        
    }//GEN-LAST:event_sortfriedfoodActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) items.getModel();
        TableRowSorter sorting = new TableRowSorter<>(model);
        String getbyname = search.getText();
        sorting.setRowFilter(RowFilter.regexFilter(getbyname,0));
        items.setRowSorter(sorting);
    }//GEN-LAST:event_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Userinterface userin = new Userinterface();
        System.out.println(new SingleUserManager("admin").getUserdata());
        userin.showinfo(usernameob);
        userin.show();
        userin.setLocationRelativeTo(this);
        userin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable cart;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel discout;
    private javax.swing.JTable items;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reset;
    private javax.swing.JTextField search;
    private javax.swing.JCheckBox sortfriedfood;
    private javax.swing.JCheckBox sortseafood;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    
}
