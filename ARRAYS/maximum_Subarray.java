package ARRAYS;

public class maximum_Subarray {

public static int max_Sub_Array(int nums[], int k){
    int max_Sum = 0;
    int n = nums.length;

    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            int currSum = 0;
            for(int z = i; z <= j; z++){
                currSum += nums[z];

                max_Sum = Math.max(max_Sum, currSum);
            }
        }
    }
    return max_Sum;
}
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        System.out.println(max_Sub_Array(arr, k));

    }
}
