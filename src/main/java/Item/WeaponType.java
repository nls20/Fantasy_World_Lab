package Item;

public enum WeaponType {
    SWORD(50),
    AXE(40),
    CLUB(35);


    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
