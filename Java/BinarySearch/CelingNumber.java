public class CelingNumber {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0 , 14, 15, 18, 36, 60};
        int target =  35;
        System.out.println(Celingnumber(arr, target));
        
    }
    static int Celingnumber(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;
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
        // return -1;
        return start;
    }
}
