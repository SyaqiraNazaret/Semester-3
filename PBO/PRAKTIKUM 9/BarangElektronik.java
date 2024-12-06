public abstract class BarangElektronik {
    public String merk;
    public String daya;

    public BarangElektronik(String merk, String daya){
        this.merk = merk;
        this.daya = daya;
    }

    public abstract void nyalakan();
    public abstract void matikan();

    public void getInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Daya : " + daya);
    }
}
