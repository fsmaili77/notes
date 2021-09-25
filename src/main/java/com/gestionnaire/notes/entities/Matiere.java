package com.gestionnaire.notes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Matiere implements Serializable {
    @Id
    @GeneratedValue
    private Long idMatiere;
    private String nomMatiere;
    private double noteMatiere;


    public Matiere() {
    }

    public Matiere( String nomMatiere, double noteMatiere) {

        this.nomMatiere = nomMatiere;
        this.noteMatiere = noteMatiere;
    }

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public double getNoteMatiere() {
        return noteMatiere;
    }

    public void setNoteMatiere(double noteMatiere) {
        this.noteMatiere = noteMatiere;
    }

    @Override
    public String toString() {
        return nomMatiere;
    }
    public void afficherMatieres() {
        System.out.println(this.toString());
    }

}

