import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        double radius;
        double circleArea;

        double length;
        double width;
        double rectangleArea;
        double rectanglePerimeter;

        String name;
        int age;
        String city;

        final double PI = 3.14159;
        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circleArea = PI * radius * radius;
        System.out.printf("The circle area is %.2f", circleArea);
        
        System.out.println("\nEnter the length: ");
        length = scanner.nextDouble();

        System.out.println("\nEnter width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        rectangleArea = length * width;
        rectanglePerimeter = 2 * (length + width);

        System.out.printf("Rectangle Area: %.2f\n", rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nEnter your city: ");
        city = scanner.nextLine();

        System.out.println();
        System.out.printf("Hello! My name is %s, I am %d years old, and I live in %s.\n", name, age, city);

        scanner.close();

    }
    
}