import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {

            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;

            sb.append(num % 2 == 0 ? num / 2 : num + 3).append(" ");
        }

        sb.setLength(sb.length() -1);

        System.out.println(sb);
    }
}
