import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        long count = Arrays.stream(str.split(" ")).mapToDouble(Double::valueOf).count();

        double sum = Arrays.stream(str.split(" ")).mapToDouble(Double::valueOf).sum();

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(sum /count));

    }
}