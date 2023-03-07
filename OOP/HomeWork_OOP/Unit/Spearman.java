package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;

public class Spearman extends Human {
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

    public Spearman (String name, Vector2D pos){
        super(1, 1, 10, 10, 5, 4, 4);
        super.name = name;
        this.damage = new int[]{1, 3};
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;
        int index = Nearest(team2);
        Human victim = team2.get(index);
        if (pos.getDistans(pos) < 2) {
            victim.getDamage(damage[0]);
            return;
        }
        if (pos.getDown(victim.pos)){
            if (pos.y - 1 > victim.pos.y && pos.getEmpty(team1, pos.x, pos.y - 1)){
                stepDown();
            }
            else {
                sideStep(team1, victim);
            }
        }
        else {
            if (pos.y + 1 < victim.pos.y && pos.getEmpty(team1, pos.x, pos.y + 1)){
                stepUp();
            }
            else {
                sideStep(team1, victim);
            }
        }
    }

    private void stepUp() {
        pos.y += 1;
    }

    private void sideStep(ArrayList<Human> team, Human victim) {
        if (pos.getLeft(victim.pos)){
            if (pos.getEmpty(team, pos.x - 1, pos.y)){
                pos.x -= 1;
            }
        
        } else {
            if (pos.getEmpty(team, pos.x + 1, pos.y)){
                pos.x += 1;
            }
        }
    }

    private void stepDown() {
        pos.y -= 1;
    }

    @Override
    public String getInfo() {
        // return String.format("Я Копейщик" + " %s  / Hp: %d  Speed: %d ", name, hp, speed);
        return "Копейщик";
    }
}
