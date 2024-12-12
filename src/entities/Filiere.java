package entities;

import java.util.ArrayList;
import java.util.List;

public class Filiere {
    private String id;
    private String nom;
    private List<Module> modules;
    private List<ElementDeModule> elementsAssocies;

    public Filiere(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.modules = new ArrayList<>();
        this.elementsAssocies = new ArrayList<>();
    }

    public void ajouterModule(Module module) {
        modules.add(module);
    }

    public void ajouterElement(ElementDeModule element) {
        elementsAssocies.add(element);
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public List<Module> getModules() { return modules; }
    public List<ElementDeModule> getElementsAssocies() { return elementsAssocies; }
}
