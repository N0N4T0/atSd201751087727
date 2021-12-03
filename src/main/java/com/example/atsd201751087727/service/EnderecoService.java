package com.example.atsd201751087727.service;

import com.example.atsd201751087727.entity.Endereco;
import com.example.atsd201751087727.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public Endereco saveEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    public List<Endereco> saveEnderecos(List<Endereco> enderecos) {
        return repository.saveAll(enderecos);
    }

    public List<Endereco> getEnderecos() {
        return repository.findAll();
    }

    public Endereco getEnderecoById(int idEndereco) {
        return repository.findById(idEndereco).orElse(null);
    }

    public Endereco getEnderecoByLogradouro(String logradouro) {
        return repository.findByLogradouro(logradouro);
    }

    public String deleteEndereco(int idEndereco) {
        repository.deleteById(idEndereco);
        return "endereço removido !! " + idEndereco;
    }

    public Endereco updateEndereco(Endereco endereco) {
        Endereco existingEndereco = repository.findById(endereco.getIdEndereco()).orElse(null);
        existingEndereco.setLogradouro(endereco.getLogradouro());
        existingEndereco.setBairro(endereco.getBairro());
        existingEndereco.setNumero(endereco.getNumero());
        existingEndereco.setComplemento(endereco.getComplemento());
        return repository.save(existingEndereco);
    }

}
