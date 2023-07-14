//ici je vais importer une class de Java qui me permettera pas la suite de utiliser les tableau
import java.util.ArrayList;
import java.util.List;

public class ClassClient {
    // je declare tout les attribue d'un client
    public String nom;
    public String prenom;
    public String adresse;
    public int codePostal;
    public String ville;
    public double solde;
    public List<String> historique;

    public ClassClient(String nom, String prenom, String adresse, int codePostal, String ville, double solde) {
    //Je declare mes attribue dans mon constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.solde = solde;
        this.historique = new ArrayList<>();
    }
// tout le get  sont des function qui renvoie la valeur de l'attribue choisi dans ce cas nom je l'utilise dans mon code juste pour afficher un attribue
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
// set c'est toujour une function pour modifier la valeur de l'attrubue dans ce cas solde
    public double getSolde() {
        return solde;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
// function qui affiche le solde elle prend aucan parametre elle return rien comme valeur (void)
    void consulterSolde() {
        System.out.println("Votre solde actuel est de " + solde + "€");
    }
// J'ai fait toutes la logique de la function pour deposer de l'argent que j'appele dans mon main
    void deposer(double entree) {
        // je declare le nouveau solde et je fais l'addiction
        double nouveauSolde = this.solde + entree;
        this.solde = nouveauSolde;
        String operation = "Dépôt de " + entree + "€. Nouveau solde : " + solde + "€";
        // je l'ajoute dans l'historique
        historique.add(operation);
        System.out.println(operation);
    }

    void prelevement(double retirer) {
        if (this.solde >= retirer) {
            double nouveauSolde = this.solde - retirer;
            this.solde = nouveauSolde;
            String operation = "Retrait de " + retirer + "€. Nouveau solde : " + solde + "€";
            historique.add(operation);
            System.out.println(operation);
        } else {
            // si le solde est inferieur à la somme que je veut retirer j'affiche :
            System.out.println("Fonds insuffisants. Vous ne pouvez pas retirer cette somme, votre solde est de "+ getSolde());
        }
    }
// ici c'est une function qui affiche tout les operations
    void afficherHistorique() {
        System.out.println("Historique des opérations :");
        // c'est une boucle pour parcourir la liste "historique"
        for (String operation : historique) {
            System.out.println(operation);
        }
    }
}
