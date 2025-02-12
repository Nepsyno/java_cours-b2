package Etude_complete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionEtudiants {
    private List<Etude_complete.Etudiant> listeEtudiants;

    public GestionEtudiants() {
        this.listeEtudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(String nom, String prenom, String classe) {
        listeEtudiants.add(new Etude_complete.Etudiant(nom, prenom, classe));
    }

    public void afficherEtudiants() {
        for (Etude_complete.Etudiant e : listeEtudiants) {
            System.out.println(e);
        }
    }

    public void supprimerEtudiant(String nom) {
        Iterator<Etude_complete.Etudiant> it = listeEtudiants.iterator();
        while (it.hasNext()) {
            if (it.next().getNom().equalsIgnoreCase(nom)) {
                it.remove();
                System.out.println("Etudiant " + nom + " supprimé.");
                return;
            }
        }
        System.out.println("Aucun étudiant trouvé avec le nom : " + nom);
    }
}
