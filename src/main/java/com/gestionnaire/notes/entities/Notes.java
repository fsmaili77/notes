package com.gestionnaire.notes.entities;

public class Notes {

    int noteEcrit;
    int noteOral;
    double noteMoyenne = (noteEcrit+noteOral)/2;


    public Notes() {
    }

    public Notes(int noteEcrit, int noteOral, double noteMoyenne) {
        this.noteEcrit = noteEcrit;
        this.noteOral = noteOral;
        this.noteMoyenne = noteMoyenne;
    }

    public int getNoteEcrit() {
        return noteEcrit;
    }

    public void setNoteEcrit(int noteEcrit) {
        this.noteEcrit = noteEcrit;
    }

    public int getNoteOral() {
        return noteOral;
    }

    public void setNoteOral(int noteOral) {
        this.noteOral = noteOral;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

    @Override
    public String toString() {
        return "Notes{" +
            "noteEcrit=" + noteEcrit +
            ", noteOral=" + noteOral +
            ", noteMoyenne=" + noteMoyenne +
            '}';
    }
    public void afficherResultatNotes() {
        System.out.println(this.toString());
    }
    public double afficherMoyenneMatiere(){
        return ((double) noteEcrit + noteOral)/2;
    }



}
