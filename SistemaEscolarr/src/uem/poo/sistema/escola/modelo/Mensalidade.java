/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.Date;

/**
 *
 * @author claucio
 */
public class Mensalidade {
    
    private Long codigo;
    private Date dataVencimento;
    private Date dataPagamento;
    private double valorApagar;
    private double valorPago;

    public Mensalidade(Date dataVencimento, Date dataPagamento, double valorApagar, double valorPago) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valorApagar = valorApagar;
        this.valorPago = valorPago;
    }
        
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
}
