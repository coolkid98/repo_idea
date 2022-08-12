import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5};
        System.out.println(Arrays.toString(arr));
        remove(arr,2);
        System.out.println(Arrays.toString(arr));

    }

    public static void remove(int[] nums, int val){
        int slow = 0;
        int length = nums.length;
        for(int fast = 0 ; fast < length; fast++){
            if(nums[fast] != val){
                nums[slow++] = nums[fast];
            }
        }
    }
}
