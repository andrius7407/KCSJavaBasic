/* Parasyti programą kuri paprasytų vartotojo įvesti  5 žodžius.
Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] masyvas = new String [5];
		
        for (int i = 0; i < 5; i++){
            System.out.println("irasykite "+ (i+1) +" zodi");
                masyvas[i] = scanner.nextLine();
        }
		
        for (String i: masyvas){
            System.out.println(i);
        }
    }
}
