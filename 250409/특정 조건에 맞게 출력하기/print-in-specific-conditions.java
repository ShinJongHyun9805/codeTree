import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) break;

            list.add(arr[i]);
        }

        String str = list.stream()
                .map(e -> (e % 2 == 0) ? e / 2 : e + 3)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(str);
    }
}
