public class HewanDemo{
    public static void main(String[] args) {
        // Membuat objek dari masing-masing class
        Burung burung = new Burung(2, "Biji-bijian", "2", "Sayap panjang");
        Ikan ikan = new Ikan(1, "Plankton", "0", "Sirip kecil");
        Kucing kucing = new Kucing(3, "Daging", "4", "Bulu pendek");

        System.out.println("=== Informasi Hewan ===");
        System.out.println("Burung:");
        System.out.println("Umur: " + burung.getUmur() + " tahun");
        System.out.println("Makanan: " + burung.getMakan());
        System.out.println("Jumlah Kaki: " + burung.getJumlahKaki());
        System.out.println("Jenis Sayap: " + burung.getJenisSayap());
        burung.mengeluarkanSuara();

        System.out.println("\nIkan:");
        System.out.println("Umur: " + ikan.getUmur() + " tahun");
        System.out.println("Makanan: " + ikan.getMakan());
        System.out.println("Jumlah Kaki: " + ikan.getJumlahKaki());
        System.out.println("Jenis Sirip: " + ikan.getJenisSirip());
        ikan.mengeluarkanSuara();

        System.out.println("\nKucing:");
        System.out.println("Umur: " + kucing.getUmur() + " tahun");
        System.out.println("Makanan: " + kucing.getMakan());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());
        System.out.println("Jenis Bulu: " + kucing.getJenisBulu());
        kucing.mengeluarkanSuara();
    }

}
