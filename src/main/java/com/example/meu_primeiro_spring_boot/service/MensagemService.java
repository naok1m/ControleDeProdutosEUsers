package com.example.meu_primeiro_spring_boot.service;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.repository.MensagemRepository;
@Service
public class MensagemService {
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMensagem();
    }
}
