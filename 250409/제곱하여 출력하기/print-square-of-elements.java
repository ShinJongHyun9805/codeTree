import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            sb.append(n * n).append(" ");
        }

        System.out.println(sb);
    }
}
