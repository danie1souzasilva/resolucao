package com.fisica.resolucao.dto;

import jakarta.validation.constraints.NotNull;

public record MRURequest(@NotNull Double velocidade,@NotNull Double tempo) {
}
