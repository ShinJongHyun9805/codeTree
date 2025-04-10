import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();


        int[] N = new int[100];

        N[0] = 1;
        sb.append(N[0]).append(" ");
        N[1] = Integer.parseInt(st.nextToken());
        sb.append(N[1]).append(" ");

        for (int i = 2; i < N.length; i++) {
            int sum = N[i - 2] + N[i - 1];
            N[i] = sum;
            sb.append(sum).append(" ");

            if (sum > 100) break;
        }

        sb.setLength(sb.length() - 1);

        System.out.println(sb);
    }
}
