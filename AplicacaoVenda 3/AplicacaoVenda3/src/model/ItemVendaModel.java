       
package model;


/**
 *
 * @author Cris
 */
public class ItemVendaModel {
    private int iditemvenda;
    private VendaModel venda;
    private ProdutoModel produto;
    private int quantidade;

    public ItemVendaModel() {
        venda = new VendaModel();
        produto = new ProdutoModel();
    }
    
    

    public int getIditemvenda() {
        return iditemvenda;
    }

    public void setIditemvenda(int iditemvenda) {
        this.iditemvenda = iditemvenda;
    }

    public VendaModel getVenda() {
        return venda;
    }

    public void setVenda(VendaModel venda) {
        this.venda = venda;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
