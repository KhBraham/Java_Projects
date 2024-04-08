package com.Ex2;

public class Main {
    public static void main(String[] args) {
        // Create a cinema with a default capacity of 100 for each hall
        Cinema cinema = new Cinema();

        // Spectators with names
        Spectateur spectateur1 = new Spectateur("Alice");
        Spectateur spectateur2 = new Spectateur("Bob");
        Spectateur spectateur3 = new Spectateur("Charlie");
        Spectateur spectateur4 = new Spectateur("David");
        Spectateur spectateur5 = new Spectateur("Eve");

        // Try placing spectators in the cinema
        try {
            cinema.placer(spectateur1);
            cinema.placer(spectateur2);
            cinema.placer(spectateur3);
            cinema.placer(spectateur4);
            cinema.placer(spectateur5); // This will trigger SallePleineException
        } catch (SallePleineException e) {
            System.out.println("Salle pleine : impossible de placer " + e.getSpectateur().getNom());
        }

        // Print the number of halls opened in the cinema
        System.out.println("Nombre de salles ouvertes : " + cinema.getNombreSalles());
    }
}
