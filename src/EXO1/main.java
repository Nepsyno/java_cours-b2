package EXO1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voiture voiture = new Voiture();

        System.out.println("Choisir la marque de la voiture");
        voiture.marque = scanner.nextLine();

        System.out.println("Choisir le modele de la voiture");
        voiture.modele = scanner.nextLine();

        System.out.print("Choisir la couleur de la voiture entre rouge, vert et bleu: ");
        String couleur = scanner.nextLine();
        boolean found = false;
        for (String color : voiture.couleurs_autorisees) {
            if (couleur.equals(color)) {
                voiture.couleur = couleur;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("La couleur n'est pas autorisée");
            System.exit(1);
        }

        // Exemple d'utilisation des méthodes de la voiture
        voiture.demarrer();
        voiture.accelerer();
        voiture.freiner();

        scanner.close();
    }
}