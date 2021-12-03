package com.example.atsd201751087727.repository;

import com.example.atsd201751087727.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    Pessoa findByName(String name);
}
