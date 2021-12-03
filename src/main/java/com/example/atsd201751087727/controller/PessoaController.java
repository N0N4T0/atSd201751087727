package com.example.atsd201751087727.controller;

import com.example.atsd201751087727.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {
    @Autowired
    private PessoaService service;



}
