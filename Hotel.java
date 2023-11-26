package Project;

import javax.swing.JOptionPane;

/**
 *
 * @author algorithmxboss
 */
public class Hotel extends javax.swing.JFrame {

    /**
     * Creates new form Hotel
     */
    public Hotel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        superior_rd = new javax.swing.JRadioButton();
        deluxe_rd = new javax.swing.JRadioButton();
        grandDeluxe_rd = new javax.swing.JRadioButton();
        juniorSuit_rd = new javax.swing.JRadioButton();
        grandFamilySuit_rd = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        day_cbx = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dayAmount = new javax.swing.JSpinner();
        calculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");

        jLabel1.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 36)); // NOI18N
        jLabel1.setText("Hotel Reservation");

        jLabel2.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel2.setText("ประเภทห้องพัก");

        buttonGroup1.add(superior_rd);
        superior_rd.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        superior_rd.setText("Superior");
        superior_rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superior_rdActionPerformed(evt);
            }
        });

        buttonGroup1.add(deluxe_rd);
        deluxe_rd.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        deluxe_rd.setText("Deluxe");
        deluxe_rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxe_rdActionPerformed(evt);
            }
        });

        buttonGroup1.add(grandDeluxe_rd);
        grandDeluxe_rd.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        grandDeluxe_rd.setText("Grand Deluxe");
        grandDeluxe_rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandDeluxe_rdActionPerformed(evt);
            }
        });

        buttonGroup1.add(juniorSuit_rd);
        juniorSuit_rd.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        juniorSuit_rd.setText("Junior Suit");
        juniorSuit_rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juniorSuit_rdActionPerformed(evt);
            }
        });

        buttonGroup1.add(grandFamilySuit_rd);
        grandFamilySuit_rd.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        grandFamilySuit_rd.setText("Grand Family Suit");
        grandFamilySuit_rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandFamilySuit_rdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel3.setText("ช่วงเวลาที่เข้าพัก");

        day_cbx.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 14)); // NOI18N
        day_cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekday", "Weekend", "Long Weekend" }));
        day_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_cbxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel4.setText("จำนวนวันเข้าพัก");

        dayAmount.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 14)); // NOI18N

        calculate.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        calculate.setText("คำนวณราคา");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        show.setColumns(20);
        show.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 16)); // NOI18N
        show.setRows(5);
        jScrollPane1.setViewportView(show);

        clear.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(juniorSuit_rd)
                                        .addGap(18, 18, 18)
                                        .addComponent(grandFamilySuit_rd))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(superior_rd)
                                        .addGap(18, 18, 18)
                                        .addComponent(deluxe_rd)
                                        .addGap(18, 18, 18)
                                        .addComponent(grandDeluxe_rd))
                                    .addComponent(day_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(superior_rd)
                            .addComponent(deluxe_rd)
                            .addComponent(grandDeluxe_rd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(juniorSuit_rd)
                            .addComponent(grandFamilySuit_rd))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(day_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void superior_rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superior_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superior_rdActionPerformed

    private void deluxe_rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxe_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deluxe_rdActionPerformed

    private void grandDeluxe_rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandDeluxe_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grandDeluxe_rdActionPerformed

    private void juniorSuit_rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juniorSuit_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juniorSuit_rdActionPerformed

    private void grandFamilySuit_rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandFamilySuit_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grandFamilySuit_rdActionPerformed

    private void day_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_cbxActionPerformed
        String day = (String) day_cbx.getSelectedItem();
        if (day_cbx.equals("Weekday")) {
            day_cbx.setEnabled(true);
        }

    }//GEN-LAST:event_day_cbxActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        buttonGroup1.clearSelection();
        day_cbx.setEditable(true);
        dayAmount.setValue(0);
        show.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        String day = (String) day_cbx.getSelectedItem();

        try {

            if (superior_rd.isSelected() == true && day.equals("Weekday")) {
                int weekday = 2090;
                int weekend = weekday + 400;
                int longWeekend = weekday + 1200;
                
                String wd = String.format("%.2f", weekday);
                String we = String.format("%.2f", weekend);
                String lwd = String.format("%.2f", longWeekend);
                
                show.append("ประเภทของห้อง : Superior");
                show.append("ช่วงเวลาเข้าพัก : Weekday");
                show.append("รวมราคา : " + wd);
            }
//            if (superior_rd.isSelected()) {
//                int room1 = 2090;
//                int weekend = room1 + 400;
//                int longWeekend = room1 + 1200;
//
//                show.setText("ประเภทห้อง : Superior");
//            }
//            if (deluxe_rd.isSelected()) {
//                int room2 = 2290;
//
//                show.setText("ประเภทห้อง : Deluxe");
//            }
//            if (grandDeluxe_rd.isSelected()) {
//                int room3 = 3890;
//                show.setText("ประเภทห้อง : Grand Deluxe");
//            }
//            if (juniorSuit_rd.isSelected()) {
//                int room4 = 3190;
//                show.setText("ประเภทห้อง : Junior Suit");
//            }
//            if (grandFamilySuit_rd.isSelected()) {
//                int room5 = 3990;
//                show.setText("ประเภทห้อง : Grand Family Suit");
//            }
//
//            switch (day) {
//                case "weekday":
//                    show.append("Weekday");
//                    break;
//                default:
//                    throw new AssertionError();
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบ");
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JSpinner dayAmount;
    private javax.swing.JComboBox<String> day_cbx;
    private javax.swing.JRadioButton deluxe_rd;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton grandDeluxe_rd;
    private javax.swing.JRadioButton grandFamilySuit_rd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton juniorSuit_rd;
    private javax.swing.JTextArea show;
    private javax.swing.JRadioButton superior_rd;
    // End of variables declaration//GEN-END:variables
}
