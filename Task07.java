/*Parasyti programą dvimačio masyvo (matricos)  
lyginiu elementų kiekiui surasti.
 */

import java.util.Random;

public class Uzduotis7 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5) + 2;
        int m = random.nextInt(5) + 3;
		
        int[][] masyvas = new int[n][m];
		
        int suma = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                masyvas[i][j] = random.nextInt(49) + 1;
                System.out.println(masyvas[i][j]);
                if (masyvas[i][j] % 2 == 0){
                    suma++;
                }
            }
        }
        System.out.println("n yra "+ n +", m yra "+ m +", kiekis " + suma);
    }
}
