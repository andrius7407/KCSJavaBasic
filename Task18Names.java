import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class Vardai {

    public String text;

    public Vardai(String tekstas) {
        this.text = tekstas;
        List<String> vard = skaitytiRasyti(getText());
        spausdinti(vard);
    }

    public String getText() {
        return text;
    }

    public List<String> skaitytiRasyti(String tekstas) {
        List<String> vardai = new LinkedList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(tekstas));
            String eilute;
            while ((eilute = reader.readLine()) != null){
                vardai.add(eilute);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return vardai;
    }

    public void spausdinti(List<String> vardai) {
        vardai.forEach(System.out::println);
    }
}
