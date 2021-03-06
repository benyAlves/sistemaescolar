/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maluleque
 */
@MappedSuperclass
public class Pessoa implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(nullable = false)
    private String apelido;
    @Column(name = "outros_nomes", nullable = false)
    private String outrosNomes;
    @Column(nullable = false)
    private String nacionalidade;
    @Column(name = "nr_bi", nullable = false)
    private String nrBi;
    @Column(name = "email", nullable = true)
    private String email;
    @Column(nullable = false)
    private String genero;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    @ManyToOne
    @JoinColumn(name = "endereco", nullable = false)
    private Endereco endereco;
    @OneToMany(mappedBy = "pessoa")    
    private List<Telefone> telefones;
    
    
    
}
