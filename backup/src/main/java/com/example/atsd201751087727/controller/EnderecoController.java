package com.example.atsd201751087727.controller;

import com.example.atsd201751087727.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoService service;
}
