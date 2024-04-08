package com.exemple1.java;
import java.lang.Exception;
public class ValRayonValideException extends Exception {
    public ValRayonValideException() {
        super("La longueur du rayon ne peut pas être négative.");
    }
}