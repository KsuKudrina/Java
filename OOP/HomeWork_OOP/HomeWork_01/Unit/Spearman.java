package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Spearman extends Characters {
    /**Копейщик */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */
    
    /**принести оружие */
    int supply;

    public Spearman (String name){
        super(10, 10, 5, 13, 4, 4);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Копейщик" + " %s  / Hp: %d  Speed: %d ", name, hp, speed);
    }

    @Override
    public void step() {
        super.step();
    }
}
