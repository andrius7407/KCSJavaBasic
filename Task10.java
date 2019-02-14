/*
Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra raidžių “a”.
Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne, grąžinti 0.
 */

import java.util.Scanner;

public class Desimt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite zodi");
        String zodis = scanner.nextLine();
        System.out.println(countALetters(zodis));
    }

    private static int countALetters(String zodis) {
        int aRaidziuSkaicius = 0;
        for (int i = 0; i < zodis.length(); i++){
            char raide = zodis.charAt(i);
            if(!Character.isLetter(raide)){
                break;
            }else if(raide == 'a'){
                aRaidziuSkaicius++;
            }
        }
        return aRaidziuSkaicius;
    }
}
