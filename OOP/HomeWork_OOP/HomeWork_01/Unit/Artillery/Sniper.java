package OOP.HomeWork_OOP.HomeWork_01.Unit.Artillery;

public class Sniper extends Artillery {
    /**Снайпер */

    /**
     * @param hp
     * @param maxHp
     * @param def
     * @param damage
     * @param attack
     * @param speed
     * @param shots
     * @param maxShots


     */

    /**замирание */
    Object motionless; //метод
    /**приблизить цель */
    Object aim;     //метод

    public Sniper(String name){
        super(15, 15, 10, 810, 12, 9,  32, 32);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Я Снайпер" + " %s  / Hp: %d Speed: %d", name, hp, speed);
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
