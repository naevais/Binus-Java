import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan umur: ");
    int age = scanner.nextInt();

    if (age < 0) {
            System.out.println("Umur negatif dinyatakan tidak valid.");
        } else if (age <= 5) {
            System.out.println("Kategori: Balita");
        } else if (age <= 12) {
            System.out.println("Kategori: Anak-anak");
        } else if (age <= 17) {
            System.out.println("Kategori: Remaja");
        } else if (age <= 59) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia (60 ke atas)");
        }
    
        System.out.print("\nMasukkan tahun: ");
        int year = scanner.nextInt();

        boolean isKabisat = (year % 4 == 0 && age % 100 != 0) || (year % 400 == 0);

        if (isKabisat) {
            System.out.println(year + " adalah tahun kabisat.");
        } else {
            System.out.println(year + " bukan tahun kabisat.");
        }
    }
    
}
