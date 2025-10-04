package com.fisica.resolucao.termodinamica.dto;

import jakarta.validation.constraints.NotNull;

public record CalorRequest(@NotNull Double massa,@NotNull Double calorEspecifico,@NotNull Double variacaoTemperatura) {
}
