package Spell;

public abstract class AbstractSpell {
    private String name;
    public int power;
    private String description;
    private int LevelofUnlocking;
    private int magicCost;
    private String Use;

    public AbstractSpell(String name, int power, String description, int LevelofUnlocking, int magicCost, String Use) {
        this.name = name;
        this.power = power;
        this.description = description;
        this.LevelofUnlocking = LevelofUnlocking;
        this.magicCost = magicCost;
        this.Use = Use;
    }

    public abstract void castSpell(Character target);

}
