package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Esoterics;

public class Magician extends Esoteric {
    /**Колдун */

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

    // public Magician(int hp, int maxHp, int def, int damage, int attack, 
    //         int treatment, int magic) {

    //     super(hp, maxHp, def, damage, attack, treatment, magic);
        
    // }

    public Magician (String name){
        super(150, 150, 3, 12, 5, 5, 8);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Колдун" + " %s  / Hp: %d Magic: %d", name, hp, magic);
    }

    @Override
    public void step() {
        super.step();
    }
    
}
