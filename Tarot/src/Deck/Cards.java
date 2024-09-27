package Deck;

public class Cards {
    public final String name;
    public final int value;
    public String color;
    public boolean IsBouts;

    public Cards(String name, int value, String color) {
        this.name = value + " of " + color;
        this.value = value;
        this.color = color;
        this.IsBouts = false;
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
