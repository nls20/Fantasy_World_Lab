package Item;

public enum HealType {

    HERB(10),
    MIND(40),
    SOUL(50);

    private final int heal;


    HealType(int heal) {
        this.heal = heal;
    }

    public int getHealed(){
        return heal;
    }
}
