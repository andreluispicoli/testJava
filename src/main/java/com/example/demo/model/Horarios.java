package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "horarios")
public class Horarios {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date dateTime;

    private Integer quantidadeAssentos;

    private Double preco_assento;

    @ManyToMany(mappedBy = "horarios", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Cinemas> cinemas;

    @OneToMany(mappedBy = "horario")
    private List<AssentosReservados> assentosReservados;

}
