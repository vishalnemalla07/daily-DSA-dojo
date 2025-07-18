package ARRAYS;

public class maxSubArray {

    public static void maxSubarraySum(int nums[]){
        //--BRUTE FORCE APPROACH--> O(n^3)
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                curr_Sum = 0;
                for(int k = i; k <= j; k++){
                    curr_Sum += nums[k];
                }
                System.out.println(curr_Sum);
                if(max_Sum < curr_Sum)
                    max_Sum = curr_Sum;
            }
        }
        System.out.println("Max Sum: " + max_Sum);
    }

    public static void maxSubarraySum2(int nums[]){
        //---BETTER APPROACH ---> O(n^2)
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum = 0;
        int prefixSum[] = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                curr_Sum = i == 0 ? prefixSum[j] : prefixSum[j] -  prefixSum[i - 1];

            if(max_Sum < curr_Sum)
                max_Sum = curr_Sum;
            }
        }
        System.out.println("Max Sum : " + max_Sum);
    }

    public static void kadanes(int nums[]){
        //KADANES ALGORITHM -- OPTIMAL O(n)
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum = 0;

        for(int i = 0; i < nums.length; i++){
            curr_Sum += nums[i];

            if(curr_Sum < 0){
                curr_Sum = 0;
            }else{
                max_Sum = Math.max(max_Sum, curr_Sum);
            }
        }
        System.out.println("Max Sum : " + max_Sum);
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        // maxSubarraySum(nums);
        // maxSubarraySum2(nums);
        kadanes(nums);
    }
}
