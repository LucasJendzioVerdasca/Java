package Spell;
import java.util.ArrayList;
import java.util.List;

public class ForbiddenSpell extends AbstractSpell {
   super(name, power, description, LevelofUnlocking, magicCost, Use);
   private int corruption;

   private List<String> forbiddenSpells = new ArrayList<String>();
   
   public ForbiddenSpell() {
      forbiddenSpells.add("Avada Kedavra");
      forbiddenSpells.add("Endoloris");
      forbiddenSpells.add("Impero");
   }
   
   public List<String> getForbiddenSpells() {
      return forbiddenSpells;
   }

   @Override
   public void castSpell(Character target) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'castSpell'");
   }
}
