package tugas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date tanggal;
    private String idOrder;
    private ArrayList<Produk> orderDetails;

    public Order(Date tanggal, String idOrder) {
        this.tanggal = tanggal ;
        this.idOrder = idOrder;
        this.orderDetails = new ArrayList<>();
    }
    public Date getTanggalOrder() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public String getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }
    public void addProduk(Produk produk) {
        orderDetails.add(produk); //digunakan untuk untuk menambahkan objek produk kedalam list orderdetails
    }
    public String infoOrder() {
        return "Order ID: " + idOrder + ", Tanggal: " + tanggal;
    }
}

