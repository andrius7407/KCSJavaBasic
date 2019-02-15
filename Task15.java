/* 
Parašyti metodą, kuris per parametrus pasiimtų tekstą ir per grąžinamą reikšmę praneštų kiek jame yra atskirų žodžių.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Penkiolika {
    
    public static int kiekTeksteZodziu(String fileName)throws IOException{
        int kiekZodziu = 0;
        
        BufferedReader bufferedReader = null;
        try {
            File file = new File(fileName);
            bufferedReader = new BufferedReader(new FileReader(file));
            
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if(!line.trim().isEmpty()){
                String []eilute = line.split(" ");
                    kiekZodziu = kiekZodziu + eilute.length;
                }
            }
            
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return kiekZodziu;
    }
    
    public static void main(String[] args) throws IOException {
        int kiekZodziu = kiekTeksteZodziu("src\\tekstas.txt");
        System.out.println(kiekZodziu);
    }
}
