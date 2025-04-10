import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];

        for (int i = 0; i < n.length; i++) {
            int num = sc.nextInt();

            if (num == 0) break;
            n[i] = num;
        }


        for (int i = 1; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < n.length; j++) {
                if (n[j] / 10 == i) {
                    count++;
                }
            }

            System.out.println(i + " - " + count);
        }
    }
}

