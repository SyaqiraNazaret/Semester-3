import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    //atribut untuk menyimpan data riwayat konsultasi
    private ArrayList<Konsultasi> riwayaKonsultasi;


    public String getNoRekamMedis(){
        return noRekamMedis;
    }
    public void setNoRekamMedis(){
        this.noRekamMedis = noRekamMedis;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //Konstruktor Berparameter
    public Pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayaKonsultasi =  new ArrayList<Konsultasi>();
    }
    public String getInfo() {
        String info = "";
        info += "No Rekam Medis : " + noRekamMedis + "\n";
        info += "Nama           : " + nama + "\n";
        
        //mengembalikan info pasien dan daftar konsultasi yang pernah dilakukan
        if (!riwayaKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";
            
            for (Konsultasi konsultasi : riwayaKonsultasi) {
                info += konsultasi.getInfo();
            }
        } 
        else{
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";
        return info;
    }
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat){
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayaKonsultasi.add(konsultasi);
    }
}
