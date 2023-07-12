import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //C'est pour lire l'entrée
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chosir l'operation que vous voulait realiser : ");
        System.out.println("1 - Compte bancaire : ");
        System.out.println("2 - Consulter le solde : ");
        System.out.println("3 - Déposer de l'argent : ");
        System.out.println("4 - Retirer de l'argent : ");
        System.out.println("5 - Consulter l'historique des operation : ");
        System.out.println("Quelle est votre choix ? ");

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
                //test
                System.out.println("votre adresse est : " + adresse);


                System.out.println("Quelle est votre Code Postal ? ");
                int CodePostal = scanner.nextInt();


                System.out.println("Quelle est votre ville ? ");
                String ville = scanner.nextLine();

                System.out.println("À quelle solde vous voulez démarrer ?");
                double solde = scanner.nextInt();

            break;
            case 2:
                System.out.println("Choix numero " + Choix);
            break;
            case 3:
                System.out.println("Choix numero " + Choix);
            break;
            case 4:
                System.out.println("Choix numero " + Choix);
            break;
            case 5:
                System.out.println("Choix numero " + Choix);
            break;



        }




    }
}