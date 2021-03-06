/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author claucio
 */
@Entity
public class Matricula {
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long nr_aluno;
    @Temporal(TemporalType.DATE)
   private Date dataMatricula;
   @Column(name = "valor", nullable = false, unique = false)
   private Double valor;
   @Column(nullable = true)
   private String observacao;
   @Column(nullable = false,unique = false)
   private String estado;

    public Long getNr_aluno() {
        return nr_aluno;
    }

    public void setNr_aluno(Long nr_aluno) {
        this.nr_aluno = nr_aluno;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
    
    
    
}
