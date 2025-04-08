import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 250) break;

            sum += nums[i];
            count ++;
        }

        double average = (double) sum / count;

        System.out.printf("%d %.1f\n", sum, average);
    }
}

