package Etude_complete;

public class Etudiant {
    private String nom;
    private String prenom;
    private String classe;

    public Etudiant(String pnom, String pprenom, String pclasse) { // le "p" dans la variable permet d'identifier le paramètre dans la variable
        this.nom = pnom;
        this.prenom = pprenom;
        this.classe = pclasse;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Etudiant {: " + " nom ='" + nom + '\'' + ", prenom ='" + prenom + '\'' + ", classe ='" + classe + '\'' + '}';
    }
}