package ARRAYS;

public class container_with_most_water {

    //-----Brute Force----TC: O(N^2)
    public static int brute_Force(int height[], int n){
        int maxWaterCount = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int minContainer = Math.min(height[i], height[j]);
                int currentWaterlevel = minContainer * (j - i);
                
                maxWaterCount = Math.max(maxWaterCount, currentWaterlevel);
            }
        }
        return maxWaterCount;
    }

    //------Optimal Approach ----TC: O(N)
    public static int optimal_Sol(int height[], int n){
        int maxWaterCount = 0;
        int lp = 0;
        int rp = n - 1;

        while(lp < rp){
            int width = rp - lp;
            int minContainer = Math.min(height[lp], height[rp]);
            int currentWaterlevel = minContainer * width;

            maxWaterCount = Math.max(maxWaterCount, currentWaterlevel);

            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWaterCount;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int n = height.length;
        System.out.println(optimal_Sol(height, n));
    }
}
