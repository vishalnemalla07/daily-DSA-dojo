package ARRAYS;

import java.util.Arrays;

public class Two_sum_2 {

    public static int[] Brute_Sol(int nums[], int target){
        int n = nums.length;
        for(int i = 0; i < n- 1; i++){
            int needed_element = target - nums[i];
            for(int j = i + 1; j < n; j++){
                if(nums[j] == needed_element){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] Two_Pointers(int nums[], int target){
        int n = nums.length;
        int left = 0; 
        int right = n - 1;

        while(left < right){
            if(nums[left] + nums[right] == target){
                return new int[]{left + 1, right + 1};
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 18;
        System.out.print(Arrays.toString(Brute_Sol(arr, target)));
        System.out.print(Arrays.toString(Two_Pointers(arr, target)));
    }
}
