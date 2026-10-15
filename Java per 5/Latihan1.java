import java.util.Arrays;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data (N): ");
        int n = scanner.nextInt();

        int[] nilai = new int[n];

        System.out.println("Masukkan " + n + " buah nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        System.out.println("Seluruh Data:");
        System.out.println("   " + Arrays.toString(nilai));

        if (n == 0) {
            System.out.println("Tidakdata yang diproses.");
            scanner.close();
            return;
        }

        int jumlah = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < n; i++) {
            jumlah += nilai[i];
            
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        double rataRata = (double) jumlah / n;

        System.out.println("Statistic nilai:");
        System.out.println("   - Jumlah  : " + jumlah);
        System.out.println("   - Rata-rata: " + rataRata);
        System.out.println("   - Maksimum: " + max);
        System.out.println("   - Minimum : " + min);

        int lebihDariRataRata = 0;
        for (int i = 0; i < n; i++) {
            if (nilai[i] > rataRata) {
                lebihDariRataRata++;
            }
        }
        System.out.println("Banyak nilai > rata-rata: " + lebihDariRataRata);

        int genap = 0;
        int ganjil = 0;
        for (int i = 0; i < n; i++) {
            if (nilai[i] % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }
        System.out.println("Banyak bilangan genap: " + genap);
        System.out.println("   Banyak bilangan ganjil: " + ganjil);

        scanner.close();

    }
    
}
