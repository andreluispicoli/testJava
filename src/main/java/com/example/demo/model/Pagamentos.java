package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "pagamentos")
public class Pagamentos {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String tipo_pagamento;

    private String valor_total;

    @ManyToOne
    @JoinColumn(name = "compras_id", nullable = false)
    private Compras compra;

}
