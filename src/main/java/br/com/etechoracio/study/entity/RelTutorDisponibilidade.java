package br.com.etechoracio.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_REL_TUTOR_DISPONIBILIDADE")
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
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private Disponibilidade disponibilidade;

}
