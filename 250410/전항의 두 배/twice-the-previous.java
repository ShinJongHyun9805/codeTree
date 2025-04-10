import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] n = new int[10];
        n[0] = arr[0];
        sb.append(n[0]).append(" ");

        n[1] = arr[1];
        sb.append(n[1]).append(" ");

        for (int i = 2; i < n.length; i++) {
            n[i] = n[i - 1] + (2 * n[i - 2]);
            sb.append(n[i]).append(" ");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
