package Model;

import java.time.LocalDateTime;

public class VendaModel {

    private int idVenda;
    private String cliente, pagamento;
    private LocalDateTime dataVenda;
    
    public VendaModel(){
        idVenda = 0;
        cliente = "";
        pagamento = "";
    }
    
    public VendaModel(int idVenda, String cliente, String pagamento, LocalDateTime dataVenda) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    
    
}
