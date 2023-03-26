import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    // Les éléments de l'histoire
    public static int place = 0, act = 1;
    public static String[] places = { "Toilettes des filles", "Chmabre des secrets", "Forêt interdite", "Cimetierre", "Salle d'examen de Poudlard", "Tour d'observation de Poudlard", "Poudlard" };

    // méthode pour attendre une entrée de l'utilisateur
    public static int readInt(String prompt, int userchoice) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                input = -1;
                System.out.println("Veuillez entrer un nombre");
            }
        } while (input < 1 || input > userchoice);
        return input;
    }

    // méthode pour simuler un vidage de la console
    public static void clearConsole() {
        for (int i = 0; i < 50; ++i)
            System.out.println();
    }

    // méthode pour afficher une séparation d'une taille n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; ++i)
            System.out.print("-");
        System.out.println();
    }

    // méthode pour afficher un en-tête
    public static void printHeading(String heading) {
        printSeparator(30);
        System.out.println(heading);
        printSeparator(30);
    }

    // méthode pour attendre une entrée de l'utilisateur
    public static void anythingToContinue() {
        System.out.println("Appuyez sur Entrée pour continuer");
        scanner.nextLine();
    }

    // Le début du jeu
    public static void startGame() {
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Bienvenue dans le jeu de sorcier le plus cool du monde");
        System.out.println("Crée par Jendzio-Verdasca");
        System.out.println("Scénarisé par Antoine Guérard (merci à lui)");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();

        // Entrée du nom du joueur
        boolean nameSet = false;
        do {
            clearConsole();
            printHeading("Avant de commencer cette merveilleuse aventure, entrez votre nom");
            String name = scanner.nextLine();

            // Vérification du nom
            clearConsole();
            printHeading("Votre nom est : " + name + ". Est-ce correct ?");
            System.out.println("(1) Oui");
            System.out.println("(2) Non");
            int input = readInt("Votre choix : ", 2);
            if (input == 1) {
                nameSet = true;
            }
            new Player(name);
        } while (!nameSet);

        // L'intro du jeu
        Story.printIntro();

        // Début de l'aventure
        gameLoop();
    }

    // Méthode pour vérifier l'année actuelle
    public static void checkAct() {
        //passer à l'acte suivant pour chaque 100 points d'expérience
        if (player.xp >= 100 && act == 1) {
            //on passe à l'année suivante
            act = 2;
            place = 1;
            //on affiche le message de fin de l'année
            Story.FirstActOutro();
            //on affiche le message de début de l'année suivante
            Story.SecondActIntro();
        } else if (player.xp >= 200 && act == 2) {
            act = 3;
            place = 2;
            Story.SecondActOutro();
            Story.ThirdActIntro();
        } else if (player.xp >= 300 && act == 3) {
            act = 4;
            place = 3;
            Story.ThirdActOutro();
            Story.FourthActIntro();
        } else if (player.xp < 400 && act == 4) {
            act = 5;
            place = 4;
            Story.FourthActOutro();
            Story.FifthActIntro();
        } else if (player.xp < 500 && act == 5) {
            act = 6;
            place = 5;
            Story.FifthActOutro();
            Story.SixthActIntro();
        } else if (player.xp < 600 && act == 6) {
            act = 7;
            place = 6;
            Story.SixthActOutro();
            Story.SeventhActIntro();
        }
    }

    // Méthode pour continuer l'aventure
    public static void continueJourney() {
        // Vérfication de l'année actuelle
        checkAct();
        // Vérification de la progression
        if act(!=7)

    }

    // Méthode pour afficher les informations du joueur
    public static void chracterInfo() {
        clearConsole();
        printHeading("Informations du joueur");
        System.out.println("Nom : " + player.name);
        System.out.println("Vie : " + player.hp + "/" + player.maxHp);
        System.out.println("Magie : " + player.magic + "/" + player.maxMagic);
        System.out.println("XP : " + player.xp);
        anythingToContinue();
        printSeparator(20);
    }

    // Méthode pour afficher le menu
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choisis une option :");
        printSeparator(20);
        System.out.println("(1) Continuer l'aventure");
        System.out.println("(2) Voir les informations du joueur");
        System.out.println("(3) Quitter le jeu");
    }

    // La boucle principale du jeu
    private static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt("-> ", 3);
            if (input == 1) {
                continueJourney();
            } else if (input == 2) {
                chracterInfo();
            } else {
                isRunning = false;
            }
        }
    }
}