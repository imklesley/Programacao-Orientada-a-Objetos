/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Klesley Gonçalves
 */
public class SenhaCartao extends javax.swing.JFrame {

    /**
     * Creates new form SenhaCartao
     */
    public SenhaCartao() {
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

        jLabel1 = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jBSOK = new javax.swing.JButton();
        jBS1 = new javax.swing.JButton();
        jBS2 = new javax.swing.JButton();
        jBS3 = new javax.swing.JButton();
        jBS4 = new javax.swing.JButton();
        jBS5 = new javax.swing.JButton();
        jBS6 = new javax.swing.JButton();
        jBS7 = new javax.swing.JButton();
        jBS8 = new javax.swing.JButton();
        jBS9 = new javax.swing.JButton();
        jBApaga = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("INFORME SUA SENHA POR FAVOR");

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        jBSOK.setText("OK");
        jBSOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSOKActionPerformed(evt);
            }
        });

        jBS1.setText("1");
        jBS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS1ActionPerformed(evt);
            }
        });

        jBS2.setText("2");
        jBS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS2ActionPerformed(evt);
            }
        });

        jBS3.setText("3");
        jBS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS3ActionPerformed(evt);
            }
        });

        jBS4.setText("4");
        jBS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS4ActionPerformed(evt);
            }
        });

        jBS5.setText("5");
        jBS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS5ActionPerformed(evt);
            }
        });

        jBS6.setText("6");
        jBS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS6ActionPerformed(evt);
            }
        });

        jBS7.setText("7");
        jBS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS7ActionPerformed(evt);
            }
        });

        jBS8.setText("8");
        jBS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS8ActionPerformed(evt);
            }
        });

        jBS9.setText("9");
        jBS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBS9ActionPerformed(evt);
            }
        });

        jBApaga.setText("<-");
        jBApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBApaga)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBS4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBS7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBS9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jBSOK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBApaga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBS1)
                    .addComponent(jBS2)
                    .addComponent(jBS3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBS4)
                    .addComponent(jBS5)
                    .addComponent(jBS6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBS7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBS8)
                        .addComponent(jBS9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSOK)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSOKActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_jBSOKActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jBS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS1ActionPerformed
        jPass.setText(jPass.getText()+"1");
    }//GEN-LAST:event_jBS1ActionPerformed

    private void jBS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS2ActionPerformed
        jPass.setText(jPass.getText()+"2");
    }//GEN-LAST:event_jBS2ActionPerformed

    private void jBS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS3ActionPerformed
        jPass.setText(jPass.getText()+"3");
    }//GEN-LAST:event_jBS3ActionPerformed

    private void jBS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS4ActionPerformed
        jPass.setText(jPass.getText()+"4");
    }//GEN-LAST:event_jBS4ActionPerformed

    private void jBS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS5ActionPerformed
        jPass.setText(jPass.getText()+"5");
    }//GEN-LAST:event_jBS5ActionPerformed

    private void jBS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS6ActionPerformed
        jPass.setText(jPass.getText()+"6");
    }//GEN-LAST:event_jBS6ActionPerformed

    private void jBS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS7ActionPerformed
        jPass.setText(jPass.getText()+"7");
    }//GEN-LAST:event_jBS7ActionPerformed

    private void jBS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS8ActionPerformed
        jPass.setText(jPass.getText()+"8");
    }//GEN-LAST:event_jBS8ActionPerformed

    private void jBS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBS9ActionPerformed
        jPass.setText(jPass.getText()+"9");
    }//GEN-LAST:event_jBS9ActionPerformed

    private void jBApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagaActionPerformed
        String conteudo = jPass.getText();
        if(conteudo.length()>0){
            conteudo=conteudo.substring(0,conteudo.length()-1);
            jPass.setText(conteudo);
        }

    }//GEN-LAST:event_jBApagaActionPerformed

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
            java.util.logging.Logger.getLogger(SenhaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenhaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenhaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenhaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SenhaCartao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApaga;
    private javax.swing.JButton jBS1;
    private javax.swing.JButton jBS2;
    private javax.swing.JButton jBS3;
    private javax.swing.JButton jBS4;
    private javax.swing.JButton jBS5;
    private javax.swing.JButton jBS6;
    private javax.swing.JButton jBS7;
    private javax.swing.JButton jBS8;
    private javax.swing.JButton jBS9;
    private javax.swing.JButton jBSOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPass;
    // End of variables declaration//GEN-END:variables
}
