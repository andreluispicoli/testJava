package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "assentos_reservados")
public class AssentosReservados {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "horarios_id", nullable = false)
    private Horarios horario;

    @ManyToOne
    @JoinColumn(name = "assentos_id", nullable = false)
    private Assentos assento;

    @ManyToOne
    @JoinColumn(name = "compras_id", nullable = false)
    private Compras compras;

}
