import java.util.ArrayList;
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
    protected Wizard(String name, int maxHealth, int xp, int maxMagic, int magic, int power) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.xp = xp;
        this.maxMagic = maxMagic;
        this.magic = magic;
        this.knownSpells = new ArrayList<>();
        this.dodge = false;
    }

    public void addSpell(Spell spell) {
        this.knownSpells.add(spell);
    }
    
    int LOW_MAGIC_COST = 5;
    int MEDIUM_MAGIC_COST = 10;
    int HIGH_MAGIC_COST = 15;

    ArrayList<Spell> getKnownSpells() {
        List <Spell> spells = Spell.getAllSpells();
        spells.add(new Spell("Wingardium Leviosa", LOW_MAGIC_COST, 5));
        return (ArrayList<Spell>) this.knownSpells;
    }
}