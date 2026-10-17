import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan6 {
    Scanner scanner = new Scanner(System.in); 

    public static int bacaInt(Scanner input, String pesan, int min, int max) {
        int nilai = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(pesan);
            try {
                nilai = input.nextInt();
                if (nilai >= min && nilai <= max) {
                    valid = true;
                } else {
                    System.out.println("Nilai harus berada di antara " + min + " dan " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! masukkan bilangan bulat.");
                input.next();
            }
        }
        return nilai;
    }

    public static String hitungGrade(int nilai) {
        return switch (nilai / 10) {
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "E";
        };
    }

    public static void tambahData(ArrayList<String> namaList, ArrayList<Integer> nilaiList, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine().trim();

        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong");
            return;
        }

        if (namaList.contains(nama)) {
            System.out.println("Mahasiswa sudah terdaftar");
            return;
        }

        int nilai = bacaInt(scanner, "Masukkan nilai mahasiswa (0-100): ", 0, 100);

        namaList.add(nama);
        nilaiList.add(nilai);
        System.out.println("Data berhasil ditambahkan");
    }

    public static void tampilkanData(ArrayList<String> namaList, ArrayList<Integer> nilaiList) {
        if (namaList.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        System.out.printf("%-5s | %-20s | %-5s | %-5s%n", "No", "Nama", "Nilai", "Grade");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < namaList.size() - 1; i++) {
            String nama = namaList.get(i);
            int nilai = nilaiList.get(i);
            String grade = hitungGrade(nilai);
            System.out.printf("%-5d | %-20s | %-5d | %-5s%n", (i + 1), nama, nilai, grade);
        }
    }

    public static void cariData(ArrayList<String> namaList, ArrayList<Integer> nilaiList, Scanner scanner) {
        if (namaList.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        scanner.nextLine();
        System.out.print("Masukkan nama yang ingin dicari: ");
        String keyword = scanner.nextLine();

        boolean ditemukan = false;
        System.out.println("\n===== HASIL PENCARIAN =====");
        for (int i = 0; i < namaList.size(); i++) {
            if (namaList.get(i).equals(keyword)) {
                System.out.println("Ditemukan: " + namaList.get(i) + " - Nilai: " + nilaiList.get(i));
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan.");
        }
    }

    public static void tampilkanStatistik(ArrayList<String> namaList, ArrayList<Integer> nilaiList) {
        if (nilaiList.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        double total = 0;
        int max = nilaiList.get(0);
        int min = nilaiList.get(0);

        for (int i = 0; i < nilaiList.size(); i++) {
            total += nilaiList.get(i);
            if (nilaiList.get(i) > max) max = nilaiList.get(i);
            if (nilaiList.get(i) < min) min = nilaiList.get(i);
        }

        double rataRata = (int) total / nilaiList.size();

        System.out.println("\n===== STATISTIK KELAS =====");
        System.out.printf("Rata-rata Kelas : %.2f%n", rataRata);
        System.out.printf("Nilai Tertinggi : %d%n", max);
        System.out.printf("Nilai Terendah  : %d%n", min);
    }

    public static void hapusData(ArrayList<String> namaList, ArrayList<Integer> nilaiList, Scanner scanner) {
        if (namaList.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        int index = bacaInt(scanner, "Masukkan nomor indeks data yang ingin dihapus: ", 0, namaList.size() - 1);
        
        namaList.remove(index);
        System.out.println("Data berhasil dihapus!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM NILAI MAHASISWA =====");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Tampilkan semua data");
            System.out.println("3. Cari mahasiswa berdasarkan nama");
            System.out.println("4. Tampilkan statistik kelas");
            System.out.println("5. Hapus data mahasiswa");
            System.out.println("6. Keluar");
            
            pilihan = bacaInt(scanner, "Pilih menu (1-6): ", 1, 6);

            switch (pilihan) {
                case 1 -> tambahData(namaMahasiswa, nilaiMahasiswa, scanner);
                case 2 -> tampilkanData(namaMahasiswa, nilaiMahasiswa);
                case 3 -> cariData(namaMahasiswa, nilaiMahasiswa, scanner);
                case 4 -> tampilkanStatistik(namaMahasiswa, nilaiMahasiswa);
                case 5 -> hapusData(namaMahasiswa, nilaiMahasiswa, scanner);
                case 6 -> System.out.println("Keluar.");
            }
        } while (pilihan != 6);

        scanner.close();
    }
    
}
