package EXO1;

class Voiture {
    public String marque;
    public String modele;
    public String couleur;
    public String[] couleurs_autorisees = {"rouge", "vert", "bleu"};

    public void demarrer() {
        System.out.println("La voiture démarre");
    }

    public void freiner() {
        System.out.println("La voiture freine");
    }

    public void accelerer() {
        System.out.println("La voiture accelere");
    }
}