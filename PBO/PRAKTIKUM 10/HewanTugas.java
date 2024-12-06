public class HewanTugas {
    private int umur;
    private String makanan;
    private String jumlahKaki;

    public HewanTugas(int umur, String makanan, String jumlahKaki) {
        this.umur = umur;
        this.makanan = makanan;
        this.jumlahKaki = jumlahKaki;
    }

    public int getUmur() {
        return umur;
    }

    public String getMakan() {
        return makanan;
    }

    public String getJumlahKaki() {
        return jumlahKaki;
    }

    public String getInfo(){
        return "Umur : " + umur +"tahun\n" + "Makanan : " + makanan + "\nJumlah Kaki : " + jumlahKaki;
    }
}
