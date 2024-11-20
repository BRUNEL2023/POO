package model;

public class Client {
    private String nom;
    private String prenom;

    // Constructeur
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode pour afficher les informations du client
    public String afficherInfos() {
        return "Client: " + prenom + " " + nom;
    }

    // Méthode toString pour une représentation en chaîne de caractères
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
