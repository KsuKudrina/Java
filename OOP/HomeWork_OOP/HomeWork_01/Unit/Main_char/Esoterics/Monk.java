package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Esoterics;

public class Monk extends Esoteric {
    /**Монах */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param treatment
     * @param magic
     */

    public Monk(String name){
        super(150, 150, 3, 12, 5, 5, 5);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Монах" + " %s  / Hp: %d Magic: %d", name, hp, magic);
    }

    @Override
    public void step() {
        super.step();
    }
}
