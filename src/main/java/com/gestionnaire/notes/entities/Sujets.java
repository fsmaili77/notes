package com.gestionnaire.notes.entities;

import java.util.Arrays;

public class Sujets {
     private String [] nomSujets =
         {"Français", "Anglais", "Math", "SVT", "Histoire et Geographie",
             "Technologie", "Arts Plastiques", "Education Musicale",
             "Education phisique et sportive", "Vie Scolaire"
         };

    public Sujets() {
    }

    public Sujets(String[] nomSujets) {
        this.nomSujets = nomSujets;
    }

    public String[] getNomSujets() {
        return nomSujets;
    }

    public void setNomSujets(String[] nomSujets) {
        this.nomSujets = nomSujets;
    }

    @Override
    public String toString() {
        return "Sujets{" +
            "nomSujets=" + Arrays.toString(nomSujets) +
            '}';
    }
    public void afficherSujets() {
        System.out.println(this.toString());
    }
    public float getAverage() {
        float avg = 0;
        for (int i = 0; i < nomSujets.length; i++) {
            return i;
        }
        return avg;

    }


    /*public int somme(){
        int somme = 0;
        for (int i = 0; i < nomSujets.length ; i++) {
            somme+=nomSujets[i];

        }
        return somme;
    }
    public double moyenne(){
        double moyenne = 0;
        moyenne = somme()/ nomSujets.length;
        return moyenne;
    }*/

}
