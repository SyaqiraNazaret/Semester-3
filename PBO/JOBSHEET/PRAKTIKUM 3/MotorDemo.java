public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayInfo();

        //Percobaan 1
        // motor1.platNomor = "B 0838 XZ";
        // motor1.kecepatan = 50;
        // motor1.displayInfo();

        // Modifikasi Pengecekan kecepatan 
    //     motor1.platNomor = "B 0838 XZ";
    //     int kecepatanBaru = 50;
    //     if (!motor1.isMesinOn && kecepatanBaru > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
    //     }
    //     else{
    //         motor1.kecepatan = kecepatanBaru;
    //     }
    //     motor1.displayInfo();

        Motor motor2 = new Motor();
    //     motor2.platNomor = "N 9840 AB";
    //     motor2.isMesinOn = true;
    //     // motor2.kecepatan = 40;
    //     // motor2.displayInfo();
    
        //Modifikasi 
    //     kecepatanBaru = 40;
    //     if (!motor2.isMesinOn && kecepatanBaru > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
    //     }
    //     else{
    //         motor2.kecepatan = kecepatanBaru;
    //     }
    //     motor2.displayInfo();

        Motor motor3 = new Motor();
    //     motor3.platNomor = "D 1234 CV";
    //     // motor3.kecepatan = 60;
    //     // motor3.displayInfo();

        //Modifikasi 
    //     kecepatanBaru = 60;
    //     if (!motor3.isMesinOn && kecepatanBaru > 0){
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
    //     }
    //     else{
    //         motor3.kecepatan = kecepatanBaru;
    //     }
    //     motor3.displayInfo();

    //Percobaan 2 
    motor1.setPlatNomor("B 0838");
    motor1.setKecepatan(50);
    motor1.displayInfo();

    motor2.setPlatNomor("N 9840 AB");
    motor2.setMesinOn(true);
    motor2.setKecepatan(-2);
    motor2.displayInfo();

    motor3.setPlatNomor("D 8343 CV");
    motor3.setKecepatan(60);
    motor3.displayInfo();
    }
}

