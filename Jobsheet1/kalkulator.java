import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+ - * /) : ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka selanjutnya: ");
        double angka2 = input.nextDouble();
        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        System.out.println("Hasil:" + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
