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

public static int sliding_window(int nums[], int k){
    int maxSum = 0;

    for(int i = 0; i < k; i++){
        maxSum += nums[i];
    }

    int window_Sum = maxSum;
    for(int j = k; j < nums.length; j++){
        window_Sum += nums[j] - nums[j - k];
        maxSum = Math.max(maxSum, window_Sum);
    }
    return maxSum;
}

     public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(sliding_window(arr, k));

    }
}

