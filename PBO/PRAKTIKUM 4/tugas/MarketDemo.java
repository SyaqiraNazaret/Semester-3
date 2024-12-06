package tugas;
import java.util.Date;

public class MarketDemo {
    public static void main(String[] args) {
        // Membuat produk baru
        Produk produk1 = new Produk("Laptop", 10000000, "Elektronik");
        Produk produk2 = new Produk("Mouse", 150000, "Aksesoris");
        Date tanggal = new Date();

        // Membuat order baru
        Order order1 = new Order(new Date(), "123");
        Order order2 = new Order(new Date(), "456");

        // Membuat order detail
        OrderDetail detail1 = new OrderDetail(produk1, new Date(), 2);
        OrderDetail detail2 = new OrderDetail(produk2, new Date(), 1);
        OrderDetail detail3 = new OrderDetail(produk2, new Date(), 1);

        // Menambahkan order detail ke order
        order1.setTanggal(new Date());
        System.out.println(order1.infoOrder());

        // Menampilkan informasi produk
        System.out.println(produk1.infoProduk());
        System.out.println(produk2.infoProduk());

        System.out.println(detail1.infoOrderDetail());
        System.out.println(detail2.infoOrderDetail());
        
        System.out.println("------------------------------------------------------------------");
        order2.setTanggal(new Date());
        order2.getTanggalOrder();
        System.out.println(order2.infoOrder());

        // Menampilkan informasi produk
        System.out.println(produk2.infoProduk());
        System.out.println(detail3.infoOrderDetail());
    }
}

