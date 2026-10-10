import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    

    System.out.print("Masukan nomor hari (1-7): ");
    int dayNumber = scanner.nextInt();

    String dayInfo = switch(dayNumber){
        case 1 -> "Senin";
        case 2 -> "Selasa";
        case 3 -> "Rabu";
        case 4 -> "Kamis";
        case 5 -> "Jumat";
        case 6 -> "Sabtu";
        case 7 -> "Minggu";
        default -> null;
    };

    String dayWork = switch(dayNumber){
        case 1, 2, 3, 4, 5 -> "Hari kerja";
        case 6, 7 -> "Akhir pekan";
        default-> "Error";
    };

    if (dayInfo != null) {
            System.out.println("Hari: " + dayInfo + " ("  +dayWork+ ")");
        } else {
            System.out.println("Nomor hari tidak valid! Masukkan angka 1 sampai 7.");

    }
    
    System.out.print("\nMasukkan angka bulan (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Masukkan tahun: ");
        int year = scanner.nextInt();

        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
            
            boolean isKabisat = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            yield isKabisat ? 29 : 28;
            }
            default -> -1;
        };

        if (daysInMonth != -1) {
            System.out.println("Jumlah hari pada bulan tersebut: " + daysInMonth);
        } else {
            System.out.println("Bulan tidak valid! Masukkan angka 1 sampai 12.");
        }

        scanner.close();
    }
}
