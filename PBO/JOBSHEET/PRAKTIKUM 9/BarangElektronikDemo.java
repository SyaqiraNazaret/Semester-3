public class BarangElektronikDemo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("8", "Asus", "30");
        laptop1.cetakInfo();
        laptop1.nyalakan();
        laptop1.matikan();

        System.out.println();
        
        Televisi televisi1 = new Televisi(32, "Samsung", "48");
        televisi1.cetakInfo();
        televisi1.nyalakan();
        televisi1.matikan();
    }
}
