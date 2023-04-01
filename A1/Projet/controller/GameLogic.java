package controller;
import java.util.Scanner;

import Personnages.Ennemy;
import Personnages.Player;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    Player player;

    public static boolean isRunning;

    // L'année en cours dans le jeu
    public static int chapter = 1;

    // méthode pour attendre une entrée de l'utilisateur
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                input = -1;
                System.out.println("Veuillez entrer un entier !");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    public static String readString(String prompt) {
        String input;
        do {
            System.out.println(prompt);
            try {
                input = scanner.nextLine();
            } catch (Exception e) {
                input = "";
                System.out.println("Veuillez entrer une réponse !");
            }
        } while (input == "");
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
    public void startGame() {
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Bienvenue dans le jeu de sorcier le plus cool du monde");
        System.out.println("Crée par Jendzio-Verdasca Lucas");
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
            // Création du personnage en lui donnant le nom entré
            player = new Player(name, 20, 0, 60, 60, 5);
            name = player.name;

        } while (!nameSet);

        // L'intro du jeu
        Story.printIntro();
        SortingHat.Sortinghat(player);

        // Is running pour confirmer que la partie se déroule bien
        isRunning = true;

        // Début de l'aventure
        gameLoop();
    }

    // La boucle de jeu
    public void checkAct() {
        if (player.xp >= 0 && player.xp < 100) {
            chapter = 1;
            Story.FirstActIntro();
            Ennemy Troll = new Ennemy("Troll", 5, 2, 0, 12);
            Battle(Troll);
            Story.FirstActOutro();
        }
        if (player.xp >= 100 && player.xp < 200) {
            chapter = 2;
            Story.FirstActOutro();
        }
        if (player.xp >= 200 && player.xp < 300) {
            chapter = 3;
            Story.SecondActOutro();
        }
        if (player.xp >= 300 && player.xp < 400) {
            chapter = 4;
            Story.ThirdActOutro();
        }
        if (player.xp >= 400 && player.xp < 500) {
            chapter = 5;
            Story.FourthActOutro();
        }
        if (player.xp >= 500 && player.xp < 600) {
            chapter = 6;
            Story.FifthActOutro();
        }
        if (player.xp >= 600 && player.xp < 700) {
            chapter = 7;
            Story.SixthActOutro();
        }
        if (player.xp >= 700) {
            Story.SeventhActOutro();
        }
    }

    // Méthode pour continuer l'aventure
    public void continueJourney() {
        clearConsole();
        printHeading("Vous continuez votre aventure");
        anythingToContinue();
        clearConsole();
        checkAct();
    }

    // Le magasin
    public void Shop() {
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

    public void confirmPurchase(String item) {
        int confirmation;

        System.out.println("Confirmer l'achat d'une " + item + " ?");
        System.out.println("1. Oui");
        System.out.println("2. Non");

        confirmation = readInt("->", 2);

        if (confirmation == 1) {
            System.out.println("Vous avez acheté une " + item + " !");
            // Ajouter le code pour ajouter l'article à l'inventaire du joueur
        } else {
            System.out.println("Achat annulé.");
        }
    }

    // Méthode pour afficher les informations du joueur
    public void chracterInfo() {
        clearConsole();
        printHeading("Informations du joueur");
        System.out.println("Nom : " + player.name);
        System.out.println("Vie : " + player.currentHealth + "/" + player.maxHealth);
        System.out.println("Magie : " + player.magic + "/" + player.maxMagic);
        System.out.println("XP : " + player.xp);
        System.out.println("Thunasse : " + player.gold + " pièces d'or");
        anythingToContinue();
    }

    // Méthode pour afficher le menu
    public void printMenu() {
        clearConsole();
        printHeading("Menu");
        System.out.println("Choisis une option :");
        printSeparator(20);
        System.out.println(
                "(1) Continuer l'aventure\n (2) Voir les informations du joueur \n (3) Se soigner \n (4) Aller au magasin \n (5) Quitter le jeu");
    }

    // La boucle principale du jeu
    private void gameLoop() {
        System.out.println(isRunning + "\n");
        while (isRunning) {
            printMenu();
            int input = readInt("-> ", 5);
            if (input == 1) {
                continueJourney();
            } else if (input == 2) {
                chracterInfo();
            } else if (input == 3) {
                Take_a_Rest();
            } else if (input == 4) {
                Shop();
            } else {
                isRunning = false;
            }
        }
    }

    // Méthode pour se soigner
    public void Take_a_Rest() {
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
        printHeading("You died ... Fin fréro, tu es cringe !");
        anythingToContinue();
        isRunning = false;
    }

    // methode pour le tour du joueur
    /**
     * @param ennemy
     */
    public void BattlePlayerTurn(Ennemy ennemy) {
        clearConsole();
        player.dodge = false;
        displayHealthAndMagic(ennemy, player);
    
        System.out.println("(1) Attaquer\n(2) Utiliser un sort\n(3) Utiliser une potion\n(4) Esquiver");
        int input = readInt("-> ", 4);
    
        switch (input) {
            case 1:
                handleBasicAttack(ennemy);
                break;
            case 2:
                handleSpellAttack(ennemy);
                break;
            case 3:
                // Implémenter l'utilisation de potion
                break;
            case 4:
                handleDodge(ennemy);
                break;
        }
    }
    
    private void displayHealthAndMagic(Ennemy ennemy, Player player) {
        printHeading(ennemy.name + "\nHP: " + ennemy.currentHealth + "/" + ennemy.maxHealth);
        printHeading(player.name + "\nHP: " + player.currentHealth + "/" + player.maxHealth + "\nMagie:" + player.magic + "/" + player.maxMagic);
        printSeparator(20);
    }
    
    private void handleBasicAttack(Ennemy ennemy) {
        int dmg = Math.max(player.attack() - ennemy.defend(), 0);
        ennemy.currentHealth -= dmg;
        clearConsole();
        printHeading("Vous attaquez le " + ennemy.name + " avec un sort basique.");
        System.out.println("Vous avez infligé " + dmg + " points de dégâts au " + ennemy.name + ".");
        anythingToContinue();
        if (!ennemy.isalive()) {
            handleEnemyDefeat(ennemy);
        }
    }
    
    private void handleSpellAttack(Ennemy ennemy) {
        clearConsole();
        int choice = chooseSpell(player);
        if (player.magic < player.knownSpells.get(choice).getMagicCost()) {
            System.out.println("Vous n'avez pas assez de magie pour lancer le sort");
            anythingToContinue();
            BattlePlayerTurn(ennemy);
            return;
        }
        int dmgSpell = Math.max(player.knownSpells.get(choice).getPower() - ennemy.def, 0);
        ennemy.currentHealth -= dmgSpell;
        player.magic -= player.knownSpells.get(choice).getMagicCost();
        clearConsole();
        printHeading("Vous lancez \"" + player.knownSpells.get(choice).getName() + "\" sur le " + ennemy.name);
        System.out.println("Vous avez infligé " + dmgSpell + " points de dégâts au " + ennemy.name + ".");
        anythingToContinue();
        if (!ennemy.isalive()) {
            handleEnemyDefeat(ennemy);
        }
        player.knownSpells.get(choice).castSpellEffect(ennemy);
        anythingToContinue();
    }
    
    private int chooseSpell(Player player) {
        System.out.println("Choisissez quel sort lancer.");
        for (int i = 0; i < player.knownSpells.size(); i++) {
            System.out.println("(" + i + ") \"" + player.knownSpells.get(i).getName() + "\" | Coût/Puissance:"
                    + player.knownSpells.get(i).getMagicCost() + "/" + player.knownSpells.get(i).getPower());
        }
        return readInt("-> ", player.knownSpells.size());
    }
    
    private void handleDodge(Ennemy ennemy) {
        clearConsole();
        if (Math.random() < 0.35) {
            printHeading("Vous vous concentrez afin d'esquiver la prochaine attaque du " + ennemy.name + ".");
            player.dodge = true;
        } else {
            printHeading("Vous essayez de prévoir la prochaine attaque du " + ennemy.name + " mais sans succès.");
        }
        anythingToContinue();
    }
    
    public void BattleEnemyTurn(Ennemy ennemy) {
        if (!ennemy.stunt) {
            System.out.println("Le " + ennemy.name + " vous attaque!");
            int dmgTook = player.dodge ? 0 : Math.max(ennemy.attack() - player.defend(), 0);
            player.currentHealth -= dmgTook;
            System.out.println("Le " + ennemy.name + " t'a infligé " + dmgTook + " points de dégâts.");
            player.dodge = false;
            anythingToContinue();
            if (!player.isalive()) {
                playerDied();
            }
        } else {
            System.out.println("Le " + ennemy.name + " est étourdi, il n'a pas pu attaquer.");
            ennemy.stunt = false;
        }
        ennemy.attack = ennemy.baseAttack;
    }
    
    public void Battle(Ennemy ennemy) {
        clearConsole();
        System.out.println("Un " + ennemy.name + " sauvage apparaît!");
        anythingToContinue();
        do {
            BattlePlayerTurn(ennemy);
            if (ennemy.isalive()) { // Ajout de la vérification de la vie de l'ennemi
                BattleEnemyTurn(ennemy);
            }
        } while (player.currentHealth > 0 && ennemy.currentHealth > 0);
    }
    
    
    private void handleEnemyDefeat(Ennemy ennemy) {
        clearConsole();
        printHeading("Vous avez vaincu le " + ennemy.name + "!");
        System.out.println("Vous avez gagné 5 pièces d'or et 100 points d'expérience.");
        player.gold += 5;
        player.xp += 100;
        anythingToContinue();
    }
}