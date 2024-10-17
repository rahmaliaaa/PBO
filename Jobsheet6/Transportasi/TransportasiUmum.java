package Transportasi;
import java.util.ArrayList;

class TransportasiUmum {
    public String jenisTransportasi;
    public int kapasitas;
    public ArrayList<String> rute;

    public TransportasiUmum(String jenisTransportasi, int kapasitas, ArrayList<String> rute) {
        this.jenisTransportasi = jenisTransportasi;
        this.kapasitas = kapasitas;
        this.rute = rute;
    }
    public String getInfo() {
        return "Jenis Transportasi: " + jenisTransportasi + "\n" + "Kapasitas: " + kapasitas;
    }
    public void getRute(String rute) {
        System.out.println("Rute: " + rute);
    }
}
