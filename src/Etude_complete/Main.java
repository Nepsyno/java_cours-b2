package Etude_complete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lancement du programme de gestion d'étudiants - v1");
        Etude_complete.GestionEtudiants gestion = new Etude_complete.GestionEtudiants();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Ajouter un étudiant");
            System.out.println("2. Afficher les étudiants");
            System.out.println("3. Supprimer un étudiant");
            System.out.println("4. Quitter");
            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Classe: ");
                    String classe = scanner.nextLine();
                    gestion.ajouterEtudiant(nom, prenom, classe);
                    break;
                case 2:
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Nom de l'étudiant à supprimer: ");
                    String nomSupp = scanner.nextLine();
                    gestion.supprimerEtudiant(nomSupp);
                    break;
                case 4:
                    System.out.println("Programme terminé.");
                    scanner.close();
                    return;
                default:
                    System.out.println("X_X --> Choix invalide ! Veuillez réessayer par une valeur comprise entre 1 et 4");
            }
        }
    }
}