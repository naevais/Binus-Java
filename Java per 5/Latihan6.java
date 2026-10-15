import java.util.ArrayList;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int jumlahMhs = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> namaMhs = new ArrayList<>();
        ArrayList<Integer> nilaiMhs = new ArrayList<>();

        for (int i = 0; i <= jumlahMhs; i++) {
            System.out.print("nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            namaMhs.add(nama);

            System.out.print("Nilai " + nama + ": ");
            int nilai = scanner.nextInt();
            scanner.nextLine();
            nilaiMhs.add(nilai);
        }

        int total = 0;
        int max = nilaiMhs.get(0);
        int min = nilaiMhs.get(0);

        for (int i = 0; i < nilaiMhs.size(); i++) {
            total += nilaiMhs.get(i);
            if (nilaiMhs.get(i) > max) {
                max = nilaiMhs.get(i);
            }
            if (nilaiMhs.get(i) < min) {
                min = nilaiMhs.get(i);
            }
        }

        double rataRata = total / nilaiMhs.size();

        System.out.println("\n--- REKAP NILAI KELAS ---");
        System.out.printf("%-15s | %-5s | %-5s\n", "Nama", "Nilai", "Grade");
        System.out.println("--------------------------------");

        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        for (int i = 0; i < namaMhs.size(); i++) {
            String nama = namaMhs.get(i);
            int nilai = nilaiMhs.get(i);
            
            char grade = switch (nilai / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'E';
            };

            if (grade == 'A') countA++;
            else if (grade == 'B') countB++;
            else if (grade == 'C') countC++;
            else if (grade == 'D') countD++;
            else countE++;

            System.out.printf("%-15s | %-5d | %-5c\n", nama, nilai, grade);
        }

        System.out.println("\nStatistic Kelas:");
        System.out.println("Rata-rata : " + rataRata);
        System.out.println("Tertinggi : " + max);
        System.out.println("Terendah  : " + min);
        System.out.println("Jumlah Grade A: " + countA);
        System.out.println("Jumlah Grade B: " + countB);
        System.out.println("Jumlah Grade C: " + countC);
        System.out.println("Jumlah Grade D: " + countD);
        System.out.println("Jumlah Grade E: " + countE);

        scanner.close();
    }
    
}
