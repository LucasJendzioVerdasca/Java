public class Player extends Wizard {
    public int currentHealth;
    // Variables / Attributs d'un joueur
    public House house;
    public int numATKupgrades, numDEFupgrades, numMAGupgrades;

    // Constructeur
    public Player() {
        super("Joueur", 100, 100, 0, 100, 100);
        this.currentHealth = 100;
        this.numATKupgrades = 0;
        this.numDEFupgrades = 0;
        this.numMAGupgrades = 0;
    }

    // getters/setters
    public void setHouse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        return (int) (Math.random() * (this.numATKupgrades + 3 + this.level));
    }

    @Override
    public int defend() {
        // TODO Auto-generated method stub
        return (int) (Math.random() * (this.numDEFupgrades + 3 + this.level));
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getMaxMagic() {
        return this.maxMagic;
    }
}