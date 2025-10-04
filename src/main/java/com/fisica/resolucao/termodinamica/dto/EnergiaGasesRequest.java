package com.fisica.resolucao.termodinamica.dto;

import jakarta.validation.constraints.NotNull;

public record EnergiaGasesRequest(@NotNull Double numeroMols, @NotNull Double temperaturaInicial, @NotNull Double temperaturaFinal) {
}
