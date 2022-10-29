import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,0,1};
        Sort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void Sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
            
        }
           
    }
    static void swap(int[] nums,int first , int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;

    }
    private static int getMaxIndex(int[] nums, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(nums[i]>max){
                max= i;
            }
            
        }
        return max;

    }
    
}
