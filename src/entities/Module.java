package entities;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private String code;
    private String nom;
    private String semestre;
    private Filiere filiere;
    private List<ElementDeModule> elements;

    public Module(String code, String nom, String semestre, Filiere filiere) {
        this.code = code;
        this.nom = nom;
        this.semestre = semestre;
        this.filiere = filiere;
        this.elements = new ArrayList<>();
    }

    public void ajouterElement(ElementDeModule element) {
        elements.add(element);
    }

    public String getCode() { return code; }
    public String getNom() { return nom; }
    public String getSemestre() { return semestre; }
    public List<ElementDeModule> getElements() { return elements; }
}
