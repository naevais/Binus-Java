import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        double celsius;
        double fahrenheit;
        double kelvin;

        System.out.println("Enter the celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9.0 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit : %.2f\n", fahrenheit);
        System.out.printf("Kelvin     : %.2f\n", kelvin);

        scanner.close();
    }
    
}
