package Wizard;
import Personnages.Player;

public class Potion {
    public enum PotionType {
        HEALTH,
        MAGIC
    }

    private String name;
    private PotionType type;

    public Potion(String name, PotionType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void use(Player player) {
        switch (type) {
            case HEALTH:
                player.currentHealth = player.getMaxHealth();
                System.out.println("La vie a été entièrement restaurée !");
                break;
            case MAGIC:
                player.magic = player.getMaxMagic();
                System.out.println("La magie a été entièrement restaurée !");
                break;
        }
    }
}