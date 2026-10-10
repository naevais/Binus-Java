import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a day (1: Senin,...7: Minggu): ");
    int day = scanner.nextInt();

    System.out.print("Enter age: ");
    int age = scanner.nextInt();

    System.out.print("Are you a student? (y/n: ");
    char studentStatus = scanner.next().charAt(0);

    double price = 50000;

    if (age < 5) {
            price = 0;
        } else {
            price = switch (day) {
                case 1, 2, 3, 4 -> (50000 * 0.80);
                case 5, 6, 7 -> 50000;
                default -> {
                    System.out.println("Day is not valid. Using a normal price");
                    yield 50000;
                }
            };
    }
    if (studentStatus == 'y' || studentStatus == 'Y') {
                price -= 5000;
            }
    
        System.out.printf("Total: Rp %.0f\n", price);

        scanner.close();

        }
    
}
