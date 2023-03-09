package OOP.HomeWork_OOP.Unit;

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


    public Magician (String name, Vector2D pos){
        super(1, 1, 30, 30, 12, 17, 9, 1);
        super.name = name;
        this.damage = new int[]{-5, -5};
    }

    @Override
    public String getInfo() {
        // return String.format("Я Колдун" + " %s  / Hp: %d Speed: %d", name, hp, speed);
        return "Волшебник";
    }
}
