/*Paprasyti vartotojo nurodyti, kiek skaičių jis ketina įvesti, 
tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko. 
Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
*/
import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        
        System.out.println("pasirinkite skaiciu n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		
        for (int i = 0; i < n; i++){
            System.out.println("iveskite skaiciu");

            int skaicius = scanner.nextInt();
            if(skaicius > 100){
                System.out.println(skaicius);
            }
        }
    }
}
