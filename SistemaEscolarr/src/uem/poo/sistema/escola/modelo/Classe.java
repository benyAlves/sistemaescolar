/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author claucio
 */
@Entity
public class Classe {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name = "nome",nullable = false,unique = true)
    private String nome;
    @Column(name = "valor_matrcula", nullable = false, unique = false)
    private double valorMatricula;
    @Column(name = "valor_mensalidade", nullable = false, unique = false)
    private double valorMensalidade;
    @Column(nullable = false)
    private String estado;

    public Classe(String nome, double valorMatricula, double valorMensalidade, String estado) {
        this.nome = nome;
        this.valorMatricula = valorMatricula;
        this.valorMensalidade = valorMensalidade;
        this.estado = estado;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
