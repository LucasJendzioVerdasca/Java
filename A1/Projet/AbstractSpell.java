@AllArgsConstructor
@Getter
@Setter
public class AbstractSpell {
    private String name;
    private int magicCost;
    private int power;

    public abstract String castSpell(String spellName, Wizard wizard);
}
