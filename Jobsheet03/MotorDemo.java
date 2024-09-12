package Jobsheet03;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        int kecepatanBaru = 50;
        if (!motor1.isMesinOn && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840";
        motor2.isMesinOn = true;
       kecepatanBaru = 40;
       if (!motor2.isMesinOn && kecepatanBaru > 0){
                System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            } else {
                motor1.kecepatan = kecepatanBaru;
        }
        motor2.displayStatus();

        Motor motor3 = new Motor();
        kecepatanBaru = 60;
        if (!motor3.isMesinOn && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        motor3.displayStatus();
    } 
}
