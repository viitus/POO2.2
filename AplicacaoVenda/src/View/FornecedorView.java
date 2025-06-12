package View;
/*Vitus*/
import Model.FornecedorModel;

public class FornecedorView extends javax.swing.JInternalFrame {
    
    private int linha = -1;
    public FornecedorView() {
        initComponents();
        PreencherTabela();
        inicializa();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLcnpj = new javax.swing.JLabel();
        jLrazaosocial = new javax.swing.JLabel();
        jlcodigo = new javax.swing.JLabel();
        jLendereco = new javax.swing.JLabel();
        jtxIdFornecedor = new javax.swing.JTextField();
        jtxCnpj = new javax.swing.JTextField();
        jtxRazaoSocial = new javax.swing.JTextField();
        jtxEndereco = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTFornecedor = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLcnpj.setForeground(new java.awt.Color(0, 0, 0));
        jLcnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLcnpj.setText("CNPJ:");

        jLrazaosocial.setForeground(new java.awt.Color(0, 0, 0));
        jLrazaosocial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLrazaosocial.setText("Razão Social:");

        jlcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jlcodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlcodigo.setText("Código:");

        jLendereco.setForeground(new java.awt.Color(0, 0, 0));
        jLendereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLendereco.setText("Endereço:");

        jtxCnpj.setEditable(false);
        jtxCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCnpjActionPerformed(evt);
            }
        });

        jtxRazaoSocial.setEditable(false);

        jtxEndereco.setEditable(false);
        jtxEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEnderecoActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jTFornecedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFornecedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTFornecedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLrazaosocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFechar))
                            .addComponent(jbPesquisar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLendereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLcnpj)
                            .addComponent(jlcodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcodigo)
                    .addComponent(jtxIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcnpj)
                    .addComponent(jtxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLrazaosocial)
                    .addComponent(jtxRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendereco)
                    .addComponent(jtxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo)
                    .addComponent(jbFechar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(427, 427, 427))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(true);
        jbExcluir.setEnabled(true);
        jbSalvar.setEnabled(false);
        jtxIdFornecedor.setEditable(false);
        jtxCnpj.setEditable(true);
        jtxEndereco.setEditable(true);
        jtxRazaoSocial.setEditable(true);
        FornecedorModel fornecedor = new FornecedorModel();
        fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
        //Controler
        //PreencherCampos
        //validar se o fornecedor foi encontrado
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtxCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCnpjActionPerformed

    private void jtxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEnderecoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbPesquisar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
        jtxIdFornecedor.setEditable(false);
        jtxCnpj.setEditable(true);
        jtxEndereco.setEditable(true);
        jtxRazaoSocial.setEditable(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        String cnpj = jtxCnpj.getText();
        String razaoSocial = jtxRazaoSocial.getText();
        String endereco = jtxEndereco.getText();
        
        FornecedorModel fornecedor = new FornecedorModel();
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setRazaoSocial(razaoSocial);
        //Controler
        limparCampos();
        inicializa();
        PreencherTabela();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        String cnpj = jtxCnpj.getText();
        String razaoSocial = jtxRazaoSocial.getText();
        String endereco = jtxEndereco.getText();
        FornecedorModel fornecedor = new FornecedorModel();
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
        //Controler
        limparCampos();
        inicializa();
        PreencherTabela();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        FornecedorModel fornecedor = new FornecedorModel();
        fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
        //Controler
        limparCampos();
        inicializa();
        PreencherTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jTFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFornecedorMouseClicked
        linha = jTFornecedor.getSelectedRow();
        if(linha != -1){
            jtxIdFornecedor.setText(jTFornecedor.getValueAt(linha, 0).toString());
            jtxCnpj.setText(jTFornecedor.getValueAt(linha, 1).toString());
            jtxRazaoSocial.setText(jTFornecedor.getValueAt(linha, 2).toString());
            jtxEndereco.setText(jTFornecedor.getValueAt(linha, 3).toString());
            
            jbPesquisar.setEnabled(false);
            jbNovo.setEnabled(false);
            jbEditar.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbSalvar.setEnabled(true);
            jtxIdFornecedor.setEditable(false);
            jtxCnpj.setEditable(true);
            jtxEndereco.setEditable(true);
            jtxRazaoSocial.setEditable(true);
            linha = -1;
        }
    }//GEN-LAST:event_jTFornecedorMouseClicked

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void PreencherTabela(){
        // ToDo
    }
    
    private void inicializa(){
        jtxCnpj.setEditable(false);
        jtxEndereco.setEditable(false);
        jtxRazaoSocial.setEditable(false);
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }
    
    private void limparCampos(){
        jtxIdFornecedor.setText("");
        jtxEndereco.setText("");
        jtxCnpj.setText("");
        jtxRazaoSocial.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLcnpj;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLrazaosocial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTFornecedor;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JTextField jtxCnpj;
    private javax.swing.JTextField jtxEndereco;
    private javax.swing.JTextField jtxIdFornecedor;
    private javax.swing.JTextField jtxRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
