package com.exemple.java;

public class Table {
    public static int[] remplirTableau(int n) {
        int[] tab = new int[n];
        int j = 5;
        for (int i = 0; i < n; i++) {
            tab[i] = j;
            j++;
        }
        return tab;
    }

    public static void affiche(int[] tab) {
        int i = tab.length;
        System.out.println("l'element avant dernier du tableau: " + tab[i - 2]);
    }
}
