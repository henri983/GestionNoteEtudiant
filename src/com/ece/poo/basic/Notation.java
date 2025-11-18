package com.ece.poo.basic;

public class Notation {
    private String matiere;
    private int coef;
    private float note;

    //constructeur

    public Notation(String matiere, int coef, float note) {
        this.matiere = matiere;
        this.coef = coef;
        this.note = note;
    }
    //getteur et setteur

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
