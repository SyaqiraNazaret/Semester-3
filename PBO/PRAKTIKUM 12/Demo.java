import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen26 dosen1 = new Dosen26("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);
    }
        //Polymorphic Arguments & instanceOff
        public static void train(Pegawaii pegawaii){
            // System.out.println("Memberikan pelatihan untuk pegawai");
            pegawaii.displayInfo();
            System.out.println("Mengenalkan lingkungan kampus");
            System.out.println("Menginfokan SOP/Juknis");

            // if (pegawaii instanceof Dosen26) {
            //     System.out.println("Memberikan Pelatihan Pedagogik");
            // }

            if (pegawaii instanceof Dosen26) { 
                Dosen26 dosen = (Dosen26) pegawaii; 
                System.out.println("Downcasting berhasil ");
            }
        }

            //Hanya Test 
            // System.out.println(pegawaii.nidn);
            // System.out.println(pegawaii.kategori);
            // pegawaii.mengajar();
            // Pegawaii pegawaii1 = dosen1;
       

        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // pegawaii1.displayInfo();

        // Dosen26 newDosen = (Dosen26) pegawaii1;

        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        // newDosen.mengajar();

        // System.out.println(dosen1.nidn);
        // dosen1.mengajar();
        
        // // TenagaKependidikan test = (TenagaKependidikan) pegawaii1;

        // Dosen26 dosen2 = new Dosen26("19940201", "Muhammad, S.Kom, M.T" , "197001");
        // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T." , "Tenaga Laboratorium");

        // ArrayList<Pegawaii> daftarPegawai =  new ArrayList<Pegawaii>();
        
        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);

        // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    
}
