/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import tools.Util;
import dao.VendedorPbt_DAO;
import bean.VendedorPbt;

/**
 *
 * @author Ever
 */
public class JDlgVendedor extends javax.swing.JFrame {
    public VendedorPbt vendedor = new VendedorPbt();
    public VendedorPbt_DAO vendedorDAO = new VendedorPbt_DAO();
    private boolean incluindo;
    /**
     * Creates new form JDlgVendedor
     */
    public JDlgVendedor() {
        initComponents();
    }
    
        public VendedorPbt viewBean(){ 
        
                VendedorPbt vendedorBean = new VendedorPbt();
     
                vendedorBean.setIdvendedorPbt (Util.strInt(idvendedorPbt.getText()));
                vendedorBean.setNomePbt(nomePbt.getText());
                vendedorBean.setEmailPbt(emailPbt.getText());
                vendedorBean.setTelefonePbt(telefonePbt.getText());
                vendedorBean.setEnderecoPbt(enderecoPbt.getText());       
                
                
                return vendedorBean;
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idvendedorPbt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomePbt = new javax.swing.JFormattedTextField();
        emailPbt = new javax.swing.JTextField();
        telefonePbt = new javax.swing.JFormattedTextField();
        enderecoPbt = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vendedorPbtcol = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Código");

        jLabel3.setText("Endereço");

        idvendedorPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idvendedorPbtActionPerformed(evt);
            }
        });

        jLabel4.setText(" Nome");

        nomePbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePbtActionPerformed(evt);
            }
        });

        emailPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailPbtActionPerformed(evt);
            }
        });

        enderecoPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoPbtActionPerformed(evt);
            }
        });

        jBtnIncluir.setText("INCLUIR");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("ALTERAR");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("EXCLUIR");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setText("CONFIRMAR");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone");

        jBtnPesquisar.setText("PESQUISAR");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel6.setText(" CNPJ");

        vendedorPbtcol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorPbtcolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBtnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(idvendedorPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(emailPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(telefonePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vendedorPbtcol, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idvendedorPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendedorPbtcol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idvendedorPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idvendedorPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idvendedorPbtActionPerformed

    private void nomePbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePbtActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        Util.habilitar(true, idvendedorPbt,  nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt);// TODO add your handling code here:
        incluindo = true;
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        Util.habilitar(true, idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt, jBtnCancelar, jBtnConfirmar);

        incluindo = false; // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (Util.perguntar("Deseja excluir o registro?") == true){
            vendedor = viewBean();
            vendedorDAO.delete(vendedor);
        }
        else {

            Util.mensagem("Exclusão cancelada");
        }
        Util.limparCampos(idvendedorPbt, telefonePbt, emailPbt, nomePbt, enderecoPbt, jBtnConfirmar, jBtnCancelar);    // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        vendedor = viewBean();
        if (incluindo == true) {
            vendedorDAO.insert(vendedor);
        } else {
            vendedorDAO.update(vendedor);
        }

        Util.habilitar(false, idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt, jBtnConfirmar, jBtnExcluir);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.limparCampos(idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt);  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.habilitar(false);
        Util.mensagem("Cancelamento concluido");
        Util.limparCampos(idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgVendedorPesquisar jDlgVendedorPesquisar = new JDlgVendedorPesquisar();
        jDlgVendedorPesquisar.setTitle("Pesquisar Vendedor");
        jDlgVendedorPesquisar.setVisible(true);
        Util.habilitar(false, idvendedorPbt, nomePbt, telefonePbt, emailPbt, nomePbt, enderecoPbt, jBtnConfirmar, jBtnExcluir);
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jBtnAlterar);
        //transformou string em inteiro

        //DrfFornecedor DrfFornecedor_DAO = new DrfFornecedor_DAO();
        //DrfFornecedor fornecedor = (DrfFornecedor)  DrfFornecedor_DAO.list(id);
        //retorna um bean e mostra na tela
        //beanView(usuarios);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void emailPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailPbtActionPerformed

    private void vendedorPbtcolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorPbtcolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedorPbtcolActionPerformed

    private void enderecoPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoPbtActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDlgVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailPbt;
    private javax.swing.JTextField enderecoPbt;
    private javax.swing.JTextField idvendedorPbt;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFormattedTextField nomePbt;
    private javax.swing.JFormattedTextField telefonePbt;
    private javax.swing.JFormattedTextField vendedorPbtcol;
    // End of variables declaration//GEN-END:variables
}