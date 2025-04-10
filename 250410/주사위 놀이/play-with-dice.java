import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

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
