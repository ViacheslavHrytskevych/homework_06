import java.util.HashSet;
import java.util.Set;

public class Task_02 {

    public static void main(String[] args) {

        int[] nums = {1, 4, 6, 11, 3, 7, 0, 3};
        boolean result = isAnyTwice(nums);
        System.out.println(result);
    }

    static boolean isAnyTwice(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        return unique.size() != nums.length;
    }
}