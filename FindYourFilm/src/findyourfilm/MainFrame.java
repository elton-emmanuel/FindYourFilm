/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourfilm;
import java.util.logging.Logger;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author elton
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form java
     */
    public boolean child = false;
    public MainFrame() {
        initComponents();
      
    }
    public MainFrame(Customer user)
    {
        initComponents();
        welcomeLbl.setText(("Welcome " + user.name));
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBtn = new javax.swing.JButton();
        quickSearchBtn = new javax.swing.JButton();
        advSearchBtn = new javax.swing.JButton();
        childModeBtn = new javax.swing.JButton();
        viewTicketsBtn = new javax.swing.JButton();
        welcomeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        quickSearchBtn.setText("Quick Search");
        quickSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSearchBtnActionPerformed(evt);
            }
        });

        advSearchBtn.setText("Advanced Search");
        advSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advSearchBtnActionPerformed(evt);
            }
        });

        childModeBtn.setText("Child Mode");
        childModeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childModeBtnActionPerformed(evt);
            }
        });

        viewTicketsBtn.setText("View Tickets");
        viewTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketsBtnActionPerformed(evt);
            }
        });

        welcomeLbl.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        welcomeLbl.setText("Welcome [Customer Name]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(childModeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewTicketsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(advSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(quickSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quickSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(advSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(viewTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(childModeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void advSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advSearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_advSearchBtnActionPerformed

    private void quickSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSearchBtnActionPerformed
        // TODO add your handling code here:
        new MovieFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_quickSearchBtnActionPerformed

    private void viewTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTicketsBtnActionPerformed
        // TODO add your handling code here:
        new ViewTicketForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_viewTicketsBtnActionPerformed

    private void childModeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childModeBtnActionPerformed
        // TODO add your handling code here:
        child = !child;
        if(child)
        JOptionPane.showMessageDialog(this, "You are now in Child Mode");
        else
        JOptionPane.showMessageDialog(this, "You have exited Child Mode");
    }//GEN-LAST:event_childModeBtnActionPerformed

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
            MainFrame.util.logging.Logger.getLogger(MainFrame.class.getName()).log(MainFrame.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            MainFrame.util.logging.Logger.getLogger(MainFrame.class.getName()).log(MainFrame.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            MainFrame.util.logging.Logger.getLogger(MainFrame.class.getName()).log(MainFrame.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            MainFrame.util.logging.Logger.getLogger(MainFrame.class.getName()).log(MainFrame.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advSearchBtn;
    private javax.swing.JButton childModeBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton quickSearchBtn;
    private javax.swing.JButton viewTicketsBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
