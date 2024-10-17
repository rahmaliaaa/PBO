package Kendaraan;

import java.util.Scanner;

public class Sedan extends Mobil {
    private double harga;
    private String type;

    // Konstruktor
    public Sedan(String merk, String tahun, String warna, String tipeMesin, String bahanBakar, 
                double harga, String type) {
        super(merk, tahun, warna, tipeMesin, bahanBakar);
        this.harga = harga;
        this.type = type;
    }

    // Getter dan Setter
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method untuk input data sedan
    public void inputData(Scanner sc) {
        System.out.print("Merk: ");
        setMerk(sc.nextLine());

        System.out.print("Tahun: ");
        setTahun(sc.nextLine());

        System.out.print("Warna: ");
        setWarna(sc.nextLine());

        System.out.print("Tipe Mesin: ");
        setTipeMesin(sc.nextLine());

        System.out.print("Bahan Bakar: ");
        setBahanBakar(sc.nextLine());

        System.out.print("Harga: ");
        setHarga(Double.parseDouble(sc.nextLine()));  // Parsing input String ke double

        System.out.print("Tipe: ");
        setType(sc.nextLine());
    }

    // Method untuk menampilkan informasi sedan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Harga: Rp" + harga);
        System.out.println("Tipe: " + type);
    }
}
