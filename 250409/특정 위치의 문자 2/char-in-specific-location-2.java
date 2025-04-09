import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);

        System.out.println(arr[1] + " " + arr[4] + " " + arr[7]);
    }
}
