package Apotek;

public class Obat {
    private String kodeObat;
    private String namaObat;
    private double harga;
    private int stok;

    public Obat(String kodeObat, String namaObat, double harga, int stok) { //constructor
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKodeObat() {
        return kodeObat;
    }
    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }
    public String getNamaObat() {
        return namaObat;
    } 
    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
}