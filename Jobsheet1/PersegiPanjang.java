public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void displayInfo(){
        System.out.println("Panjang    : " + panjang);
        System.out.println("Lebar      : " + lebar);
        System.out.println("Luas       : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
    public double getLuas(){
        return panjang * lebar;
    }
    public double getKeliling(){
        return 2 * (panjang + lebar);
    }
}
 