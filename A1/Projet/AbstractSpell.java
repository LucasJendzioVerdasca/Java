public abstract class AbstractSpell {
    protected String name;
    private int magicCost;
    private int power;

    // Constructeurs
    public AbstractSpell() {}

    public AbstractSpell(String name, int magicCost, int power) {
        this.name = name;
        this.magicCost = magicCost;
        this.power = power;
    }

    // Constantes
    public static final int LOW_MAGIC_COST = 10;
    public static final int MEDIUM_MAGIC_COST = 20;
    public static final int HIGH_MAGIC_COST = 30;

    
    public String toString() {
        return "Name: " + name + ", Magic Cost: " + magicCost + ", Power: " + power;
    }
}