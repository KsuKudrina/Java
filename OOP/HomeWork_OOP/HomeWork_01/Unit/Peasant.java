package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Peasant extends  Characters{
    /**Крестьянин */

    /**кормить (+10 hp) */
    int feed;
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    public Peasant(String name){
        super(1, 1, 1, 1, 1, 3);
        super.name = name;
    }    

    @Override
    public String getInfo() {
        return String.format("Я Крестьянин" + " %s  / Hp: %d  Speed: %d ", name, hp, speed);
    }

    @Override
    public void step() {
        super.step();
    }

}
