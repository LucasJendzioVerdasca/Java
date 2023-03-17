import java.util.Scanner;

public class SortingHat {

    public SortingHat() {
        try (// Création d'un scanner pour lire les réponses de l'utilisateur
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
                "Question 5: Quel est votre plus grand défaut ?",
                "Question 6: Quelle est votre plus grande qualité ?",
                "Question 7: Quel est votre plus grand rêve ?",
                "Question 8: Quelle est votre plus grande qualité ?",
            };
    
            String[][] options = {
                {"a) Courage", "b) Intelligence", "c) Bienveillance", "d) Ambition"},
                {"a) Je fonce tête baissée pour trouver une solution", "b) J'analyse la situation pour trouver la meilleure solution", "c) J'essaie de comprendre les sentiments des autres et de les aider", "d) Je trouve une solution qui me profitera personnellement"},
                {"a) La mort", "b) L'ignorance", "c) L'échec", "d) La faiblesse"},
                {"a) En pratiquant un sport ou une activité physique", "b) En lisant un livre", "c) En discutant avec des amis", "d) En faisant quelque chose qui me profitera personnellement"},
                {"a) Audacieux(euse) et téméraire", "b) Intelligent(e) et réfléchi(e)", "c) Gentil(le) et empathique", "d) Ambitieux(euse) et déterminé(e)"},
                {"a) Je me bats pour défendre les opprimés", "b) J'essaie de trouver une solution juste et équitable", "c) Je me mets à la place de la personne injustement traitée","d) Je cherche une solution qui me profitera personnellement"},
                {"a) Vivre une vie remplie d'aventures", "b) Avoir une grande connaissance et compréhension du monde", "c) Avoir une famille heureuse et aimante", "d) Obtenir une grande réussite et reconnaissance"},
                {"a) Je fais face aux difficultés et aux défis avec détermination et courage", "b) J'analyse la situation pour trouver la meilleure solution possible","c) J'essaie de comprendre les émotions des autres pour trouver une solution collective", "d) Je travaille dur pour réussir et éviter l'échec."},
            };
    
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }
    
                String response = scanner.nextLine().toLowerCase();
    
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
            String maison = "";
            int pointsMax = Math.max(Math.max(gryffindor, ravenclaw), Math.max(hufflepuff, slytherin));
            if (gryffindor == pointsMax) {
                maison = "Gryffondor";
            }
            else if (ravenclaw == pointsMax) {
                maison = "Serdaigle";
            }
            else if (hufflepuff == pointsMax) {
                maison = "Poufsouffle";
            }
            else if (slytherin == pointsMax) {
                maison = "Serpentard";
            }
            
            // Affichage du résultat
            System.out.println("Vous êtes dans la maison " + maison + " !");
        }
    }
}