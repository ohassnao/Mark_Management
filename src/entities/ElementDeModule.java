package entities;

import java.util.ArrayList;
import java.util.List;

public class ElementDeModule {
    private String nom;
    private double coefficient;
    private Module module;
    private List<ModaliteEvaluation> modalitesEvaluation;
    private List<Etudiant> etudiantsAttribues; // Liste des étudiants
    private List<Filiere> filieresAssociees;   // Affiliation à plusieurs filières

    public ElementDeModule(String nom, double coefficient, Module module) {
        this.nom = nom;
        this.coefficient = coefficient;
        this.module = module;
        this.modalitesEvaluation = new ArrayList<>();
        this.etudiantsAttribues = new ArrayList<>();
        this.filieresAssociees = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiantsAttribues.add(etudiant);
    }

    public void ajouterFiliere(Filiere filiere) {
        if (!filieresAssociees.contains(filiere)) {
            filieresAssociees.add(filiere);
        }
    }

    public List<Etudiant> getEtudiantsAttribues() { return etudiantsAttribues; }
    public List<Filiere> getFilieresAssociees() { return filieresAssociees; }
    public String getNom() { return nom; }
    public double getCoefficient() { return coefficient; }
    public Module getModule() { return module; }
    public List<ModaliteEvaluation> getModalitesEvaluation() { return modalitesEvaluation; }
}
