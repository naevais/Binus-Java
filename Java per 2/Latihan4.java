import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name = " Cardiska Hanna Naeva Rahmania ";

    String capital = name.toUpperCase();
    System.out.println(capital);

    String names = name.strip();
    int strip = names.length();
    System.out.println(strip);

    char firstLetter = name.charAt(0);
    char lastLetter = name.charAt(30);
    System.out.println(firstLetter);
    System.out.println(lastLetter);

    boolean adaAulia = name.contains("Aulia");
    System.out.println(adaAulia);

    String changeSpace = name.replace( "", "_");
    System.out.println(changeSpace);
    scanner.close();



    }
    
}
