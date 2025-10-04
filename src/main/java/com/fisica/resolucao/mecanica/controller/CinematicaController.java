package com.fisica.resolucao.mecanica.controller;

import com.fisica.resolucao.mecanica.dto.*;
import com.fisica.resolucao.service.CinematicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinematica")
public class CinematicaController {
    @Autowired
    private CinematicaService service;

    @PostMapping("/mru")
    public MRUResponse resolverMRU(@RequestBody @Valid MRURequest request){
        return service.calcularMRU(request);
    }
    @PostMapping("/mruv")
    public MRUVResponse resolverMRUV(@RequestBody @Valid MRUVRequest request){
        return service.calcularMRUV(request);
    }
    @PostMapping("/forca")
    public ForcaResponse resolverForca(ForcaRequest request){
        return service.calcularForca(request);
    }
    @PostMapping("/energiaCinetica")
    public EnergiaCineticaResponse resolverEnergia(@RequestBody @Valid EnergiaCineticaRequest request){
        return service.resolverEnergiaCinetica(request);
    }

}
