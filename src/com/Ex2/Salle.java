package com.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Salle {

    private int capacite;
    private List<Spectateur> spectateurs;

    public Salle(int capacite) {
        this.capacite = capacite;
        this.spectateurs = new ArrayList<>();
    }

    public void ajouterSpectateur(Spectateur spectateur) throws SallePleineException {
        if (spectateurs.size() >= capacite) {
            throw new SallePleineException(spectateur);
        }
        spectateurs.add(spectateur);
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNombreSpectateurs() {
        return spectateurs.size();
    }
}

