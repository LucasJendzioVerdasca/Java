import java.util.Scanner;

import javax.swing.event.TreeModelListener;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;
    
    //L'année en cours dans le jeu
    public static int chapter = 1;

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

    //La boucle de jeu
    public static void checkAct(){
        if (player.xp >= 100 && player.xp < 200){
            chapter = 2;
            Story.FirstActOutro();
        }
        if (player.xp >= 200 && player.xp < 300){
            chapter = 3;
            Story.SecondActOutro();
        }
        if (player.xp >= 300 && player.xp < 400){
            chapter = 4;
            Story.ThirdActOutro();
        }
        if (player.xp >= 400 && player.xp < 500){
            chapter = 5;
            Story.FourthActOutro();
        }
        if (player.xp >= 500 && player.xp < 600){
            chapter = 6;
            Story.FifthActOutro();
        }
        if (player.xp >= 600 && player.xp < 700){
            chapter = 7;
            Story.SixthActOutro();
        }
        if (player.xp >= 700){
            Story.SeventhActOutro();
        }
    }

    // Méthode pour continuer l'aventure
    public static void continueJourney() {
        clearConsole();
        printHeading("Vous continuez votre aventure");
        anythingToContinue();
        clearConsole();
        checkAct();
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
        System.out.println("Thunasse" + player.gold + " pièces d'or");
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
        anythingToContinue();
        isRunning = false;
    }

    //methode pour le tour du joueur
    public static void BattlePlayerTurn(Ennemy ennemy){
        clearConsole();
        //On remet le booléen d'esquive à false
        player.dodge = false;
        printHeading(ennemy.name + "\nHP: " + ennemy.currentHealth + "/" + ennemy.maxHealth);
        printHeading(player.name + "\nHP: " + player.currentHealth + "/" + ennemy.maxHealth + "\nMagic:" + player.magic + "/" + player.maxMagic);
        printSeparator(20);
        System.out.println("(1) Attaquer\n(2) Utiliser un sorts\n(3) Utiliser une potion\n(4) Esquiver");
        int input = readInt("-> ", 4);
        //réagit en fonction des inputs du joueur
        if(input == 1){
            //attaque basique
            //calcule les dégâts infligés et subis 
            int dmg = player.attack() - ennemy.defend();
            //Vérifie si les dégâts ne sont pas négatifs
            if(dmg < 0){
                dmg = 0;
            }
            //Applique les dégâts
            ennemy.currentHealth -= dmg;
            //affiche le résultat
            clearConsole();
            printHeading("Vous attaquez le " + ennemy.name + " avec un sort basique.");
            System.out.println("Vous avez infligé " + dmg + " points de dégâts au " + ennemy.name +".");
            anythingToContinue();
            //Vérifie si l'ennemi meurt
            if(!ennemy.isalive()){
                //le joueur gagne
                clearConsole();
                printHeading("Vous avez vaincu le " + ennemy.name + "!");
                //ajouter systeme de recompense
                anythingToContinue();
            }
        }else if(input == 2){
            //lancer un sort
            clearConsole();
            //On demande au joueur quel sort il souhaite lancer
            System.out.println("Choisissez quel sort lancer.");
            for(int i=0; i<size(player.knownSpells); i++){
                System.out.println("(" + i + ") \"" + player.knownSpells.get(i).getName() + "\" | Coût/Puissance:" + player.knownSpells.get(i).getMagicCost() + "/" + player.knownSpells.get(i)/getPower());
            }
            int choice = readInt("-> ", size(player.knownSpells));
            //On vérifie que le joueur à assez de magie disponible pour lancer le sort
            if(player.magic < player.knownSpells.get(choice).getMagicCost()){
                System.out.println("Vous n'avez pas assez de magie pour lancer le sort");
                anythingToContinue();
                //si ce n'est pas le cas, on lui refais jouer son tour
                BattlePlayerTurn(ennemy);
                return;
            }
            //On calcule les dégats infligés
            int dmgSpell = player.knownSpells.get(choice).getPower() - ennemy.def;
            //On vérifie que les dégats sont positifs
            if(dmgSpell < 0){
                dmgSpell = 0;
            }
            //On applique les dégats à l'ennemi et on paie le coût en magie
            ennemy.currentHealth -= dmgSpell;
            player.magic -= player.knownSpells.get(choice).getMagicCost();
            //affiche le résultat
            clearConsole();
            printHeading("Vous lancez \"" + player.knownSpells.get(choice).getName() + "\" sur le " + ennemy.name);
            System.out.println("Vous avez infligé " + dmg + " points de dégâts au " + ennemy.name +".");
            anythingToContinue();
            //Vérifie si l'ennemi meurt
            if(ennemy.isalive()){
                //le joueur gagne
                clearConsole();
                printHeading("Vous avez vaincu le " + ennemy.name + "!");
                //Les récompenses du joueur
                System.out.println("Vous avez gagné 5 pièces d'or et 100 points d'expérience.");
                player.gold += 5;
                player.xp += 100;
                anythingToContinue();
            }
            //On applique les effets du sort (étourdissement si stupefix et baisse d'attaque si expelliarmus)
            player.knownSpells.get(choice).castSpellEffect(ennemy);
            anythingToContinue();
        }else if(input == 3){
            //use a potion
            //faut implémenter
        }else if(input == 4){
            //Esquive
            clearConsole();
            //Une probabilité de 35% d'esquiver 
            if(Math.random() < 0.35){
                printHeading("Vous vous concentrez afin d'esquiver la prochaine attaque du " + ennemy.name + ".");
                player.dodge = true;
                anythingToContinue();
            }else{
                printHeading("Vous essayez de prévoir la prochaine attaque du " + ennemy.name + " mais sans succés.");
                anythingToContinue();
            }
        }
    }


    //methode pour le tour de l'ennemi
    public static void BattleEnemyTurn(Ennemy ennemy){
        //L'ennemi ne joue que s'il n'est pas étourdi
        if(ennemy.stunt = false){
            System.out.println("Le " + ennemy.name + " vous attaque!");
            //On calcule les dégats que le monstre va infliger
            int dmgTook = ennemy.attack() - player.defend();
            //On vérifie que les dégats sont bien positifs et si le joueur esquive ou non
            if(dmgTook < 0){
                dmgTook = 0;
            }
            if(player.dodge == true){
                System.out.println("Vous esquiver l'attaque de " + ennemy.name + ".");
                dmgTook = 0;
            }
            //On applique les dégats
            player.currentHealth -= dmgTook;
            System.out.println("Le " + ennemy.name + " t'a infligé " + dmgTook + " points de dégâts.");
            anythingToContinue();
            //On vérifie si le joueur est mort
            if(!player.isalive()){
                    playerDied();
            }
        }else{
            System.out.println("Le " + ennemy.name + " est étourdi, il n'a pas pu attaquer.");
            ennemy.stunt = false;
        }
        //On remet l'attaque de l'ennemi à sa valeur normale
        ennemy.attack = ennemy.baseAttack;
    }


    //méthode pour dérouler les bataille
    public static void Battle(Ennemy ennemy){
        clearConsole();
        System.out.println("Un " + ennemy.name + " sauvage apparaît!");
        do{
            BattlePlayerTurn(ennemy);
            BattleEnemyTurn(ennemy);
        }while(player.currentHealth > 0 && ennemy.currentHealth > 0);
        //ajouter systeme de recompense (ici ou lorsque l'ennemi meurt dans la méthode BattlePLayerTurn)
    }
}