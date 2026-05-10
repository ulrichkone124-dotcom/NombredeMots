import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nombredeMots {
    private String nomFichier;

    // Constructeur avec le chemin du fichier à analyser
    public nombredeMots(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public int compter() {
        int totalMots = 0;
        File fichier = new File(nomFichier);

        try {
            // Utilisation du Scanner pour lire le fichier
            Scanner lecteur = new Scanner(fichier);

            // Boucle qui lit chaque ligne du fichier
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // On ignore les lignes vides pour éviter les erreurs de comptage
                if (!ligne.trim().isEmpty()) {
                    // Séparation de la ligne en utilisant l'espace comme délimiteur
                    // "\\s+" permet de gérer plusieurs espaces consécutifs
                    String[] mots = ligne.trim().split("\\s+");

                    // Addition du nombre de mots de la ligne au total
                    totalMots += mots.length;
                }
            }
            lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Le fichier '" + nomFichier + "' est introuvable.");
        }

        return totalMots;
    }
}
