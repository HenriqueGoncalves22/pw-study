package br.com.etechoracio.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_disciplina")
public class Disciplina {
    @Id
    @Column(name = "id_disciplina", columnDefinition = "numeric")
    private Long id;

    private String nome;

}
