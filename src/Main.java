import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Chemin vers le fichier à lire
        File fichier = new File("test.txt");
        int totalMots = 0;

        try {
            // Utilisation du File Scanner pour lire le fichier
            Scanner lecteur = new Scanner(fichier);

            // Boucle qui lit chaque ligne du fichier
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // Séparation de la ligne en utilisant l'espace comme délimiteur
                // On utilise trim() pour enlever les espaces inutiles au début/fin
                if (!ligne.trim().isEmpty()) {
                    String[] mots = ligne.trim().split("\\s+");

                    // Addition du nombre de mots de la ligne au total
                    totalMots += mots.length;
                }
            }
            lecteur.close();

            

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Le fichier est introuvable. Vérifiez l'emplacement.");
        }
    }
}