public class findDuplicate {
    public static void main(String[] args) {
        int[] nums ={3,1,5,4,2};
        Sort(nums);
        System.out.println(Sort(nums));
        
    }

    static int Sort(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct  = nums[i]-1;
            if(nums[correct]!= nums[i]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }

 
        }
        // List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1){
                // ans.add(j+1);
                return nums[j];

            }
            
        }
        // return ans;
        return -1;

    }
    static void swap(int[] nums,int first , int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;

    }
    
}
