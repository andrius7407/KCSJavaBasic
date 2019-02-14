/*
    Parasyti programą dvimačio masyvo (matricos)   elementų, kurie didesni už 5, sumai surasti.
*/

import java.util.Random;

public class Astuoni {

    public static void main(String[] args) {

        Random random = new Random();
        int suma = 0;
        int n = random.nextInt(5) + 2;
        int m = random.nextInt(5) + 3;
        
        int[][] masyvas = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                masyvas[i][j] = random.nextInt(10);
                if (masyvas[i][j] > 5) {
                    suma += masyvas[i][j];
                }
                System.out.println(masyvas[i][j]);
            }
        }
        System.out.println("elementu, didesniu uz 5 suma lygi " + suma);
    }
}
