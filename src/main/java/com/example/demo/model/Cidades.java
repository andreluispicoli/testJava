package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cidades")
public class Cidades {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "cidades_filmes",
            joinColumns = {@JoinColumn(name = "cidades_id")},
            inverseJoinColumns = {@JoinColumn(name = "filmes_id")}
            )
    private List<Filmes> filmes;

}
