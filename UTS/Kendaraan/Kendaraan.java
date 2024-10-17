package Kendaraan;

public class Kendaraan {
    private String merk;
    private String tahun;
    private String warna;

    public Kendaraan(String merk, String tahun, String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " +tahun);
        System.out.println("Warna: " + warna);
    }
}
