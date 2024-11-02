public class Kulkas extends BarangElektronik {
    private int kapasitas;  

    public Kulkas() {
        
        System.out.println("Detail Kulkas");
    }

    public Kulkas(String merk, String model, double harga, int kapasitas) {
        super(merk, model, harga);  
        this.kapasitas = kapasitas;
    }

    public String getAllInfo(){
        String info = super.getInfoBarang();
        info += "Kapasitas isi: " + this.kapasitas + "\n";

        return info;
    }
}
