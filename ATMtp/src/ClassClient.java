public class ClassClient {
    public String nom;
    public String prenom;
    public String adresse;
    public int codePostal;
    public String ville;
    public double solde;
    public double retirer;
    //Je declare mon constructeur
    public ClassClient(String nom,String prenom, String adresse, int codePostal, String ville, double solde){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.solde = solde;


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

    public double getRetirer() {
        return retirer;
    }


    void consulterSolde(double getSolde){
        System.out.println("Votre solde actuelle est de " + getSolde + "€");

    }




    void deposer (double entree){
        double nouveauSolde = this.solde + entree;
        setSolde(nouveauSolde);
        System.out.println("Vous avez deposer " + entree + "€ nouveau solde est de : " + solde + "€");

    }

    void prelevement(double retirer ){


        if (this.solde >= retirer) {
            double reste = (this.solde - retirer);
            setSolde(reste);
            System.out.println("Votre nouveau solde est de : " + solde + "€");

        }
        else {
            System.out.println("IL vous reste " + solde + "€");
            System.out.println("Vous êtes en negatif, vous devez nous rembourser : " + solde);




        }
        }

    }

