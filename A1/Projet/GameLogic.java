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
        System.out.println("Crée par Jendzio-Verdasca Lucas");
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
        System.out.println("Vie : " + player.currentHealth + "/" + player.maxHealth);
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

    // methode pour le systeme de combat
    public static void Battle(Ennemy ennemy){
        while (true){
            clearConsole();
            printHeading(ennemy.name + "\nHP: " + ennemy.currentHealth + "/" + ennemy.maxHealth);
            printHeading(player.name + "\nHP: " + player.currentHealth + "/" + ennemy.maxHealth);
            printSeparator(20);
            System.out.println("(1) Attaquer\n(2) Utiliser un sorts\n(3) Utilise une potion\n(4) FUIS SI TU TIENS A LA VIE");
            int input = readInt("-> ", 2);
            //réagit en fonction des inputs du joueur
            if(input == 1){
                //auto-attack
                //calcule les dégâts infligés et subis 
                int dmg = player.attack() - ennemy.defend();
                int dmgTook = ennemy.attack() - player.defend();
                //Vérfiie si les dégâts ne sont pas négatifs
                if(dmgTook < 0){
                    //Ajoute des dégâts si le joueur se défend bien
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0){
                    dmg = 0;
                }

                //Applique les dégâts aux différents personnages
                player.currentHealth -= dmgTook;
                ennemy.currentHealth -= dmg;
                //affiche le résultat
                clearConsole();
                printHeading("Stuperfix");
                System.out.println("Tu as infligé " + dmg + " points de dégâts à l'autre connard de " + ennemy.name +".");
                printSeparator(15);
                System.out.println("Le " + ennemy.name + " t'a infligé " + dmgTook + " points de dégâts.");
                anythingToContinue();
                //Vérifie si un des personnages meurt
                if(player.currentHealth <= 0){
                    playerDied();
                    break;
                }else if(ennemy.currentHealth <= 0){
                    //le joueur gagne
                    clearConsole();
                    printHeading("Bravo fréro, tu as battu " + ennemy.name + "!");
                    //ajouter systeme de recompense
                    anythingToContinue();
                    break;
                }
            }else if(input == 2){
                //cast a spell
                //faut implémenter
            }else if(input == 3){
                //use a potion
                //faut implémenter
            }else if(input == 4){
                //Esquive
                clearConsole();
                //Une probabilité de 35% d'esquiver 
                if(Math.random() < 0.35){
                    printHeading("Tu as réussi à esquiver");
                    anythingToContinue();
                    break;
                //faut implémenter
                }
            }
        }
    }
}
