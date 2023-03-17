package Spell;
import java.util.ArrayList;
import java.util.List;

public class Spell {
   private List<String> spells = new ArrayList<String>();
   
   public Spell() {
    spells.add("Accio");
    spells.add("Alohomora");
    spells.add("Expelliarmus");
    spells.add("Lumos");
    spells.add("Nox");
    spells.add("Obliviate");
    spells.add("Petrificus Totalus");
    spells.add("Prior Incantato");
    spells.add("Protego");
    spells.add("Reducto");
    spells.add("Rennervate");
    spells.add("Reparo");
    spells.add("Rictusempra");
    spells.add("Stupefy");
    spells.add("Wingardium Leviosa");
   }
   
   public List<String> getSpells() {
      return spells;
   }
}