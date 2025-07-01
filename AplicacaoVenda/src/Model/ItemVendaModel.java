package Model;

public class ItemVendaModel {
    private int idItemVenda;
    private ProdutoModel produto;
    private VendaModel venda;
    private int quantidade;

    public ItemVendaModel(int idItemVenda, int quantidade) {
        this.idItemVenda = idItemVenda;
        this.produto = new ProdutoModel();
        this.venda = new VendaModel();
        this.quantidade = quantidade;
    }

    public ItemVendaModel() {
        idItemVenda = 0;
        produto = new ProdutoModel();
        venda = new VendaModel();
        quantidade = 0;
    }    
    
    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public VendaModel getVenda() {
        return venda;
    }

    public void setVenda(VendaModel venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
