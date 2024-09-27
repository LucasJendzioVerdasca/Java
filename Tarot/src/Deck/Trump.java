package Deck;

public class Trump extends Cards {
    public Trump(String name, int value, String color, boolean IsBouts) {
        super(name, value, color);
        this.IsBouts = isBouts();
    }   

    public boolean isBouts() {
        if(value == 1 || value == 21) {
            return true;
        } else {
            return false;
        }
    }
}