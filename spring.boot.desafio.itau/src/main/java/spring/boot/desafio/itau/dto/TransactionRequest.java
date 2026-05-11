package spring.boot.desafio.itau.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull
    private Double value;

    @NotNull
    private OffsetDateTime dateTime;

    public Double getValue() {
        return value;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }
}
