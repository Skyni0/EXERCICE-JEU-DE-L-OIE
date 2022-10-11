package oie.boucl;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        int total = 0;
        int nbrEssais = 5;

        Random generateur = new Random();

        for (int i = 0; i <= nbrEssais; i++) {

            int lancer = generateur.nextInt(6) + 1;
            System.out.println("Vous avez fait " + lancer);

            total += lancer;
            System.out.println("Vous êtes à la case " + total);

        }
        System.out.println(total == 20 ? "Vous avez gagné !" : "Perdu ! ");

    }

}
