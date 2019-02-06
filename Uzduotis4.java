/* Parasyti programą, kuri paprasytų įvesti 5 skaičius.
Baigus skaičių įvedimą, turi būti atvaizduojama įvestų 
skaičių suma ir visi įvesti skaičiai.
*/

import java.util.Scanner;

public class Uzduotis4 {
    public static void main(String[] args) {
        int n = 5;

        int[] masyvas = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("iveskite "+ (1+i) +" skaiciu");
            Scanner scanner = new Scanner(System.in);
            masyvas[i] = scanner.nextInt();
        }

        int suma = skaiciuojaSuma(masyvas);
        System.out.println("suma yra lygi " + suma);
        for(int skaicius: masyvas){
            System.out.println(skaicius);
        }
    }

    public static int skaiciuojaSuma(int[] mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i ++){
            sum += mas[i];
        }
        return sum;
    }
}
