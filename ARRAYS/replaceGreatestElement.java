package ARRAYS;
import java.util.Arrays;

public class replaceGreatestElement {

    public static int[] BruteForce(int nums[]){
        int n = nums.length;
        
        for(int i = 0; i < n - 1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i + 1; j <= n - 1; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            nums[i] = max;
        }
        nums[n - 1] = -1;
        return nums;
    }

    public static int[] OptSoln(int nums[]){
        int n = nums.length;
        int max = -1;

        for(int i = n - 1; i >= 0; i--){
            int current = nums[i];
            nums[i] = max;
            max = Math.max(max, current);
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        // BruteForce(arr);
        // System.out.print(Arrays.toString(nums));
        OptSoln(arr);
        System.out.print(Arrays.toString(arr));
    }
}
