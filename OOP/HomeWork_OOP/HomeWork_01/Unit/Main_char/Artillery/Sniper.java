package OOP.HomeWork_OOP.HomeWork_01.Unit.Main_char.Artillery;

public class Sniper extends Artillery {
    /**Снайпер */

    /**
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param shots
     * @param maxShots
     * @param accuracy

     */

    /**замирание */
    Object motionless; //метод
    /**приблизить цель */
    Object aim;     //метод

    public Sniper(String name){
        super(150, 150, 5, 12, 10, 30,  30, 5);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Снайпер" + " %s  / Hp: %d Shots: %d", name, hp, shots);
    }


    @Override
    public void step() {
        super.step();
    }

    // public Object getMotionless() {
    //     return motionless;
    // }

    // public Object getAim() {
    //     return aim;
    // }

    

}
