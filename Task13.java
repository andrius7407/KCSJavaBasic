/*
Faile surašyti žmonių vardai.
Parašyti programą kuri juos nuskaitytų ir atvaizduotų tik tuos vardus kurie prasideda raide ‘A’.
*/

import java.io.*;

public class Trylika {
 
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            File file = new File("src\\vardai.txt");
            bufferedReader = new BufferedReader(new FileReader(file));
            String eilute;
            while ((eilute = bufferedReader.readLine()) != null){
                eilute = eilute.toUpperCase();
                if(eilute.charAt(0) == 'A'){
                    System.out.println(eilute);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
