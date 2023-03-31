package Personnages;

public class Ennemy {
    public String name;
    public int attack;
    public int baseAttack;
    public int def;
    public int magic;
    public int currentHealth;
    public int maxHealth;
    public boolean stunt;

    //constructeurs
    public Ennemy(String name, int attack, int def, int magic, int health){
        this.name = name;
        this.attack = attack;
        this.baseAttack = attack;
        this.def = def;
        this.magic = magic;
        this.currentHealth = health;
        this.maxHealth = health;
        this.stunt = false;
    }

    //Methodes pour attack et def
    public int attack(){
        return (int) (Math.random()*(this.attack + 3));
    }

    public int defend(){
        return (int) (Math.random()*(this.def + 3));
    }

    public boolean isalive() {
        return this.currentHealth > 0;
    }

    public int getAttack() {
        return attack;
    }
}