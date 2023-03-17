


@Getter
public class ForbiddenSpell extends AbstractSpell {
    private String corruption;

    public ForbiddenSpell(String name, int magicCost, int power,  String corruption) {
        super(name, magicCost, power);
        this.corruption = corruption;
    }

    public String castSpell(String spellName, Wizard wizard){
       return "";
    }
}