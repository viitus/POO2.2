package model;

/**
 *
 * @author Cris
 */
public class ProdutoModel {
    private int idproduto;
    private String descricao;
    private int estoque;
    private float valor;
    private FornecedorModel fornecedor;
    
    public ProdutoModel(){
        idproduto = 0;
        descricao = "";
        estoque = 0;
        valor = 0;
        fornecedor = new FornecedorModel();
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
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

    public FornecedorModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
