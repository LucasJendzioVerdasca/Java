public class Player extends Wizard {
    public int currentHealth;
    // Variables / Attributs d'un joueur
    public House house;
    int gold = 5;
    int attack = 1;
    int def = 4;
    // Constructeur
    public Player() {
        super("Joueur", 100, 100, 0, 100);
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

    public int getMaxMagic() {
        return this.maxMagic;
    }

    public boolean isalive() {
        return this.currentHealth > 0;
    }
}