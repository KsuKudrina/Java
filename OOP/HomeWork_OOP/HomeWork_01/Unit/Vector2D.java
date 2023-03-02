package OOP.HomeWork_OOP.HomeWork_01.Unit;

import java.lang.Math;

public class Vector2D {
    public int x;
    public int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**расстояние */
    public double getDistans(Vector2D coord){
        return Math.sqrt((Math.pow(x - coord.x, 2)) + Math.pow(y - coord.y, 2));
    }

}
