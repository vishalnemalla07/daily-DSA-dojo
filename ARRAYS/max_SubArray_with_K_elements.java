package ARRAYS;

public class max_SubArray_with_K_elements {

    public static int max_Sub_Array(int nums[], int k){
        int maxSum = 0;
        int n = nums.length;

        for(int i = 0; i < n - k + 1; i++){
            int currSum = 0;
            for(int j = 0; j < k; j++){
                currSum += nums[i + j];

                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
     public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        System.out.println(max_Sub_Array(arr, k));

    }
}

