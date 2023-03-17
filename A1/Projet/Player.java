public class Player extends Wizard{
    //Variables / Attributs d'un joueur
    public int numATKupgrades, numDEFupgrades, numMAGupgrades;

    //Constructeur
    public Player(String name) {
        super(name, 100, 0, 100, 100);
    }

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public int defend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defend'");
    }

}