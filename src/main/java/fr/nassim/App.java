package fr.nassim;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 1. Initialisation des variables
        int gainMinimumParAn = 30000;
        int tempsDeTravailMinimum = 2;

        // 2. Demande a l'utilisateur son argent gagnée par année
        System.out.println("Combien gagnez vous d'argent par an ?");
        Scanner clavier = new Scanner(System.in);
        Double argentParAn = clavier.nextDouble();

        // 3. Demande à l'utilisateur depuians combien de temps travaille t-il
        System.out.println("Depuis combien de temps travaillez vous ?");
        int tempsDeTravail = clavier.nextInt();
        clavier.close();

        // 4. Condition pour obtenir le prêt
        if (argentParAn >= gainMinimumParAn && tempsDeTravail >= tempsDeTravailMinimum) {
            System.out.println("Bravo ! Vous êtes éligible à l'obtention d'un prêt");
        } else {
            System.out.println("Désolé, Vous n'êtes malheureusement pas éligible à un prêt");
        }

    }

}
