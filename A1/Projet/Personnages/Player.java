package Personnages;
import java.util.Random;

import Wizard.House;
import Wizard.Wizard;

public class Player extends Wizard {
    // Variables / Attributs d'un joueur
    public House house;
    public int gold = 5;
    public int attack = 4;
    public int def = 4;
    public int nbHpPotion = 0;
    public int nbMagicPotion = 0;
    public int power;
    public double hitchance;
    // Constructeur
    public Player(String name, int maxHealth, int xp, int maxMagic, int magic, int power, double hitchance) {
        super(name, 20, 0, 60, 60, 5, 0.8);
    }

     //Methodes pour attack et def
     public int attack(){
        return (int) (Math.random()*(this.attack + 3));
    }

    public int defend(){
        return (int) (Math.random()*(this.def + 3));
    }

    private Random random = new Random(); // Ajoutez cet attribut à la classe Player

    public boolean attemptHit() {
        return random.nextDouble() <= hitchance;
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

    public int getnbHpPotion(){
        return this.nbHpPotion;
    }

    public int getnbMagicPotion(){
        return this.nbMagicPotion;
    }

    public boolean noPotions(){
        return (this.nbHpPotion == 0 && this.nbMagicPotion == 0);
    }
}