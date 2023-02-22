package OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics;

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
    //  * @param treatment
     * @param magic
     */

    public Monk(String name){
        super(30, 30, 7, 4, 12, 5, 1);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Монах" + " %s  / Hp: %d Speed: %d", name, hp, speed);
    }

    @Override
    public void step() {
        super.step();
    }
}
