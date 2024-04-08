package com.exemple.java;

import java.util.Objects;
import java.util.Scanner;

public class Personne {
    private String nom;
    public Personne(String nom){
        this.nom = nom;
    }

    public String toString() {
        return "Mr. " + this.nom;
    }

    public String getNom(){
        return this.nom;
    }
    public int compare(Personne P){
        if (Objects.equals(this.getNom(), P.getNom())){
            return 1;
        }else {
            return 0;
        }
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public static void main(String[] args){
        Personne p1 = new Personne("Ahmed");
        System.out.println("Say hii to " + p1.toString());
        Scanner sc = new Scanner(System.in);
        System.out.print("gave us new name : ");
        String name = (String) sc.nextLine();
        p1.setNom(name);
        System.out.println("this is the new name of our person : " + p1.getNom());
    }

}
