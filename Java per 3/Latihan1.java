import java.util.Scanner;

public class Latihan1{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();

    if(number > 0){
        System.out.println("The number is positive!");
    } else if (number < 0) {
        System.out.println("The number is negative!");
        
    }  else{
        System.out.println("The number is zero!");
    }

    if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd.");

            }
        }

    if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        scanner.close();
    }
}