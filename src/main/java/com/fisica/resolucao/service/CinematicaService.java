package com.fisica.resolucao.service;

import com.fisica.resolucao.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CinematicaService {

    public MRUResponse calcularMRU(MRURequest request){
        double deslocamento = request.velocidade() * request.tempo();
        return new MRUResponse(deslocamento);
    }
    public MRUVResponse calcularMRUV(MRUVRequest request){
        double s = request.posicaoInicial() + request.velocidadeInicial() * request.tempo() + request.aceleracao() * Math.pow(request.tempo(), 2);
        return new MRUVResponse(s);
    }
    public ForcaResponse calcularForca(ForcaRequest request){
        double f = request.massa() * request.aceleracao();
        return new ForcaResponse(f);
    }
    public EnergiaCineticaResponse resolverEnergiaCinetica(EnergiaCineticaRequest request){
        double e = 0.5 * request.massa() * Math.pow(request.velocidade(), 2);
        return new EnergiaCineticaResponse(e);
    }
}
