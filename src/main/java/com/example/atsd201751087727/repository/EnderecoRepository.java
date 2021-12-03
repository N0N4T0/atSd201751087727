package com.example.atsd201751087727.repository;

import com.example.atsd201751087727.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Endereco findByLogradouro(String logradouro);
}
