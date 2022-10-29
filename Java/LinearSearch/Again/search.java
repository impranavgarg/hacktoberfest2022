/**
 * search
 */
public class search {

    public static void main(String[] args) {
        int[] numbers = {5,7,8,6,15,-5};
        int target = 15;
        System.out.println(linearSearch(numbers, target));

        
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
            
        }
        return -1;
    }
}