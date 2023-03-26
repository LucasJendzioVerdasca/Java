public class Player extends Wizard{
    //Variables / Attributs d'un joueur
    public House house;

    //Constructeur
    public Player(String name) {
        super(name, 100, 0, 100, 100);
    }

    //getters/setters
    public House getHouse() {
        return house;
    }

    public void setHouse(House house2) {
        this.house = house2;
    }

    @Override
    public int defend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defend'");
    }

}