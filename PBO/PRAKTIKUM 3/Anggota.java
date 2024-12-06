public class Anggota {
    public String nomorKtp;
    public String nama;
    public int limitPeminjaman;
    public int jumlahPinjaman;
    public int pinjaman;
    public int angsuran;
    public double minimumAngsuran;

    public Anggota(String nomorKtp, String nama, int limitPeminjaman){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }
    public String getNoKtp(){
        return nomorKtp;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPeminjaman(){
        return limitPeminjaman;
    }
    public int getPeminjaman(){
        return pinjaman;
    }
    public int getAngsuran(){
        return angsuran;
    }
    public void pinjaman(int jumlahPinjaman){
        if (this.pinjaman + jumlahPinjaman > limitPeminjaman){
            System.out.println("Maaf, jumlah peminjaman melebihi limit.");
        } else {
            this.pinjaman += jumlahPinjaman;
        }
    }
    public void angsuran (int angsuran){
        minimumAngsuran = pinjaman * 0.1;
        if (angsuran < minimumAngsuran) {
            System.out.println("Maaf angsuran hasrus 10% dari jumlah pinjaman"); 
        }
        else   this.pinjaman -= angsuran;
        if (this.pinjaman < 0){
            this.pinjaman = 0;
            }
        
        }
    }

