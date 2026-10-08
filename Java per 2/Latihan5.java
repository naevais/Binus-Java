import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        final double PPN = 0.11;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama barang   : ");
        String barang1 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        double harga1 = scanner.nextDouble();
        System.out.print("Jumlah beli   : ");
        int jumlah1 = scanner.nextInt();
        System.out.print("Diskon    : ");
        double diskonPersen1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nama barang   : ");
        String barang2 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        double harga2 = scanner.nextDouble();
        System.out.print("Jumlah beli   : ");
        int jumlah2 = scanner.nextInt();
        System.out.print("Diskon (%)    : ");
        double diskonPersen2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nama barang   : ");
        String barang3 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        double harga3 = scanner.nextDouble();
        System.out.print("Jumlah beli   : ");
        int jumlah3 = scanner.nextInt();
        System.out.print("Diskon (%)    : ");
        double diskonPersen3 = scanner.nextDouble();

        double subtotal1 = harga1 * jumlah1;
        double diskon1 = subtotal1 * diskonPersen1 / 100;
        double kenaPajak1 = subtotal1 - diskon1;

        double subtotal2 = harga2 * jumlah2;
        double diskon2 = subtotal2 * diskonPersen2 / 100;
        double kenaPajak2 = subtotal2 - diskon2;

        double subtotal3 = harga3 * jumlah3;
        double diskon3 = subtotal3 * diskonPersen3 / 100;
        double kenaPajak3 = subtotal3 - diskon3;

        double subtotalTotal = subtotal1 + subtotal2 + subtotal3;
        double diskonTotal = diskon1 + diskon2 + diskon3;
        double kenaPajakTotal = kenaPajak1 + kenaPajak2 + kenaPajak3;
        double pajak = kenaPajakTotal * PPN;
        double total = kenaPajakTotal + pajak;

        System.out.println("\n" + "=".repeat(32));
        System.out.println("           STRUK BELANJA           ");
        System.out.println("=".repeat(32));
        System.out.printf("1. %s x%d%n", barang1, jumlah1);
        System.out.printf("   Subtotal : Rp %,.2f%n", subtotal1);
        System.out.printf("   Diskon   : Rp %,.2f%n", diskon1);
        
        System.out.printf("2. %s x%d%n", barang2, jumlah2);
        System.out.printf("   Subtotal : Rp %,.2f%n", subtotal2);
        System.out.printf("   Diskon   : Rp %,.2f%n", diskon2);
        
        System.out.printf("3. %s x%d%n", barang3, jumlah3);
        System.out.printf("   Subtotal : Rp %,.2f%n", subtotal3);
        System.out.printf("   Diskon   : Rp %,.2f%n", diskon3);
        System.out.println("-".repeat(32));
        System.out.printf("Subtotal : Rp %,.2f%n", subtotalTotal);
        System.out.printf("Diskon   : Rp %,.2f%n", diskonTotal);
        System.out.printf("PPN 11%%  : Rp %,.2f%n", pajak);
        System.out.printf("TOTAL    : Rp %,.2f%n", total);
        System.out.println("=".repeat(32));

        scanner.close();
    }
}