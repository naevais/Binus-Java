import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan5 {
    Scanner scanner = new Scanner(System.in);

    public class LatihanInputAman {

    }

    public static int bacaInt(Scanner input, String pesan, int min, int max) {
        int nilai = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(pesan);
            try {
                nilai = input.nextInt();
                if (nilai >= min && nilai <= max) {
                    valid = true;
                } else {
                    System.out.println("Nilai harus di antara " + min + " dan " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! masukkan bilangan bulat.");
                input.next();
            }
        }
        return nilai;
    }

    public static double bacaDouble(Scanner input, String pesan, double min, double max) {
        double nilai = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(pesan);
            try {
                nilai = input.nextDouble();
                if (nilai >= min && nilai <= max) {
                    valid = true;
                } else {
                    System.out.println("Nilai harus berada di antara " + min + " dan " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.next();
            }
        }
        return nilai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int umur = bacaInt(scanner, "Masukkan umur (1-100): ", 1, 100);
        System.out.println("Umur yang dimasukkan: " + umur);

        System.out.println();

        double tinggi = bacaDouble(scanner, "Masukkan tinggi badan dalam meter (0.5 - 3.0): ", 0.5, 3.0);
        System.out.println("Tinggi badan yang dimasukkan: " + tinggi);

        scanner.close();
} 
}


