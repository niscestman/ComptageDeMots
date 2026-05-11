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




        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Le fichier est introuvable. Vérifiez l'emplacement.");
        }
    }
}