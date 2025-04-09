import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum += arr[i];
        }

        int sum2 = 0;
        int count = 0;
        for (int i = 2; i < arr.length; i+=3) {
            sum2 += arr[i];
            count++;
        }

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(sum + " " + df.format((double) sum2 / count));
    }
}
