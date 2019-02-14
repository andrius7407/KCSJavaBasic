/*
9. Parašyti programą funkcijos f(x) reikšmei surasti:
a. jei x teigiamas, tai f(x)=2x+8,
b. jei x neigiamas, tai f(x)=21-7x
 */

import java.util.Random;

public class Devyni {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(11)-5;
        System.out.println("x = " + x);
        int f;
        if(x >= 0){
            f = 2 * x + 8;
        }else{
            f = 21 - 7 * x;
        }
        System.out.println("f(x) = " + f);
    }
}
