/* Parasyti programą, kuri paprasytų vesti skaičius tol, 
kol bus įvestas skaičius 0. Pabaigoje turi būti atvaizduojama įvestų skaičių suma. 
Skaičiavimas turi būti atliekamas kitame metode.
Papildykite programą kuri neleistu įvesti ne skaičius, 
jei vartotojas įveda ne skaičių
programa praso pakartoti tol, kol bus įvestas skaičius.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis3 {
    
    public static void main(String[] args) {
        int skaicius = 1;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while (skaicius != 0){
            System.out.println("iveskite skaiciu.Kai ivesite 0, bus suskaiciuota ivestu skaiciu suma");
            try {
                skaicius = scanner.nextInt();
                suma = countNumbers(skaicius, suma);
            }catch (InputMismatchException a){
                System.out.println("ivedete ne skaiciu");
                scanner.nextLine();
            }
        }
        System.out.println(suma);
    }

    public static int countNumbers(int sk, int sum){
        int suma = sk + sum;
        return suma;
    }
}
