package tugas;
import java.util.ArrayList;

public class Produk {
    private String namaProduk;
    private int harga;
    private String kategori;
    private ArrayList<Order> orders;

    public Produk(String namaProduk, int harga, String kategori) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.kategori = kategori;
        this.orders = new ArrayList<>();
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String infoProduk() {
        return "Produk: " + namaProduk + ", Harga: " + harga + ", Kategori: " + kategori;
    }
}
