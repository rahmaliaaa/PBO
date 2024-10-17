package Transportasi;
import java.util.ArrayList;

public class DemoTransportasiUmum {
    public static void main(String[] args) {
        ArrayList<String> ruteKereta = new ArrayList<>();
        ruteKereta.add("Jakarta - Bandung");
        ruteKereta.add("Bandung - Surabaya");

        ArrayList<String> ruteBus = new ArrayList<>();
        ruteBus.add("Jakarta - Bogor");
        ruteBus.add("Bogor - Bandung");

        Kereta keretaApi = new Kereta("Kereta Api", 300, ruteKereta, "Surabaya", 10, "Eksekutif");
        System.out.println("Info Kereta:\n" + keretaApi.getInfo());

        keretaApi.setKelas("Bisnis");
        keretaApi.setDestinasiTujuan("Malang");
        System.out.println("\nInfo Kereta setelah modifikasi:\n" + keretaApi.getInfo());

        Bus busPariwisata = new Bus("Bus Pariwisata", 50, ruteBus, "Double Decker", 2);
        System.out.println("\nInfo Bus:\n" + busPariwisata.getInfo());

        busPariwisata.setTipeBus("Single Decker");
        System.out.println("\nInfo Bus setelah modifikasi:\n" + busPariwisata.getInfo());
    }
}
