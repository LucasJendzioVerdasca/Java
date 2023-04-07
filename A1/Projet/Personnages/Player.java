package Personnages;

import Wizard.House;
import Wizard.Wizard;
import controller.GameLogic;

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
    public int protegoUse = 0;
    public boolean hasUsedAccio = false;
    public boolean hasGryffondorSword = false;

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

    public boolean attemptHit() {
        if(Math.random() > hitchance  || hitchance == 1)
            return true;
        else
            return false;
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

    public boolean hasUsedAccio(){
        return false;
    }

    public void setHasGryffondorSword(boolean hasGryffondorSword) {
        this.hasGryffondorSword = hasGryffondorSword;
    }

    public void equipGryffindorSword() {
        if (house.equals(House.GRYFFINDOR)) {
            System.out.println("Vous entendez au loin le bruit de l'oiseau de feu. Il est revenu avec … le choixpeau ? Il tourne quelques instants autour de votre tête et lâcha l'objet. En retombant, vous entendez un bruit métallique. vous apercevez alors le pommeau d'une épée dans le chapeau et décidez de profiter de la diversion du phénix pour l'attraper ");
            GameLogic.anythingToContinue();
            System.out.println("Vous obtenez l'épée de Griffondor. \n Votre attaque augmente, utilisez l'attaque de base pour l'utiliser.");
            setHasGryffondorSword(true);
            GameLogic.anythingToContinue();
        }
    }
}