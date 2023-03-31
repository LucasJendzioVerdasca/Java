import java.util.ArrayList;
import java.util.List;

public class Spell extends AbstractSpell {
    public Spell(String name, int magicCost, int power) {
        super();
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
    }

    public List<Spell> learnSpell(Wizard wiz, Spell newSpell){
        wiz.knownSpells.add(newSpell);
        return wiz.knownSpells;
    }


    public int getMagicCost() {
        return 0;
    }


    public int getPower() {
        return 0;
    }


    public String getName() {
        return null;
    }
}