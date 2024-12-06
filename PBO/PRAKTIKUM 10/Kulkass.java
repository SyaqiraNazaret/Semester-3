public class Kulkass extends AlatElektronik{
    private int jumlahPintu;

    public Kulkass(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return this.jumlahPintu;
    }

    public String getInfo(){
        return super.getInfo() + "\nJumlah Pintu : " +jumlahPintu;
    }
}

