import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        double scoreAkhir;
            
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter nilai tugas (0-100): ");
        double scoreTugas = scanner.nextDouble();

        System.out.print("Enter nilai UTS (0-100): ");
        double scoreUTS = scanner.nextDouble();

        System.out.print("Enter nilai UAS (0-100): ");
        double scoreUAS = scanner.nextDouble();

        if (scoreTugas < 0 || scoreTugas > 100 ||
            scoreUTS < 0 || scoreUTS > 100 ||
            scoreUAS < 0 || scoreUAS > 100) {
        System.out.println("\nError! Nilai harus sesuai pada rentang 0-100!");


        }
        scoreAkhir = (0.30 * scoreTugas) + (0.30 * scoreUTS) + (0.40 * scoreUAS);
        
        char grade;
        if (scoreAkhir >= 85) {
            grade = 'A';
        } else if (scoreAkhir >= 70) {
            grade = 'B';
        } else if (scoreAkhir >= 55) {
            grade = 'C';
        } else if (scoreAkhir >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        boolean isLulus = (grade == 'A' || grade == 'B' || grade == 'C') && (scoreUAS >= 50);

                
                System.out.println("\n--- Hasil Penilaian ---");
                System.out.printf("Nilai Akhir : %.2f\n", scoreAkhir);
                System.out.println("Grade       : " + grade);
                
                if (isLulus) {
                    System.out.println("LULUS");
                } else {
                    System.out.println("TIDAK LULUS");
                }

                scanner.close();


            }

}
