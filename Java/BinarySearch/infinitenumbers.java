public class infinitenumbers {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 9, 10, 90, 100, 130,
            140, 160, 170};
        int target = 100;    
        System.out.println(ans(arr, target));
        
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (arr[end]<target) {
            int newstart= end + 1;
            end = end + (end - start + 1);
            start =  newstart;
            
        }
        return Search(arr, target, start, end);

    }
    static int Search(int[] arr, int target, int start, int end){
        // int start = 0;
        // int end  = arr.length-1;
        while (start<=end) {
            // find the middle element
            int mid = start + (end- start)/2;

            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }

            
        }
        return -1;

    }
    
}
