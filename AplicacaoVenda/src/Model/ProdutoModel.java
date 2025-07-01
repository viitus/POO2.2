package Model;

public class ProdutoModel {
    private int idProduto, estoque;
    private String descricao;
    private float valor;
    private FornecedorModel fornecedor;

    
    public ProdutoModel(int idFornecedor, String descricao, int estoque, int razaoSocial, float valor) {
        this.idProduto = idFornecedor;
        this.descricao = descricao;
        this.estoque = estoque;
        this.valor = valor;
        this.fornecedor = new FornecedorModel();
    }
    
    public ProdutoModel() {
        idProduto = 0;
        descricao = "";
        estoque = 0;
        valor = 0;
        fornecedor = new FornecedorModel();
    }
    
    public FornecedorModel getFornecedor(){
        return fornecedor;
    }
    
    public void setFornecedor(FornecedorModel fornecedor){
        this.fornecedor = fornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
