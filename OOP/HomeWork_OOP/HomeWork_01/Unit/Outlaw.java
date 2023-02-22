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

    public Outlaw(String name){
        super(10, 10, 3, 24, 8, 6);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Разбойник" + " %s  / Hp: %d Speed: %d ", name, hp, speed);
    }

    @Override
    public void step() {
        super.step();
    }
}
