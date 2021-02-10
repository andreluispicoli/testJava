package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "compra")
    private List<Pagamentos> pagamentos;

    @ManyToOne
    @JoinColumn(name = "clientes_id", nullable = false)
    private Clientes cliente;

    @OneToMany(mappedBy = "compras")
    private List<AssentosReservados> assentosReservados;

}
