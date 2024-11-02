package tugas;
import java.util.Date;

public class OrderDetail {
    private Produk namaProduk;
    private Date tanggal;
    private int jumlah;

    public OrderDetail(Produk namaProduk, Date date, int jumlah) {
        this.namaProduk = namaProduk;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
    }
    public double getSubtotal(double hargaPerUnit) {
        return jumlah * hargaPerUnit;
    }
    public int getJumlah() {
        return jumlah;
    }
    public Produk getProduk() {
        return namaProduk;
    }
    public void setProduk(Produk namaProduk) {
        this.namaProduk = namaProduk;
    }
    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public String infoOrderDetail() {
        
            String info = "";
            info += "\nDetail " + namaProduk.infoProduk();
            info += "\nJumlah: " + jumlah;
            info += "\n";
            return info;
        }
    }

