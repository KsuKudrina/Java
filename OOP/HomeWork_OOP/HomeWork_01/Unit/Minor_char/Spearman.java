package OOP.HomeWork_OOP.HomeWork_01.Unit.Minor_char;

public class Spearman extends Minor_characters {
    /**Копейщик */

    /**
     * 
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param hide
     * @param hit
     */
    
    /**принести оружие */
    int supply;

    public Spearman (String name){
        super(150, 150, 3, 12, false, 2);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Копейщик" + " %s  / Hp: %d ", name, hp);
    }

    @Override
    public void step() {
        super.step();
    }
}
