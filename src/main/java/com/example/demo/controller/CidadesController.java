package com.example.demo.controller;

import com.example.demo.model.Cidades;
import com.example.demo.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cidades")
public class CidadesController {

    @Autowired
    private CidadesRepository cidadesRepository;

    @GetMapping()
    List<Cidades> all(){
        return cidadesRepository.findAll();
    }


}
