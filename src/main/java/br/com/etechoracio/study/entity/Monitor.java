package br.com.etechoracio.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_monitor")
@Getter
@Setter
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tx_nome;
    private String tx_foto;
    private String tx_whatsapp;
    private String tx_email;
    private String tx_conteudo;
    private Long id_disciplina;

    @OneToMany
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

}
