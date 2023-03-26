public abstract class Wizard {
    //Variables / Attributs d'un sorcier
    public String name;
    public int maxHp, hp, xp;
    public int magic;
    public int maxMagic;

    //Constructeur
    protected Wizard(String name, int maxHealth, int xp, int maxMagic, int magic) {
        this.name = name;
        this.maxHp = maxHealth;
        this.hp = maxHealth;
        this.xp = xp;
        this.maxMagic = maxMagic;
        this.magic = magic;
    }

    //Méthodes
    public abstract int defend();
    
    public String getname() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getXp() {
        return xp;
    }

    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setMaxMagic(int maxMagic) {
        this.maxMagic = maxMagic;
    }
}
