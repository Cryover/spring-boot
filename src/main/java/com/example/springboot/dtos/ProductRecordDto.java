package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
    public ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public @NotBlank String name() {
        return this.name;
    }

    public @NotNull BigDecimal value() {
        return this.value;
    }
}
