package ARRAYS;

public class trapped_Water {
    
    public static int trappedWater(int height[]){
        int n = height.length;
        //calculate the Auxilary array - leftMax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        //caluclate the Auxilary array - rightMax
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        //loop
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
        //water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
        //trapped water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water : " + trappedWater(height));
    }
}
