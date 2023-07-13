import java.util.ArrayList;
import java.util.List;

public class ClassClient {
    public String nom;
    public String prenom;
    public String adresse;
    public int codePostal;
    public String ville;
    public double solde;
    public List<String> historique;

    public ClassClient(String nom, String prenom, String adresse, int codePostal, String ville, double solde) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.solde = solde;
        this.historique = new ArrayList<>();
    }

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

    void consulterSolde() {
        System.out.println("Votre solde actuel est de " + solde + "€");
    }

    void deposer(double entree) {
        double nouveauSolde = this.solde + entree;
        this.solde = nouveauSolde;
        String operation = "Dépôt de " + entree + "€. Nouveau solde : " + solde + "€";
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
            System.out.println("Fonds insuffisants. Vous ne pouvez pas retirer cette somme.");
        }
    }

    void afficherHistorique() {
        System.out.println("Historique des opérations :");
        for (String operation : historique) {
            System.out.println(operation);
        }
    }
}
