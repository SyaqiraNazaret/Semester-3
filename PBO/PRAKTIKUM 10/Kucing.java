public class Kucing extends HewanTugas implements AudibleHewan {
    private String jenisBulu;

    public Kucing(int umur, String makanan, String jumlahKaki, String jenisBulu) {
        super(umur, makanan, jumlahKaki);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Kucing mengeong: Meow!");
    }

    public String getInfo(){
        return "Jenis Bulu : " + jenisBulu;
    }
}