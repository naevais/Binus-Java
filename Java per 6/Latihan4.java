import java.util.Scanner;

public class Latihan4 {
    Scanner scanner = new Scanner(System.in);

    public static int cariMaks(int[] data) {
        int maks = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
            }
        }
        return maks;
    }

    public static int cariMin(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static double hitungRataRata(int[] data) {
        double total = 0;
        for (int n : data) {
            total += n;
        }
        return total / data.length;
    }

    public static int[] balikArray(int[] data) {
        int[] hasil = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            hasil[i] = data[data.length - 1 - i];
        }
        return hasil;
    }

    public static void urutkan(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void cetak(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] angka = {5, 2, 9, 1, 7};

        System.out.print("Array awal: ");
        cetak(angka);

        System.out.println("Nilai Maksimum: " + cariMaks(angka));
        System.out.println("Nilai Minimum: " + cariMin(angka));
        System.out.println("Rata-rata: " + hitungRataRata(angka));
        System.out.println();

        System.out.print("Hasil balikArray (array baru): ");
        int[] dibalik = balikArray(angka);
        cetak(dibalik);

        System.out.print("Cek array asli setelah balikArray: ");
        cetak(angka);
        System.out.println();

        System.out.print("Array setelah urutkan (mengubah array asli): ");
        urutkan(angka);
        cetak(angka);

        System.out.print("Cek array asli setelah urutkan: ");
        cetak(angka);
    
}
}
