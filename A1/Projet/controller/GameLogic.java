package controller;

import java.util.List;
import java.util.Scanner;

import Personnages.Ennemy;
import Personnages.Player;
import Spells.Spell;
import Wizard.Potion;

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
                // Lower case the input
                input = scanner.nextLine().toLowerCase();
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
            System.out.println("\r\n");
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
        printSeparator(30);
        System.out.println("Bienvenue dans le jeu de sorcier le plus cool du monde");
        System.out.println("Crée par Jendzio-Verdasca Lucas");
        System.out.println("Scénarisé par Antoine Guérard (merci à lui)");
        printSeparator(30);
        anythingToContinue();

        // Entrée du nom du joueur
        boolean nameSet = false;
        do {
            clearConsole();
            printHeading("Avant de commencer cette merveilleuse aventure, entrez votre nom");
            String name = scanner.nextLine();
            while (name.length() < 3) {
                System.out.println("Votre nom doit contenir au moins 3 caractères");
                name = scanner.nextLine();
            }

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
            player = new Player(name, 20, 0, 60, 60, 5, 0.8);
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

            // Aprrendre le Wingardium Léviosa pour le combat
            List<Spell> allSpells = Spell.getAllSpells();
            Spell Wingardium_leviosa = allSpells.get(0);
            player.learnSpell(Wingardium_leviosa);

            // Création du Troll
            Ennemy Troll = new Ennemy("Troll", 5, 2, 0, 12);
            Battle(Troll);

            Story.FirstActOutro();

            gameLoop();
        }

        if (player.xp >= 100 && player.xp < 200) {
            chapter = 2;
            Story.SecondActIntro();

            // Aprrendre Accio pour le combat
            List<Spell> allSpells = Spell.getAllSpells();
            Spell Accio = allSpells.get(1);
            player.learnSpell(Accio);

            // Apprendre Protego pour le combat
            Spell Protego = allSpells.get(2);
            player.learnSpell(Protego);

            // On équipe l'épée de Gryffondor
            player.equipGryffindorSword();

            // Création du Basilic
            Ennemy basilic = new Ennemy("Basilic", 10, 30, 0, 30);
            Battle(basilic);

            Story.SecondActOutro();

            // On enlève l'épée de Gryffondor
            player.hasGryffondorSword = false;

            gameLoop();
        }

        if (player.xp >= 200 && player.xp < 300) {
            chapter = 3;

            Story.ThirdActIntro();

            // Apprendre Expecto Patronum pour le combat
            List<Spell> allSpells = Spell.getAllSpells();
            Spell Expecto_patronum = allSpells.get(3);
            player.learnSpell(Expecto_patronum);

            // Création du Dementor
            Ennemy dementor = new Ennemy("Détraqueur", 10, 0, 0, 15);
            Battle(dementor);

            Story.ThirdAct();

            // Création d'un autre dementor
            Ennemy dementor2 = new Ennemy("Détraqueur", 10, 0, 0, 15);
            Battle(dementor2);

            Story.ThirdActOutro();

            player.attack = 4; // On a réduit l'attaque lorsque le joueur joue face à un détraqueur, on la
                               // rétablit donc à la fin
            gameLoop();
        }

        if (player.xp >= 400 && player.xp < 500) {
            chapter = 4;

            gameLoop();
        }
        if (player.xp >= 500 && player.xp < 600) {
            chapter = 5;

            gameLoop();
        }
        if (player.xp >= 600 && player.xp < 700) {
            chapter = 6;

            gameLoop();
        }
        if (player.xp >= 700 && player.xp < 800) {
            chapter = 7;

            gameLoop();
        }
        if (player.xp >= 800) {
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
        clearConsole();

        int choice;
        System.out.println("Bienvenue dans la boutique ! Vous avez : " + player.gold + " pièces d'or");
        System.out.println("1. Acheter une potion de soin. Prix : 5 pièces d'or");
        System.out.println("2. Acheter une potion de magie. Prix : 5 pièces d'or");
        System.out.println("3. Quitter la boutique");

        choice = readInt("->", 3);

        switch (choice) {
            case 1:
                confirmPurchaseHP("Potion de soin");
                break;
            case 2:
                confirmPurchaseMagic("Potion de magie");
                break;
            case 3:
                System.out.println("Merci d'avoir visité la boutique !");
                clearConsole();
                printMenu();
                break;
        }
    }

    public void confirmPurchaseHP(String item) {
        if (player.gold < 5) {
            System.out.println("Vous n'avez pas assez d'or pour acheter cette potion");
        } else {
            int confirmation;

            System.out.println("Confirmer l'achat d'une potion de soin ?");
            System.out.println("1. Oui");
            System.out.println("2. Non");

            confirmation = readInt("->", 2);

            if (confirmation == 1) {
                System.out.println("Vous avez acheté une potion de soin !");
                anythingToContinue();
                player.nbHpPotion += 1;
                player.gold -= 5;
            } else {
                System.out.println("Achat annulé.");
                anythingToContinue();
            }
        }
    }

    public void confirmPurchaseMagic(String item) {
        if (player.gold < 5) {
            System.out.println("Vous n'avez pas assez d'or pour acheter cette potion");
        } else {
            int confirmation;

            System.out.println("Confirmer l'achat d'une potion de magie ?");
            System.out.println("1. Oui");
            System.out.println("2. Non");

            confirmation = readInt("->", 2);

            if (confirmation == 1) {
                System.out.println("Vous avez acheté une potion de magie !");
                player.nbMagicPotion += 1;
                player.gold -= 5;
                anythingToContinue();
            } else {
                System.out.println("Achat annulé.");
                anythingToContinue();
            }
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
                TakeaRest();
            } else if (input == 4) {
                Shop();
            } else {
                isRunning = false;
            }
        }
    }

    // Méthode pour se soigner
    public void TakeaRest() {
        clearConsole();
        printHeading("Vous vous reposez");
        player.currentHealth = player.maxHealth;
        player.magic = player.maxMagic;

        System.out.println("Vous avez récupéré toute votre vie et toute votre magie");
        anythingToContinue();
    }

    // Méthode pour le combat
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

    // J'ai renommé displayHealthAndMagic en displayStatus pour une meilleure clarté
    private void displayStatus(Ennemy ennemy, Player player) {
        printHeading(ennemy.name + "\nHP: " + ennemy.currentHealth + "/" + ennemy.maxHealth);
        printHeading(player.name + "\nHP: " + player.currentHealth + "/" + player.maxHealth + "\nMagie:" + player.magic
                + "/" + player.maxMagic);
        printSeparator(20);
    }

    // methode pour le tour du joueur
    /**
     * @param ennemy
     */
    public void BattlePlayerTurn(Ennemy ennemy) {
        clearConsole();
        player.dodge = false;
        displayStatus(ennemy, player);

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
                handlePotionUsage(ennemy);
                break;
            case 4:
                handleDodge(ennemy);
                break;
        }
    }

    // Méthode pour l'attaque de base
    private void handleBasicAttack(Ennemy ennemy) {
        if (player.attemptHit() == true) {
            double damageMultiplier = 1;

            if (ennemy.name.equals("Basilic")) {
                if (player.hasGryffondorSword = true) {
                    damageMultiplier = 15; // Multiplie les dégâts par 15 pour l'Épée de Griffondor
                } else if (player.hasUsedAccio) {
                    System.out.println(
                            "Vous avez obtenu le croc du basilic ! \n Vos attaques de base percent maintenat sa peau !");
                    damageMultiplier = 3; // Multiplie les dégâts par 3 pour le Croc du Basilic
                } else if (ennemy.name.equals("Détraqueur")) {
                    player.attack = 0;
                }
            }

            int dmg = (int) Math.max(player.attack() * damageMultiplier - ennemy.defend(), 0);
            ennemy.currentHealth -= dmg;
            clearConsole();
            printHeading("Vous attaquez le " + ennemy.name + " avec une attaque basique.");
            System.out.println("Vous avez infligé " + dmg + " points de dégâts au " + ennemy.name + ".");
        } else {
            clearConsole();
            printHeading("Vous avez raté votre attaque contre le " + ennemy.name + ".");
        }
        anythingToContinue();
        if (!ennemy.isalive()) {
            handleEnemyDefeat(ennemy);
        }
    }

    // Méthode pour choisir un sort
    private int chooseSpell(Player player) {
        System.out.println("Choisissez quel sort lancer.");
        for (int i = 0; i < player.knownSpells.size(); i++) {
            System.out.println("(" + (i + 1) + ") \"" + player.knownSpells.get(i).getName() + "\" | Coût/Puissance : "
                    + player.knownSpells.get(i).getMagicCost() + " / " + player.knownSpells.get(i).getPower());
        }
        int choice = readInt("-> ", player.knownSpells.size()) - 1;
        return choice;
    }

    private void handleSpellAttack(Ennemy ennemy) {
        clearConsole();
        int choice = chooseSpell(player);
        Spell chosenSpell = player.knownSpells.get(choice);

        // Modification pour vérifier si le joueur a assez de magie pour lancer le sort
        if (player.magic < chosenSpell.getMagicCost()) {
            System.out.println("Vous n'avez pas assez de magie pour lancer le sort");
            anythingToContinue();
            BattlePlayerTurn(ennemy);
            return;
        }

        if (player.attemptHit() == true) {
            int dmgSpell = Math.max(chosenSpell.getPower() - ennemy.def, 0);

            if (ennemy.name.equals("Détraqueur") && !chosenSpell.getName().equals("Expecto Patronum")) {
                dmgSpell = 0; // Aucun dégât infligé au Dementaur si un autre sort que Expecto Patronum est
                              // utilisé
            }

            ennemy.currentHealth -= dmgSpell;
            player.magic -= chosenSpell.getMagicCost();
            clearConsole();
            printHeading("Vous lancez \"" + chosenSpell.getName() + "\" sur le " + ennemy.name);
            System.out.println("Vous avez infligé " + dmgSpell + " points de dégâts au " + ennemy.name + ".");
            if (!ennemy.isalive()) {
                anythingToContinue();
                handleEnemyDefeat(ennemy);
            } else {
                chosenSpell.castSpellEffect(ennemy);
                chosenSpell.castSpellEffect(player);
            }
        } else {
            clearConsole();
            printHeading("Vous avez raté votre attaque contre le " + ennemy.name + ".");
        }
    }

    // Méthode pour utiliser une potion
    private void handlePotionUsage(Ennemy ennemy) {
        clearConsole();
        if (player.noPotions()) {
            System.out.println("Vous n'avez plus de potions");
            anythingToContinue();
            BattlePlayerTurn(ennemy);
            return;
        } else {
            displayStatus(ennemy, player);
            System.out.println("Quel potion voulez-vous utiliser ?\n (1) Potion de vie : x" + player.nbHpPotion
                    + "\n (2) Potion de magie : x" + player.nbMagicPotion + " \n (3) Annuler");
            int input = readInt("-> ", 3);
            if (input == 1) {
                Potion.useHp(player);
            }
            if (input == 2) {
                Potion.useMagic(player);
            }
            if (input == 3) {
                BattlePlayerTurn(ennemy);
            }
        }
    }

    // Méthode pour esquiver
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

    // Méthode pour le tour de l'ennemi
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

    // Méthode pour la mort du jouer
    public static void playerDied() {
        clearConsole();
        printHeading("You died ... Fin fréro, tu es cringe !");
        anythingToContinue();
        isRunning = false;
        System.exit(chapter);
    }

    // Méthode pour la victoire
    private void handleEnemyDefeat(Ennemy ennemy) {
        clearConsole();
        printHeading("Vous avez vaincu le " + ennemy.name + "!");
        System.out.println("Vous avez gagné 5 pièces d'or et 100 points d'expérience.");
        player.gold += 5;
        player.xp += 100;
        player.def = -5 * player.protegoUse;
        anythingToContinue();
    }
}