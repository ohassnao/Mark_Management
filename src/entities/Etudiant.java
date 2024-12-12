package entities;

import java.util.HashMap;
import java.util.Map;

public class Etudiant {
    private String id;
    private String nom;
    private String prenom;
    private Map<ElementDeModule, Note> notes;

    public Etudiant(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new HashMap<>();
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public Map<ElementDeModule, Note> getNotes() { return notes; }

    public void attribuerNote(ElementDeModule element, Note note) {
        notes.put(element, note);
    }
}
