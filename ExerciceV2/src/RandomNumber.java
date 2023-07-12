
/*
Exercice 2 :
Générer trois nombres aléatoires compris entre 0 et 1000,
puis vérifier si vous avez deux nombres pairs suivis par un nombre impair.
Si ce n’est pas le cas, recommencer jusqu’à ce que vous ayez la combinaison pair, pair, impair.
Afficher ensuite le nombre d’essais nécessaires pour obtenir cette combinaison.
*/
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int Random1 = rand.nextInt(1001);
        int Random2 = rand.nextInt(1001);
        int Random3 = rand.nextInt(1001);
        System.out.println(Random1);
        System.out.println(Random2);
        System.out.println(Random3);

        while ((Random1 % 2 != 0) && (Random2 % 2 != 0) && (Random3 % 2 == 0))  {
             Random1 = rand.nextInt(1101);
             Random2 = rand.nextInt(1001);
             Random3 = rand.nextInt(1001);
             System.out.println(Random1 + " est paire " + Random2 + " est paire et " + Random3 + " est impair");


             /*
                if((Random1 % 2 == 0) && (Random2 % 2 == 0) && (Random3 % 2 != 0)){
                    System.out.println(Random1 + " est paire " + Random2 + " est paire et " + Random3 + " est impair");

                }
*/

        }
    }
}
