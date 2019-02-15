   /*
  Parašyti metodą kuris patikrina ar per parametrus paduotame žodyje yra raidžių derinių “ab”.
  Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0.
  Užuomina: radus “a” raidę, tikrinti ar tai nėra paskutinė žodžio raidė, ir jeigu ne,
  tuomet tikrinti ar sekanti raidė (i + 1) yra “b”.
 */

import java.util.Scanner;

public class Vienuolika {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite zodi");
        String zodis = scanner.nextLine();
        int res = yraAB(zodis);
        switch (res){
            case 0:
                System.out.println("zodis ivestas netinkamai");
                break;
            case 1:
                System.out.println("raidziu derinys ab zodyje yra");
                break;
            case 2:
                System.out.println("raidziu derinio ab zodyje nera ");
                break;
        }
    }

    private static int yraAB(String zodis) {
        int result = 0;
        for (int i = 0; i < zodis.length(); i++){
            char raide = zodis.charAt(i);
            if(!Character.isLetter(raide)){
                result = 0;
                break;
            }else if (raide == 'a' && i < zodis.length()){
                if (zodis.charAt(i + 1) == 'b'){
                    result = 1;
                    break;
                }
            }else{
                result = 2;
            }
        }
        return result;
    }
}
