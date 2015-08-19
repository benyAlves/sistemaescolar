/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author maluleque
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Aluno extends Pessoa{
    @Column(name = "codigo_aluno", unique = true, nullable = false)
    private Long codigoAluno;
    @Column(name = "caminho_foto", nullable = true)
    private String caminhoFoto;
    private String profissao;
    private String estado;
}
