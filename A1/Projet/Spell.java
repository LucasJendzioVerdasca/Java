    import java.util.ArrayList;
    import java.util.List;

    public class Spell extends AbstractSpell {
        public Spell(String name, int magicCost, int power) {
            super();
        }


        public static List<Spell> getAllSpells() {
            List<Spell> spells = new ArrayList<>();

            // Create spells and add them to the list
            spells.add(new Spell("Wingardium Leviosa", LOW_MAGIC_COST, 1));
            spells.add(new Spell("Stupefix", LOW_MAGIC_COST, 5));
            spells.add(new Spell("Expecto Patronum", MEDIUM_MAGIC_COST, 10));
            spells.add(new Spell("Expelliarmus", MEDIUM_MAGIC_COST, 1));
            spells.add(new Spell("Sectumsempra", HIGH_MAGIC_COST, 50));

            return spells;
        }


}