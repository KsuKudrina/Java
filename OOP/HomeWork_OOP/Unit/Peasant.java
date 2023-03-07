package OOP.HomeWork_OOP.Unit;

import java.util.ArrayList;

public class Peasant extends  Human{
    /**Крестьянин */

    /**кормить (+10 hp) */
    int feed;
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     */

    public Peasant(String name, Vector2D pos){
        super(1, 1, 1, 1, 1, 1, 3);
        super.name = name;
        this.damage = new int[]{1, 1};
    }    

    @Override
    public String getInfo() {
        return "Фермер";
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (!this.state.equals("Die")){
            this.state = "Stand";
        }
    }

}
