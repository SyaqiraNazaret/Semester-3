public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa ml = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();

        ml.nim = "023432";
        ml.nama = "Yansy Ayuningtyas";
        ml.alamat = "Nias, Sumatera Utara";
        ml.kelas = "2A";
        //soal 
        m2.nim = "023433";
        m2.nama = "Izzatir Rofi'ah";
        m2.alamat = "Blitar, Jawa Timur";
        m2.kelas = "2E";

        m3.nim = "023434";
        m3.nama = "Queenadhynar Azarine";
        m3.alamat = "Probolinggo, Jawa Timur";
        m3.kelas = "2B";

        ml.displayBiodata();
        //soal 
        System.out.println();
        m2.displayBiodata();
        System.out.println();
        m3.displayBiodata();
    }
}
