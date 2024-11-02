public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("1113334444", "Donny", 5000000);

        System.out.println("Nama Anggota " + anggota1.getNama());
        System.out.println("Limit Pinjaman " +anggota1.getLimitPeminjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjaman(10000000);
        System.out.println("Jumlah pinjaman saat ini: " +anggota1.getPeminjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjaman(4000000);
        System.out.println("Jumlah pinjaman saat ini: " +anggota1.getPeminjaman());

        System.out.println("\nMembayar angsuran 50.000");
        anggota1.angsuran(50000);

        System.out.println("Jumlah pinjaman saat ini: " +anggota1.getPeminjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsuran(3000000);
        System.out.println("Jumlah pinjam saat ini: " +anggota1.getPeminjaman());
    }
}
