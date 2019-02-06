/* Parayti programą, kuri leistų vartotojui įvesti norimą skaičių 
ir po to parasytų ar sis skaičius yra lyginis, ar nelyginis. 
Užuomina - panaudokite % operatoriu. */

import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {
        /* Parayti programą, kuri leistų vartotojui įvesti norimą skaičių 
		ir po to parasytų ar sis skaičius yra lyginis, ar nelyginis. 
		Užuomina - panaudokite % operatoriu. */

        System.out.println("Iveskite skaiciu");
        Scanner scanner = new Scanner(System.in);
		
        int skaicius = scanner.nextInt();
		
        if(skaicius % 2 == 0){
            System.out.println("ivestas skaicius yra lyginis");
        }else {
            System.out.println("ivestas skaicius yra nelyginis");
        }
    }
}
