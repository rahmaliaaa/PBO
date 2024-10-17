package Jobsheet03;

public class Motor{
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public String getPlatNomor(){ //tambahan
        return platNomor; 
    }
    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
    public boolean isMesinOn(){
        return isMesinOn;
    }
    public void setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepatan){
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) { //modifikasi no 4
            System.out.println("Kecepatan tidak boleh lebih dari 100");
        } else if (kecepatan < 0) {//modifikasi no 5
            System.out.println("Kecepatan tidak boleh negatif");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus () {
        System. out.println ("Plat Nomor: " + this.platNomor) ;

        if (isMesinOn) {
        System. out.println ("Mesin On") ;
        }
        else{
        System. out.println ("Mesin Off");
        }

        System. out.println ("System. out.println: " + this.kecepatan);
        System.out.println("====================================");
    }
}