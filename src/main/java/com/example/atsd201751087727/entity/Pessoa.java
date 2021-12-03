package com.example.atsd201751087727.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Pessoa {

    @Id
    @GeneratedValue
    private int idPessoa;
    private String Nome;
    private Date Nascimento;
    private String Cpf;
    private String TipoSanguineo;
}
