import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[3][3];
        System.out.println("masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nmatriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nJumlah per baris:");
        for (int i = 0; i < 3; i++) {
            int sumRow = 0;
            for (int j = 0; j < 3; j++) {
                sumRow += mat[i][j];
            }
            System.out.println("Baris " + (i + 1) + ": " + sumRow);
        }

        System.out.println("\nJumlah per kolom:");
        for (int j = 0; j < 3; j++) {
            int sumCol = 0;
            for (int i = 0; i < 3; i++) {
                sumCol += mat[i][j];
            }
            System.out.println("Kolom " + (j + 1) + ": " + sumCol);
        }

        int sumDiag = 0;
        for (int i = 0; i < 3; i++) {
            sumDiag += mat[i][i];
        }
        System.out.println("Jumlah diagonal utama: " + sumDiag);

        System.out.println("\nTranspose Matriks:");
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = mat[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nPerkalian Matriks 2x2");
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}
