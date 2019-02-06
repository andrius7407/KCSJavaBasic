/* Parasykite metodą kuris per parametrus paimtu du masyvus [1,2,3,4] ir [a,b,c,d]
ir kaip rezultatą grąžintu [1,a,2,b,3,c,4,d].
 */
 
public class Uzduotis6 {
    public static void main(String[] args) {
        String[] skaiciai = {"1","2","3","4"};
        String[] raides = {"a","b","c","d"};
        
        String[] mas = sujungiamMasyvus(skaiciai,raides);
        System.out.println(String.join(",",mas));
    }


    public static String[] sujungiamMasyvus (String[] sk, String[] raid){
        int n = sk.length + raid.length;
        String [] masyvas = new String [n];
        
        for (int i = 0; i < n; i++){
            if((i%2) == 0){
                masyvas[i] = sk[(i/2)];
            }else {
                masyvas[i] = raid[(i/2)];
            }
        }
        return masyvas;
    }
}
