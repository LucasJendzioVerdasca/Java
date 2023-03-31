package Personnages;
import Wizard.House;
import Wizard.Wizard;

public class Player extends Wizard {
    // Variables / Attributs d'un joueur
    public House house;
    public int gold = 5;
    int attack = 1;
    int def = 4;
    // Constructeur
    public Player(String name, int maxHealth, int xp, int maxMagic, int magic, int power) {
        super(name, 20, 0, 60, 60, 5);
    }

     //Methodes pour attack et def
     public int attack(){
        return (int) (Math.random()*(this.attack + 3));
    }

    public int defend(){
        return (int) (Math.random()*(this.def + 3));
    }

    // getters/setters
    public void setHouse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getMaxMagic() {
        return this.maxMagic;
    }

    public int getMagic() {
        return this.magic;
    }

    public boolean isalive() {
        if (currentHealth > 0) {
            return true;
        } else {
            return false;
        }
    }
}