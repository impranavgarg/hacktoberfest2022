public class FloorNumber {
    public static void main(String[] args) {
        int[] arr ={1,8,9,15,18,19,25,30,32};
        int target = 17;
        System.out.println(flornum(arr,target));    }

    static int flornum(int[] arr, int target) {
        // return -1;
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
        return end;
    }
    
}
