package diceroller;

import java.util.Random;

public class Modelo {
    
    Random rand = new Random();

    public int d4(){
        return rand.nextInt(4)+1;
    }

    public int d6(){
        return rand.nextInt(6)+1;
    }

    public int d8(){
        return rand.nextInt(8)+1;
    }

    public int d10(){
        return rand.nextInt(10)+1;
    }

    public int d12(){
        return rand.nextInt(12)+1;
    }

    public int d100(){
        return rand.nextInt(100)+1;
    }
}
