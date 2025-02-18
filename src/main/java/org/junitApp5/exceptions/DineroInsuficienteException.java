package org.junitApp5.exceptions;

public class DineroInsuficienteException extends RuntimeException{
    public DineroInsuficienteException(String mensaje){
        super(mensaje);
    }
}
