/*
Sukurti klasę kuri turėtų metodus skaičių sumos, skirtumo ir sandaugos radimui.
Metodai per parametrus priimtų du skaičius, o gražintų atitinkamo veiksmo rezultatą.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Septyniolika {
 
    private static double gautiKorektiskaSkaiciu(String skaicius, Scanner scanner, String text){
        double result;
        try{
            result = Double.parseDouble(skaicius);
        }catch (NumberFormatException e){
            while (true){
                System.out.println(text);
                try {
                    result = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e1){
                    System.out.println("ivesti skaiciu");
                    scanner.nextLine();
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp ju. pvz : 13 + 10");
        String eilute = scanner.nextLine();
        String[] nariai = eilute.split(" ");
        Calculator calculator = new Calculator();
        double pirmas;
        double antras;
        if(nariai.length == 3){
            switch (nariai[1]){
                case "+":
                    pirmas = gautiKorektiskaSkaiciu(nariai[0], scanner, "pakartokite pirma skaiciu");
                    antras = gautiKorektiskaSkaiciu(nariai[2], scanner, "pakartokite antra skaiciu");
                    System.out.println("Suma " + calculator.suma(pirmas, antras));
                    break;
                case "-":
                    pirmas = gautiKorektiskaSkaiciu(nariai[0], scanner, "pakartokite pirma skaiciu");
                    antras = gautiKorektiskaSkaiciu(nariai[2], scanner, "pakartokite antra skaiciu");
                    System.out.println("Skirtumas " + calculator.skirtumas(pirmas, antras));
                    break;
                case "*":
                    pirmas = gautiKorektiskaSkaiciu(nariai[0], scanner, "pakartokite pirma skaiciu");
                    antras = gautiKorektiskaSkaiciu(nariai[2], scanner, "pakartokite antra skaiciu");
                    System.out.println("Sandauga " + calculator.sandauga(pirmas, antras));
                    break;
                    default:
                        System.out.println("nera tokio veiksmo");
            }
        }else {
            System.out.println("neteisingai ivesti duomenys");
        }
    }
}
