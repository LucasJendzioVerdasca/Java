import java.util.Scanner;

public class SortingHat {
    public static void Sortinghat(Player player) {
        // Vérification que le joueur est défini
        if (player == null) {
            System.out.println("Erreur : joueur n'est pas défini.");
            return;
        }

        // Création d'un scanner pour lire les réponses de l'utilisateur
        try (
                Scanner scanner = new Scanner(System.in)) {
            // Initialisation des compteurs pour chaque maison
            int gryffindor = 0;
            int ravenclaw = 0;
            int hufflepuff = 0;
            int slytherin = 0;

            // Affichage des questions et des options de réponse
            String[] questions = {
                    "Question 1: Quelle est votre plus grande qualité?",
                    "Question 2: Comment réagissez-vous face à une situation difficile?",
                    "Question 3: Quelle est votre plus grande peur ?",
                    "Question 4: Comment préférez-vous passer votre temps libre ?",
                    "Question 5: Quel est votre trait de caractère le plus marquant ?",
                    "Question 6: Comment réagissez-vous face à une injustice ?",
                    "Question 7: Quelle est votre plus grande ambition ?",
                    "Question 8: Comment réagissez-vous face aux difficultés ?",
            };

            String[][] options = {
                    { "a) Courage", "b) Intelligence", "c) Bienveillance", "d) Ambition" },
                    { "a) Je fonce tête baissée pour trouver une solution",
                            "b) J'analyse la situation pour trouver la meilleure solution",
                            "c) J'essaie de comprendre les sentiments des autres et de les aider",
                            "d) Je trouve une solution qui me profitera personnellement" },
                    { "a) La mort", "b) L'ignorance", "c) L'échec", "d) La faiblesse" },
                    { "a) En pratiquant un sport ou une activité physique", "b) En lisant un livre",
                            "c) En discutant avec des amis",
                            "d) En faisant quelque chose qui me profitera personnellement" },
                    { "a) Audacieux(euse) et téméraire", "b) Intelligent(e) et réfléchi(e)",
                            "c) Gentil(le) et empathique", "d) Ambitieux(euse) et déterminé(e)" },
                    { "a) Je me bats pour défendre les opprimés",
                            "b) J'essaie de trouver une solution juste et équitable",
                            "c) Je me mets à la place de la personne injustement traitée",
                            "d) Je cherche une solution qui me profitera personnellement" },
                    { "a) Vivre une vie remplie d'aventures",
                            "b) Avoir une grande connaissance et compréhension du monde",
                            "c) Avoir une famille heureuse et aimante",
                            "d) Obtenir une grande réussite et reconnaissance" },
                    { "a) Je fais face aux difficultés et aux défis avec détermination et courage",
                            "b) J'analyse la situation pour trouver la meilleure solution possible",
                            "c) J'essaie de comprendre les émotions des autres pour trouver une solution collective",
                            "d) Je travaille dur pour réussir et éviter l'échec." },
            };

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }

                String response = scanner.nextLine().toLowerCase();
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);

                switch (response) {
                    case "a":
                        gryffindor++;
                        break;
                    case "b":
                        ravenclaw++;
                        break;
                    case "c":
                        hufflepuff++;
                        break;
                    case "d":
                        slytherin++;
                        break;
                    default:
                        System.out.println("Réponse invalide.");
                        i--;
                        break;
                }
            }

            // Détermination de la maison correspondante en fonction des points obtenus
            House house = null;
            int pointsMax = Math.max(Math.max(gryffindor, ravenclaw), Math.max(hufflepuff, slytherin));
            if (gryffindor == pointsMax) {
                house = House.GRYFFINDOR;
            } else if (ravenclaw == pointsMax) {
                house = House.RAVENCLAW;
            } else if (hufflepuff == pointsMax) {
                house = House.HUFFLEPUFF;
            } else if (slytherin == pointsMax) {
                house = House.SLYTHERIN;
            }

            player.setHouse(house);

            // Affichage du résultat
            System.out.println("Choixpeau : Je vois... Je vois... " + house.getName() + " ! ");
        }
    }
}