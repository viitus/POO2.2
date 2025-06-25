package View;

/*Vitus*/

import Controler.FornecedorController;
import Model.ProdutoModel;
import Controler.ProdutoController;
import Model.FornecedorModel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ProdutoView extends javax.swing.JInternalFrame {
    
    private ArrayList<FornecedorModel> listaFornecedores;
    private int linha = -1;
    public ProdutoView() {
        initComponents();
        preencheCombo();
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
        jtxIdProduto = new javax.swing.JTextField();
        jtxDescricao = new javax.swing.JTextField();
        jtxEstoque = new javax.swing.JTextField();
        jtxValor = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLcnpj.setForeground(new java.awt.Color(0, 0, 0));
        jLcnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLcnpj.setText("Descrição:");

        jLrazaosocial.setForeground(new java.awt.Color(0, 0, 0));
        jLrazaosocial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLrazaosocial.setText("Estoque:");

        jlcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jlcodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlcodigo.setText("Código:");

        jLendereco.setForeground(new java.awt.Color(0, 0, 0));
        jLendereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLendereco.setText("Valor:");

        jtxIdProduto.setColumns(15);
        jtxIdProduto.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jtxDescricao.setEditable(false);
        jtxDescricao.setColumns(15);
        jtxDescricao.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtxDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDescricaoActionPerformed(evt);
            }
        });

        jtxEstoque.setEditable(false);
        jtxEstoque.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jtxValor.setEditable(false);
        jtxValor.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxValorActionPerformed(evt);
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

        jTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Estoque", "Valor", "Fornecedor"
            }
        ));
        jTProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTProduto);

        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Fornecedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLrazaosocial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLendereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxValor, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(jcbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlcodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jtxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlcodigo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcnpj)
                            .addComponent(jtxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLrazaosocial)
                            .addComponent(jtxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendereco)
                    .addComponent(jtxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo)
                    .addComponent(jbFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencheCombo(){
        FornecedorController controller = new FornecedorController();
        listaFornecedores = controller.selecionarTodos();
        for (FornecedorModel f: listaFornecedores){
            jcbFornecedor.addItem(f.getRazaoSocial());
        }
    }
    
    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        ProdutoModel produto = new ProdutoModel();
        if(jtxIdProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o Código do Produto");
        }else{
            produto.setIdProduto(Integer.parseInt(jtxIdProduto.getText()));
            //Controler
            ProdutoController controller = new ProdutoController();
            produto = controller.selecionar(produto);
            //validar se o produto foi encontrado
            if(produto == null){
                JOptionPane.showMessageDialog(this, "Produto não encontrado");
            }else{
                //PreencherCampos
                jtxDescricao.setText(produto.getDescricao());
                jtxEstoque.setText(String.valueOf(produto.getEstoque()));
                jtxValor.setText(String.valueOf(produto.getValor()));
                jcbFornecedor.setSelectedItem(produto.getFornecedor().getRazaoSocial());
                
                jbNovo.setEnabled(false);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbSalvar.setEnabled(false);
                jtxIdProduto.setEditable(false);
                jtxDescricao.setEditable(true);
                jtxValor.setEditable(true);
                jtxEstoque.setEditable(true);   
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtxDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDescricaoActionPerformed

    private void jtxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxValorActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jbPesquisar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
        jtxIdProduto.setEditable(false);
        jtxDescricao.setEditable(true);
        jtxValor.setEditable(true);
        jtxEstoque.setEditable(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        String descricao = jtxDescricao.getText();
        int estoque = Integer.parseInt(jtxEstoque.getText());
        float valor = Float.parseFloat(jtxValor.getText());
        String forn = (String) jcbFornecedor.getSelectedItem();
        int fornecedor = 0;
        
        for (int i=0; i<listaFornecedores.size(); i++){
            if(forn.equals(listaFornecedores.get(i).getRazaoSocial())){
                fornecedor = listaFornecedores.get(i).getIdFornecedor();
                break;
            }
        }
        
        if((descricao.isEmpty())||(valor == 0)){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        }else{
            ProdutoModel produto = new ProdutoModel();
            produto.setDescricao(descricao);
            produto.setEstoque(estoque);
            produto.setValor(valor);
            produto.getFornecedor().setIdFornecedor(fornecedor);
            
            //Controler
            ProdutoController controller = new ProdutoController();
            if(controller.inserir(produto)){
                JOptionPane.showMessageDialog(this, "Inserido com sucesso");
                limparCampos();
                inicializa();
                PreencherTabela();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao inserir o produto");
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        String descricao = jtxDescricao.getText();
        int estoque = Integer.parseInt(jtxEstoque.getText());
        float valor = Float.parseFloat(jtxValor.getText());
        String forn = (String) jcbFornecedor.getSelectedItem();
        int fornecedor = 0;
        
        for (int i=0; i<listaFornecedores.size(); i++){
            if(forn.equals(listaFornecedores.get(i).getRazaoSocial())){
                fornecedor = listaFornecedores.get(i).getIdFornecedor();
                break;
            }
        }
        
        if((descricao.isEmpty())||(valor == 0)){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        }else{
            ProdutoModel produto = new ProdutoModel();
            produto.setDescricao(descricao);
            produto.setEstoque(estoque);
            produto.setValor(valor);
            produto.setIdProduto(Integer.parseInt(jtxIdProduto.getText()));
            produto.getFornecedor().setIdFornecedor(fornecedor);
            
            //Controler
            ProdutoController controller = new ProdutoController();
            if(controller.editar(produto)){
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
        ProdutoModel produto = new ProdutoModel();
        if(jtxIdProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o Código do Produto");
        }else{
            produto.setIdProduto(Integer.parseInt(jtxIdProduto.getText()));
            //Controler
            ProdutoController controller = new ProdutoController();
            if(controller.excluir(produto)){
                JOptionPane.showMessageDialog(this, "Excluido com sucesso");
                limparCampos();
                inicializa();
                PreencherTabela();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao excluir");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jTProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutoMouseClicked
        linha = jTProduto.getSelectedRow();
        
        if(linha != -1){
            jtxIdProduto.setText(jTProduto.getValueAt(linha, 0).toString());
            jtxDescricao.setText(jTProduto.getValueAt(linha, 1).toString());
            jtxEstoque.setText(jTProduto.getValueAt(linha, 2).toString());
            jtxValor.setText(jTProduto.getValueAt(linha, 3).toString());
            jcbFornecedor.setSelectedItem(jTProduto.getValueAt(linha, 4).toString());
            
            jbPesquisar.setEnabled(false);
            jbNovo.setEnabled(true);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(false);
            jbSalvar.setEnabled(true);
            jtxIdProduto.setEditable(false);
            jtxDescricao.setEditable(true);
            jtxValor.setEditable(true);
            jtxEstoque.setEditable(true);
            
            linha = -1;
        }
    }//GEN-LAST:event_jTProdutoMouseClicked

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void PreencherTabela(){
        ProdutoController controller = new ProdutoController();
        ArrayList<ProdutoModel> lista = controller.selecionarTodos();
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado");
        }else{
            DefaultTableModel modeloTabela = (DefaultTableModel) jTProduto.getModel();
            modeloTabela.setRowCount(0);
            for(ProdutoModel f:lista){
                modeloTabela.addRow(new String[]{
                    String.valueOf(f.getIdProduto()),
                    String.valueOf(f.getDescricao()),
                    String.valueOf(f.getEstoque()),
                    String.valueOf(f.getValor()),
                    String.valueOf(f.getFornecedor().getRazaoSocial())
                });
            }
        }
    }
    
    private void inicializa(){
        jbPesquisar.setEnabled(true);
        jbNovo.setEnabled(true);
        
        jtxDescricao.setEditable(false);
        jtxValor.setEditable(false);
        jtxEstoque.setEditable(false);
        
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }
    
    private void limparCampos(){
        jtxIdProduto.setText("");
        jtxValor.setText("");
        jtxDescricao.setText("");
        jtxEstoque.setText("");
        jcbFornecedor.setSelectedItem(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcnpj;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLrazaosocial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTProduto;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbFornecedor;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JTextField jtxDescricao;
    private javax.swing.JTextField jtxEstoque;
    private javax.swing.JTextField jtxIdProduto;
    private javax.swing.JTextField jtxValor;
    // End of variables declaration//GEN-END:variables
}
