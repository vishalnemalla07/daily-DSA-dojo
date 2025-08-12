/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104 */

package ARRAYS;

public class minimun_Size_Subarray_Sum {

    public static int minSubArrayLen(int nums[], int target){
        int left = 0; 
        int min_Len = Integer.MAX_VALUE;
        int currSum = 0;

        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];

            while(currSum >= target){
                if(right - left + 1 < min_Len){
                    min_Len = right - left + 1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return min_Len != Integer.MAX_VALUE ? min_Len : 0;
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("minimun Subarray length : " + minSubArrayLen(arr, target));
    }
}
