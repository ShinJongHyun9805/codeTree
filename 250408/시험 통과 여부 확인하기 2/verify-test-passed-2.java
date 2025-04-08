import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int sum = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();

            if (sum / 4 >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}