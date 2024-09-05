public class Speaker {
    private String merek;
    private String warna;
    private int volume;

    public void setMerek(String newValue) {
        merek = newValue;
    }
    public void setWarna(String newValue) {
        warna = newValue;
    }
    public void aturVolume(int newVolume) {
        volume = newVolume;
    }
    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Volume: " + volume);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Speaker spk1 = new Speaker();
        Speaker spk2 = new Speaker();
        Speaker spk3 = new Speaker();
        Speaker spk4 = new Speaker();
        Speaker spk5 = new Speaker();
        Speaker spk6 = new Speaker();
        Speaker spk7 = new Speaker();
        Speaker spk8 = new Speaker();
        Speaker spk9 = new Speaker();
        Speaker spk10 = new Speaker();

        spk1.setMerek("Sony");
        spk1.setWarna("Hitam");
        spk1.aturVolume(4);
        spk1.cetakStatus();

        spk2.setMerek("JBL");
        spk2.setWarna("Putih");
        spk2.aturVolume(2);
        spk2.cetakStatus();

        spk3.setMerek("JETE");
        spk3.setWarna("Abu-abu");
        spk3.aturVolume(5);
        spk3.cetakStatus();

        spk4.setMerek("Bose");
        spk4.setWarna("Biru");
        spk4.aturVolume(5);
        spk4.cetakStatus();

        spk5.setMerek("Robot");
        spk5.setWarna("Hitam");
        spk5.aturVolume(5);
        spk5.cetakStatus();

        spk6.setMerek("Harman Kardon");
        spk6.setWarna("Putih");
        spk6.aturVolume(3);
        spk6.cetakStatus();

        spk7.setMerek("Logitech");
        spk7.setWarna("Abu-abu");
        spk7.aturVolume(9);
        spk7.cetakStatus();

        spk8.setMerek("Sonos");
        spk8.setWarna("Hijau");
        spk8.aturVolume(10);
        spk8.cetakStatus();

        spk9.setMerek("Marshall Emberton");
        spk9.setWarna("Putih");
        spk9.aturVolume(4);
        spk9.cetakStatus();

        spk10.setMerek("Tribit");
        spk10.setWarna("Hitam");
        spk10.aturVolume(3);
        spk10.cetakStatus();
    }
}