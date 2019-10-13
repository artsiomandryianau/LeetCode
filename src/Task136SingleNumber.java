import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public class Task136SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }
}
