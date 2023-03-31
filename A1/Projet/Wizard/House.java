package Wizard;
public enum House {
    GRYFFINDOR("Griffondor"),
    HUFFLEPUFF("Poufsouffle"),
    RAVENCLAW("Serdaigle"),
    SLYTHERIN("Serpentard");

    private String name;

    // getter
    public String getName() {
        return name;
    }

    House(String name) {
        this.name = name;
    }
}
