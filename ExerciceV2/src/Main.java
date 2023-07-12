/*Exercice 1
creez un tableaux contenant 10 string , et remplir ce tableau avec des adresses mail, exemple
calculez le pourcentage de fournisseur de service amil.
(pour une adresse @gmail.com le fournisseur est gmail).
Consultez la Javadoc :
    String : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
 */

public class Main {
    public static void main(String[]args){
        //Je crée mon article et j'appele mon constructeur

        Article psg = new Article("ref0001","T-shirt PSG", 59.99);

        System.out.println("Le " + psg.designation + " avec la reference " + psg.reference +  " coûte "+ psg.price );

    //Je crée mon article et j'appele mon constructeur
        Article inter = new Article("ref0002","T-shirt INTER", 100);

        System.out.println("Le " + inter.designation + " avec la reference " + inter.reference +  " coûte "+ inter.price );

       inter.soldes(inter.designation);
    }
}