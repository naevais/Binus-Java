import java.util.Scanner;

public class Latihan3 {
    Scanner scanner = new Scanner(System.in);

    public static double luas(double sisi) {
        return sisi * sisi;
    }

    public static double luas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double luas(String bentuk, double ukuran) {
        if (bentuk.equalsIgnoreCase("lingkaran")) {
            return Math.PI * ukuran * ukuran;
        }
        return 0;
    }

    public static double rataRata(double... nilai) {
        if (nilai.length == 0) {
            return 0;
        }
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

    public static void main(String[] args) {
        System.out.println("--- Pengujian Overloading Method Luas ---");
        System.out.println("Luas Persegi (sisi 5.0) = " + luas(5.0));
        System.out.println("Luas Persegi Panjang (p: 4.0, l: 6.0) = " + luas(4.0, 6.0));
        System.out.println("Luas Lingkaran (r: 7.0) = " + luas("lingkaran", 7.0));

        System.out.println("\n--- Pengujian Varargs Method Rata-rata ---");
        System.out.println("Rata-rata (80.0, 90.5, 75.0, 85.0) = " + rataRata(80.0, 90.5, 75.0, 85.0));
        System.out.println("Rata-rata (tanpa argumen) = " + rataRata());
    
}
    }