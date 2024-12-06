import testPackage.Pegawai;
public class Dosen extends Pegawai {
    //percobaan 2
    public String nidn;
    
    public Dosen(){
        // System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }
    //Percobaan 7 
    public Dosen(String nip, String nama, double gaji, String nidn){
        super(nip, nama, gaji);
        this.nidn = nidn;
        // super.nip = nip;
        // super.nama = nama;
        // super.gaji = gaji;
    }

    // public Dosen(String nip, String nama, double gaji, String nidn){
    //     System.out.println("Objek dari class Dosen dibuat dengan construktor berparameter");
    // }

    // public String getInfo(){
    //     return "NIDN    : " + this.nidn + "\n";
    // }
    //Percobaan 4
    // public String getAllInfo(){
    //     String info = "";
    //     info += "NIP: " + super.nip + "\n";
    //     info += "Nama: " + super.nama + "\n";
    //     info += "Gaji: " + super.gaji + "\n";
    //     info += "NIDN: " + this.nidn + "\n";

    //     return info;
    // }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN: " + this.nidn;
        return info;
    }
}
