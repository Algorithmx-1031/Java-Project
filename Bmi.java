
package Project;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author algorithmxboss
 */
public class Bmi extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Bmi() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        head_lb = new javax.swing.JLabel();
        weight_txt = new javax.swing.JTextField();
        height_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        claculate_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        show_lb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 177, 59));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        exit_btn.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 14)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel5.setText("ผล");

        head_lb.setBackground(new java.awt.Color(255, 255, 255));
        head_lb.setFont(new java.awt.Font("LINE Seed Sans TH App", 0, 36)); // NOI18N
        head_lb.setText("น้ำหนักและส่วนสูง");

        weight_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weight_txtActionPerformed(evt);
            }
        });

        height_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height_txtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel1.setText("น้ำหนัก");

        jLabel2.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel2.setText("ความสูง");

        jLabel3.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel3.setText("กิโลกรัม");

        jLabel4.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 18)); // NOI18N
        jLabel4.setText("เซนติเมตร");

        claculate_btn.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 14)); // NOI18N
        claculate_btn.setText("คำนวณ");
        claculate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claculate_btnActionPerformed(evt);
            }
        });

        clear_btn.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 14)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        show_lb.setFont(new java.awt.Font("LINE Seed Sans TH", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(head_lb)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(show_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(claculate_btn)
                        .addGap(33, 33, 33)
                        .addComponent(clear_btn)
                        .addGap(31, 31, 31)
                        .addComponent(exit_btn)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(head_lb)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claculate_btn)
                    .addComponent(clear_btn)
                    .addComponent(exit_btn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(show_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        weight_txt.setText("");
        height_txt.setText("");
        show_lb.setText("");
        show_lb.setBackground(Color.WHITE);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void claculate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claculate_btnActionPerformed
        //        String w = weight_txt.getText();
        double height = Double.parseDouble(height_txt.getText());
        double weight = Double.parseDouble(weight_txt.getText());

        double height2 = height / 100;
        double heightSum = height2*height2;
        double bmi = weight/heightSum;
        //        String bmi2 = String.format("%.1f", bmi);

        if(bmi < 18) {
            show_lb.setText("ต่ำกว่าเกณฑ์");
            show_lb.setBackground(new Color(51, 51, 51));
            show_lb.setForeground(Color.WHITE);
        }
        if(bmi >= 18 && bmi <= 22.9) {
            show_lb.setText("ปกติ");
            show_lb.setBackground(new Color(0, 102, 0));
            show_lb.setForeground(Color.WHITE);
        }
        if(bmi >= 23 && bmi <= 24.9) {
            show_lb.setText("ท้วม");
            show_lb.setBackground(Color.YELLOW);
            show_lb.setForeground(Color.BLACK);
        }
        if(bmi >= 25 && bmi <= 29.9) {
            show_lb.setText("อ้วนระดับที่ 1");
            show_lb.setBackground(new Color(255, 153, 255));
            show_lb.setForeground(Color.WHITE);
        }
        if(bmi >= 30) {
            show_lb.setText("อ้วนระดับที่ 2");
            show_lb.setBackground(Color.red);
            show_lb.setForeground(Color.WHITE);
        }
        //else {
            //            show_lb.setText("ERROR Pease try again.");
            //        }

    }//GEN-LAST:event_claculate_btnActionPerformed

    private void height_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height_txtActionPerformed

    private void weight_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weight_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weight_txtActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton claculate_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel head_lb;
    private javax.swing.JTextField height_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField show_lb;
    private javax.swing.JTextField weight_txt;
    // End of variables declaration//GEN-END:variables
}
