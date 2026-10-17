import java.util.Scanner;

public class Latihan2 {

        Scanner scanner = new Scanner(System.in);
        
        public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long faktorialRekursif(int n) {
        if (n <= 1) return 1;
        return n * faktorialRekursif(n - 1);
    }

    public static long faktorialIteratif(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isPalindrom(String teks) {
        String bersih = teks.toLowerCase();
        String dibalik = new StringBuilder(bersih).reverse().toString();
        return bersih.equals(dibalik);
    }

    public static void main(String[] args) {
        System.out.println("1. Bilangan prima dari 1 sampai 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("2. Perbandingan faktorial (n = 1..15):");
        System.out.printf("%-5s %-15s %-15s%n", "n", "Rekursif", "Iteratif");
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%-5d %-15d %-15d%n", i, faktorialRekursif(i), faktorialIteratif(i));
        }
        System.out.println();

        System.out.println("3. 15 Suku perrtama Fibonacci:");
        for (int i = 0; i < 15; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");

        System.out.println("4. Uji palindrom:");
        String kata1 = "Katak";
        String kata2 = "Java";
        System.out.println("\"" + kata1 + "\" -> " + isPalindrom(kata1));
        System.out.println("\"" + kata2 + "\" -> " + isPalindrom(kata2));
        
    }
    
}
