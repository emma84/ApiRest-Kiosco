package com.emmanuel.kiosco.model.entity.Response;

public class GenericResponse {
    private String errorMessage;

    public GenericResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public GenericResponse() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
