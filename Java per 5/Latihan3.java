import java.util.Arrays;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.println("Sebelum diurutkan: " + Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Setelah diurutkaan: " + Arrays.toString(arr));
    }
    
}
