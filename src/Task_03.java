import java.util.Arrays;

public class Task_03 {

    public static void main(String[] args) {

        int[] nums = {11, 2, 15, 6, 23, 33, 3};
        int target = 9;

        int[] result = solution(nums, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return new int[0];
    }
}