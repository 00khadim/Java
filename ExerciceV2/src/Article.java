//Création de la class
public class Article {
    //Declaration de attributs
    public String reference;
    public String designation;
    public double price;

    public Article() {
    }

    public Article(String test) {
        System.out.println(test);
    }


    // Je declare mon constructeur
    public Article(String reference, String designation, double price) {
        this.reference = reference;
        this.designation = designation;
        this.price = price;

    }

    void soldes(String designation) {
        this.designation = designation;
        this.price = price;
        double priceSolde = price * 0.80;
        System.out.println("SOLDE 80% l'article " + designation + " passe à " + priceSolde);


    }

}
