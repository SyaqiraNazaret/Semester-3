public class Ikan extends HewanTugas implements AudibleHewan {
    private String jenisSirip;

    public Ikan(int umur, String makanan, String jumlahKaki, String jenisSirip) {
        super(umur, makanan, jumlahKaki);
        this.jenisSirip = jenisSirip;
    }

    public String getJenisSirip() {
        return jenisSirip;
    }

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Ikan membuat suara gelembung: Blub!");
    }

    public String getInfo(){
        return "Jenis Sirip : " + jenisSirip;
    }
}