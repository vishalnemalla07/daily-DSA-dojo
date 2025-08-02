package ARRAYS;

public class container_with_most_water {

    public static int brute_Force(int nums[], int n){
        int maxWaterCount = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int minContainer = Math.min(nums[i], nums[j]);
                int currentWaterlevel = minContainer * (j - i);
                
                maxWaterCount = Math.max(maxWaterCount, currentWaterlevel);
            }
        }
        return maxWaterCount;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        System.out.println(brute_Force(arr, n));
    }
}
