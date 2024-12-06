public class Dosen26 extends Pegawaii implements Comparable<Dosen26>{
    public String nidn;

    public Dosen26(){

    }
    public Dosen26(String nip, String nama, String nidn){
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("NIDN : " + nidn);
    }

    public void mengajar(){
        System.out.println("Membuat rencana Pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

    @Override
    public int compareTo(Dosen26 otherDosen26) {
        return this.nama.compareTo(otherDosen26.nama);
    }
}