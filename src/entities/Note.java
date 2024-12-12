package entities;

public class Note {
    private String etudiantId;
    private double valeur;

    public Note(String etudiantId, double valeur) {
        this.etudiantId = etudiantId;
        this.valeur = valeur;
    }

    public String getEtudiantId() { return etudiantId; }
    public double getValeur() { return valeur; }
}
