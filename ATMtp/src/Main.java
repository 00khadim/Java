import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //C'est pour lire l'entrée
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chosir l'operation que vous voulait realiser : ");
        System.out.println("1 - Compte bancaire ");
        System.out.println("2 - Consulter le solde ");
        System.out.println("3 - Déposer de l'argent ");
        System.out.println("4 - Retirer de l'argent ");
        System.out.println("5 - Consulter l'historique des operation ");
        System.out.println("Quelle est votre choix ? ");


        ClassClient newClient2 = new ClassClient("Cisse",
                "Khadim","40 av.lyon",
                69009, "LYON",
                1000) ;
        //Je stock ma variable pour le choix de l'user
        int Choix = scanner.nextInt();
        switch (Choix) {
            case 1:
                System.out.println("CREATION COMPTE BANCAIRE :");

                System.out.println("Quelle est votre nom ? ");
                String nom = scanner.nextLine();

                System.out.println("Quelle est votre prenom ? ");
                String prenom = scanner.nextLine();

                System.out.println("Quelle est votre adresse ? ");
                String adresse = scanner.nextLine();



                System.out.println("Quelle est votre Code Postal ? ");
                int codePostal = scanner.nextInt();


                System.out.println("Quelle est votre ville ? ");
                String ville = scanner.nextLine();

                System.out.println("À quelle solde vous voulez démarrer ? ");
                double solde = scanner.nextInt();

                //Je declare mon constructeur
                ClassClient newClient = new ClassClient(nom,prenom, adresse, codePostal, ville, solde ) ;
                System.out.println(nom + "TEST nom");
                System.out.println(prenom + "test prenom");

                break;
            case 2:
                System.out.println("Choix numero " + Choix);
            break;
            case 3:
                System.out.println("Vous avez : " + newClient2.solde);
                System.out.println("Quelle est la somme que vous  voulez deposer ? ");
                double entree = scanner.nextDouble();
                newClient2.deposer(entree);


            break;
            case 4:
                System.out.println("Vous avez : " + newClient2.solde);

                System.out.println("Vous voulez retirer quelle somme ?");
                double retirer = scanner.nextDouble();

                newClient2.prelevement(retirer);


                break;
            case 5:
                System.out.println("Choix numero " + Choix);
            break;



        }




    }
}