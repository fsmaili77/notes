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
    private int noteMatiere;


    public Matiere() {
    }

    public Matiere( String nomMatiere, int noteMatiere) {

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

    public int getNoteMatiere() {
        return noteMatiere;
    }

    public void setNoteMatiere(int noteMatiere) {
        this.noteMatiere = noteMatiere;
    }

    @Override
    public String toString() {
        return "Matiere: " +
                "ID = " + idMatiere +
                ", NOM = '" + nomMatiere + '\'' +
                ", NOTE = " + noteMatiere;
    }
}

