package Item;

public enum SpellType {
    FIRE (10),
    LIGHTING (20),
    FROST(30);

    private final int damage;

    SpellType (int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
