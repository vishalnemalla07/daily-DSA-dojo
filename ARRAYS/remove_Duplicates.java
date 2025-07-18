package ARRAYS;

public class remove_Duplicates {

    public static int OPT(int arr[]){
        int n = arr.length;
        int i = 0;
        for(int j = i + 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int k = OPT(nums);
        System.out.println("Number of unique elements : " + k);
    }
}
