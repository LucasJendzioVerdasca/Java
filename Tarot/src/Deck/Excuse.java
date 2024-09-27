package Deck;

public class Excuse {
    public final String name;
    public final int value;
    public String color;
    public boolean IsBouts;

    public Excuse(String name, int value, String color) {
        this.name = "Excuse";
        this.value = value;
        this.color = null;
        this.IsBouts = true;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    
    public String getColor() {
        return color;
    }
}
