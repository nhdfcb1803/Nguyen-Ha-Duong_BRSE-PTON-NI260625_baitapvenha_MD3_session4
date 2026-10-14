import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0!");
            scanner.close();
            return;
        }

        // Bước 2: Nhập các phần tử của mảng
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Bước 3: Sắp xếp nổi bọt giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Bước 4: Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}