package br.com.etechoracio.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_disponibilidade")
@Getter
@Setter
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tx_dia_semana;
    private LocalDateTime dt_das;
    private LocalDateTime dt_ate;
    private Long id_monitor;

    @ManyToOne
    @JoinColumn(name = "id_monitor")
    private Monitor monitor;




}
