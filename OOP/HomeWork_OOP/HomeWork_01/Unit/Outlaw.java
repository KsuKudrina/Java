package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Outlaw extends Characters {
    /**Разбойник */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    /**украсть */
    int steal;

    public Outlaw(String name, Vector2D pos){
        super(1, 1, 10, 10, 3, 8, 6);
        super.name = name;
        this.damage = new int[]{2, 4};
    }

    @Override
    public String getInfo() {
        // return String.format("Я Разбойник" + " %s  / Hp: %d Speed: %d ", name, hp, speed);
        return "Я Разбойник";
    }
}
