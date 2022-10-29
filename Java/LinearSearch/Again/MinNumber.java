/**
 * MinNumber
 */
public class MinNumber {

    public static void main(String[] args) {
        int[] numbers = {5,7,8,6,15,-5};
        System.out.println(min(numbers));
    }
    static int min(int[] arr){
        // int min = MIN_V
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
            
        }
        return ans;
    }
}