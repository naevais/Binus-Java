import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N untuk faktorial: ");
        int nFaktorial = scanner.nextInt();
        int hasil = 1; 
        for (int i = 1; i <= nFaktorial; i++) {
            hasil *= i;
        }
        System.out.println("Hasil " + nFaktorial + "! = " + hasil);

        System.out.print("\nMasukkan jumlah suku Fibonacci (N): ");
        int nFibo = scanner.nextInt();
        long t1 = 0, t2 = 1;
        System.out.print("Deret Fibonacci: ");
        for (int i = 1; i <= nFibo; i++) {
            System.out.print(t1 + " ");
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum; 
        }
        System.out.println();

        System.out.print("\nMasukkan bilangan untuk dihitung digitnya: ");
        int angkaDigit = scanner.nextInt();
        int jumlahDigit = 0;
        int tempDigit = angkaDigit;
        
        if (tempDigit == 0) {
            jumlahDigit = 1;
        }
        
        while (tempDigit > 0) {
            jumlahDigit++; 
            tempDigit /= 10;
        }
        System.out.println("Jumlah digit dari " + angkaDigit + " adalah: " + jumlahDigit);

        System.out.print("\nMasukkan bilangan untuk cek palindrom: ");
        int angkaAsli = scanner.nextInt();
        int tempPalindrom = angkaAsli;
        int angkaTerbalik = 0;
        
        while (tempPalindrom > 0) {
            int sisa = tempPalindrom % 10;
            angkaTerbalik = (angkaTerbalik * 10) + sisa;
            tempPalindrom /= 10; 
        }
        
        if (angkaAsli == angkaTerbalik) {
            System.out.println(angkaAsli + " adalah Palindrom.");
        } else {
            System.out.println(angkaAsli + " bukan Palindrom.");
        }

        scanner.close();
    }
}
