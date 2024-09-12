public class Speaker {
    private String merek;
    private String warna;
    private int volume;
    private int stok;

    public void setMerek(String newValue) {
        merek = newValue;
    }
    public void setWarna(String newValue) {
        warna = newValue;
    }
    public void aturVolume(int newVolume) {
        volume = newVolume;
    }
    public int updateStok(int increment){
        return stok = stok + increment;
    }
    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Volume: " + volume);
        System.out.println("Stok : " + stok);
        System.out.println("---------------------------");
    }
}