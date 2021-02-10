package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinemas")
public class Cinemas {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;
    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;

    @ManyToMany(mappedBy = "cinemas", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Filmes> filmes;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "cinemas_horarios",
            joinColumns = {@JoinColumn(name = "cinemas_id")},
            inverseJoinColumns = {@JoinColumn(name = "horarios_id")}
    )
    private List<Horarios> horarios;


}
