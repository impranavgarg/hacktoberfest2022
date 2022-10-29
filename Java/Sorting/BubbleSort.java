
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums ={0,1,1,0,1,0,1};
        Sort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void Sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]= temp;
                    swapped = true;

                }
                
            }
            if(!swapped){
                break;
            }

            
        }

    }
}
