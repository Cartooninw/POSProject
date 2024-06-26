/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Shopmain;

import javax.swing.table.DefaultTableModel;
import Data.OPD;
import Main.Main;
import MainUser.MultiUserData;
import MainUser.User;
import Data.DataBase;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author cart
 */
public class sumorder extends javax.swing.JFrame  {
    public DataBase baseManager = new DataBase();
    public static InterOrder cartlista = new InterOrder();
    public MultiUserData data = new MultiUserData(); 
    public String username;
    public double Globaltotal = 0;
    public double basepay;
    boolean ismoneygreater ;
    double  totalPay;
    Map<Integer,Object> Items = new HashMap<>();
    double basemoney = 0;
    
    public sumorder() {
        initComponents();
        data.readdata();
//        double totalget = 0;
        User user = data.getSelectuser(username);
        for (Menu item : cartlista.getcart()) {
            Globaltotal += item.getPrice(); 
        }
            basepay = Globaltotal;
            pricetotal.setText(String.format("%.2f", basepay));
            discouttotal.setText("0");
            total.setText(String.format("%.2f", Globaltotal));
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void Guest() {
        this.username = "Guest";
        pointcheck.setEnabled(false);
        moneycheck.setEnabled(false);
    }
    
    public  void toordertable() {
        DefaultTableModel model =  (DefaultTableModel) order.getModel();
        int count = 0;
        for (Menu item : cartlista.getcart()) {
            Object[] itemto = {item.getName() , item.getPrice() , item.getType()};
            Items.put(count, itemto);
                    count ++;
            model.addRow(itemto);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        pay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        discouttotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricetotal = new javax.swing.JLabel();
        moneycheck = new javax.swing.JCheckBox();
        pointcheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("This is your order:");

        order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(order);
        if (order.getColumnModel().getColumnCount() > 0) {
            order.getColumnModel().getColumn(0).setResizable(false);
            order.getColumnModel().getColumn(1).setResizable(false);
        }

        pay.setBackground(new java.awt.Color(51, 255, 51));
        pay.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Total discout");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Total");

        discouttotal.setText("jLabel4");

        total.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Total price");

        pricetotal.setText("jLabel7");

        moneycheck.setText("Use your balance");
        moneycheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneycheckActionPerformed(evt);
            }
        });

        pointcheck.setText("Use your point");
        pointcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointcheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pointcheck)
                            .addComponent(moneycheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pricetotal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discouttotal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pricetotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discouttotal)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moneycheck)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pointcheck)))
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
//        double totalget = 0;
        double pointdiscout = 0 ;
         double point = 0;
         User user = null;
         boolean hasuser = false;
        try {
            user= data.getSelectuser(username);
            point = user.getPoint();
            hasuser = true;
        } catch (Exception e) {
            System.out.println("Guset has no data");
        }
        
//        for (Menu item : cartlista.getcart()) {
////            totalget += item.getPrice(); 
//        }
            if (pointcheck.isSelected()) {
                    for (Menu item : cartlista.getcart()) {
                        if (Globaltotal > item.discout(item.getPrice(), point)) {
                            pointdiscout += item.discout(item.getPrice(), point);
                        } else {
                            pointdiscout += Globaltotal;
                            break;
                        }
                    }
             if (pointdiscout > 0) {
                OPD.addDiscoutCount();
                user.setPoint(0);
            }
        } else if (!pointcheck.isSelected() && hasuser){
//            System.out.println("hello");
                point += Globaltotal * 0.1;
                user.setPoint(point);
            }
            
            
//         = Globaltotal - pointdiscout;

            
//        if (moneycheck.isSelected()) {
//            if (user.getMoney() <= totalPay) {
//                user.setMoney(0);
//            } else {
//                System.out.println(Globaltotal);
//                user.setMoney(user.getMoney() - totalPay);
//            }
//        } 
        

        OPD.addOrderCount();
        OPD.addRevenueCount(Double.parseDouble(String.format("%.3f", Globaltotal)));
        
        StringBuilder torecord = new StringBuilder();
        if (username.equals("Guest")) {
            torecord.append("Guest;");
        } else {
            torecord.append(username+";");
        }
        
        Items.forEach((key,item) -> {
            Object[] array = (Object[]) item;
            if (key == Items.size() - 1) {
                torecord.append(String.format("%s-%.2f;", array[0],array[1]));
            } else {
                torecord.append(String.format("%s-%.2f/", array[0],array[1]));
            }
        });
        LocalDate datenow = LocalDate.now();
        DateTimeFormatter formatdate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatdate2 = DateTimeFormatter.ofPattern("ddMMyyyy");
        torecord.append(String.format("%.3f", Globaltotal)+";"+datenow.format(formatdate)+";");
        torecord.append(datenow.format(formatdate2)+""+Main.recordcountorder+"\n");
        Main.recordcountorder ++;
        baseManager.addRecordData(torecord.toString());
        
//        System.out.println(OPD.getRevenueCount()+OPD.getOrderCount());
        if (user != null) {
        data.setPointBySelected(username);
        data.updatedata();
        data.readdata();
        }
        
        Main reto = new Main();
        reto.show();
        reto.setLocationRelativeTo(this);
        reto.setVisible(true);
        Order.ordermn.dispose();
        sumorder.cartlista.clearcart();
        this.dispose();
        
    }//GEN-LAST:event_payActionPerformed

    private void pointcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointcheckActionPerformed
        // TODO add your handling code here:
//        double totalget = 0;
        double pointdiscout = 0 ;
;
        User user = data.getSelectuser(username);
        double point = user.getPoint();
//        for (Menu item : cartlista.getcart()) {
//            totalget += item.getPrice(); 
//        }
            if (pointcheck.isSelected()) {
                    for (Menu item : cartlista.getcart()) {
                        if (Globaltotal > item.discout(item.getPrice(), point)) {
                            pointdiscout += item.discout(item.getPrice(), point);
                        } else {
                            pointdiscout += Globaltotal;
                            break;
                        }
                    }
                        Globaltotal -= pointdiscout;

        } else {
                for (Menu item : cartlista.getcart()) {
                        if (Globaltotal > item.discout(item.getPrice(), point)) {
                            pointdiscout += item.discout(item.getPrice(), point);
                        } else {
                            pointdiscout += Globaltotal;
                            break;
                        }
                    }
                        Globaltotal += pointdiscout;
                        pointdiscout -= pointdiscout;
            } 

//        if (pointcheck.isSelected()) {
//            pricetotal.setText(String.format("%.2f", basepay));
//            discouttotal.setText(pointdiscout+"");
//            total.setText(String.format("%.2f", Globaltotal));
//        } else {
            pricetotal.setText(String.format("%.2f", basepay));
            discouttotal.setText(String.format("%.2f", pointdiscout));
            total.setText(String.format("%.2f", Globaltotal));
//        }
    }//GEN-LAST:event_pointcheckActionPerformed

    private void moneycheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneycheckActionPerformed
        // TODO add your handling code here:
        User user = data.getSelectuser(username);
        double money = user.getMoney();
//        double moneypay = 0;
//        for (Menu item : cartlista.getcart()) {
//            moneypay += item.getPrice();
//        }
        
    
//        double totalpay = Globaltotal;
        if (moneycheck.isSelected()) {
            if (money < Globaltotal) {
                basemoney += money;
                System.out.println(basemoney);
                 Globaltotal -= money;
                 money -= money;
                 ismoneygreater = true;
            } else {
                ismoneygreater = false;
                basemoney += money;
                money -= Globaltotal;
                Globaltotal -= Globaltotal; 
                pointcheck.setEnabled(false);
                pointcheck.setSelected(false);
                discouttotal.setText("0");
            }
        } else {
            if (ismoneygreater) {
                money += basemoney;
//                System.out.println(money);
                Globaltotal += money;
                basemoney -= money;
//            } 
//            else if (money <= Globaltotal && pointcheck.isSelected()){
//                  money += basemoney;
//                  Globaltotal += 
            }
            else {
                money += basepay;
                Globaltotal += basepay;
                pointcheck.setEnabled(true);
//                Globaltotal -= Globaltotal; 6
            }
        }
        
            user.setMoney(money);
            pricetotal.setText(String.format("%.2f", basepay));
            total.setText(String.format("%.2f", Globaltotal));

    }//GEN-LAST:event_moneycheckActionPerformed

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
            java.util.logging.Logger.getLogger(sumorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sumorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sumorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sumorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel discouttotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox moneycheck;
    private javax.swing.JTable order;
    private javax.swing.JButton pay;
    private javax.swing.JCheckBox pointcheck;
    private javax.swing.JLabel pricetotal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
