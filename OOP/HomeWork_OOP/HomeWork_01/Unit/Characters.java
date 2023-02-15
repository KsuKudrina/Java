package OOP.HomeWork_OOP.HomeWork_01.Unit;

public class Characters {
    /**здоровье персонажа */
    protected int hp;
    /**максимальное здоровье */
    protected int maxHp;
    /**защита */
    protected int protection;
    /**урон */
    protected int damage;

    /**конструктор */
   
    public Characters(int hp, int maxHp, int protection, int damage){
        this.hp = hp;
        this.protection = protection;
        this.damage = damage;
        this.maxHp = maxHp;
    }

    public int Attack(){
        this.hp -= (int)(damage * 0.8);
        if (hp < 0) return 0;
        else return damage;
    }

    public void Heal(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

}
