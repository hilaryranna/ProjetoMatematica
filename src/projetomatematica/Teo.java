/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomatematica;

import javax.swing.JOptionPane;

/**
 *
 * @author TI431
 */
public class Teo extends javax.swing.JFrame {

    double H;
    double CO;
    double CA;

    public Teo() {
        initComponents();
        setSize(1000, 600);
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 937, 536));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Teorema de Pitágoras:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 270, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Digite o valor da hipotenusa:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 120, 249, 41);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(600, 160, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("H");
        jLabel7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel7FocusLost(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 170, 50, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("C.A.");
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel9FocusLost(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 430, 40, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("C.O.");
        jLabel8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel8FocusLost(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 150, 40, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Digite o valor do cateto Oposto:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 200, 254, 22);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(600, 230, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Digite o valor do cateto Adjacente:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 280, 274, 22);

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(600, 310, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("a²+ b²= c²");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 400, 135, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 450, 86, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 450, 90, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomatematica/trianguloretanguloangulo1.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 150));
        jLabel10.setMinimumSize(new java.awt.Dimension(200, 150));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-20, 110, 610, 370);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Observação: os catetos são denominados a partir da referência do ângulo estabelecido.");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 490, 900, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jLabel7.setText(jTextField1.getText());
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        jLabel8.setText(jTextField2.getText());
    }//GEN-LAST:event_jTextField2FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // calcular

        if (jTextField1.getText().trim().isEmpty()) {
            try {
                CO = Double.parseDouble(jTextField2.getText());
                CA = Double.parseDouble(jTextField3.getText());
                H = Math.sqrt(Math.pow(CO, 2) + Math.pow(CA, 2));
                jTextField1.setText("" + H);
                jLabel7.setText(jTextField1.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao calcular. " + e.getMessage());
            }
        } else if (jTextField2.getText().trim().isEmpty()) {
            try {

                CA = Double.parseDouble(jTextField3.getText());
                H = Double.parseDouble(jTextField1.getText());
                if (H > CA){
                  CO = Math.sqrt(Math.pow(H, 2) - Math.pow(CA, 2));
                  jTextField2.setText("" + CO);
                  jLabel8.setText(jTextField2.getText());
                }
                else
                  JOptionPane.showMessageDialog(null, "Você precisa informar um valor maior\npara a Hipotenusa que o Cateto Adjacente .");  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao calcular. " + e.getMessage());
            }
        } else if (jTextField3.getText().trim().isEmpty()) {
            try {
                CO = Double.parseDouble(jTextField2.getText());
                H = Double.parseDouble(jTextField1.getText());
                if (H > CO){
                CA = Math.sqrt(Math.pow(H, 2) - Math.pow(CO, 2));
                jTextField3.setText("" + CA);
                jLabel9.setText(jTextField3.getText());
                }else
                  JOptionPane.showMessageDialog(null, "Você precisa informar um valor maior\npara a Hipotenusa que o Cateto Oposto .");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao calcular. " + e.getMessage());
            }
        } else 
            JOptionPane.showMessageDialog(null, "Você precisa deixar um campo em branco para o calculo.");
            




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handlin
        jLabel9.setText(jTextField3.getText());
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //limpar
        jTextField1.setText("");
        jLabel7.setText(jTextField1.getText());
        jTextField2.setText("");
        jLabel8.setText(jTextField2.getText());
        jTextField3.setText("");
        jLabel9.setText(jTextField3.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel7FocusLost
        // TODO add your handling code here://foco da hipotenusa
        if (jTextField1.getText().trim().isEmpty()) {
            jLabel7.setText(jTextField1.getText());
        }
    }//GEN-LAST:event_jLabel7FocusLost

    private void jLabel8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel8FocusLost
        //CO

        if (jTextField2.getText().trim().isEmpty()) {
            jLabel8.setText(jTextField2.getText());
        }

    }//GEN-LAST:event_jLabel8FocusLost

    private void jLabel9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusLost
        // CA


        if (jTextField3.getText().trim().isEmpty()) {
            jLabel9.setText(jTextField3.getText());
        }
    }//GEN-LAST:event_jLabel9FocusLost

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
            java.util.logging.Logger.getLogger(Teo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
