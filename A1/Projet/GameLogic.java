import java.util.Scanner;

import javax.swing.event.TreeModelListener;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

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
            player = new Player();

        }
        while (!nameSet);

        //L'intro du jeu
        Story.printIntro();
        SortingHat.Sortinghat(player);
        Story.FirstActIntro();

        //Is running pour confirmer que la partie se déroule bien 
        isRunning = true;

        //Début de l'aventure
        gameLoop();
    }

    // Méthode pour continuer l'aventure
    public static void continueJourney() {
        clearConsole();
        printHeading("Vous continuez votre aventure");
        anythingToContinue();
        switch (act) {
            case 1 : 
                Story.FirstActIntro();
                Battle(Troll);
                Story.FirstActOutro();
                break;
            case 2 :
                Story.SecondActIntro();
                Battle(Basilic);
                Story.SecondActOutro();
                break;
            case 3 :
                Story.ThirdActIntro();
                Battle(Dementor);
                Story.ThirdActOutro();
                break;
            case 4 : 
                Story.FourthActIntro();
                Battle(Voldemort_1);
                Story.FourthActOutro();
                break;
            case 5 :
                Story.FifthActIntro();
                Battle(Dolores);
                Story.FifthActOutro();
                break;
            case 6 :
                Story.SixthActIntro();
                Battle(Mangemorts);
                Story.SixthActOutro();
                break;
            case 7 :
                Story.SeventhActIntro();
                Battle(Voldemort_2);
                Story.SeventhActOutro();
                break;
        }  
    }

    //Le magasin
    public static void Shop() {
        int choice;

        System.out.println("Bienvenue dans la boutique !");
        System.out.println("1. Acheter une potion de soin");
        System.out.println("2. Acheter une potion de magie");
        System.out.println("3. Quitter la boutique");

        choice = readInt("->", 3);

        switch (choice) {
            case 1:
                confirmPurchase("potion de soin");
                break;
            case 2:
                confirmPurchase("potion de magie");
                break;
            case 3:
                System.out.println("Merci d'avoir visité la boutique !");
                clearConsole();
                printMenu();
                break;
        }
    }

    public static void confirmPurchase(String item) {
        int confirmation;

        System.out.println("Confirmer l'achat d'une " + item + " ?");
        System.out.println("1. Oui");
        System.out.println("2. Non");

        confirmation = readInt("->" , 2);

        if (confirmation == 1) {
            System.out.println("Vous avez acheté une " + item + " !");
            // Ajouter le code pour ajouter l'article à l'inventaire du joueur
        } else {
            System.out.println("Achat annulé.");
        }
    }

    // Méthode pour afficher les informations du joueur
    public static void chracterInfo() {
        clearConsole();
        printHeading("Informations du joueur");
        System.out.println("Nom : " + player.name);
        System.out.println("Vie : " + player.currentHealth + "/" + player.maxHealth);
        System.out.println("Magie : " + player.magic + "/" + player.maxMagic);
        System.out.println("XP : " + player.xp);
        anythingToContinue();
    }

    // Méthode pour afficher le menu
    public static void printMenu() {
        clearConsole();
        printHeading("Menu");
        System.out.println("Choisis une option :");
        printSeparator(20);
        System.out.println("(1) Continuer l'aventure\n (2) Voir les informations du joueur \n (3) Se soigner \n (4) Aller au magasin \n (5) Quitter le jeu");
    }

    // La boucle principale du jeu
    private static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt("-> ", 5);
            if (input == 1) {
                continueJourney();
            } else if (input == 2) {
                chracterInfo();
            } else if (input == 3) {
                Take_a_Rest();
            } else if (input == 4){
                Shop();
            } else if (input == 5) {
                isRunning = false;
            }
        }
    }

    // Méthode pour se soigner
    public static void Take_a_Rest() {
        clearConsole();
        printHeading("Vous vous reposez");
        player.currentHealth = player.maxHealth;
        player.magic = player.maxMagic;

        System.out.println("Vous avez récupéré toute votre vie et toute votre magie");
        anythingToContinue();
    }

    // methode pour la mort du jouer (à faire)
    public static void playerDied() {
        clearConsole();
        printHeading("You died ... dommage frerot");
    }

    // methode pour le systeme de combat
    public static void Battle(Ennemy ennemy){
        while (true){
            clearConsole();
            printHeading(ennemy.name + "\nHP: " + ennemy.currentHealth + "/" + ennemy.maxHealth);
            printHeading(player.name + "\nHP: " + player.currentHealth + "/" + ennemy.maxHealth);
            printSeparator(20);
            System.out.println("(1) Attaquer\n(2) Utiliser un sorts\n(3) Utilise une potion\n(4) ESQUIVE SI TU TIENS A LA VIE");
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
                    printHeading("Tu as réussi à t'échapper");
                    anythingToContinue();
                    break;
                //faut implémenter
                }
            }
        }
    }
}