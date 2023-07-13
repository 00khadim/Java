import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C'est pour lire l'entrée
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        ClassClient newClient2 = null;

        while (choix != 7) {
            System.out.println("Choisir l'opération que vous souhaitez réaliser : ");
            System.out.println("1 - Créer un compte bancaire ");
            System.out.println("2 - Consulter le solde ");
            System.out.println("3 - Déposer de l'argent ");
            System.out.println("4 - Retirer de l'argent ");
            System.out.println("5 - Consulter l'historique des opérations ");
            System.out.println("6 - Modifier les informations du compte client ");
            System.out.println("7 - Sortir ");
            System.out.println();
            System.out.println("Quel est votre choix ? ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.println("CRÉATION COMPTE BANCAIRE :");

                    System.out.println("Quel est votre nom ? ");
                    String nom = scanner.nextLine();

                    System.out.println("Quel est votre prénom ? ");
                    String prenom = scanner.nextLine();

                    System.out.println("Quelle est votre adresse ? ");
                    String adresse = scanner.nextLine();

                    System.out.println("Quel est votre Code Postal ? ");
                    int codePostal = scanner.nextInt();
                    scanner.nextLine(); // Pour consommer le retour à la ligne

                    System.out.println("Quelle est votre ville ? ");
                    String ville = scanner.nextLine();

                    System.out.println("Avec quel solde voulez-vous démarrer ? ");
                    double solde = scanner.nextDouble();
                    scanner.nextLine(); // Pour consommer le retour à la ligne

                    newClient2 = new ClassClient(nom, prenom, adresse, codePostal, ville, solde);
                    System.out.println("Compte créé avec succès.");
                    break;

                case 2:
                    if (newClient2 != null) {
                        System.out.println("Votre solde actuel est de : " + newClient2.getSolde());
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 3:
                    if (newClient2 != null) {
                        System.out.println("Vous avez actuellement : " + newClient2.getSolde());
                        System.out.println("Quelle somme voulez-vous déposer ? ");
                        double montantDepot = scanner.nextDouble();
                        scanner.nextLine(); // Pour consommer le retour à la ligne
                        newClient2.deposer(montantDepot);
                        System.out.println("Dépôt effectué avec succès.");
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 4:
                    if (newClient2 != null) {
                        System.out.println("Vous avez actuellement : " + newClient2.getSolde());
                        System.out.println("Quelle somme voulez-vous retirer ? ");
                        double montantRetrait = scanner.nextDouble();
                        scanner.nextLine(); // Pour consommer le retour à la ligne
                        newClient2.prelevement(montantRetrait);
                        System.out.println("Retrait effectué avec succès.");
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 5:
                    System.out.println("Choix numéro " + choix);
                    break;

                case 6:
                    System.out.println("MODIFIER LES INFORMATIONS DU COMPTE CLIENT :");

                    if (newClient2 != null) {
                        System.out.println("Quel est votre nouveau nom ? ");
                        String nouveauNom = scanner.nextLine();

                        System.out.println("Quel est votre nouveau prénom ? ");
                        String nouveauPrenom = scanner.nextLine();

                        System.out.println("Quelle est votre nouvelle adresse ? ");
                        String nouvelleAdresse = scanner.nextLine();

                        System.out.println("Quel est votre nouveau Code Postal ? ");
                        int nouveauCodePostal = scanner.nextInt();
                        scanner.nextLine(); // Pour consommer le retour à la ligne

                        System.out.println("Quelle est votre nouvelle ville ? ");
                        String nouvelleVille = scanner.nextLine();

                        newClient2.setNom(nouveauNom);
                        newClient2.setPrenom(nouveauPrenom);
                        newClient2.setAdresse(nouvelleAdresse);
                        newClient2.setCodePostal(nouveauCodePostal);
                        newClient2.setVille(nouvelleVille);

                        System.out.println("Les informations du compte client ont été mises à jour avec succès.");
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 7:
                    System.out.println("à la prochaine fois !");
                    break;

                default:
                    System.out.println("ERREUR : CHOIX INVALIDE");
                    break;
            }
        }
    }
}