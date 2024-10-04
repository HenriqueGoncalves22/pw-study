package br.com.etechoracio.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_rel_tutor_disponibilidade")
@Getter
@Setter
public class RelTutorDisponibilidade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_monitor;
    private Long id_disponilidade;

    @ManyToMany
    @JoinColumn(name = "id_monitor")
    private Monitor monitor;

    @ManyToMany
    @JoinColumn(name = "id_disponibilidade")
    private Disponibilidade disponibilidade;

}
