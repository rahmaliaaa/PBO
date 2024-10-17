package Apotek;
import java.util.Scanner;

public class ApotekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier supplier = null;

        // Input data supplier
        System.out.print("Masukkan nama supplier: ");
        String namaSupplier = scanner.nextLine();
        System.out.print("Masukkan alamat supplier: ");
        String alamatSupplier = scanner.nextLine();
        supplier = new Supplier(namaSupplier, alamatSupplier);

        // Menambahkan dua objek obat secara langsung
        Obat obat1 = new Obat("001", "Paracetamol", 5000.0, 100);
        Obat obat2 = new Obat("002", "Amoxicillin", 12000.0, 50);

        supplier.setObat(obat1); // Tambahkan obat ke daftar supplier
        supplier.setObat(obat2); // Tambahkan obat ke daftar supplier

        // Menampilkan detail obat yang telah ditambahkan
        System.out.println("\nObat yang tersedia dari supplier:");
        for (Obat o : supplier.getDaftarObat()) {
            System.out.println("Kode Obat: " + o.getKodeObat());
            System.out.println("Nama Obat: " + o.getNamaObat());
            System.out.println("Harga Obat: " + o.getHarga());
            System.out.println("Stok Obat: " + o.getStok());
            System.out.println();
        }

        // Input data obat tambahan dari supplier
        while (true) {
            System.out.print("Masukkan kode obat (atau ketik 'selesai' untuk mengakhiri): ");
            String kodeObat = scanner.nextLine();
            if (kodeObat.equalsIgnoreCase("selesai")) break;

            System.out.print("Masukkan nama obat: ");
            String namaObat = scanner.nextLine();
            System.out.print("Masukkan harga obat: ");
            double harga = scanner.nextDouble();
            System.out.print("Masukkan stok obat: ");
            int stok = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            Obat obat = new Obat(kodeObat, namaObat, harga, stok);
            supplier.setObat(obat); // Tambahkan obat ke daftar supplier

            System.out.println("\nDetail Obat yang Baru Ditambahkan:");
            System.out.println("Kode Obat: " + obat.getKodeObat());
            System.out.println("Nama Obat: " + obat.getNamaObat());
            System.out.println("Harga Obat: " + obat.getHarga());
            System.out.println("Stok Obat: " + obat.getStok());

            System.out.print("\nApakah Anda ingin melihat semua data obat? (ya/tidak): ");
            String lihatSemuaData = scanner.nextLine();
            if (lihatSemuaData.equalsIgnoreCase("ya")) {
                System.out.println("\nSemua Data Obat:");
                for (Obat o : supplier.getDaftarObat()) {
                    System.out.println("Kode Obat: " + o.getKodeObat());
                    System.out.println("Nama Obat: " + o.getNamaObat());
                    System.out.println("Harga Obat: " + o.getHarga());
                    System.out.println("Stok Obat: " + o.getStok());
                    System.out.println();
                }
            }
        }

        System.out.println("\nTotal stok obat dari supplier: " + supplier.getStokObatSupply());

        // Proses supply tambahan obat
        while (true) {
            System.out.print("Masukkan kode obat yang akan disupply (atau ketik 'selesai' untuk mengakhiri): ");
            String kodeObat = scanner.nextLine();
            if (kodeObat.equalsIgnoreCase("selesai")) break;

            // Cari obat di daftar obat supplier
            Obat obatToSupply = null;
            for (Obat obat : supplier.getDaftarObat()) {
                if (obat.getKodeObat().equals(kodeObat)) {
                    obatToSupply = obat;
                    break;
                }
            }
            if (obatToSupply == null) {
                System.out.println("Obat tidak ditemukan.");
                continue;
            }
            System.out.print("Masukkan jumlah yang akan disupply: ");
            int jumlahSupply = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            // Proses supply menggunakan kelas Penjualan
            Supply supply = new Supply(obatToSupply, jumlahSupply);
            supply.getDisplayDetailSupply(); 
            supply.prosesSupply(); 

            System.out.println("Stok " + obatToSupply.getNamaObat() + " setelah supply: " + obatToSupply.getStok());
        }

        scanner.close();
    }
}
