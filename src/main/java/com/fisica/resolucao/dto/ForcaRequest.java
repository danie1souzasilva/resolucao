package com.fisica.resolucao.dto;

import jakarta.validation.constraints.NotNull;

public record ForcaRequest(@NotNull Double massa,@NotNull Double aceleracao) {
}
