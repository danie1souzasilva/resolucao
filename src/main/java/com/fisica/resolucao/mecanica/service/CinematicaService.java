package com.fisica.resolucao.service;

import com.fisica.resolucao.mecanica.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CinematicaService {

    public MRUResponse calcularMRU(MRURequest request){
        if(request.tempo() < 0) {
            throw new IllegalArgumentException("O tempo não pode ser negativo.");
        }
        double deslocamento = request.velocidade() * request.tempo();
        return new MRUResponse(deslocamento);
    }
    public MRUVResponse calcularMRUV(MRUVRequest request){
        if(request.tempo() < 0) {
            throw new IllegalArgumentException("O tempo não pode ser negativo.");
        }
        double s = request.posicaoInicial() + request.velocidadeInicial() * request.tempo() + 0.5 * request.aceleracao() * Math.pow(request.tempo(), 2);
        return new MRUVResponse(s);
    }
    public ForcaResponse calcularForca(ForcaRequest request){
        if(request.massa() < 0) {
            throw new IllegalArgumentException("A massa não pode ser negativa.");
        }
        double f = request.massa() * request.aceleracao();
        return new ForcaResponse(f);
    }
    public EnergiaCineticaResponse resolverEnergiaCinetica(EnergiaCineticaRequest request){
        if(request.massa() < 0) {
            throw new IllegalArgumentException("A massa não pode ser negativa.");
        }
        double e = 0.5 * request.massa() * Math.pow(request.velocidade(), 2);
        return new EnergiaCineticaResponse(e);
    }
}
