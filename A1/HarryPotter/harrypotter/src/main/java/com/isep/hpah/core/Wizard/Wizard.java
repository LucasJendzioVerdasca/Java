package com.isep.hpah.core.Wizard;

import java.util.ArrayList;
import java.util.List;

import com.isep.hpah.core.Spells.Spell;

public abstract class Wizard {
    //Variables / Attributs d'un sorcier
    public String name;
    public int maxHealth, currentHealth;
    public int magic, maxMagic;
    public int xp;
    public List<Spell> knownSpells;
    public boolean dodge;

    //Constructeur
    protected Wizard(String name, int maxHealth, int xp, int maxMagic, int magic, int power, double d) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.xp = xp;
        this.maxMagic = maxMagic;
        this.magic = magic;
        this.knownSpells = new ArrayList<>();
        this.dodge = false;
    }

    public void learnSpell(Spell newSpell) {
        this.knownSpells.add(newSpell);
    }
    
    int LOW_MAGIC_COST = 5;
    int MEDIUM_MAGIC_COST = 10;
    int HIGH_MAGIC_COST = 15;

    public List<Spell> getKnownSpells() {
        return this.knownSpells;
    }
}