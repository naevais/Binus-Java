import java.util.ArrayList;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- MENU BELANJA ---");
            System.out.println("1. Tambah barang");
            System.out.println("2. Hapus barang");
            System.out.println("3. Tampilkan daftar");
            System.out.println("4. Cari barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nama barang: ");
                String barang = scanner.nextLine();
                if (belanja.contains(barang)) {
                    System.out.println("Barang sudah ada di daftar!");
                } else {
                    belanja.add(barang);
                    System.out.println("Barang berhasil ditambahkan.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama barang yang akan dihapus: ");
                String barang = scanner.nextLine();
                int index = belanja.indexOf(barang);
                if (index != -1) {
                    belanja.remove(index);
                    System.out.println("Barang dihapus.");
                } else {
                    System.out.println("Barang tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                if (belanja.isEmpty()) {
                    System.out.println("Daftar belanja masih kosong!");
                } else {
                    System.out.println("Daftar Belanja:");
                    for (int i = 0; i <= belanja.size(); i++) {
                        System.out.println((i + 1) + ". " + belanja.get(i));
                    }
                    System.out.println("Pertama: " + belanja.getFirst());
                    System.out.println("Terakhir: " + belanja.getLast());
                }
            } else if (pilihan == 4) {
                System.out.print("Cari barang: ");
                String cari = scanner.nextLine();
                if (belanja.contains(cari)) {
                    System.out.println("Ketemu! Ada di indeks ke-" + belanja.indexOf(cari));
                } else {
                    System.out.println("Tidak ketemu.");
                }
            }
        } while (pilihan != 5);

        System.out.println("Program selesai.");
        scanner.close();
    }
    
}
