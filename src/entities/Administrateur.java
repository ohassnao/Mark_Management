package entities;

public class Administrateur extends Utilisateur {
    private String nom;
    private String prenom;

    public Administrateur(String login, String motDePasse, String nom, String prenom) {
        super(login, motDePasse);
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    @Override
    public String getRole() {
        return "Administrateur";
    }
}
