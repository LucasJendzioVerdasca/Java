public enum House {
    GRYFFINDOR("Griffondor"),
    HUFFLEPUFF("Poufsouffle"),
    RAVENCLAW("Serdaigle"),
    SLYTHERIN("Serpentard");

    House(String name) {
    }

    public static String getHouseName(House house) {
        return house.name();
    }
}
