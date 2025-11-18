import com.ece.poo.basic.Etudiant;

import java.sql.Connection;// permet la connexion avec le serveur
import java.sql.DriverManager;// import drivermanager dans le serveur sql
import java.sql.SQLException;//on importe SQLException dans le serveur sql

public class Main {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test-jdbc?createDatabaseIfNotExist=true";// la creation de db
        var username = "root";
        var password = "";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connexion etablit  a la base de donnee");
          /*
            //pour la rec
            var data = conn.prepareStatement("SELECT * FROM etudiant").executeQuery();
            while (data.next()) {

                String name = data.getString("name"), avis = data.getString("avis");
                Float moyenne = data.getFloat("moyenne");
                Etudiant student = new Etudiant(name,avis,moyenne);
                student.afficherInfo();
                etudiant.add(student);

            }   */

            //l'insertion de donnee

            var stmt = conn.prepareStatement(
                    "INSERT INTO etudiant (name , moyenne,avis) VALUES (?,?,?)"
            );
            stmt.setString(1, "john");
            stmt.setFloat(2, 14);
            stmt.setString(3, "passe en classe superieur");
            stmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}