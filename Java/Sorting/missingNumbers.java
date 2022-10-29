// import java.util.Arrays;

public class missingNumbers {
    public static void main(String[] args) {
        int[] nums ={3,1,5,0,2};
        ;
        System.out.println(Sort(nums));
        
    }

    static int Sort(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct  = nums[i];
            if(nums[i]<nums.length && nums[correct]!= nums[i]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }

 
        }
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;

    }
    static void swap(int[] nums,int first , int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;

    }
}
    
