package entities;

import java.util.List;

public class Professeur extends Utilisateur {
    private String nom;
    private String prenom;
    private String specialite;
    private List<ElementDeModule> elementsPrisEnCharge;

    public Professeur(String login, String motDePasse, String nom, String prenom, String specialite) {
        super(login, motDePasse);
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getSpecialite() { return specialite; }
    public List<ElementDeModule> getElementsPrisEnCharge() { return elementsPrisEnCharge; }

    public void ajouterElement(ElementDeModule element) {
        elementsPrisEnCharge.add(element);
    }

    @Override
    public String getRole() {
        return "Professeur";
    }
}
