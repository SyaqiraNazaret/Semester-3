public class Setrika {
    public String merk;
    public String warna;
    public int suhu = 100;
    public String jenis;

public void nyalakan(){
    System.out.println("Setrika "+merk+" telah diaktifkan");
}
public void matikan(){
    System.out.println("Setrika "+merk+" telah dimatikan");
}
public int tambahSuhu(int increment){
    suhu += increment;
    System.out.println("Suhu meningkat menjadi: " + suhu + " derajat");
    return suhu;
}
public int kurangiSuhu(int decrement){
    suhu -= decrement;
    System.out.println("Suhu menurun menjadi: " + suhu + " derajat");
    return suhu;
}
public void cetakInfo(){
    System.out.println("-= Informasi Setrika =-");
    System.out.println("Merk        : "+merk);
    System.out.println("Warna       : "+warna);
    System.out.println("Jenis       : "+jenis);
    System.out.println("Suhu awal   : "+suhu + " derajat");
}
}
