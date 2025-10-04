package com.fisica.resolucao.termodinamica.controller;

import com.fisica.resolucao.termodinamica.dto.*;
import com.fisica.resolucao.termodinamica.service.TermodinamicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/termodinamica")
public class TermodinamicaController {
    @Autowired
    private TermodinamicaService service;

    @PostMapping("/calor")
    public CalorResponse calcularCalor(CalorRequest request){
        return service.calcularCalor(request);
    }
    @PostMapping("/trabalho")
    public TrabalhoResponse calcularTrabalho(TrabalhoRequest request){
        return service.calcularTrabalho(request);
    }
    @PostMapping("/energiaGases")
    public EnergiaGasesResponse energiaInternaDeGasIdeal(EnergiaGasesRequest request) {
        return service.energiaInternaDeGasIdeal(request);
    }
    @PostMapping("/energia")
    public EnergiaResponse calcularEnergia(EnergiaRequest request) {
        return service.calcularEnergia(request);
    }
}
