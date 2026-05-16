package com.edu.udec.holding.domain.exception;

public final class invalidEmpresaNameException extends RuntimeException {
    private static final String MESSAGE_EMPTY = "El nombre de la empresa no puede estar vacío";
    private static final String MESSAGE_TOO_SHORT = "El nombre de la empresa debe tener al menos %d carácteres.";

    private invalidEmpresaNameException(final String message) {
        super(message);
    }

    public static invalidEmpresaNameException becauseValueIsEmpty() {
        return new invalidEmpresaNameException(MESSAGE_EMPTY);
    }

    public static invalidEmpresaNameException becauseLengthIsTooShort(final int minimumLength) {
        return new invalidEmpresaNameException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
