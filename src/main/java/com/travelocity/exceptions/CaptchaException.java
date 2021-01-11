package com.travelocity.exceptions;

public class CaptchaException extends AssertionError {

    public CaptchaException(String mensaje) {
        super(mensaje);
    }
}
