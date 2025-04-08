import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        String collect = Arrays.stream(nums)
                .filter(e -> e % 2 == 0)
                .boxed()
                .collect(
                        Collectors.collectingAndThen(Collectors.toList(), list -> {
                            Collections.reverse(list);
                            return list.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining(" "));
                        })
                );

        System.out.println(collect);
    }
}