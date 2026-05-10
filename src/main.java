import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String nomFichierTest = "texte_volumineux.txt";

        // --- Étape de préparation : Création d'un fichier de test ---
        try (FileWriter fw = new FileWriter(nomFichierTest)) {
            fw.write("Java est un langage de programmation.\n");
            fw.write("Ce programme compte le nombre de mots dans ce fichier.\n");
            fw.write("Chaque ligne est lue et séparée par des espaces.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la création du fichier de test.");
        }

        // --- Étape de l'exercice : Comptage des mots ---
        nombredeMots compteur = new nombredeMots(nomFichierTest);
        int resultat = compteur.compter();

        System.out.println("---------------------------------------");
        System.out.println("Analyse du fichier : " + nomFichierTest);
        System.out.println("Nombre total de mots détectés : " + resultat);
        System.out.println("---------------------------------------");
    }
}
