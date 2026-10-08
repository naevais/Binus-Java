import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan detik: ");
    int totalSeconds = scanner.nextInt();

    int hours = totalSeconds / 3600;
    int remainingSeconds = totalSeconds % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;

    System.out.println(hours + " jam " + minutes + "menit " +  seconds + "detik");

    scanner.close();


    }
    
}
