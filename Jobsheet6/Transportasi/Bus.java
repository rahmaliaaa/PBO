package Transportasi;
import java.util.ArrayList;

class Bus extends TransportasiUmum {
    private String tipeBus;
    private int jumlahRute;

    public Bus(String jenisTransportasi, int kapasitas, ArrayList<String> rute, String tipeBus, int jumlahRute) {
        super(jenisTransportasi, kapasitas, rute);
        this.tipeBus = tipeBus;
        this.jumlahRute = jumlahRute;
    }

    public void setTipeBus(String newType) {
        this.tipeBus = newType;
    }

    public String getTipeBus() {
        return tipeBus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"\n"+ "Tipe Bus: " + tipeBus +"\n"+ "Jumlah Rute: " + jumlahRute;
    }
}

