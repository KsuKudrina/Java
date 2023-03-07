package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;


public abstract class Artillery extends Human {
    /**Артиллерия */

     /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     */

    /**выстрелы */ 
    protected int shots;

    /**максимальное кол-во выстрелов */
    protected int maxShots;   
    
    /**расстояние */
    protected int range;
    
    /**конструктор */ 
    public Artillery(int x, int y, int hp, int maxHp, int def, int attack, int speed, int shots, int maxShots, int range) {
                
        super(x, y, hp, maxHp, def, attack, speed);
        this.shots = shots;
        this.maxShots = maxShots;
        this.range = range;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || shots == 0) return;
        Human victim = team2.get(Nearest(team2));
        int damage = (victim.def - attack > 0) ? 
        this.damage[0] : (victim.def - attack < 0) ? 
        this.damage[1] : (this.damage[1] + this.damage[0])/ 2;
        victim.getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().equals("Крестьянин") && team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }
        }
        shots--;
    }

    @Override
    public String toString() {
        return getInfo() + " " +
                name +
                " H:" + Math.round(hp) +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1])/2)) +
                " Shots:" + shots +
                " " + state;
    }
    
}
