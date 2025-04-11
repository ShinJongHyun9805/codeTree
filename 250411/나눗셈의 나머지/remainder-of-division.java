import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        while (A > 1) {

            list.add(A % B);
            A = A / B;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < list.size(); j++) {
                if (i == list.get(j)) {
                    cnt++;
                }
            }

            sum += (int) Math.pow(cnt, 2);
        }

        System.out.println(sum);
    }
}
