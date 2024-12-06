public class AlatElektronikDemo {
    public static void main(String[] args) {
        //instansiasi objek dari setiap class 
        Kipas K1 = new Kipas("Dinding", 200000, "Pink", "Panasonic");
        TV tv = new TV("LED", 20, 3000000, "Hitam", "Samsung");
        Kulkass kulkas = new Kulkass(2, 4000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(10, 3, 7000000, "Putih", "Samsung");

        // Menampilkan informasi dari setiap objek
        System.out.println("Kipas \n" + K1.getInfo());
        System.out.println("\nTV \n" + tv.getInfo());
        System.out.println("\nKulkas \n" + kulkas.getInfo());
        System.out.println("\nSmart Fridge \n" + smartFridge.getInfo());
    }
}
