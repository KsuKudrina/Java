package OOP.HomeWork_OOP.HomeWork_01.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Characters> DarkSide, ArrayList<Characters> BrightSide);
    
    String getInfo();
}
