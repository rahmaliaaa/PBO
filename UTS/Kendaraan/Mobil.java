package Kendaraan;
public class Mobil extends Kendaraan {
    private String tipeMesin;
    private String bahanBakar;

    public Mobil(String merk, String tahun, String warna, String tipeMesin, String bahanBakar) {
        super(merk, tahun, warna);
        this.tipeMesin = tipeMesin;
        this.bahanBakar = bahanBakar;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe Mesin: " + tipeMesin);
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
}
