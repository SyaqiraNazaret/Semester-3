public class Burung extends HewanTugas implements AudibleHewan {
    private String jenisSayap;

    public Burung(int umur, String makanan, String jumlahKaki, String jenisSayap) {
        super(umur, makanan, jumlahKaki);
        this.jenisSayap = jenisSayap;
    }

    public String getJenisSayap() {
        return jenisSayap;
    }

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Burung berkicau: Tweet!");
    }

    public String getInfo(){
        return "Jenis Sayap : " + jenisSayap;
    }
}
