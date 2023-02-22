package OOP.HomeWork_OOP.HomeWork_01.Unit.Esoterics;

public class Magician extends Esoteric {
    /**Колдун */

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

    // public Magician(int hp, int maxHp, int def, int damage, int attack, 
    //         int treatment, int magic) {

    //     super(hp, maxHp, def, damage, attack, treatment, magic);
    // }

    public Magician (String name){
        super(30, 30, 12, 5, 17, 9, 1);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Колдун" + " %s  / Hp: %d Speed: %d", name, hp, speed);
    }

    @Override
    public void step() {
        super.step();
    }
    
}
