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

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}