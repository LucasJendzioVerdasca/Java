class House {
    private String name;
    private int score;

    public House(String name, int i) {
        this.name = name;
        this.score = 0;
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}