package com.example.atsd201751087727.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Endereco {
    @Id
    @GeneratedValue
    private int idEndereco ;
    private int idPessoa ;
    private String Logradouro ;
    private String Bairro ;
    private String Numero ;
    private String Complemento ;
}


