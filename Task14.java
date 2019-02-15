/*
Parašyti metodą kuris per parametrus pasiimtų tekstą ir per grąžinamą reikšmę praneštų ar jame yra žodis “labas”.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Keturiolika {

    public static int arYraZodisLabas (String fileName) throws IOException {
        int rezultatas;
        String visasTekstas = new String(Files.readAllBytes(Paths.get(fileName)));
        String ieskoti = "labas";
        if (visasTekstas.indexOf(ieskoti) != -1){
            rezultatas = 1;
        }else {
            rezultatas = 0;
        }
        return rezultatas;
    }
    
    public static void main(String[] args)throws Exception {
        int rezultatas = arYraZodisLabas("src\\tekstas.txt");

        if (rezultatas == 1){
            System.out.println("yra");
        }else {
            System.out.println("nera");
        }
    }
}
