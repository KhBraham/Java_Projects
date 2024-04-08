package com.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Salle> salles;

    public Cinema() {
        this.salles = new ArrayList<>();
    }

    public void placer(Spectateur spectateur) throws SallePleineException{
        try {
            // On essaye d'ajouter le spectateur à la dernière salle
            salles.get(salles.size() - 1).ajouterSpectateur(spectateur);
        } catch (SallePleineException e) {
            // Salle pleine, on en crée une nouvelle
            Salle nouvelleSalle = new Salle(4); // Capacité par défaut
            salles.add(nouvelleSalle);
            nouvelleSalle.ajouterSpectateur(spectateur);
        }
    }

    public int getNombreSalles() {
        return salles.size();
    }
}
