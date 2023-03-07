package OOP.HomeWork_OOP.Unit;

public class Crossbowman extends Artillery {
    /**Арбалетчик */
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param shots
     * @param maxShots
     */

    public Crossbowman(String name, Vector2D pos){
        super(1, 1, 10, 10, 3, 8, 9, 16, 16, 1);
        super.name = name;
        this.damage = new int[]{2, 3};
    }

    @Override
    public String getInfo() {
        //return String.format("Я Арбалетчик" + " %s  / Hp: %d Speed: %d", name, hp, speed);
        return "Арбалетчик";
    }
}
