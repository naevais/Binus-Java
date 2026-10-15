import java.util.ArrayList;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        System.out.print("IndeX tempat angka muncul: ");
        boolean ditemukan = false;
        StringBuilder indeksList = new StringBuilder();

        int[] data = {12, 45, 7, 89, 23, 45, 61};
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                if (ditemukan) {
                    indeksList.append(", ");
                }
                indeksList.append(i);
                ditemukan = true;
            }
        }

        if (ditemukan) {
            System.out.println(indeksList.toString());
        } else {
            System.out.println("tidak ditemukan");
        }

        System.out.print("Isi array secara terbalik: [");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        ArrayList<Integer> unikList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (!unikList.contains(data[i])) {
                unikList.add(data[i]);
            }
        }

        System.out.println("Array baru dengan elemen unik: " + unikList);

        scanner.close();
    }

    
}
