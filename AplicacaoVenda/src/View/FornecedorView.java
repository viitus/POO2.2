package View;
/*Vitus*/
import Model.FornecedorModel;
import Controler.FornecedorController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

        jtxIdFornecedor.setColumns(15);

        jtxCnpj.setEditable(false);
        jtxCnpj.setColumns(15);
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
                "Código", "CNPJ", "Razão Social", "Endereço"
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
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbFechar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLrazaosocial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLendereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLcnpj)
                                .addComponent(jlcodigo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbPesquisar)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo)
                    .addComponent(jbFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        FornecedorModel fornecedor = new FornecedorModel();
        if(jtxIdFornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o Código do fornecedor");
        }else{
            fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
            //Controler
            FornecedorController controller = new FornecedorController();
            fornecedor = controller.selecionar(fornecedor);
            //validar se o fornecedor foi encontrado
            if(fornecedor == null){
                JOptionPane.showMessageDialog(this, "Fornecedor nao encontrado");
            }else{
                //PreencherCampos
                jtxCnpj.setText(fornecedor.getCnpj());
                jtxRazaoSocial.setText(fornecedor.getRazaoSocial());
                jtxEndereco.setText(fornecedor.getEndereco());

                jbNovo.setEnabled(false);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbSalvar.setEnabled(false);
                jtxIdFornecedor.setEditable(false);
                jtxCnpj.setEditable(true);
                jtxEndereco.setEditable(true);
                jtxRazaoSocial.setEditable(true);   
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtxCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCnpjActionPerformed

    private void jtxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEnderecoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
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
        
        if((cnpj.isEmpty())||(razaoSocial.isEmpty())||(endereco.isEmpty())){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        }else{
            FornecedorModel fornecedor = new FornecedorModel();
            fornecedor.setCnpj(cnpj);
            fornecedor.setEndereco(endereco);
            fornecedor.setRazaoSocial(razaoSocial);
            
            //Controler
            FornecedorController controller = new FornecedorController();
            if(controller.inserir(fornecedor)){
                JOptionPane.showMessageDialog(this, "Inserido com sucesso");
                limparCampos();
                inicializa();
                PreencherTabela();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao inserir o fonecedor");
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        String cnpj = jtxCnpj.getText();
        String razaoSocial = jtxRazaoSocial.getText();
        String endereco = jtxEndereco.getText();
        
        if((cnpj.isEmpty())||(razaoSocial.isEmpty())||(endereco.isEmpty())){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        }else{
            FornecedorModel fornecedor = new FornecedorModel();
            fornecedor.setCnpj(cnpj);
            fornecedor.setEndereco(endereco);
            fornecedor.setRazaoSocial(razaoSocial);
            fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
                
            //Controler
            FornecedorController controller = new FornecedorController();
            if(controller.editar(fornecedor)){
                JOptionPane.showMessageDialog(this, "Atualizado com Sucesso");
                limparCampos();
                inicializa();
                PreencherTabela();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao editar fornecedor");
            }
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        FornecedorModel fornecedor = new FornecedorModel();
        if(jtxIdFornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o Código do fornecedor");
        }else{
            fornecedor.setIdFornecedor(Integer.parseInt(jtxIdFornecedor.getText()));
            //Controler
            FornecedorController controller = new FornecedorController();
            if(controller.excluir(fornecedor)){
                JOptionPane.showMessageDialog(this, "Excluido com sucesso");
                limparCampos();
                inicializa();
                PreencherTabela();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao excluir");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jTFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFornecedorMouseClicked
        linha = jTFornecedor.getSelectedRow();
        if(linha != -1){
            jtxIdFornecedor.setText(jTFornecedor.getValueAt(linha, 0).toString());
            jtxCnpj.setText(jTFornecedor.getValueAt(linha, 1).toString());
            jtxRazaoSocial.setText(jTFornecedor.getValueAt(linha, 2).toString());
            jtxEndereco.setText(jTFornecedor.getValueAt(linha, 3).toString());
            
            jbPesquisar.setEnabled(false);
            jbNovo.setEnabled(true);
            jbEditar.setEnabled(true);
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
        FornecedorController controller = new FornecedorController();
        ArrayList<FornecedorModel> lista = controller.selecionarTodos();
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum fornecedor cadastrado");
        }else{
            DefaultTableModel modeloTabela = (DefaultTableModel) jTFornecedor.getModel();
            modeloTabela.setRowCount(0);
            for(FornecedorModel f:lista){
                modeloTabela.addRow(new String[]{
                    String.valueOf(f.getIdFornecedor()),f.getCnpj(),f.getRazaoSocial(),f.getEndereco()
                });
            }
        }
    }
    
    private void inicializa(){
        jbPesquisar.setEnabled(true);
        jbNovo.setEnabled(true);
        
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
