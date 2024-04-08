package com.exemple.java;

import java.util.Objects;

public class Etudiant extends Personne {
    public int code;
    public String univ;

    public Etudiant(String nom, int code, String univ) {
        super(nom);
        this.code = code;
        this.univ = univ;
    }
    public int  getCode(){
        return this.code;
    }
    public String getUniv(){
        return this.univ;
    }

    public String toString(){
        return "the student with the name" + this.getNom() + "his code is " + this.getCode() + "study in " + this.getUniv();
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setUniv(String univ) {
        this.univ = univ;
    }
    public boolean equals(Etudiant E){
        return Objects.equals(this, E);
    }

    public static void main(String[] args){
        Etudiant e1 = new Etudiant("brahim", 122, "ENSAM");
        Etudiant e2 = new Etudiant("brahim", 122, "ENSAM");
        Etudiant e3 = e1;
        System.out.println(e1.equals(e3));

    }
}
