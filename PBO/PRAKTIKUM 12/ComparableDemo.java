import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Dosen26> daftarDosen = new ArrayList<>();
        daftarDosen.add(new Dosen26("321", "Bella", "0091"));
        daftarDosen.add(new Dosen26("123", "Adila", "0081"));
        daftarDosen.add(new Dosen26("231", "Petrus", "0071"));

        Collections.sort(daftarDosen);

        for (Dosen26 dosen : daftarDosen) {
            dosen.displayInfo();
        }
    } 
}
