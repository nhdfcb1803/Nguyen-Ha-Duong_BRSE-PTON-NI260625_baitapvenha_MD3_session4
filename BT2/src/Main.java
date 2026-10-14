import java.util.Scanner;

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

        // Buoc 2: Nhap cac phan tu cua mang
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Buoc 3: Tinh tong cac phan tu
        int tong = 0;

        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        // Buoc 4: In ket qua
        System.out.println("Tong cac phan tu trong mang: " + tong);

        scanner.close();
    }
}