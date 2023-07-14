import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C'est pour lire l'entrée
        Scanner scanner = new Scanner(System.in);
        // Je declare mon choix et j'initialise à 0
        int choix = 0;
        ClassClient newClient2 = null;
// Je fais une boucle tant que pour que mon programme soit toujours en execution jusqu'à quand l'utilisateur quitte
        while (choix != 7) {
            //Je affiche mon menu
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

            //Grace à la methode scanner je recupere la reponse de l'user
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                // Les case sert à traiter different cas en 1 et 7, chaque cas à une propre logique
                case 1:
                    //La creation du compte ce lance quand l'utilisateur selection "1"
                    System.out.println("CRÉATION COMPTE BANCAIRE :");


                    // je lui pose tout le question neccessaire pour la creation de mon client
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
                    // Ici si l'utilisateur selectionne "2" l'objectif est de afficher le solde actuelle
                    //
                    if (newClient2 != null) {
                        System.out.println("Votre solde actuel est de : " + newClient2.getSolde());
                        //Si au contraire le solde est = a null le compte n'existe pas pour info (0!=null)
                    } else {
                        // ici le solde = nul du coup le compte n'existe pas
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 3:
                    // ici meme logique que dans le case 2, j'ai crée une condition si c'est vrai on rentre dans le if
                    if (newClient2 != null) {
                        //j'affiche le solde actuelle
                        System.out.println("Vous avez actuellement : " + newClient2.getSolde());
                        //je demande combien il veut deposer
                        System.out.println("Quelle somme voulez-vous déposer ? ");
                        //Grace toujours à scanner je inislialise le depot dans "montantDepot"
                        double montantDepot = scanner.nextDouble();
                        scanner.nextLine(); // Pour consommer le retour à la ligne
                        // Ici j'ai une methode est en parametre je passe le depot d'argent de l'utulisateur  et dans ma ClassClient je fait la logique
                        newClient2.deposer(montantDepot);
                        System.out.println("Dépôt effectué avec succès.");
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 4:
                    if (newClient2 != null) {
                        // meme logique que le case 3 sauf pour le nom de la methode et de la logique dans ma ClassClient
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
                    if (newClient2 != null) {
                        // ici si le client existe j'appele ma methode definie dans ma class
                        newClient2.afficherHistorique();
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 6:
                    System.out.println("MODIFIER LES INFORMATIONS DU COMPTE CLIENT :");
// Si le client existe je modifie le information en function des input rentree par kle client
                    if (newClient2 != null) {

                        System.out.println("Quel est votre nouveau nom ? ");
                        // Pour chaque attibue actuellement j'ai crée une nouvelle variable
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
                        //Ici je modifie les atrubue grace à methode set tojours definie dans ma class "ClassClient
                        newClient2.setNom(nouveauNom);
                        newClient2.setPrenom(nouveauPrenom);
                        newClient2.setAdresse(nouvelleAdresse);
                        newClient2.setCodePostal(nouveauCodePostal);
                        newClient2.setVille(nouvelleVille);

                        System.out.println("Les informations du compte client ont été modifié.");
                    } else {
                        System.out.println("Aucun compte n'a été créé.");
                    }
                    break;

                case 7:
                    //Je fais quitter l'utilisateur du menu principale
                    System.out.println("à la prochaine fois !");
                    break;

                default:
                    // si le choix est plus de 7 ou moins de 1 j'affiche "ERREUR : CHOIX INVALIDE"
                    System.out.println("ERREUR : CHOIX INVALIDE");
                    break;
            }
        }
    }
}