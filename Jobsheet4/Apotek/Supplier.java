package Apotek;
import java.util.ArrayList;

public class Supplier {
    private String namaSupplier;
    private String alamat;
    private ArrayList<Obat> daftarObat;

    public Supplier(String namaSupplier, String alamat) {
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.daftarObat = new ArrayList<>(); 
    }
    public String getNamaSupplier() {
        return namaSupplier;
    }
    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public ArrayList<Obat> getDaftarObat() {
        return daftarObat;
    }
    public void setDaftarObat(ArrayList<Obat> daftarObat) { //array
        this.daftarObat = daftarObat; 
    }
    public void setObat(Obat obat) {
        this.daftarObat.add(obat);
    }
    public int getStokObatSupply() {
        int totalStok = 0;
        for (Obat obat : daftarObat) {
            totalStok += obat.getStok();
        } 
        return totalStok;
    }
}
