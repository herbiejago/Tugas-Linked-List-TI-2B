/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdbSma;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Lenovo
 */
public class FrameAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdmin
     */
    ModelTabel modelTabel = new ModelTabel();
    int kodeSekolahUpdate;
    int kuotaUpdateBaru;
    public FrameAdmin() {
        initComponents();
        tabelSekolah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row=tabelSekolah.rowAtPoint(e.getPoint());
                int col= tabelSekolah.columnAtPoint(e.getPoint());
                if(true){
                   System.out.println("XXXXX");
                   kodeSekolahUpdate = Integer.parseInt(tabelSekolah.getValueAt(row,0).toString());
                   fieldKuotaBaru.setText(tabelSekolah.getValueAt(row, 2).toString());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSekolah = new javax.swing.JTable();
        fieldKuotaBaru = new javax.swing.JTextField();
        tombolUpdateKuota = new javax.swing.JButton();
        tombolProses = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textPaneOutput = new javax.swing.JTextPane();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelSekolah.setModel(modelTabel);
        jScrollPane2.setViewportView(tabelSekolah);

        tombolUpdateKuota.setText("Update Kuota");
        tombolUpdateKuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateKuotaActionPerformed(evt);
            }
        });

        tombolProses.setText("Proses");
        tombolProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolProsesActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(textPaneOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tombolUpdateKuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldKuotaBaru)
                    .addComponent(tombolProses, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldKuotaBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tombolUpdateKuota)
                        .addGap(18, 18, 18)
                        .addComponent(tombolProses))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolUpdateKuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateKuotaActionPerformed
        // TODO add your handling code here:
        kuotaUpdateBaru = Integer.parseInt(fieldKuotaBaru.getText());
        modelTabel.updateKuota(kodeSekolahUpdate, kuotaUpdateBaru);
//        tabelSekolah.repaint();
    }//GEN-LAST:event_tombolUpdateKuotaActionPerformed

    private void tombolProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolProsesActionPerformed
        // TODO add your handling code here:
        MainLogic.proses();
        textPaneOutput.setText(MainLogic.getOutput());
    }//GEN-LAST:event_tombolProsesActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldKuotaBaru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelSekolah;
    private javax.swing.JTextPane textPaneOutput;
    private javax.swing.JButton tombolProses;
    private javax.swing.JButton tombolUpdateKuota;
    // End of variables declaration//GEN-END:variables
}
