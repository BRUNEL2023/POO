package model;

public class Compte {
    private String numeroCompte;
    private double solde;
    private Client client;

    // Constructeur
    public Compte(String numeroCompte, Client client) {
        this.numeroCompte = numeroCompte;
        this.client = client;
        this.solde = 0.0; // Solde initial à 0
    }

    // Getters et Setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getClient() {
        return client;
    }

    // Méthodes pour les opérations bancaires
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0) {
            if (solde >= montant) {
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
            } else {
                System.out.println("Solde insuffisant pour effectuer ce retrait.");
            }
        } else {
            System.out.println("Le montant du retrait doit être positif.");
        }
    }

    // Méthode pour afficher les informations du compte
    public String afficherInfos() {
        return "Compte n°" + numeroCompte + " - " + client.afficherInfos() + " - Solde: " + solde;
    }

    // Méthode toString pour une représentation en chaîne de caractères
    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }
}
