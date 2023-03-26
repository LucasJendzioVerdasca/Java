public class Player extends Wizard{
    public int currentHealth;
    //Variables / Attributs d'un joueur
    public House house;
    public int numATKupgrades, numDEFupgrades, numMAGupgrades;

    //Constructeur
    public Player(String name) {
        super(name, 100, 0, 100, 100);
    }

    //getters/setters
    public void setHouse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        return (int) (Math.random()*(this.numATKupgrades + 3 + this.level));
    }

    @Override
    public int defend() {
        // TODO Auto-generated method stub
        return (int) (Math.random()*(this.numDEFupgrades + 3 + this.level));
    }
}