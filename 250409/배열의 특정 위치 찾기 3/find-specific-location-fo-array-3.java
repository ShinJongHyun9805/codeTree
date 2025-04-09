import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                found = i - 1;
                break;
            }
        }

        int sum = 0;
        for (int i = found; i > found - 3; i--) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
