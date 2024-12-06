public class Televisi extends BarangElektronik{
    public int ukuranLayar;

    public Televisi(int ukuranLayar, String merk, String daya){
        super(merk, daya);
        this.ukuranLayar = ukuranLayar;
    }
    @Override
    public void nyalakan(){
        System.out.println("Tekan Tombol power pada Remote");
        System.out.println("Pilih Channel");
    }
    @Override
    public void matikan(){
        System.out.println("Tekan Tombol power off pada Remote");
    }
    public void cetakInfo(){
        System.out.println("Ukuran Layar : " + this.ukuranLayar);
    }
}
