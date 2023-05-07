package com.isep.hpah.core.Spells;
import java.util.ArrayList;
import java.util.List;

public class ForbiddenSpell extends AbstractSpell {
    public ForbiddenSpell(String name, int magicCost, int power) {
        super();
    }


    public static List<Spell> getAllSpells() {
        List<Spell> Forbidenspells = new ArrayList<>();

        //création de tous les sorts interdits
        Forbidenspells.add(new Spell("Avada Kedavra", HIGH_MAGIC_COST, 100));
        Forbidenspells.add(new Spell("Crucio", HIGH_MAGIC_COST, 50));
        Forbidenspells.add(new Spell("Imperio", HIGH_MAGIC_COST, 50));

        return Forbidenspells;
    }

}
