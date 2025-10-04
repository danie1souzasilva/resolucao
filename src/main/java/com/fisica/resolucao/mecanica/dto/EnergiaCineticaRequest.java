package com.fisica.resolucao.mecanica.dto;

import jakarta.validation.constraints.NotNull;
import lombok.NonNull;

public record EnergiaCineticaRequest(@NonNull Double massa,@NotNull Double velocidade) {
}
