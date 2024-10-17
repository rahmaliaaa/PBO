package Apotek;

public class Supply {
    private Obat obat;
    private int jumlah;
    private double totalHarga;

    public Supply(Obat obat, int jumlah) { //constructor
        this.obat = obat;
        this.jumlah = jumlah; 
        this.totalHarga = obat.getHarga() * jumlah;
    }
    public void setObat(Obat obat) {
        this.obat = obat;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        this.totalHarga = obat.getHarga() * jumlah;
    }
    public double getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    public void prosesSupply() {
        obat.setStok(obat.getStok() + jumlah);
        System.out.println("Supply berhasil. Stok obat bertambah.");
    }
    public void getDisplayDetailSupply() {
        System.out.println("Obat: " + obat.getNamaObat());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + totalHarga);
    }
}
