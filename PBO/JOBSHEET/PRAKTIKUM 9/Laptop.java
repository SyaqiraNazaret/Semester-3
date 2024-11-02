public class Laptop extends BarangElektronik {
    public String ram;

    public Laptop(String ram, String merk, String daya){
        super(merk, daya);
        this.ram = ram;
    }
    @Override
    public void nyalakan(){
        System.out.println("Tekan tombol power");
        System.out.println("jika menggunakan kunci pada laptop, maka buka kunci terlebih dahulu");
    }
    @Override
    public void matikan() {
        System.out.println("Tekan icon windows");
        System.out.println("Pilih shutdown");
        System.out.println("Tunggu beberapa detik");
    }
    public void cetakInfo(){
        System.out.println("Ram Laptop : " + ram);
    }
}
