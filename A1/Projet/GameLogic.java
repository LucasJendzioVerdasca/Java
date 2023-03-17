import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    //méthode pour attendre une entrée de l'utilisateur
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
        }
        while (input < 1 || input > userchoice);
        return input;
    }

    //méthode pour simuler un vidage de la console
    public static void clearConsole() {
        for (int i = 0; i < 50; ++i)
            System.out.println();
    }

    //méthode pour afficher une séparation d'une taille n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; ++i)
            System.out.print("-");
        System.out.println();
    }

    //méthode pour afficher un en-tête
    public static void printHeading(String heading) {
        printSeparator(30);
        System.out.println(heading);
        printSeparator(30);
    }

    //méthode pour attendre une entrée de l'utilisateur
    public static void anythingToContinue() {
        System.out.println("Appuyez sur Entrée pour continuer");
        scanner.nextLine();
    }

    //Le début du jeu
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

        //Entrée du nom du joueur
        boolean nameSet = false;
        do {
            clearConsole();
            printHeading("Avant de commencer cette merveilleuse aventure, entrez votre nom");
            String name = scanner.nextLine();

            //Vérification du nom
            clearConsole();
            printHeading("Votre nom est : " + name + ". Est-ce correct ?");
            System.out.println("(1) Oui");
            System.out.println("(2) Non");
            int input = readInt("Votre choix : ", 2);
            if (input == 1) {
                nameSet = true;
            }
            //Création du personnage en lui donnant le nom entré
            player = new Player(name);

        }
        while (!nameSet);

        //L'intro du jeu
        Story.printIntro();



        //Début de l'aventure
        gameLoop();


    }

    //Méthode pour continuer l'aventure
    public static void continueJourney() {
        clearConsole();
        printHeading("Vous continuez votre aventure");
        anythingToContinue();
    }

    //Méthode pour afficher les informations du joueur
    public static void chracterInfo(){
        clearConsole();
        printHeading("Informations du joueur");
        System.out.println("Nom : " + player.name);
        System.out.println("Vie : " + player.hp + "/" + player.maxHp);
        System.out.println("Magie : " + player.magic + "/" + player.maxMagic);
        System.out.println("XP : " + player.xp);
        anythingToContinue();
    }

    //Méthode pour afficher le menu
    public static void printMenu(){
        clearConsole();
        printHeading("Menu");
        System.out.println("Choisis une option :");
        printSeparator(20);
        System.out.println("(1) Continuer l'aventure");
        System.out.println("(2) Voir les informations du joueur");
        System.out.println("(3) Quitter le jeu");
    }

    //La boucle principale du jeu
    private static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1){
                continueJourney();
            }
            else if(input == 2){
                chracterInfo();
            }
            else{
                isRunning = false;
            }
        }
    }
}   