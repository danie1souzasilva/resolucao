package com.fisica.resolucao.mecanica.dto;

import jakarta.validation.constraints.NotNull;

public record MRUVRequest(@NotNull Double posicaoInicial,@NotNull Double velocidadeInicial,@NotNull Double tempo,@NotNull Double aceleracao) {
}
