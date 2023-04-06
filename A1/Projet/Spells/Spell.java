package Spells;

import java.util.ArrayList;
import java.util.List;
import Personnages.Ennemy;
import controller.GameLogic;


public class Spell extends AbstractSpell {
    public String name;

    public Spell(String name, int magicCost, int power) {
        this.name = name;
        this.magicCost = magicCost;
        this.power = power;
    }

    public static List<Spell> getAllSpells() {
        List<Spell> spells = new ArrayList<>();
        // Create spells and add them to the list
        spells.add(new Spell("Wingardium Leviosa", LOW_MAGIC_COST, 5));
        spells.add(new Spell("Stupefix", LOW_MAGIC_COST, 5));
        spells.add(new Spell("Expecto Patronum", MEDIUM_MAGIC_COST, 5));
        spells.add(new Spell("Expelliarmus", MEDIUM_MAGIC_COST, 1));
        spells.add(new Spell("Sectumsempra", HIGH_MAGIC_COST, 50));
        return spells;
    }
        
    public void castSpellEffect(Ennemy ennemy){
        if (this.name == "Expelliarmus"){
            ennemy.attack -= 5;
            System.out.println("Le " + ennemy.name + " voit son attaque être diminuée.");
        }else if(this.name == "Stupefix"){
            ennemy.stunt = true;
            System.out.println("Le " + ennemy.name + " est étourdi.");
        }
        GameLogic.anythingToContinue();
    }

    public int getMagicCost() {
        return magicCost;
    }


    public int getPower() {
        return power;
    }


    public String getName() {
        return name;
    }
}