package Kendaraan;
import java.util.Scanner;

public class kendaraanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next;

        do {
            System.out.println("-------------------------");
            System.out.println("Detail Mobil Sedan");
            System.out.println("-------------------------");

            Sedan sedan = new Sedan("Honda", "2019", "Putih", "DOHC VTEC", "Bensin", 150000000, "Turbo");
            sedan.tampilkanInfo(); // Menampilkan info sedan default

            System.out.print("\nApakah Anda ingin memasukkan detail mobil sedan yang lain? (ya/tidak): ");
            next = sc.nextLine(); // Menerima input pengguna

            if (next.equalsIgnoreCase("ya")) {
                System.out.println("\n---------------------------");
                System.out.println("Masukkan Detail Mobil Lain");
                System.out.println("---------------------------");

                // Membuat objek sedan baru dan meminta input datanya
                sedan = new Sedan("", "", "", "", "", 0, "");
                sedan.inputData(sc); // Input data mobil baru
                System.out.println("\n-------------------------");
                System.out.println("Detail Mobil Sedan");
                System.out.println("-------------------------");
                sedan.tampilkanInfo(); // Menampilkan info mobil baru
            }

        } while (next.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih!");
        sc.close();
    }
}
