import Ennemis.Ennemy;
import Spell.ForbiddenSpell;
import Spell.Spell;

public class Wizard {
    //Variables / Attributs d'un sorcier
    private String name, gender;
    private int maxHealth, currentHealth, maxMagic, magic, level;
    private Pet pet;
    private Wand wand;
    private House house;
    private Spell[] knownSpells;
    private ForbiddenSpell[] forbiddenSpells;
    private Ennemy[] ennemies;
    private Potion[] potions;
    
    //Constructeur
    private Wizard(String name, int maxHealth, int maxMagic, int level, Pet pet, Wand wand, House house, Spell[] knownSpells, ForbiddenSpell[] forbiddenSpells, Ennemy[] ennemies, Potion[] potions) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.maxMagic = maxMagic;
        this.magic = maxMagic;
        this.level = level;
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = knownSpells;
        this.forbiddenSpells = forbiddenSpells;
        this.ennemies = ennemies;
        this.potions = potions;
    }
    
    
}
