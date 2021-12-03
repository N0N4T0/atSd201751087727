package com.example.atsd201751087727.service;

import com.example.atsd201751087727.entity.Pessoa;
import com.example.atsd201751087727.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public Pessoa savePessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }


    public List<Pessoa> savePessoas(List<Pessoa> pessoas) {
        return repository.saveAll(pessoas);
    }

    public List<Pessoa> getPessoas() {
        return repository.findAll();
    }

    public Pessoa getPessoaById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Pessoa getPessoaByName(String name) {
        return repository.findByName(name);
    }

    public String deletePessoa(int id) {
        repository.deleteById(id);
        return "pessoa removida !! " + id;
    }

    public Pessoa updatePessoa(Pessoa pessoa) {
        Pessoa existingPessoa = repository.findById(pessoa.getIdPessoa()).orElse(null);
        existingPessoa.setNome(pessoa.getNome());
        existingPessoa.setNascimento(pessoa.getNascimento());
        existingPessoa.setCpf(pessoa.getCpf());
        existingPessoa.setTipoSanguineo(pessoa.getTipoSanguineo());
        return repository.save(existingPessoa);
    }


}
