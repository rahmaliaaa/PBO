import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // membuat objek baru customer
        Customer customer = new Customer(1, "customer", "rahmalia", 19, "rahmalia@gmail.com");
        Admin admin = new Admin(2, "admin", "Admin", 20, "admin@gmail.com");
        int menu;

        while (true) {
            System.out.println("------------------------");
            System.out.println("Daftar Menu");
            System.out.println("------------------------");
            System.out.println("1. login customers");
            System.out.println("2. login admin");
            System.out.println("3. recorvery password");
            System.out.println("4. logout");
            System.out.print("Masukkan pilihan menu   : ");
            menu = sc.nextInt();
            sc.nextLine();


            switch (menu) {
                case 1:
                    boolean log;
                    do {
                        System.out.println("\n-------Login Customer--------");
                        System.out.print("Masukkan UserId         : ");
                        int customerId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan Password       : ");
                        String customerPass = sc.nextLine();
    
                         log = customer.logIn(customerId, customerPass);
                        
                    } while (log == false);

                    int pilih;
                    while (true) {
                        System.out.println("\n----------Pilih menu customer-----");
                        System.out.println("1. Masukkan dokumen");
                        System.out.println("2. Kirim keluhan");
                        System.out.println("3. Tampilkan profil");
                        System.out.println("4. Edit Profil");
                        System.out.println("5. Keluar");
                        System.out.print("Masukkan pilihan menu: ");
                        pilih = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------");

                        switch (pilih) {
                            case 1:
                                System.out.print("Masukkan file dokumen : ");
                                String doc = sc.nextLine();
                                customer.applyVerification(doc);
                                break;

                            case 2:
                                System.out.print("Kirim Keluhan : ");
                                String keluhan = sc.nextLine();
                                customer.keluhan(keluhan);
                                break;

                            case 3:
                                System.out.println("Tampilkan Profil");
                                System.out.println(customer.infoUser());
                                break;

                            case 4:
                                System.out.println("Edit profil:");
                                System.out.print("Nama       : ");
                                String nama = sc.nextLine();
                                System.out.print("Umur       : ");
                                int umur = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Email      : ");
                                String email = sc.nextLine();
                                customer.editProfile(nama, umur, email);
                                break;

                            case 5:
                                System.out.println("Customer logout!");
                                break;
                        }

                        if (pilih == 5) {
                            break; // kembali ke menu utama
                        }
                    }
                    break;

                case 2:
                boolean log1;
                    do {
                        System.out.println("\n-------Login Admin--------");
                        System.out.print("Masukkan UserId         : ");
                        int adminId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan Password       : ");
                        String adminPass = sc.nextLine();
    
                        log1 = admin.logIn(adminId, adminPass);
                        
                    } while (log1==false);

                    int pilihan;
                    while (true) {
                        System.out.println("\nPilih menu Admin-----");
                        System.out.println("1. Tambah Kendaraan");
                        System.out.println("2. Tampilkan Kendaraan");
                        System.out.println("3. Ambil keluhan dari customer");
                        System.out.println("4. Verifikasi customer");
                        System.out.println("5. Logout");
                        System.out.print("Masukkan pilihan menu : ");
                        pilihan = sc.nextInt();
                        sc.nextLine();

                        switch (pilihan) {
                            case 1:
                                System.out.println("Tambah kendaraan:");
                                System.out.print("Merek       : ");
                                String merek = sc.nextLine();
                                System.out.print("Model       : ");
                                String model = sc.nextLine();
                                System.out.print("Harga       : ");
                                double harga = sc.nextDouble();
                                admin.addVehicle(merek, model, harga);
                                break;

                            case 2:
                                System.out.println("Informasi Kendaraan");
                                System.out.println(admin.infoKendaraan());
                                break;

                            case 3:
                                System.out.println("Ambil keluhan dari customer");
                                admin.retrieveComplain();
                                break;

                            case 4:
                                System.out.println("Verifikasi customer");
                                admin.verifyUser(customer);
                                break;

                            case 5:
                                System.out.println("Admin logout!");
                                break; // keluar dari loop admin
                        }

                        if (pilihan == 5) {
                            break; // kembali ke menu utama
                        }
                    }
                    break;

                case 3:
                    System.out.println("pemulihan password");
                    System.out.print("Masukkan email yang terdaftar   : ");
                    String e = sc.nextLine();
                    System.out.print("Masukkan kata sandi baru      : ");
                    String ks = sc.nextLine();
                    customer.recoverPassword(e,ks);
                    break;

                case 4:
                    System.out.println("Terima Kasih");
                    sc.close(); // menutup scanner
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
 