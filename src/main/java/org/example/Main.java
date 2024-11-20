package org.example;

import model.Client;
import model.Compte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Création d'une liste de comptes
        List<Compte> comptes = new ArrayList<>();

        // Création de quelques clients
        Client client1 = new Client("Dupont", "Jean");
        Client client2 = new Client("Martin", "Marie");
        Client client3 = new Client("Durand", "Pierre");

        // Création et ajout de comptes à la liste
        comptes.add(new Compte("123456", client1));
        comptes.add(new Compte("789012", client2));
        comptes.add(new Compte("345678", client3));

        // Effectuer quelques opérations sur les comptes
        comptes.get(0).deposer(1000);
        comptes.get(1).deposer(2000);
        comptes.get(2).deposer(1500);
        comptes.get(1).retirer(500);

        // Affichage de la liste des comptes dans la console
        System.out.println("Liste des comptes :");
        for (Compte compte : comptes) {
            System.out.println(compte.afficherInfos());
        }

        // Ou, si vous préférez utiliser les streams de Java 8+ :
        // comptes.forEach(compte -> System.out.println(compte.afficherInfos()));
    }
}
