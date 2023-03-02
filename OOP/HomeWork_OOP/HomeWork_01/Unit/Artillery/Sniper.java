package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Vector2D;

public class Sniper extends Artillery {
    /**Снайпер */

    /**
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param shots
     * @param maxShots
     */

    public Sniper(String name, Vector2D pos){
        super(1, 1, 15, 15, 10, 12, 9,  32, 32);
        super.name = name;
        this.damage = new int[]{8, 10};
    }

    @Override
    public String getInfo() {
        //return String.format("Я Снайпер" + " %s  / Hp: %d Speed: %d", name, hp, speed);
        return "Я Снайпер";
    }

}
