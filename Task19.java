import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Nauja {
    public String  tekstas;

    public Nauja(String  tekstas1){
        this.tekstas = tekstas1;
        List<Double> skaiciai = skaitytiISarasa(getTekstas());
        spausdinti(skaiciai);
        skaciuotiSuma(skaiciai);

    }
    private String getTekstas() {
        return tekstas;
    }

    private static List<Double> skaitytiISarasa(String tekstas2){
        List<Double> list = new ArrayList<>();
        String eilute;
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(tekstas2));
            while ((eilute = bufferedReader.readLine()) != null){
                list.add(Double.parseDouble(eilute));
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void spausdinti(List<Double> list){
        list.forEach(System.out::println);
    }

    private static void skaciuotiSuma(List<Double> list){
        double suma = 0;
        for (int i = 0; i < list.size(); i++){
            suma = list.stream().mapToDouble(f -> f).sum();
        }
        System.out.println("Suma yra "+suma);
    }
}
