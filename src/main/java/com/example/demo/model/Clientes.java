package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nome;

    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<Compras> compras;



}
