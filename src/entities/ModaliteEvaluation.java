package entities;

public class ModaliteEvaluation {
    private String type; // CC, TP, Projet, etc.
    private double coefficient;

    public ModaliteEvaluation(String type, double coefficient) {
        this.type = type;
        this.coefficient = coefficient;
    }

    public String getType() { return type; }
    public double getCoefficient() { return coefficient; }
}
