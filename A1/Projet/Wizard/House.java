package Wizard;

import Personnages.Player;

public enum House {
    GRYFFINDOR("Griffondor"),
    HUFFLEPUFF("Poufsouffle"),
    RAVENCLAW("Serdaigle"),
    SLYTHERIN("Serpentard");

    private String name;

    // getter
    public String getName() {
        return name;
    }

    House(String name) {
        this.name = name;
    }

    //Méthode si le joueur est Griffondor
    public static void gryffindor(Player player) {
        player.def += 2;
        player.maxHealth += 10;
        player.currentHealth += 10;
    }

    //Méthode si le joueur est Serpentard
    public static void slytherin(Player player) {
        player.attack += 2;
        player.power += 5;
    }

    //Méthode si le joueur est Serdaigle
    public static void ravenclaw(Player player) {
        player.hitchance = 1;
        player.magic += 10;
    }
}
