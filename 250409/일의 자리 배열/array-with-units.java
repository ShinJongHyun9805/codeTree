import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        arr[0] = n;
        arr[1] = m;

        sb.append(arr[0]).append(" ").append(arr[1]).append(" ");

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

            if (arr[i] > 9) {
                arr[i] = arr[i] % 10;
            }

            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
