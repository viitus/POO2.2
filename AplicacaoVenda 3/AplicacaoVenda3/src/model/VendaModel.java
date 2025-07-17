/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Cris
 */
public class VendaModel {
    private int idvenda;
    private String cliente, pagamento;
    private Date dataVenda;

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
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

    public Date getDataVenda() {
       return dataVenda;
    }
    
    public String toStringDataVenda() {
        LocalDate localDate = dataVenda.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();

        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int ano = localDate.getYear();
        
        String retorno = String.valueOf(ano)+'-'+String.valueOf(mes)+'-'+String.valueOf(dia);
        return retorno;
    }
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
}
