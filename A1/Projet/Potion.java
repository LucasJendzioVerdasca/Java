public class Potion {
    private String name;
    private String description;
    private int power;
    
    public Potion(String name, String description, int power) {
        this.name = name;
        this.description = description;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }

    public int getPower() {
        return power;
    }
}
