package com.gestionnaire.notes.entities;

public class Classe {
    private int id;
    private String nomClasse;
    private String periode;

    public Classe() {
    }

    public Classe(int id, String nomClasse, String periode) {
        this.id = id;
        this.nomClasse = nomClasse;
        this.periode = periode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }
}
