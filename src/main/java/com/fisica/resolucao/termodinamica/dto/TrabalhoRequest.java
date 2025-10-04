package com.fisica.resolucao.termodinamica.dto;

import jakarta.validation.constraints.NotNull;

public record TrabalhoRequest(@NotNull Double pressao,@NotNull Double volumeInicial,@NotNull Double volumeFinal) {
}
