/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Parente implements Serializable{
    @Id @GeneratedValue()
    private Long codigo;
    @Column(nullable = false ,unique = true)
    private String profissao;
    @Column(nullable = false ,unique = true)
    private String localTrabalho;
    @Column(nullable = false ,unique = true)
    private String grauParentestico;
    @Column(nullable = false ,unique = true)
    private String nome;

    public String getProfissa() {
        return profissao;
    }

    public void setProfissa(String profissa) {
        this.profissao = profissa;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getGrauParentestico() {
        return grauParentestico;
    }

    public void setGrauParentestico(String grauParentestico) {
        this.grauParentestico = grauParentestico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
