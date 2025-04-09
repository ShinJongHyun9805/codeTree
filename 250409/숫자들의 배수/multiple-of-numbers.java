import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int stop = 2;

        int num = 0;
        StringBuilder sb = new StringBuilder();
        while (stop > 0) {
            num += n;
            sb.append(num).append(" ");

            if (num % 5 == 0) stop--;
        }

        System.out.println(sb);
    }
}
