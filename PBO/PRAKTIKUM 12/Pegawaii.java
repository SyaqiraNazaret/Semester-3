public class Pegawaii{
    public String nip;
    public String nama;

    public Pegawaii(){

    }
    public Pegawaii(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
    }
}
