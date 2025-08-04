/*You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */


package ARRAYS;

public class maximum_Avg_SubArray {

    public static double maximum_Average(int nums[], int k){
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;
        for(int j = k; j < nums.length; j++){
            sum += nums[j] - nums[j - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Maximum Average: " + maximum_Average(arr, k));
    }
    
}
