import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 0; i < 3; i++) {
            String[] split = sc.nextLine().split(" ");

            if (split[0].equals("Y") && Integer.parseInt(split[1]) >= 37) {
                A++;
            } else if (split[0].equals("N") && Integer.parseInt(split[1]) >= 37) {
                B++;
            } else if (split[0].equals("Y") && 37 > Integer.parseInt(split[1])) {
                C++;
            } else {
                D++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A).append(" ").append(B).append(" ").append(C).append(" ").append(D);

        if (A >= 2) sb.append(" E");

        System.out.println(sb);

    }

}

