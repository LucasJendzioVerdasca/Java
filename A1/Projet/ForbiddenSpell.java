import java.util.ArrayList;
import java.util.List;

public class ForbiddenSpell extends AbstractSpell {
    public ForbiddenSpell(String name, int magicCost, int power) {
        super();
        boolean isForbidden;
    }


    public static List<Spell> getAllSpells() {
        List<Spell> Forbideenspells = new ArrayList<>();

        //création de tous les sorts interdits
        Forbideenspells.add(new Spell("Avada Kedavra", HIGH_MAGIC_COST, 100, true));
        Forbideenspells.add(new Spell("Crucio", HIGH_MAGIC_COST, 50, true));
        Forbideenspells.add(new Spell("Imperio", HIGH_MAGIC_COST, 50, true));

        return Forbideenspells;
    }


    @Override
    public String castSpell(String spellName, Wizard wizard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'castSpell'");
    }
}
