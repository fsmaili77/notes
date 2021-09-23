package com.gestionnaire.notes.entities;

public class Notes {
    int noteMatiere;
    float noteMoyenne;

    public Notes() {
    }

    public Notes(int noteMatiere, float noteMoyenne) {
        this.noteMatiere = noteMatiere;
        this.noteMoyenne = noteMoyenne;
    }

    public int getNoteMatiere() {
        return noteMatiere;
    }

    public void setNoteMatiere(int noteMatiere) {
        this.noteMatiere = noteMatiere;
    }

    public float getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(float noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }
}
