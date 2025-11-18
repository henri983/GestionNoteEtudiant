package com.ece.poo.test;
import com.ece.poo.basic.Etudiant;
import com.ece.poo.basic.Notation;

import java.util.Scanner;

public class TestEtudiant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indiquez le nom de l'etudiant:");
        String nom = sc.nextLine();
        Etudiant etudiant = new Etudiant(nom);
        etudiant.ajouerNotation(new Notation("Maths",4,12));
        etudiant.ajouerNotation(new Notation("PC",5,8));
        etudiant.ajouerNotation(new Notation("HG",1,18));
        etudiant.calculMoyenne();
        etudiant.genereAvis();
        System.out.println("Moyenne:"+ etudiant.getMoyenne());
        System.out.println("Avis:"+ etudiant.getMoyenne());


    }
}
