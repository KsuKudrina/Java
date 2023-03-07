package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;

public abstract class Esoteric extends Human {
    /**Эзотерики */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    // /**лечение */
    // int treatment;
    
    /**Удар магией */
    int magic;

    /**конструктор */

    public Esoteric(int x, int y, int hp, int maxHp, int def, int attack, int speed, int magic) {
        super(x, y, hp, maxHp, def, attack, speed);
        this.magic = magic;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        
        for (Human human : team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")){
                human.getDamage(damage[1]);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return getInfo() + " " +
                name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " " + state;
    }
}
