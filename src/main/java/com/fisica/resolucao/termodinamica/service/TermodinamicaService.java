package com.fisica.resolucao.termodinamica.service;

import com.fisica.resolucao.termodinamica.dto.*;
import com.fisica.resolucao.termodinamica.utils.Constantes;
import org.springframework.stereotype.Service;

@Service
public class TermodinamicaService {

    public CalorResponse calcularCalor(CalorRequest request) {
        double Q = request.massa() * request.calorEspecifico() * request.variacaoTemperatura();
        return new CalorResponse(Q);
    }
    public TrabalhoResponse calcularTrabalho(TrabalhoRequest request) {
        double W = request.pressao() * (request.volumeFinal() - request.volumeInicial());
        return new TrabalhoResponse(W);
    }
    public EnergiaGasesResponse energiaInternaDeGasIdeal(EnergiaGasesRequest request) {
        double E = (3/2.0) * Constantes.R * request.numeroMols() * (request.temperaturaFinal() - request.temperaturaInicial());
        return new EnergiaGasesResponse(E);
    }
    public EnergiaResponse calcularEnergia(EnergiaRequest request) {
        double U = request.calor() - request.trabalho();
        return new EnergiaResponse(U);
    }
}
