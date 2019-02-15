/*
Faile surašyti žmonių vardai. Parašyti programą kuri juos nuskaitytų ir atvaizduotų ekrane.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dvylika {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            File file = new File("src\\vardai.txt");
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
