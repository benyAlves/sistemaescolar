/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author maluleque
 */
@Entity
public class Telefone implements Serializable{
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codigo;
   @Column(nullable = false,unique = true)
   private String numero;
   @ManyToOne
   @JoinColumn(name = "cod_pessoa",nullable = true)
   private Pessoa pessoa;
   
   @ManyToOne
   @JoinColumn(name = "cod_instituicao",nullable = true)
   private Instituicao instituicao;
   
   @ManyToOne
   @JoinColumn(name = "cod_utilizador",nullable = true)
   private Utilizador utilzador;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
