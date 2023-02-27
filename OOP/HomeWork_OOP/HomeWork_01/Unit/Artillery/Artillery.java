package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

import java.util.ArrayList;

import OOP.HomeWork_OOP.HomeWork_01.Unit.Characters;

public abstract class Artillery extends Characters {
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


    // protected String name;
    
    
    /**конструктор */ 
    public Artillery(int x, int y, int hp, int maxHp, int def, int attack, int speed, int shots, int maxShots) {
                
        super(x, y, hp, maxHp, def, attack, speed);
        this.shots = shots;
        this.maxShots = maxShots;
    }

    @Override
    public void step(ArrayList<Characters> team1, ArrayList<Characters> team2) {
        if (state.equals("Die") || shots == 0) return;
        int index = super.Nearest(team2);
        int damage = (team2.get(index).def - attack > 0) ? 
        this.damage[0] : (team2.get(index).def - attack < 0) ? 
        this.damage[1] : this.damage[1] - this.damage[0];

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().equals("Крестьянин") && team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }
        }
        shots--;
    }
    
        
}
