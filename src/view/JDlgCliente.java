/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import tools.Util;
import bean.ClientePbt;
import dao.ClientePbt_DAO;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;

/**
 *
 * @author Ever
 */
public class JDlgCliente extends javax.swing.JDialog {

    private  boolean incluindo;
    private ClientePbt cliente;
    private ClientePbt_DAO clienteDAO;
    MaskFormatter mascaracep, mascaracpf,mascaradatanascimento, mascaratelefone, mascararg;
    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Util.habilitar(false, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt);
        //Util.habilitar(true, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimento, apelidoPbt, paisPbt, barroPbt, cepPbt, sexoPbt, celularPbt, rgPbt, cidadePbt);
        setTitle("Cliente");
        setLocationRelativeTo(null);
        clienteDAO = new ClientePbt_DAO();
        cliente= new ClientePbt();
         
         try {
          mascaracpf = new MaskFormatter("###.###.###-##");
          mascaracep = new MaskFormatter("######-###");
          mascaradatanascimento = new MaskFormatter("##/##/####");
          mascaratelefone = new MaskFormatter("(##)#####-####");
          mascararg = new MaskFormatter("#.###.###");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    
        cpf.setFormatterFactory(new DefaultFormatterFactory(mascaracpf));
        telefonePbt.setFormatterFactory(new DefaultFormatterFactory(mascaratelefone));
        cepPbt.setFormatterFactory(new DefaultFormatterFactory(mascaracep));
        rgPbt.setFormatterFactory(new DefaultFormatterFactory(mascararg));
        datanascimentopbt.setFormatterFactory(new DefaultFormatterFactory(mascaradatanascimento));
        celularPbt.setFormatterFactory(new DefaultFormatterFactory(mascaratelefone));
        
    
    }
    
    
    
     public ClientePbt viewBean() {
        ClientePbt cliente = new ClientePbt();
        cliente.setIdClientePbt(Util.strInt(idClientePbt.getText()));
        cliente.setNomePbt(nomePbt.getText());
        cliente.setApelidoPbt(apelidoPbt.getText());
        cliente.setBarroPbt(barroPbt.getText());
        cliente.setCelularPbt(celularPbt.getText());
        cliente.setCpfPbt(cpf.getText());
        cliente.setDadospagamentoPbt(dadospagamentoPbt.getText());
        cliente.setDatanascimentoPbt(Util.strDate(datanascimentopbt.getText()));
        cliente.setEmailPbt(emailPbt.getText());
        cliente.setPaisPbt(paisPbt.getText());
        cliente.setRgPbt(rgPbt.getText());
        cliente.setSexoPbt(SexoPbt.getSelectedIndex());
        cliente.setTelefonePbt(telefonePbt.getText());
        cliente.setCepPbt(cepPbt.getText());
        cliente.setCidadePbt(cidadePbt.getText());
        
        return cliente;
    }
     
       public ClientePbt beanView() {
        ClientePbt cliente = new ClientePbt();
        idClientePbt.setText(Util.intStr(cliente.getIdClientePbt()));
        nomePbt.setText(cliente.getNomePbt());
        apelidoPbt.setText(cliente.getApelidoPbt());
        barroPbt.setText(cliente.getBarroPbt());
        celularPbt.setText(cliente.getCelularPbt());
        cpf.setText(cliente.getCpfPbt());
        dadospagamentoPbt.setText(cliente.getDadospagamentoPbt());
        datanascimentopbt.setText(Util.dateStr(cliente.getDatanascimentoPbt()));
        emailPbt.setText(cliente.getEmailPbt()); ;
        paisPbt.setText(cliente.getPaisPbt());
        rgPbt.setText(cliente.getRgPbt());
        SexoPbt.setSelectedIndex(cliente.getSexoPbt());
        telefonePbt.setText(cliente.getTelefonePbt());
        cepPbt.setText(cliente.getCepPbt());
        cidadePbt.setText(cliente.getCidadePbt());
        
        return cliente;
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadospagamentoPbt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        apelidoPbt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idClientePbt = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cepPbt = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cidadePbt = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        barroPbt = new javax.swing.JTextField();
        nomePbt = new javax.swing.JTextField();
        jBtnConfirmar = new javax.swing.JButton();
        paisPbt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        emailPbt = new javax.swing.JFormattedTextField();
        telefonePbt = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        rgPbt = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        datanascimentopbt = new javax.swing.JFormattedTextField();
        celularPbt = new javax.swing.JFormattedTextField();
        SexoPbt = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText(" Cidade");

        jLabel16.setText("Código");

        jLabel3.setText("CPF");

        jLabel10.setText(" Celular");

        jLabel15.setText(" CEP");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel11.setText(" bairro");

        cepPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepPbtActionPerformed(evt);
            }
        });

        jLabel12.setText(" Pais");

        jLabel4.setText(" Dados Pagamento (num cartão)");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel14.setText(" Apelido");

        jLabel5.setText(" Telefone");

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel6.setText(" Data de nascimento");

        jLabel1.setText("Nome");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        nomePbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePbtActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        paisPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisPbtActionPerformed(evt);
            }
        });

        jLabel2.setText(" Email");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        telefonePbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonePbtActionPerformed(evt);
            }
        });

        jLabel8.setText(" Rg");

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        celularPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularPbtActionPerformed(evt);
            }
        });

        SexoPbt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Prefiro não especificar" }));
        SexoPbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoPbtActionPerformed(evt);
            }
        });

        jLabel13.setText("Sexo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(emailPbt, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addComponent(cepPbt)
                            .addComponent(jLabel8)
                            .addComponent(rgPbt, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(datanascimentopbt))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dadospagamentoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(telefonePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(SexoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apelidoPbt, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(celularPbt))
                        .addGap(38, 38, 38)
                        .addComponent(paisPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(cidadePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(barroPbt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(idClientePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePbt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClientePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadospagamentoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datanascimentopbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadePbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barroPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apelidoPbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = true;

        Util.limparCampos(idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
           if (Util.perguntar("Deseja excluir o registro?") == true){
          cliente = viewBean();
          clienteDAO.delete(cliente);
       }
       else {
        
            Util.mensagem("Exclusão cancelada");
        }
        Util.limparCampos(idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar);  
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar, jBtnAlterar, jBtnExcluir);
        Util.habilitar(false, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar  );
// TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        cliente = viewBean();
        ClientePbt_DAO cliDAO = new ClientePbt_DAO();
        System.out.println("objeto Cliente: " + cliente.getNomePbt());
        if (incluindo == true) {
            cliDAO.insert(cliente);
            Util.mensagem("Cliente Incluido Com Sucesso!");
        } else {
            cliDAO.update(cliente);   
        }
        Util.habilitar(false, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar, jBtnAlterar, jBtnExcluir);
        Util.limparCampos(idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false);
        Util.mensagem("Cancelamento concluido");  
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar, jBtnAlterar, jBtnExcluir);
        Util.habilitar(false, idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt, jBtnConfirmar, jBtnCancelar);
        Util.limparCampos(idClientePbt, nomePbt, cpf, emailPbt, dadospagamentoPbt, telefonePbt, datanascimentopbt, apelidoPbt, paisPbt, barroPbt, cepPbt, SexoPbt, celularPbt, rgPbt, cidadePbt);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        setVisible(false);
        JDlgClientePesquisar jDlgClientePesquisar = new JDlgClientePesquisar();
        jDlgClientePesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void paisPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisPbtActionPerformed

    private void cepPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepPbtActionPerformed

    private void telefonePbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonePbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonePbtActionPerformed

    private void nomePbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePbtActionPerformed

    private void celularPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularPbtActionPerformed

    private void SexoPbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoPbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoPbtActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SexoPbt;
    private javax.swing.JTextField apelidoPbt;
    private javax.swing.JTextField barroPbt;
    private javax.swing.JFormattedTextField celularPbt;
    private javax.swing.JFormattedTextField cepPbt;
    private javax.swing.JTextField cidadePbt;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField dadospagamentoPbt;
    private javax.swing.JFormattedTextField datanascimentopbt;
    private javax.swing.JFormattedTextField emailPbt;
    private javax.swing.JTextField idClientePbt;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomePbt;
    private javax.swing.JTextField paisPbt;
    private javax.swing.JFormattedTextField rgPbt;
    private javax.swing.JFormattedTextField telefonePbt;
    // End of variables declaration//GEN-END:variables
}
