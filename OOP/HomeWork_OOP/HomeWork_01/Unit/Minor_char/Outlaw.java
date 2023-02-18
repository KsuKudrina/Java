package OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char;

public class Outlaw extends Minor_characters {
    /**Разбойник */
    
    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param hide
     * @param hit
     */

    /**украсть */
    int steal;

    public Outlaw(String name){
        super(150, 150, 3, 12, false, 2);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Разбойник" + " %s  / Hp: %d ", name, hp);
    }

    @Override
    public void step() {
        super.step();
    }
}
