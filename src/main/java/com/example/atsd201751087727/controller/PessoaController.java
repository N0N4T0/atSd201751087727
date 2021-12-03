package com.example.atsd201751087727.controller;

import com.example.atsd201751087727.entity.Pessoa;
import com.example.atsd201751087727.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {
    @Autowired
    private PessoaService service;

    @PostMapping
    public Pessoa addPessoa(@RequestBody Pessoa pessoa){
        return service.savePessoa(pessoa);
    }

    @PostMapping
    public List<Pessoa> addPessoas(@RequestBody List<Pessoa> pessoas){
        return service.savePessoas(pessoas);
    }

    @GetMapping
    public List<Pessoa> findAllPessoas(){
        return service.getPessoas();
    }

    @GetMapping
    public Pessoa findPessoaById(@PathVariable int id) {
        return service.getPessoaById(id);
    }

    @GetMapping
    public Pessoa findPessoaByName(@PathVariable String name) {
        return service.getPessoaByName(name);
    }

    @PutMapping
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa) {
        return service.updatePessoa(pessoa);
    }

    @DeleteMapping
    public String deletePessoa(@PathVariable int id) {
        return service.deletePessoa(id);
    }
}
