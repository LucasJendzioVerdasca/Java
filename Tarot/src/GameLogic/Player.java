package GameLogic;

public class Player {
    private String name;
    private int score;
    private boolean isDealer;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.isDealer = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean isDealer) {
        this.isDealer = isDealer;
    }

    public void addScore(int points) {
        this.score += points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", isDealer=" + isDealer +
                '}';
    }
}