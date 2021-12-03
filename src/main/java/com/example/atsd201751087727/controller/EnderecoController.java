package com.example.atsd201751087727.controller;

import com.example.atsd201751087727.entity.Endereco;
import com.example.atsd201751087727.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    @PostMapping
    public Endereco addEndereco(@RequestBody Endereco endereco){
        return service.saveEndereco(endereco);
    }

    @PostMapping
    public List<Endereco> addEndereco(@RequestBody List<Endereco> enderecos){
        return service.saveEnderecos(enderecos);
    }

    @GetMapping
    public List<Endereco> findAllEndereco(){
        return service.getEnderecos();
    }

    @GetMapping
    public Endereco findEnderecoById(@PathVariable int id) {
        return service.getEnderecoById(id);
    }

    @GetMapping
    public Endereco findEnderecoByName(@PathVariable String name) {
        return service.getEnderecoByLogradouro(name);
    }

    @PutMapping
    public Endereco updateEndereco(@RequestBody Endereco endereco)
    {
        return service.updateEndereco(endereco);
    }

    @DeleteMapping
    public String deleteEndereco(@PathVariable int id) {
        return service.deleteEndereco(id);
    }

}
