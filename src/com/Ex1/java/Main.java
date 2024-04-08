package com.exemple1.java;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = null;
        try {
            cercle = new Cercle(0, 0, 5, "bleu");
            System.out.println(cercle);
            cercle.setRayon(-3); // Déclenche une exception
            cercle.setCouleur("rouge"); // Déclenche une exception
        } catch (ValRayonValideException | CouleurValideException e) {
            System.out.println("Erreur: " + e.getMessage());
            try {
                cercle.setRayon(Math.abs(-3));
                System.out.println(cercle);
            } catch (ValRayonValideException ex) {
                System.out.println("Erreur lors de la correction du rayon: " + ex.getMessage());
            }
        }
    }
}
