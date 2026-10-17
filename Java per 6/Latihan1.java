import java.util.Scanner;

public class Latihan1 {
        Scanner scanner = new Scanner(System.in);

        public static double luasPersegiPanjang(double p, double l) {
            return p * l;
        }

        public static double kelilingPersegiPanjang(double p, double l) {
            return 2 * (p + l);
        }

        public static double luasLingkaran(double r) {
            return Math.PI * r * r;
        }

        public static double kelilingLingkaran(double r) {
            return 2 * Math.PI * r;
        }

        public static double luasSegitiga(double alas, double tinggi) {
            return 0.5 * alas * tinggi;
        }

        public static void cetakHasil(String bangun, double hasil) {
            System.out.printf("Luas/Keliling %s = %.2f%n", bangun, hasil);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Menu Pilihan Bangun Datar ===");
            System.out.println("1. Persegi Panjang (Luas & Keliling)");
            System.out.println("2. Lingkaran (Luas & Keliling)");
            System.out.println("3. Segitiga (Luas)");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = scanner.nextDouble();

                    double luasPP = luasPersegiPanjang(p, l);
                    double kelilingPP = kelilingPersegiPanjang(p, l);

                    cetakHasil("Persegi Panjang luas", luasPP);
                    cetakHasil("Persegi panjang keliling", kelilingPP);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari (r): ");
                    double r = scanner.nextDouble();

                    double luasLing = luasLingkaran(r);
                    double kelilingLing = kelilingLingkaran(r);

                    cetakHasil("Lingkaran luas", luasLing);
                    cetakHasil("Lingkaran keliling", kelilingLing);
                    break;

                case 3:
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();

                    double luasSeg = luasSegitiga(alas, tinggi);

                    cetakHasil("Segitiga luas", luasSeg);
                    break;

                default:
                        System.out.println("Pilihan tida valid");
                    }
                    

            scanner.close();
            }
        }
