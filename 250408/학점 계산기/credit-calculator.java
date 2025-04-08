import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sc.nextDouble();
        }

        double avg = Math.round((sum / N) * 10.0) / 10.0;
        System.out.println(avg);

        String msg = avg >= 4.0 ? "Perfect" : avg >= 3.0 ? "Good" : "Poor";
        System.out.println(msg);

    }
}