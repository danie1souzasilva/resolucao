package com.fisica.resolucao.termodinamica.dto;

import jakarta.validation.constraints.NotNull;

public record EnergiaRequest(@NotNull Double calor, @NotNull Double trabalho) {
}
