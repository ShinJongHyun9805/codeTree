import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int odd = 0;
        for (int i = 0; i < arr.length; i+=2) {
            odd += arr[i];
        }

        int even = 0;
        for (int i = 1; i < arr.length; i+=2) {
            even += arr[i];
        }

        int res = Math.max(odd, even) - Math.min(odd, even);
        System.out.println(res);
    }
}
