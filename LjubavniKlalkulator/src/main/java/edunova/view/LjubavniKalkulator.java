/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import java.util.Arrays;

/**
 *
 * @author Marta
 */
public class LjubavniKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form LjubavniKalkulator
     */
    public LjubavniKalkulator() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOna = new javax.swing.JLabel();
        lblOn = new javax.swing.JLabel();
        txtOna = new javax.swing.JTextField();
        txtOn = new javax.swing.JTextField();
        btnVoleSe = new javax.swing.JButton();
        lblPosto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        lblOna.setBackground(new java.awt.Color(255, 102, 255));
        lblOna.setText("ONA");

        lblOn.setText("ON");

        txtOna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnaActionPerformed(evt);
            }
        });

        btnVoleSe.setText("VOLE SE");
        btnVoleSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoleSeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("LJUBAVNI KALKULATOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOna, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOna, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnVoleSe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOna, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOna, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtOn))
                .addGap(39, 39, 39)
                .addComponent(btnVoleSe)
                .addGap(29, 29, 29)
                .addComponent(lblPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnaActionPerformed
        
    }//GEN-LAST:event_txtOnaActionPerformed

    private void btnVoleSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoleSeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoleSeActionPerformed

    private String složiPoAbecedi (){
        
        String string = ((txtOna.getText() + txtOn.getText()).toLowerCase());
        
        
        char temp;
        char[] tempArray = string.toCharArray();
        for (int i = 1; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length - 1; j++) {
                if (tempArray[j] > tempArray[j + 1]) {
                    temp =  tempArray[j];
                 tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }
        return String.valueOf(tempArray).trim();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoleSe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblOn;
    private javax.swing.JLabel lblOna;
    private javax.swing.JLabel lblPosto;
    private javax.swing.JTextField txtOn;
    private javax.swing.JTextField txtOna;
    // End of variables declaration//GEN-END:variables
}
