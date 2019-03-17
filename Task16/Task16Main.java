/*
16.  Faile surašyti žmonių vardai. Sukurti klasę kuri turėtų metodą failo nuskaitymui ir nuskaitytų vardų atvaizdavimui.
 */
public class Sesiolika {

    public static void main(String[] args) {

        Vardai vardai = new Vardai();
        vardai.skaitytiEilute("src\\vardai.txt");
    }
}
