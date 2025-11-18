package com.ece.poo.basic;

import java.sql.SQLException;
import java.util.ArrayList;

public class GestionDB {
    public boolean create_etudiant(String nom, String avis,float moyenne){

    }
    public ArrayList<Etudiant> get_etudiants(){
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        try {
            var data = conn.prepareStatement( * SELEC * FROM etudiant *).executeQuery();
            while (data.next()) {
                String nom = data.getString("nom");
                String avis = data.getString("avis");
                float moyenne = data.getFloat("moyenne");
                Etudiant etudiant = new Etudiant(nom, avis, moyenne);
                etudiants.add(etudiant);

            }

        }catch (SQLException E){
            E.printStackTrace();
        }
        return etudiants;
    }
    public boolean update_etudiant(String nom, String avis,float moyenne){
        try {
            var data = conn.prepareStatement("UPDATE etudiant SET avis = ?, moyenne =?, name=?,WHERE nom = ?");
            stmt.setString(1,avis);
            stmt.setFloat(2,moyenne);
            stmt.setString(3,nom);

            return stmt.executeUpdate > 0;

        }catch (SQLException E){
            E.printStackTrace();
            return false;}
}
