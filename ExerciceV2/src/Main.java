/*Exercice 1
creez un tableaux contenant 10 string , et remplir ce tableau avec des adresses mail, exemple
calculez le pourcentage de fournisseur de service amil.
(pour une adresse @gmail.com le fournisseur est gmail).
Consultez la Javadoc :
    String : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
 */

public class Main {
    public static void main(String[]args){
        //Mon premier article
        Article psg = new Article();
        psg.reference = ("ref0001");
        psg.designation = ("T-shirt PSG");
        psg.price = (59.99);
        System.out.println("Le " + psg.designation + " avec la reference " + psg.reference +  " coûte "+ psg.price );

    //Mon dexieme article
        Article inter = new Article();
        inter.reference = ("ref0002");
        inter.designation = ("T-shirt INTER");
        inter.price = (59.99);
        System.out.println("Le " + inter.designation + " avec la reference " + inter.reference +  " coûte "+ inter.price );
    }
}