import java.util.Random;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Random random = new Random();
        
        char playAgain;
        do {
            int target = random.nextInt(100) + 1;
            int attempts = 7;
            boolean hasWon = false;
            
            System.out.println("\n=== GAME TEBAK ANGKA PLUS ===");
            System.out.println("Tebak angka antara 1 sampai 100. Kamu punya 7 kesempatan.");
            
            while (attempts > 0) {
                System.out.print("Sisa kesempatan (" + attempts + "). Masukkan tebakan: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    scanner.next();
                    continue;
                }
                
                int guess = scanner.nextInt();
                
                if (guess == target) {
                    hasWon = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Terlalu kecil!");
                } else {
                    System.out.println("Terlalu besar!");
                }
                
                attempts--;
            }
            
            if (hasWon) {
                int score = attempts * 15;
                System.out.println("Selamat! Kamu berhasil menebak angka " + target);
                System.out.println("Skor kamu: " + score);
            } else {
                System.out.println("Game Over! Angka yang benar adalah: " + target);
                System.out.println("Skor kamu: 0");
            }
            
            System.out.print("Main lagi? (y/n): ");
            playAgain = scanner.next().charAt(0);
            
        } while (playAgain == 'y' || playAgain == 'Y');
        
        scanner.close();
    }
    
}
