import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // a
int a = 10, b = 3;
System.out.println(a / b + " " + a % b + " " + (double) a / b);
//3 1 3.3333333333333335

// b
int x = 5;
int y = x++ + ++x;
System.out.println(x + " " + y);
//y = 5 + 7 → 12, x is 7, y is 12

// c
System.out.println(1 + 2 + "3" + 4 + 5);
//3345

// d
System.out.println('A' + 'B');
System.out.println("" + 'A' + 'B');
//65 + 66 = 131

// e
boolean hasil = (5 > 3) && !(2 > 4) || (10 / 2 == 3);
System.out.println(hasil);
//true, not false, false

    }
    
}
