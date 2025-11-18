package com.ece.poo.basic;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String avis;
    private float moyenne;
    // ArrayList pour les tableau
    private ArrayList<Notation> notations;

    //les constructeurs

    public Etudiant(String nom) {
        this.nom = nom;
        this.notations = notations;
        this.moyenne = 0;
    }
    //getteur et setteur

    //le get pour voir l'attribut
    //le set pour modifier l'attribut

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public float getMoyenne() {
        return moyenne;
    }


    public ArrayList<Notation> getNotations() {
        return notations;
    }

    public void setNotations(ArrayList<Notation> notations) {
        this.notations = notations;
    }

    // la methode calcule moyenne
    public void calculMoyenne(){
        var sumCoef = 0;// somme des coef
        var sumCoefxNote = 0; //somme (coef * note)
        for (Notation n : notations) { //pour chaque note "n"
            sumCoef += n.getCoef(); //on fait la somme des coef
            sumCoefxNote += n.getCoef() * n.getNote();

        }
       this.moyenne =  sumCoefxNote / sumCoef;
    }
    public void genereAvis(){
        //operateur ternaire
        this.avis =this.moyenne >= 10? "Passe en classe superieure":"Autorisé à redoubler";
    }

   public void ajouerNotation(Notation n){
        notations.add(n);
   }
/*
   public  void afficherInfo(){
        System.out.println(
                for (Notation n : notations) {
                    return afficherInfo();
       }
                String.format("Name :%s, Moyenne: %s, Avis: %s",nom ,  moyenne ,avis)

        );
    }

 */
    public void afficherInfo() {
    for (Notation n : notations) {
        System.out.println(String.format(
                "nom : %s, Moyenne : %.2f, Avis : %s",nom,moyenne,avis));
    }
}

    //ajouter etudiant
    public boolean ajouter_etudiant(){
        return GestionDB.get_etudiant();
    }
    //mettre a jour etudiant
    public boolean mettre_a_jour_etudiant(){
        return GestionDB.update_etudiant(this.nom, this.avis, this.moyenne);
    }
}
