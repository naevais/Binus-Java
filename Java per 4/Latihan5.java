import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("\n1. Bilangan prima dari 2 sampai " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n2. Jumlah seluruh bilangan prima yang ditemukan: " + count);

        System.out.print("\n3. Masukkan bilangan untuk faktorisasi prima: ");
        int angkaFaktor = scanner.nextInt();
        System.out.print(angkaFaktor + " = ");
        
        boolean first = true;
        for (int i = 2; i <= angkaFaktor; i++) {
            while (angkaFaktor % i == 0) {
                if (!first) {
                    System.out.print(" x ");
                }
                System.out.print(i);
                angkaFaktor /= i;
                first = false;
            }
        }
        System.out.println();

        //int result = ();

        scanner.close();
    }
    
}
