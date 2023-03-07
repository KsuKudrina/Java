package OOP.HomeWork_OOP.Unit;

public class Monk extends Esoteric {
    /**Монах */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param magic
     */

    public Monk(String name, Vector2D pos){
        super(1, 1, 30, 30, 7, 12, 5, 1);
        super.name = name;
        this.damage = new int[]{-4, -4};
    }

    @Override
    public String getInfo() {
        // return String.format("Я Монах" + " %s  / Hp: %d Speed: %d", name, hp, speed);
        return "Монах";
    }
}
