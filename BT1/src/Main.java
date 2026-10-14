import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1: Nhap kich thuoc mang
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Kich thuoc mang phai lon hon 0!");
            return;
        }

        // Buoc 2: Nhap cac phan tu
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Buoc 3: Sap xep chon giam dan
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Hoan doi phan tu lon nhat voi arr[i]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Buoc 4: In mang da sap xep
        System.out.println("Mang sau khi sap xep giam dan:");
        System.out.println(Arrays.toString(arr));

        // Buoc 5: In phan tu lon nhat
        System.out.println("Phan tu lon nhat: " + arr[0]);

        scanner.close();
    }
}