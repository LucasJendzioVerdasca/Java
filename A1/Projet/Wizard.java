import java.util.List;

public abstract class Wizard {
    //Variables / Attributs d'un sorcier
    public String name;
    public int maxHealth, currentHealth;
    public int magic, maxMagic;
    public int xp;
    public List<Spell> knownSpells;
    public boolean dodge;

    //Constructeur
    protected Wizard(String name, int maxHealth, int xp, int maxMagic, int magic) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.xp = xp;
        this.maxMagic = maxMagic;
        this.magic = magic;
        this.knownSpells = .getKnownSpells();
        this.dodge = false;
    }
}