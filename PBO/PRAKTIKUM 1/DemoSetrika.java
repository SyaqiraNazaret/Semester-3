public class DemoSetrika {
    public static void main(String[] args) {
        Setrika strk1 = new Setrika();
        Setrika strk2 = new Setrika();

        strk1.merk = "Panasonic";
        strk1.warna = "Merah";
        strk1.jenis = "Listrik";
        strk1.nyalakan();
        System.out.println();
        strk1.cetakInfo();
        System.out.println();
        strk1.tambahSuhu(20);
        strk1.kurangiSuhu(30);
        System.out.println();
        strk1.matikan();
        System.out.println();

        strk2.merk = "Philips";
        strk2.warna = "Hitam";
        strk2.jenis = "Uap";
        strk2.nyalakan();
        strk2.cetakInfo();
        System.out.println();
        strk2.tambahSuhu(10);
        strk2.kurangiSuhu(40);
        System.out.println();
        strk2.matikan();
    }
}