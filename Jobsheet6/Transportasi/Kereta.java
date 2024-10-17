package Transportasi;
import java.util.ArrayList;

class Kereta extends TransportasiUmum {
    private String destinasiTujuan;
    private int jumlahGerbong;
    private String kelas;

    public Kereta(String jenisTransportasi, int kapasitas, ArrayList<String> rute, String destinasiTujuan, int jumlahGerbong, String kelas) {
        super(jenisTransportasi, kapasitas, rute);
        this.destinasiTujuan = destinasiTujuan;
        this.jumlahGerbong = jumlahGerbong;
        this.kelas = kelas;
    }
    public void setKelas(String newKelas) {
        this.kelas = newKelas;
    }
    public String getKelas() {
        return kelas;
    }
    public void setDestinasiTujuan(String newTujuan) {
        this.destinasiTujuan = newTujuan;
    }
    public String getDestinasiTujuan() {
        return destinasiTujuan;
    }
    @Override
    public String getInfo() {
        return super.getInfo() +"\n"+ "Destinasi Tujuan: " + destinasiTujuan +"\n"+ "Jumlah Gerbong: " + jumlahGerbong +"\n"+ "Kelas: " + kelas;
    }
}

