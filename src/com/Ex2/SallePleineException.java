package com.Ex2;
import java.lang.Exception;
public class SallePleineException extends Exception {

    private Spectateur spectateur;

    public SallePleineException(Spectateur spectateur) {
        super("Salle pleine : " + spectateur.getNom());
        this.spectateur = spectateur;
    }

    public Spectateur getSpectateur() {
        return spectateur;
    }
}
