public class Wand {
    private String name;
    private Core core;
    private float size;

    public Wand(String name, Core core, float size) {
        this.name = name;
        this.core = Core.generateRandomCore();
        this.size = size;
    }
}
