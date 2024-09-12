import java.util.Scanner;
public class SpeakerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputStok;
        Speaker spk1 = new Speaker();
        Speaker spk2 = new Speaker();

        System.out.println("-------------------------");
        System.out.println("Stok Lama");
        System.out.println("-------------------------");
        spk1.setMerek("Sony");
        spk1.setWarna("Hitam");
        spk1.aturVolume(4);
        spk1.updateStok(4);
        spk1.cetakStatus();

        spk2.setMerek("JBL");
        spk2.setWarna("Putih");
        spk2.aturVolume(2);
        spk2.updateStok(10);
        spk2.cetakStatus();

        System.out.println("--------------------------");
        System.out.println("Update Stok yang baru");
        System.out.println("--------------------------");
        System.out.print("masukkan stok terbaru Sony: ");
        inputStok = sc.nextInt();
        spk1.updateStok(inputStok);
        spk1.cetakStatus();

        System.out.print("masukkan stok terbaru JBL: ");
        inputStok = sc.nextInt();
        spk2.updateStok(inputStok);
        spk2.cetakStatus();
    }
}
