//Création de la class
public class Article {
    //Declaration de attributs
    public String reference;
    public String designation;
    public double price;

    void Article(){
        System.out.println(reference + designation + price + "test");

    }
    //Constructeur ??
    void Soldes(){
        double priceSolde = price*0.80;
        System.out.println("SOLDE 80% l'article passe à "+ priceSolde );


    }
}
