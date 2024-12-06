public class BarangElektronik {
    public String merk;
    public String model;
    public double harga;

    public BarangElektronik() {
      System.out.println("Ini Barang Elektronik");
    }
    
    public BarangElektronik(String merk, String model, double harga) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
    }
    
    public String getInfoBarang() {
        String info = "";
        info += "Merk: " + merk + "\n";
        info += "Model: " + model + "\n";
        info += "Harga: " + harga + "\n";

        return info;
    }
}