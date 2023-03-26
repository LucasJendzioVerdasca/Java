public class Ennemy {
    
    public String name;
    private int attack;
    public int def;
    public int magic;
    public int currentHealth;
    public int maxHealth;

    //constructeurs
    public Ennemy(String name, int baseattack, int basedef, int basemagic, int basehealth){
        this.name = name;
        this.attack = baseattack;
        this.def = basedef;
        this.magic = basemagic;
        this.currentHealth = basehealth;
        this.maxHealth = basehealth;
    }

    //Methodes pour attack et def
    public int attack(){
        return (int) (Math.random()*(this.attack + 3));
    }

    public int defend(){
        return (int) (Math.random()*(this.attack + 3));
    }
}