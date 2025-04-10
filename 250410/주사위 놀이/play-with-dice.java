import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 6; i++) {
            int count = 0;

            for (int k : arr) {
                if (k == i) {
                    count++;
                }
            }
            System.out.println(i + " - " + count);
        }
    }
}
