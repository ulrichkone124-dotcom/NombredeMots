# WordCounter - Compteur de Mots

Un programme Java simple qui analyse un fichier texte volumineux et calcule le nombre total de mots qu'il contient.

## Fonctionnement
1. Le programme ouvre un fichier spécifié via la classe `Scanner`.
2. Il parcourt le fichier ligne par ligne.
3. Chaque ligne est découpée (`split`) en fonction des espaces pour isoler les mots.
4. La longueur du tableau résultant est ajoutée à un compteur global.

## Structure
- `NombreDeMots.java` : Classe contenant la logique de lecture et de calcul.
- `Main.java` : Classe de test créant un fichier exemple et affichant le résultat.

## Utilisation
1. Clonez le projet.
2. Assurez-vous d'avoir un fichier `.txt` à la racine du projet ou laissez le `Main` générer le fichier de test.
3. Compilez : `javac *.java`
4. Exécutez : `java main`