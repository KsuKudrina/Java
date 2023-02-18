package OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char;

public class Peasant extends Minor_characters{
    /**Крестьянин */

    /**кормить (+10 hp) */
    int feed;
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param hide
     * @param hit
     */

    public Peasant(String name){
        super(150, 150, 3, 12, false, 2);
        super.name = name;
    }    

    @Override
    public String getInfo() {
        return String.format("Я Крестьянин" + " %s  / Hp: %d ", name, hp);
    }

    @Override
    public void step() {
        super.step();
    }

}
