package com.exemple1.java;
import com.exemple1.java.ValRayonValideException;

public class Cercle {
    private double x, y, rayon;
    private String couleur;

    public Cercle(double x, double y, double rayon, String couleur) throws ValRayonValideException, CouleurValideException {
        this.x = x;
        this.y = y;
        setRayon(rayon);
        setCouleur(couleur);
    }

    public double getRayon() {
        return rayon;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setRayon(double newRayon) throws ValRayonValideException {
        if (newRayon < 0) {
            throw new ValRayonValideException();
        }
        this.rayon = newRayon;
    }

    public void setCouleur(String newCouleur) throws CouleurValideException {
        if (newCouleur == null || newCouleur.isEmpty() || newCouleur.equalsIgnoreCase("rouge")) {
            throw new CouleurValideException();
        }
        this.couleur = newCouleur;
    }

    public String toString() {
        return "Cercle [centre=(" + x + "," + y + "), rayon=" + rayon + ", couleur=" + couleur + "]";
    }

}
