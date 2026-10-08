import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan bilangan pertama: ");
    int num1 = scanner.nextInt();

    System.out.print("Masukan bilang kedua: ");
    int num2 = scanner.nextInt();

    int addition = num1 + num2;
    int substraction = num1 - num2;
    int multiplication = num1 * num2;
    double division = num1 / num2;
    int modulus = num1 % num2;

    System.out.println("Hasil multiplication: " + addition);
    System.out.println("Hasil substraction: " + substraction);
    System.out.println("Hasil division: " + division);
    System.out.println("Hasil modulus: " + modulus);

    scanner.close();

    }
}
