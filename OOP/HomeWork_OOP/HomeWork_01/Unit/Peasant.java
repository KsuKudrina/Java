package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Peasant extends  Characters{
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

    public Peasant(String name, int x, int y){
        super(1, 1, 1, 1, 1, 1, 3);
        super.name = name;
        this.damage = new int[]{1, 1};
    }    

    @Override
    public String getInfo() {
        return "Крестьянин";
    }

}
