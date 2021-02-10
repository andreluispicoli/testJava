package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assentos {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String sigla;


}
