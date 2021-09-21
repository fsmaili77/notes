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

    private Long id;
    private String nomMatiere;

    public Matiere() {
    }

    public Matiere( String nomMatiere) {

        this.nomMatiere = nomMatiere;

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }


}

