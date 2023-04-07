package Wizard;

import Personnages.Player;
import controller.GameLogic;

public class Potion {
    public static void useHp(Player player) {
        if (player.currentHealth < player.maxHealth) {    
            player.currentHealth += 30;
                if (player.currentHealth > player.maxHealth) {
                    player.currentHealth = player.maxHealth;
                }

                //Si le joueur est Serdaigle, il régénère toute sa vie
                if (player.house == House.HUFFLEPUFF) {
                    player.currentHealth = player.maxHealth;
                }

                System.out.println("La vie a été restaurée !");
                GameLogic.anythingToContinue();
        } else {
            System.out.println("Vous avez déjà toute votre vie !");
            GameLogic.anythingToContinue();
        }
    }
            
    public static void useMagic(Player player) {
        if (player.magic < player.maxMagic) {
            player.magic =+ 30;
                if (player.magic > player.maxMagic) {
                    player.magic = player.maxMagic;
                }

                //Si le joueur est Poufsouffle, il régénère toute sa magie
                if (player.house == House.HUFFLEPUFF) {
                    player.magic = player.maxMagic;
                }
                
                System.out.println("La magie a été restaurée !");
                GameLogic.anythingToContinue();
        }
        else {
            System.out.println("Vous avez déjà toute votre magie !");
            GameLogic.anythingToContinue();
        }
    }
}