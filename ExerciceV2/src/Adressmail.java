public class Adressmail {



    public static void main(String[] args) {

        //Je declare et initialise  mon tableau de mails
        String[] mails = {
                "Kjadimcisse00@gmail.com",
                "johndoe123@gmail.com",
                "emilyjones22@hotmail.com",
                "davidbrown456@outlook.com",
                "amycarter99@gmail.com",
                "samwilson234@yahoo.com",
                "lilythomas77@hotmail.com",
                "robertgreen555@outlook.com",
                "sophiewalker123@gmail.com",
                "alexmartin789@yahoo.com",

        };
        // Je declare et initialise  mon Compteur de mail à 0
        int compteurGmail = 0;
        int totalMails = mails.length;
        //J'initialise cette variable pour avoir la quantité de mail dans le tableau de string mails       int totalMails = mails.length;
        for(int i =0; i < totalMails; i++){
            //Avec la boucle for je vais parcourir un par un chaque adresse mail
            String email =  mails[i];
            // Pour chaque mail  qui termine par @gmail.com compteur mai=il = +1
            //Voici la doc https://www.w3schools.com/java/ref_string_endswith.asp
            if(email.endsWith ("@gmail.com")){
                compteurGmail++;

            }

        }

        System.out.println("Il y a " + compteurGmail + " mail avec service gmail");
        double moyenneGmail = (( double)compteurGmail / totalMails * 100 );
        // Je affiche la moyenne
        System.out.println("La moyenne des services gmail est  de : " + moyenneGmail + "%");
    }
}
