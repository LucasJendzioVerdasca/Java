public abstract class Wizard {
    //Variables / Attributs d'un sorcier
    public String name;
    public int maxHealth, currentHealth;
    public int magic, maxMagic;
    public int xp, level;

    //Constructeur
    protected Wizard(String name, int maxHealth, int currentHealth, int xp, int maxMagic, int magic) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.xp = xp;
        this.maxMagic = maxMagic;
        this.magic = magic;
    }

}
