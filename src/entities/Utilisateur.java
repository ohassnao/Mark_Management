package entities;

public abstract class   Utilisateur {
    private String login;
    private String motDePasse;

    public Utilisateur(String login, String motDePasse) {
        this.login = login;
        this.motDePasse = motDePasse;
    }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public abstract String getRole();
}
