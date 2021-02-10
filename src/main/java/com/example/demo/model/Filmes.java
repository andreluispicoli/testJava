package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "filmes")
public class Filmes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String faixaEtaria;

    @ManyToMany(mappedBy = "filmes", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Cidades> cidades;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "filmes_cinemas",
            joinColumns = {@JoinColumn(name = "filmes_id")},
            inverseJoinColumns = {@JoinColumn(name = "cinemas_id")}
    )
    private List<Cinemas> cinemas;

}
