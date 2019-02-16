import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vardai {

    public Vardai() {

    }

    public static void skaitytiEilute(String visasTekstas) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File(visasTekstas);
            bufferedReader = new BufferedReader(new FileReader(file));
            String eilute;
            while ((eilute = bufferedReader.readLine()) != null) {
                System.out.println(eilute);

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
    }
}
