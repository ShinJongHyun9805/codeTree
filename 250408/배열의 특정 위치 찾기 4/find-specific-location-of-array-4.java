import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (String s : split) {
            int num = Integer.parseInt(s);

            if (num == 0) break;
            list.add(num);
        }

        int sum = 0, count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                count++;
                sum += list.get(i);
            }
        }

        System.out.println(count + " " + sum);
    }
}