package View;

import java.awt.Color;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreadeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFornecedor = new javax.swing.JMenuItem();
        jmiProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreadeTrabalho.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout AreadeTrabalhoLayout = new javax.swing.GroupLayout(AreadeTrabalho);
        AreadeTrabalho.setLayout(AreadeTrabalhoLayout);
        AreadeTrabalhoLayout.setHorizontalGroup(
            AreadeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        AreadeTrabalhoLayout.setVerticalGroup(
            AreadeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jmiFornecedor.setText("Fornecedor");
        jmiFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFornecedor);

        jmiProduto.setText("Produto");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProduto);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreadeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreadeTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedorActionPerformed
        FornecedorView fornecedor = new FornecedorView();
        fornecedor.setVisible(true);
        AreadeTrabalho.add(fornecedor);
    }//GEN-LAST:event_jmiFornecedorActionPerformed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
        ProdutoView produto = new ProdutoView();
        produto.setVisible(true);
        AreadeTrabalho.add(produto);
    }//GEN-LAST:event_jmiProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){              
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane AreadeTrabalho;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiFornecedor;
    private javax.swing.JMenuItem jmiProduto;
    // End of variables declaration//GEN-END:variables
}
