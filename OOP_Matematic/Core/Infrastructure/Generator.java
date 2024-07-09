package OOP_Matematic.Core.Infrastructure;

import java.util.Random;

public class Generator {
    static Random rand = new Random();

    public static int number(){
        return rand.nextInt(10, 15);
    }
}
