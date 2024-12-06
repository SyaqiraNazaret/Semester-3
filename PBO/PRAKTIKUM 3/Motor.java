public class Motor {
    //Percobaan 1
    // public String platNomor;
    // public boolean isMesinOn;
    // public int kecepatan;

    //Percobaan 2
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    //Percobaan 1
    public void displayInfo(){
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " +(this.isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==========================");
    }

    //Percobaan 2 
    public String getPlatNomor(){
        return platNomor;
    }
    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
    public boolean getIsMesinOn(){
        return isMesinOn;
    }
    public void setMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }
    public int kecepatan(){
        return kecepatan;
    }
    // public void setKecepatan(int kecepatan){
    //     this.kecepatan = kecepatan;
    // }
    public void setKecepatan (int kecepatan){
        
        if(!this.isMesinOn && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
        }
        //modifikasi tugas
        else if(this.isMesinOn && kecepatan > 100){
            System.out.println("Kecepatan maksimal adalah 100 jika mesin On");
        }
        else if(kecepatan < 0){
            System.out.println("kecepatan tidak boleh kurang dari 0 ketika mesin On ataupun Off");
        }
        else {
            this.kecepatan = kecepatan;
        }
    }
}