import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Introduction à l'aventure
        System.out.println("Il y a bien longtemps, dans une petite école, pas si lointaine que ça au final ...");
        System.out.println("COLLEGE JACQUES PREVERT");
        System.out.println("Nan je déconne ^^");
        System.out.println("Poudlard, collège public de Magie, quelque part dans le Calvados.");

        //Création du personnage
        System.out.println("Bien, avant de commencer, nous devons créer votre lettre d'admission : Quel est votre nom ?");
        try (Scanner scanner = new Scanner(System.in)) {
                String name = scanner.nextLine();
                System.out.println("Bienvenue à Poudlard " + name + " !");
                System.out.println("Vous êtes un garçon ou une fille ? M pour garçon, F pour fille.");
                String gender = scanner.nextLine();
                if (gender.equalsIgnoreCase("garçon")) {
                    gender = "M";
                } else if (gender.equalsIgnoreCase("fille")) {
                    gender = "F";
                } else {
                    System.out.println("Je n'ai pas compris, vous êtes un garçon ou une fille ?");
                    gender = scanner.nextLine();
                        while(gender != "M" || gender != "F"){
                                System.out.println("Je n'ai pas compris, vous êtes un garçon ou une fille ?");
                                gender = scanner.nextLine();
                        }
                }
        }
        
    }
}