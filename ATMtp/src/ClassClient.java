import java.util.ArrayList;
import java.util.List;

public class ClassClient {
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private String ville;
    private double solde;
    private List<Double> historiqueOperations;

    public ClassClient(String nom, String prenom, String adresse, int codePostal, String ville, double solde) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.solde = solde;
        this.historiqueOperations = new ArrayList<>();
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

    public void consulterSolde() {
        System.out.println("Votre solde actuel est de : " + solde + "€");
    }

    public void deposer(double entree) {
        double nouveauSolde = this.solde + entree;
        setSolde(nouveauSolde);
        System.out.println("Vous avez déposé " + entree + "€. Votre nouveau solde est de : " + solde + "€");
        historiqueOperations.add(entree);
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            double nouveauSolde = solde - montant;
            setSolde(nouveauSolde);
            System.out.println("Vous avez retiré " + montant + "€. Votre nouveau solde est de : " + solde + "€");
            historiqueOperations.add(-montant);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public void afficherHistoriqueOperations() {
        System.out.println("Historique des opérations :");
        for (double operation : historiqueOperations) {
            if (operation >= 0) {
                System.out.println("Dépôt : " + operation + "€");
            } else {
                System.out.println("Retrait : " + (-operation) + "€");
            }
        }
    }
}
